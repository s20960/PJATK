--BEFORE, AFTER
--FOR EACH ROW
CREATE OR REPLACE TRIGGER del_emp
BEFORE DELETE ON emp
BEGIN
    RAISE_APPLICATION_ERROR(-20100, 'Nie mo¿na usuwaæ pracowników!');
END;
/
ALTER TRIGGER del_emp ENABLE;
/
DELETE FROM emp WHERE sal > 500;

/
CREATE OR REPLACE TRIGGER zad2
BEFORE INSERT OR UPDATE ON emp
FOR EACH ROW
DECLARE
v_sal emp.sal%type;
BEGIN
    v_sal := :new.sal;
    IF v_sal < 1000 THEN
        IF INSERTING THEN
            RAISE_APPLICATION_ERROR(-20100, 'Zbyt niskie zarobki!');
        ELSIF UPDATING THEN
            :new.sal := :old.sal;
            DBMS_OUTPUT.PUT_LINE('Nowe zarobki sa zbyt niskie ('|| v_sal ||'), pozostawiamy stara wartoœæ zarobków ('|| :old.sal ||').');            
        END IF;    
    END IF;   
END;
/
UPDATE emp 
SET sal = sal - 500
WHERE job = 'CLERK';

SELECT * FROM emp;








