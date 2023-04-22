-- zad1
GO
CREATE TRIGGER t_zad1 ON EMP
FOR DELETE
AS
     ROLLBACK;


--test
delete from emp;


-- zad2
CREATE TRIGGER t_zad2 ON EMP
AFTER INSERT
AS
     IF EXISTS(
     SELECT 1
     FROM   inserted AS i
     WHERE  i.comm IS NULL)
         BEGIN
             UPDATE     emp
                    SET
                        comm = 0
             WHERE      empno IN(SELECT i.empno
								 FROM         inserted AS i
								 WHERE  comm IS NULL);
     END;
	 


-- zad3
CREATE TRIGGER t_zad3
   ON  emp
   AFTER INSERT, UPDATE
AS 
BEGIN
	SET NOCOUNT ON;

   
	IF EXISTS(SELECT 1
			  FROM   inserted AS i
			  WHERE  i.sal <= 1000)
         BEGIN
            RAISERROR ('Pensja musi być wyższa niż 1000!', 15, 1);
			ROLLBACK;
		 END

END
GO

-- zad4
CREATE TRIGGER t_zad4 ON EMP
FOR INSERT, UPDATE, DELETE
AS
     SET NOCOUNT ON;
     DECLARE @add INT = 0
           , @substract INT = 0;

	 -- nowe rekordy
	 SELECT @add=SUM(i.sal) FROM inserted i;
	 SELECT @substract=SUM(d.sal) FROM deleted d;     
	 UPDATE Budzet SET wartosc = wartosc + ISNULL(@add,0) - ISNULL(@substract,0);


-- zad5
CREATE TRIGGER t_zad5 ON dept
FOR UPDATE
AS
     SET NOCOUNT ON;
    
	IF EXISTS (SELECT 1 FROM inserted i JOIN deleted d ON i.DEPTNO=d.DEPTNO WHERE i.DNAME<>d.DNAME)
		BEGIN
			RAISERROR ('Nie można edytować nazw działów!', 15, 1);
			ROLLBACK;
		END

	

-- zad6
CREATE TRIGGER t_zad6 ON emp
FOR INSERT, UPDATE, DELETE
AS
     SET NOCOUNT ON;
    
	IF EXISTS (SELECT 1 
				FROM inserted i RIGHT JOIN deleted d ON i.EMPNO=d.EMPNO 
				WHERE i.EMPNO IS NULL AND d.SAL>0) --rekordy usunięte (występujące wyłącznie w deleted) z pensją większą niż 0
		BEGIN
			RAISERROR ('Nie można usunąć pracownika z pensją wyższą niż 0', 15, 1);
			ROLLBACK;
		END

	IF EXISTS (SELECT 1 
				FROM inserted i JOIN deleted d ON i.EMPNO=d.EMPNO 
				WHERE i.ENAME<>d.ENAME) --rekordy zaktualizowane ze zmienionym nazwiskiem
		BEGIN
			RAISERROR ('Nie można zmieniać nazwisk pracowników!', 15, 1);
			ROLLBACK;
		END

	IF EXISTS (SELECT 1 --dodane rekordy z nazwiskami które istnieją w tabeli emp
				FROM inserted i LEFT JOIN deleted d ON i.EMPNO=d.EMPNO 
				WHERE d.EMPNO IS NULL AND EXISTS (SELECT 1 
													FROM EMP e 
													WHERE e.ENAME = i.ENAME AND e.EMPNO<> i.EMPNO)) 
													
		BEGIN
			RAISERROR ('Istnieje już pracownik z takim nazwiskiem!', 15, 1);
			ROLLBACK;
		END
	


