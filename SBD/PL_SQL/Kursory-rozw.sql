-- 1
SET SERVEROUTPUT ON;
DECLARE 
v_empno INTEGER; 
v_sal   INTEGER;
CURSOR cur IS SELECT e.empno, e.sal FROM emp e;

BEGIN
    OPEN cur;    
    LOOP
        FETCH cur INTO v_empno, v_sal;
        EXIT WHEN cur%NOTFOUND;
            dbms_output.put_line(v_empno || ' ' || v_sal);
           IF v_sal > 1500 THEN            
                    UPDATE emp
					SET sal = sal * 0.9
                    WHERE empno = v_empno;
                    dbms_output.put_line('Emplyee with number ' || v_empno || ' has salary lowered to ' || v_sal*0.9);               
           ELSIF v_sal < 1000 THEN                    
                 UPDATE emp
                 SET sal = sal * 1.1
				 WHERE empno = v_empno;
                 dbms_output.put_line('Emplyee with number  ' || v_empno || ' got a raise to ' || v_sal*1.1);         
            END IF;
    END LOOP;
    CLOSE cur;
END;


-- 2
SET Serveroutput ON;
CREATE OR REPLACE PROCEDURE ModifySalaries 
(p_lower emp.sal%type,
p_upper emp.sal%type)
IS 
CURSOR cur IS SELECT e.empno, e.sal FROM emp e;
v_empno emp.empno%type; 
v_sal   emp.sal%type;
BEGIN
    OPEN cur;    
    LOOP
        FETCH cur INTO v_empno, v_sal;
        EXIT WHEN cur%NOTFOUND;
            dbms_output.put_line(v_empno || ' ' || v_sal);
           IF v_sal > p_upper THEN            
                    UPDATE emp
					SET sal = sal * 0.9
                    WHERE empno = v_empno;
                    dbms_output.put_line('Emplyee with number ' || v_empno || ' has salary lowered to ' || v_sal*0.9);               
           ELSIF v_sal < p_lower THEN                    
                 UPDATE emp
                 SET sal = sal * 1.1
				 WHERE empno = v_empno;
                 dbms_output.put_line('Emplyee with number  ' || v_empno || ' got a raise to ' || v_sal*1.1);         
            END IF;
    END LOOP;
    CLOSE cur;
END ModifySalaries;

--Wywolanie procedury
EXECUTE ModifySalaries(p_lower => 1000, p_upper => 1500);



-- 3
SET Serveroutput ON;
CREATE OR REPLACE PROCEDURE GiveRaise 
(p_deptno dept.deptno%type)
IS 
CURSOR cur IS SELECT e.empno, e.sal FROM emp e WHERE e.deptno=p_deptno;
v_avgSalary emp.sal%type;
v_comm   emp.comm%type;
v_empno emp.empno%type; 
v_sal   emp.sal%type;
exc_noDeptFound EXCEPTION; --wlasny wyjatek
BEGIN
    SELECT AVG(e.sal) INTO v_avgSalary
    FROM emp e
    WHERE e.deptno = p_deptno;
    
    IF v_avgsalary IS NULL THEN
        RAISE exc_noDeptFound;
    END IF;
    
    dbms_output.put_line('Average salary in department ' || p_deptno || ': ' || v_avgsalary);        
    
    OPEN cur;    
    LOOP
        FETCH cur INTO v_empno, v_sal;
        EXIT WHEN cur%NOTFOUND;
           IF v_sal < v_avgSalary THEN 
                v_comm := v_sal * 0.05;
                
				--OPEN cur; --odkomentuj linię w celu doprowadzenia do podniesienia wyjatku CURSOR_ALREADY_OPEN 
				
                UPDATE emp
				SET comm = v_comm
                WHERE empno = v_empno;
                dbms_output.put_line('-Employee with number ' || v_empno || ' has a new comission assigned ' || v_comm);                  
            END IF;
    END LOOP;
    CLOSE cur;
    
EXCEPTION --obsluga wyjatkow
   WHEN exc_noDeptFound THEN --wlasny wyjatek
       dbms_output.put_line('Department with provided id does not exist!'); 
   WHEN CURSOR_ALREADY_OPEN THEN --predefiniowany wyjatek
       CLOSE cur; 
       dbms_output.put_line('Error - cursor was already open!'); 
END GiveRaise;

--CALL
EXECUTE GiveRaise(p_deptno => 10);