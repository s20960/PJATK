--1
DECLARE @var INT;
SET @var = 12;
--PRINT @var;
SELECT @var = COUNT(1) FROM emp;
--PRINT @var;
--SELECT TOP 3 @var = empno FROM emp;

SET @var = (SELECT COUNT(1) FROM emp);

PRINT 'There are ' + CAST(@var AS VARCHAR) + ' employees.';
PRINT 'There are ' + CONVERT(VARCHAR, @var) + ' employees.';


--2
IF (SELECT COUNT(1) FROM Emp) <16
	BEGIN
		DECLARE @newId INTEGER, @currentDate DATE = GETDATE();

		SELECT @newId = MAX(e.Empno)+1 FROM Emp e;
		INSERT INTO EMP(Empno,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno)
		VALUES (@newId, 'New', 'Employee', NULL, @currentDate, 3000, NULL, 10);
		PRINT 'Employee ' + CAST(@newId AS VARCHAR) + ' hired with current date ('+CONVERT(VARCHAR, @currentDate, 104)+').';
	END;
ELSE 
	BEGIN
		PRINT 'There are already enough employees';
	END;

GO


--3
ALTER PROCEDURE FindEmployees
	@minimumSalary MONEY
AS
BEGIN	
	SET NOCOUNT ON;
	
	SELECT *
	FROM emp e 
	WHERE e.sal > @minimumSalary;
END

GO


EXECUTE FindEmployees 1500;
EXEC FindEmployees 1500;
EXEC FindEmployees @minimumSalary = 1500;

GO

--4
ALTER PROCEDURE AddDept 	
	@Name VARCHAR(50),
	@Location VARCHAR(50),
	@Deptno INT OUT
AS
BEGIN
	SET NOCOUNT ON;

	IF EXISTS (SELECT 1 FROM dept d WHERE d.dname = @Name OR d.loc = @Location)
		BEGIN
			RAISERROR ('Department already exists!',11,-1); 
			/*
			RAISERROR ('wiadomosc', -- Tekst komunikatu.  
			11, -- Severity,  
			-1  -- State, 
			);   
		   */
			--Znaczenie severity
			--https://docs.microsoft.com/en-us/sql/t-sql/language-elements/raiserror-transact-sql?view=sql-server-ver15#remarks
		END;
    ELSE
		BEGIN
			SET @Deptno = (SELECT MAX(Deptno) + 1 FROM Dept);
			INSERT INTO DEPT(Deptno, Dname, Loc) VALUES (@Deptno, @Name, @Location);
			PRINT 'Department ' + @Name + ' created.';
		END;	
END

GO

DECLARE @newId INT;
EXEC AddDept 'NewDept2', @Deptno = @newId OUT, @Location = 'Warsaw';
SELECT @newId AS NewDeptno;

GO

--5
ALTER PROCEDURE AddEmp 
	@Dname VARCHAR(50),
	@Ename VARCHAR(50)
AS
BEGIN
	SET NOCOUNT ON;
--	IF  (SELECT COUNT(1) FROM dept d WHERE d.dname = @Dname) <> 1
	IF NOT (SELECT COUNT(1) FROM dept d WHERE d.dname = @Dname) = 1
		BEGIN
			RAISERROR ('Department doesn''t exist!',11,-1);
		END;
    ELSE
		BEGIN
			DECLARE @Empno INT, @Deptno INT, @Salary MONEY, @Job VARCHAR(50);--deklaracja zmiennych
			
			SET @Empno = (SELECT MAX(empno) FROM emp) + 1 ;--przypisanie wartości do 1. zmiennej
			SET @Deptno = (SELECT d.deptno FROM dept d WHERE d.dname = @Dname);
			SELECT @Salary = ISNULL(AVG(e.sal),1000) FROM emp e WHERE e.deptno = @Deptno;--przypisanie wartości do 3. zmiennej korzystając z innego sposobu niż wcześniej
							 --ISNULL() w MSSQL to ekwiwalent Oracle'owego NVL()
			SELECT TOP 1 @Job = e.job	/*	1. jeżeli istnieje jakakolwiek szansa, że SELECT może zwrócić więcej niż 1 rekord nie powinniśmy używać SET (w celu uniknięcia błędów)
											2. TOP 3 zwraca 3 pierwsze rekordy z góry ze zbioru wynikowego */ 
			FROM emp e 
			GROUP BY e.job
			HAVING COUNT(1) = (	SELECT MAX(sub.num)
								FROM (SELECT COUNT(1) AS num, e2.job
									  FROM emp e2
									  GROUP BY e2.job) AS sub
								);
			
			
			INSERT INTO EMP(Empno,Ename,Job,Hiredate,Sal,Deptno)
		    VALUES (@Empno, @Ename, @Job, GETDATE(), @Salary, @Deptno);
			
			--Wyświetlenie wiadomości jako pojedynczy string w ResultSet
			SELECT 'New ' + @Job + ' has been hired (' +@Ename+'). Initial earnings: '
			+ CONVERT(VARCHAR, @Salary, 1) AS Information;
		END;	
END

GO

--Test
EXEC AddEmp @Dname = 'NewDept2', @Ename='Yoshi';

GO

/* Różnice między wstawianiem wielu wartości do zmiennej

Użycie SELECT  */

DECLARE @sth INT;
SELECT TOP 3 @sth = deptno FROM dept; 
PRINT @sth;

/*
 Użycie SET i wykorzystanie podzapytania
 Poniższy przykład nie zadziała (zwróci błąd) ponieważ podzapytanie zwróci więcej niż 1 wartość!
*/

DECLARE @sth2 INT;
SET @sth2 = (SELECT TOP 3 deptno FROM dept); --błąd
PRINT @sth2;