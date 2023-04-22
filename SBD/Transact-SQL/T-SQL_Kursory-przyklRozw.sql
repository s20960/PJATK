--zad 1
DECLARE cur CURSOR FOR
	SELECT e.empno, e.sal
	FROM emp e;
DECLARE @empno INT, @sal MONEY;

OPEN cur;
PRINT '@@Fetch_status value BEFORE the first fetch: ' + CAST(@@Fetch_status AS VARCHAR);
FETCH NEXT FROM cur INTO @empno, @sal;
PRINT '@@Fetch_status value AFTER the first fetch: ' + CAST(@@Fetch_status AS VARCHAR);

WHILE @@Fetch_status = 0
	BEGIN
		PRINT 'processing ' + CAST(@empno AS VARCHAR)+' '+CAST(@sal AS VARCHAR);			
		IF @sal > 1500
			BEGIN
				UPDATE emp
				SET sal = sal * 0.9
				WHERE empno = @empno;
				PRINT 'Salary of the employee '+CAST(@empno AS VARCHAR)+' has been decreased to '+CAST(@sal * 0.9 AS VARCHAR);
			END;
		ELSE IF @sal < 1000
			BEGIN
				UPDATE emp
				SET sal = sal * 1.1
				WHERE empno = @empno;
				PRINT 'Salary of the employee '+CAST(@empno AS VARCHAR)+' has been increased to '+CAST(@sal * 1.1 AS VARCHAR);
			END;
		FETCH NEXT FROM cur INTO @empno, @sal;
	END;
PRINT '@@Fetch_status value AFTER the LAST fetch: ' + CAST(@@Fetch_status AS VARCHAR);
CLOSE cur;
DEALLOCATE cur;
GO


--zad 3
CREATE PROCEDURE [dbo].[task3]
	@idDept INT
	AS
BEGIN
	SET NOCOUNT ON;
		DECLARE @avg MONEY = (	SELECT  AVG(e.sal)
								FROM emp e
								WHERE e.deptno=@idDept);

		DECLARE cur CURSOR FOR
			SELECT e.empno, e.sal
			FROM   emp e
			WHERE e.deptno=@idDept;
		DECLARE @empno   INT
			  , @sal   MONEY;

		OPEN cur;
		FETCH NEXT FROM cur INTO @empno, @sal;
		WHILE @@Fetch_status = 0
			BEGIN
				IF @sal < @avg
					BEGIN 
						UPDATE emp SET comm = sal*0.05 WHERE empno =@empno;
						PRINT 'Employee with number ' + CAST(@empno AS VARCHAR) + ' received a commssion.';
					END
				FETCH NEXT FROM cur INTO @empno, @sal;	
			END;
		CLOSE cur;
		DEALLOCATE cur;
END

GO

exec task3 10;


GO

--zad 4
CREATE TABLE Warehouse 
             (IdItem	  INT IDENTITY,
             ItemName     VARCHAR(250) NOT NULL,
             Quantity     INT NOT NULL);

ALTER TABLE Warehouse
ADD CONSTRAINT Warehouse_PK PRIMARY KEY(IdItem);

INSERT INTO Warehouse (ItemName, Quantity)
VALUES ('Product 1', 10),
       ('Product 2', 30),
       ('Product 3', 35);

GO

ALTER FUNCTION fn_task4()
RETURNS VARCHAR(50)
BEGIN
	DECLARE @idItem INT, @itemName VARCHAR(50), @quantity INT;
		
	SELECT TOP 1 @idItem = w.IdItem, @itemName = w.ItemName, @quantity = w.Quantity
	FROM Warehouse w
	WHERE w.Quantity = (SELECT MAX(Quantity) FROM Warehouse);

	IF @quantity < 5
		RETURN NULL;

	RETURN @itemName;
END
GO


--zad 5
UPDATE Warehouse 
SET Quantity = Quantity - 5 
WHERE ItemName = dbo.fn_task4();
