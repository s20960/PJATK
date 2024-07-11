--CZESC PIERWSZA
--1
SELECT deptno, ename, mgr 
FROM emp;

--2
SELECT *
FROM emp;

--3
SELECT sal * 12
FROM emp;

--4
select ename, (sal+250)*12 
from emp;

--5
select ename, sal*12 "Roczna"
from emp;

--6
SELECT ename "pracownicy", sal * 12 "Placa roczna"
FROM emp;

--7
SELECT empno || ' ' || ename "Zatrudniony"
FROM emp;

--8
SELECT 'Pracowanik ' || empno ||' '|| ename || ' pracuje w dziale nr ' || deptno || ' i zarabia ' || sal "Dane pracowanika" 
FROM emp;

--9
SELECT 'Pracowanik ' || ename || ' dochody: ' || (sal * 12 + NVL(comm, 0)) 
FROM emp;

--10
SELECT deptno
FROM emp;

--11
select distinct deptno
from emp;

select deptno 
from emp 
group by deptno;

--12
SELECT DISTINCT job, DEPTNO
FROM EMP;

--13
select * 
from emp 
order by ename asc;

select * 
from emp 
order by job asc, ename desc; 

--14                                                                                                tutaj
select *
from emp;
--order by hiredate desc;

--15                                                                                                   tutaj
select *
from emp
order by deptno asc, sal desc;








--CZESC DRUGA
--1
select e.ename, e.empno, e.job, e.sal, e.deptno 
from emp e
where e.job = 'CLERK';

--2
select dname, deptno
from dept
where deptno>20;

--3
select ename 
from emp
where comm>sal;

--4
select *
from emp e
--where e.sal >= 1000 and e.sal <= 2000;
where e.sal between 1000 and 2000;

--5
select e.ename, e.empno
from emp e
where e.mgr = 7902 or e.mgr = 7566 or e.mgr = 7788;

select e.ename, e.empno
from emp e
where e.mgr in(7902, 7566, 7788);

--6                                                                                                
select ename
from emp
where ename like 'S%';

--7
select ename
from emp
--where ename like '____';
where length(ename) = 4;

--8
select *
from emp e
where e.mgr is null;

--9 
select *
from emp e
where e.sal not between 1000 and 2000;

--10
select ename
from emp
where ename like 'M%';

--11
select *
from emp e
where e.mgr is not null;

--12
select *
from emp
where job='CLERK' and sal between 1000 and 2000;

--13
select *
from emp
where job='CLERK' or sal between 1000 and 2000;

--14
select *
from emp
where (job='MANAGER' and sal>1500) or job='SALESMAN';

--15
select *
from emp
where (job='MANAGER' or job='SALESMAN') and sal>1500 ;

--16
select *
from emp
where job='MANAGER' or (job='CLERK' and deptno=10 );

--17
select *
from salgrade;

--18
select *
from dept;

--19
select *
from emp
where job='CLERK' and sal not between 1000 and 2000;

--20
select deptno, dname
from dept
order by deptno asc;

--21
select distinct job
from emp;

--22 
select ename, job, deptno
from emp
where deptno=10 or deptno=20
order by ename asc;

--23
select ename, job, deptno
from emp
where deptno=20 and job='CLERK';

--24
select ename
from emp
where ename like '%TH%' or ename like '%LL%';

--25
select ename, job, sal
from emp
where mgr is not null;

--26
select ename, sal*12
from emp
where empno is not null;

SELECT ename, sal*12 + NVL(comm,0) "Roczna Pensja"
FROM emp;

--27                                                                                                    tutaj
select deptno, hiredate
from emp
where hiredate = 82;

--28                                                                                                    tutaj
select ename, sal*12, comm
from emp
where job='SALESMAN' and comm<sal 
order by sal desc, ename asc;

SELECT ename, sal*12 "Roczna Pensja", NVL(comm,0) comm
FROM emp
WHERE job = 'SALESMAN' AND sal > NVL(comm,0)
ORDER BY sal DESC, ename;





--CZÊŒÆ TRZECIA 

--1
select *
from emp, dept
where emp.deptno=dept.deptno;

--2
select ename, dname
from emp 
inner join dept
on emp.deptno=dept.deptno
order by ename ;

select ename, dname
from emp
natural join dept
order by ename;


--3
select e.ename, d.deptno, d.dname, d.loc
from emp e
inner join dept d 
on e.deptno = d.deptno;

select ename, dept.deptno, dname, loc
from emp, dept 
where emp.deptno = dept.deptno; 

--4
select ename, loc, dname--, sal
from emp
inner join dept
on emp.deptno = dept.deptno
where sal>1500;

--5
select ename, job, sal, grade 
from emp, salgrade
where sal between losal and hisal;

--6
SELECT emp.*
FROM emp
JOIN salgrade
ON grade = 3;

SELECT emp.*
FROM emp, salgrade 
where grade = 3;

--7
SELECT ename, loc
FROM emp
NATURAL JOIN dept
WHERE loc = 'DALLAS';

SELECT ename, loc
FROM emp
inner JOIN dept
on emp.deptno=dept.deptno
where loc = 'DALLAS';

--8
select ename, dept.deptno, dname, loc
from emp
inner join dept
on emp.deptno=dept.deptno
where emp.deptno='40' or emp.deptno='30' ;


select ename, emp.deptno, dname, loc
from emp, dept
where emp.deptno=dept.deptno 
and (emp.deptno='40' or emp.deptno='30');
--9

SELECT ename, dname, loc
FROM emp
left outer join dept 
ON emp.deptno = dept.deptno;

--10
SELECT ename, dname
FROM emp
FULL OUTER JOIN dept 
ON emp.deptno = dept.deptno;

--11
SELECT Prac.ename
FROM emp Prac
INNER JOIN emp Kier
ON Prac.mgr = Kier.empno
WHERE Prac.sal < Kier.sal;

select ename                                                                                    --tutaj, jak inaczej naisaæ, 
from emp
inner join salgrade
on mgr.sal>empno.sal;

--12
SELECT Prac.ename pracownik, Kier.ename kierownik, Kier.sal placa_szefa, Prac.sal placa_pracownika
FROM emp Prac
INNER JOIN emp Kier
ON Prac.mgr = Kier.empno
WHERE Prac.sal < Kier.sal;

--13                                                                                    
SELECT job 
FROM emp 
WHERE deptno = 10
UNION
SELECT job 
FROM emp 
WHERE deptno = 30;

--14
SELECT job FROM emp WHERE deptno = 10
INTERSECT
SELECT job FROM emp WHERE deptno = 30;

--15
SELECT job FROM emp WHERE deptno = 10
MINUS
SELECT job FROM emp WHERE deptno = 30;

Grupowanie w pierwszej kolejnoœci wzglêdem Deptno, w drugiej kolejnoœci wzglêdem Job:
SELECT	 Deptno, Job, SUM(Sal) AS Bud¿et
FROM 	 Emp
GROUP By  Job, Deptno;

Wypisz nazwiska pracowników, zamieszczaj¹c gwiazdkê przy pracownikach dzia³u numer 10.
SELECT Ename||'*' FROM Emp WHERE Deptno = 10
UNION
SELECT Ename FROM Emp WHERE Deptno <> 10
ORDER BY 1;






--CZÊŒÆ CZWARTA
--1
select avg(sal) as "srednia placa"
from emp;

--2
select ename, min(sal)                      
from emp
where job='CLERK'
group by ename
order by min(sal) fetch first 1 rows only;

--3
select count(*)
from emp
where deptno=20;

--4
select job, avg(sal)
from emp
group by job;

--5
select job, avg(sal)
from emp
where job <> 'MANAGER'
group by job;

--6
select job, avg(sal), deptno
from emp
group by job, deptno;

--7
select job, max(sal)
from emp
group by job;

--8
select deptno, avg(sal), count(deptno)
from emp
group by deptno
having count(deptno)>3;

--9
select job, avg(sal)
from emp
group by job
having avg(sal)>3000;

--10
select job, avg(sal), avg(sal+nvl(comm, 0))
from enp
group by job;

--11
select deptno, count(deptno)
from emp
group by deptno
having count(deptno)>3;

--12  
select empno
from emp
minus
select distinct empno
from emp;

--13                 
select empno, sal
from emp
where sal>1000
--group by job
order by sal desc;

--14                                                            
select loc, count(*)
from emp
natural join dept
group by loc
having loc='DALLAS';

--15
select max(sal), grade
from emp, salgrade
group by grade;

--16
select sal, count(*)
from emp
group by sal
having count(*)=2;

--17
select avg(sal), grade 
from emp
inner join salgrade 
on emp.sal between losal and hisal
where grade=2
group by grade;

--18
select ename, mgr
from emp
where empno in
            ();

select  mgr, count(*)
from emp
group by mgr;

where mgr in 
            (select empno
            from emp);
                        
select ename, empno, mgr
from emp;

--19
select sum(sal), grade 
from emp
inner join salgrade 
on emp.sal between losal and hisal
where grade=1
group by grade;










--CZÊŒÆ PIATA
--1
select empno, ename, sal
from emp
where sal =
            (select min(sal)
            from emp);

--2
select ename, empno, job                                    
from emp
where job =
            (select job
            from emp
            where ename= 'BLAKE');
            
--3
select ename, empno, sal
from emp 
where sal in
        (select min(sal)
        from emp
        group by deptno);

--4
select ename, empno, sal
from emp
where (sal, deptno) in
                    (select min(sal), deptno
                    from emp
                    group by deptno);

--5
select ename, sal
from emp
where sal > any
            (select sal
            from emp
            where deptno=30);

--6

select ename, sal
from emp
where sal > all
            (select sal
            from emp
            where deptno=30);

--7
select deptno
from emp
where avg(sal) >
            (select avg(sal)
            from emp
            where deptno=30);

--8

select job , max(sal)
from    (select job, avg(sal)
        from emp
        group by job)
group by job; 
        
select job, avg(sal)
from emp
where avg(sal) >any
            (select avg(sal)
            from emp
            group by job); 

--9
select ename, empno, sal
from emp
where sal > 
            (select max(sal)
            from emp
            natural join dept            
            where dname='SALES');

--10

select *
from emp
where job =(
            select job
            from emp 
            where empno=7369) 
and sal >(
            select sal
            from emp
            where empno=7876);

--11

select dname
from dept
natural join emp
where empno in
            (select empno 
            from emp
            where job ='CLERK'); 





--CZÊŒÆ SZOSTA
--1
select *
from emp e1
where e1.sal =  (select max(sal)
                from emp e2);
                where e2.deptno = e1.deptno);
                
--2
select *
from emp e1
where e1.sal>
            (select avg(sal)
            from emp e2
            where e1.deptno=e2.deptno);

--3
select *
from emp e1
where e1.sal =  (select min(sal)
                from emp e2
                where e2.deptno = e1.deptno);
   
--4                                                         --to jeest zle
select *
from emp e1
where exists    (select 'x'
                from emp e2
                where e1.deptno=e2.deptno);

--5
select *
from emp
natural join dept
where dname not exists  (select 'x'
                        from dept
                        where emp.deptno=dept.deptno);

--6
select dname
from dept
where; 
















--4
select *
from emp m
where exists   (select 1
                from emp e
                where e.mgr = m.empno);
                
            
--2ga baza danych

--1
SELECT *
FROM Gosc
order by imie;

--2
select DISTINCT procent_rabatu
from gosc
order by procent_rabatu desc;

--3
select ;

--9
select g.Imie, g.Nazwisko
from Gosc g join rezerwacja r on g.idgosc = r.idgosc
group by g.idgosc, g.imie, g.nazwisko
having count(1)>=3;


























