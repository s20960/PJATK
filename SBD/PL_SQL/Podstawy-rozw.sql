--wlaczenie wyjscia
SET Serveroutput ON;
dbms_output.enable; 

-- 1
DECLARE v_counter INTEGER;-- := 10;
BEGIN
	SELECT COUNT(1) INTO counter
	FROM emp e;
	dbms_output.put_line('There are ' || counter || ' records in table EMP') ;
END;


-- 2
SET Serveroutput ON;
CREATE OR REPLACE PROCEDURE AddDept 
(departmentNo INTEGER,
 deptName VARCHAR2,
 location VARCHAR2)
AS 
v_ifexists INTEGER;
BEGIN
    SELECT COUNT(1) INTO v_ifexists 
	FROM dept 
	WHERE deptno = departmentNo OR dname=deptName OR loc = location;
    
    IF v_ifexists>0  THEN
        dbms_output.put_line('Department already exists!') ;
    ELSE 
        INSERT INTO dept(deptno,dname, loc) 
        VALUES (departmentNo,deptName, location);
    END IF;
END AddDept;

/

SELECT * FROM dept;
DELETE FROM dept WHERE deptno =50;
--Wywolania procedur
--1.
CALL AddDept(50, 'IT', 'Warsaw'); 
--2.
EXECUTE AddDept(deptName=>'IT', location => 'Warsaw', departmentNo=>50);
--3.
BEGIN
    AddDept(50, location => 'Warsaw',deptName=>'IT' );
END;

-- 3
CREATE OR REPLACE PROCEDURE AddEmployee 
(p_deptno DEPT.DEPTNO%TYPE,
p_lastname EMP.ENAME%TYPE,
p_newEmpNo OUT EMP.EMPNO%TYPE)
AS 
v_ifexists INTEGER;
v_minsal EMP.SAL%TYPE; 
BEGIN
    SELECT COUNT(1) INTO v_ifexists FROM dept WHERE deptno=p_deptno;
    IF v_ifexists=1  THEN        
        SELECT NVL(MIN(e.sal),450) INTO v_minsal FROM emp e where e.deptno=p_deptno;--NVL w razie gdy wybrany departament nie ma jeszcze pracowników
        SELECT MAX(e.empno)+1 INTO p_newEmpNo FROM emp e;
        INSERT INTO emp(empno,ename,hiredate,job,deptno,sal) 
		VALUES (p_newEmpNo,p_lastname,SYSDATE(),'CLERK',p_deptno,v_minsal);
    ELSE 
    Raise_application_error(-20100,'Department does not exist!') ;    
 END IF;
END AddEmployee;
/
--Wywołanie procedury i wyświetlenie numeru nowego pracownika
DECLARE v_empno INTEGER;
BEGIN    
    AddEmployee(p_deptno=>50, p_lastname => 'JOHNSON', p_newEmpNo => v_empno);    
    dbms_output.put_line('Succesfully added an employee with a new number ' || v_empno) ;
END;