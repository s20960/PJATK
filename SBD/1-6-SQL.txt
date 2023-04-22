-- ========= Czesc 1 samemu =========

 -- Proste zapytania, zwracające wszystkie rekordy z jednej tabeli. 

--1.Wypisz numery departamentów, nazwiska pracowników oraz numery pracownicze ich szefów z tabeli EMP.

SELECT deptno, ename, mgr FROM emp;

--2. Wypisz wszystkie wartości wszystkich kolumn z tabeli EMP.

SELECT * FROM emp;

--3. Wylicz wartość rocznej pensji podstawowej (12 płac miesięcznych) dla każdego pracownika.

SELECT ename, 12*sal roczna_pensja FROM emp;

--4. Wypisz nazwisko i wartości rocznej pensje podstawowej każdego pracownika, jeśli każdy dostanie podwyżkę o 250.

SELECT ename, sal*12 + 250 roczna_pensja_podstawowa FROM emp;

--5. Wypisz nazwisko i wartości rocznej pensji podstawowej każdego pracownika. Wynikową kolumnę nazwij(zaetykietuj) nagłówkiem Roczna.

SELECT ename, 12*sal + 250 "Roczna" FROM emp;

--6. Kolumnę zawierającą wyniki operacji sal * 12 opatrz nagłówkiem Płaca Roczna.

SELECT ename, 12*sal + 250 "Paca Roczna" FROM emp;

--7. Wypisz w jednej kolumnie połączone (skonkatenowane) numery i nazwiska pracowników. Kolumnę wynikową zaetykietuj nagłówkiem Zatrudniony.

SELECT empno || '  ' || ename "Zatrudniony" FROM emp;

--8. Utwórz zapytanie zwracające tekst: „Pracownik numer i nazwisko pracownika pracuje w dziale nr numer działu i zarabia płaca” z nagłówkiem Dane pracownika.

SELECT 'Pracownik ' || empno || ' ' || ename || ' pracuje w dziale nr ' || deptno || ' i zarabia ' || sal "Dane pracownika" FROM emp;

--9. Dla każdego pracownika wypisz jego nazwisko i całkowite roczne dochody (z uwzględnieniem prowizji, czyli 12 płac miesięcznych + prowizja).

SELECT ename || '  ' || (12*sal + NVL(comm,0)) "Roczne dochody" FROM emp;

--10. Wypisz wszystkie numery departamentów występujące w tabeli EMP.

SELECT deptno FROM emp;

--11. Wypisz wszystkie różne numery departamentów występujące w tabeli EMP.

SELECT DISTINCT deptno from emp;

--12. Wypisz wszystkie wzajemnie różne kombinacje wartości deptno i job.

--SELECT 

--14. Posortuj malejąco wszystkie dane tabeli EMP według daty zatrudnienia (hiredate), począwszy od ostatnio zatrudnionych.

SELECT *
FROM emp
ORDER BY hiredate DESC;

--15. Posortuj dane tabeli EMP według wzrastającej wartości kolumny deptno, oraz malejących wartości kolumny sal

SELECT *
FROM emp
ORDER BY deptno, sal DESC;


-- ========= Czesc 2 samemu =========

 -- Ograniczenie zwracanych rekordów przez zastosowanie klauzuli WHERE. 

--1. Wypisz nazwiska, numery pracowników, stanowiska pracy, płacę i numery departamentów wszystkich zatrudnionych na stanowisku CLERK.

SELECT ename, empno, job, sal, deptno
FROM emp
WHERE job = 'CLERK';

--2. Wypisz wszystkie nazwy i numery departamentów większe od 20. 

SELECT dname, deptno
FROM dept
WHERE deptno > 20;

--3. Wypisz nazwiska pracowników, których prowizja przekracza miesięczną pensję. 

SELECT ename
FROM emp
WHERE comm > sal;

--4. Znajdź wszystkie dane tych pracowników, których zarobki mieszczą się w przedziale pomiędzy 1000 a 2000. 

SELECT *
FROM emp e
WHERE e.sal BETWEEN 1000 AND 2000;

--5. Znajdź nazwiska i numery pracowników, których bezpośrednimi szefami są 7902, 7566 lub 7788. 

SELECT e.ename, e.empno
FROM emp e
WHERE e.mgr IN(7902,7566,7788);

--6. Znajdź nazwiska pracowników zaczynające się na literę S. 

SELECT e.ename
FROM emp e
WHERE ename LIKE 'S%';

--7. Znajdź czteroliterowe nazwiska pracowników. 

SELECT e.ename
FROM emp e
WHERE LENGTH (ename) = 4;

--8. Znajdź wszystkie dane pracowników, którzy nie posiadają szefa. 

--9. Znajdź dane tych pracowników, których zarobki są poza przedziałem <1000, 2000>. 

SELECT *
FROM emp e
WHERE e.sal NOT BETWEEN 1000 AND 2000;

--10. Znajdź nazwiska pracowników zaczynające się na literę M. 

SELECT e.ename
FROM emp e
WHERE e.ename LIKE 'M%';

--11. Znajdź dane tych pracowników, którzy mają szefa. 

--12. Znajdź dane tych pracowników zatrudnionych na stanowisku CLERK, których zarobki mieszczą się w przedziale <1000, 2000>.

SELECT *
FROM emp e
WHERE e.job = 'CLERK' AND e.sal >= 1000 AND e.sal <= 2000;

--13. Znajdź dane tych pracowników, którzy są zatrudnieni na stanowisku CLERK, lub ich zarobki mieszczą się w przedziale <1000, 2000>. 

SELECT *
FROM emp e
WHERE e.job = 'CLERK' OR (e.sal >= 1000 AND e.sal <= 2000);

--14. Znajdź wszystkich pracowników zatrudnionych na stanowisku MANAGER z pensją powyżej 1500, oraz wszystkich na stanowisku SALESMAN. 

SELECT *
FROM emp
WHERE (job = 'MANAGER' AND sal > 1500) OR job = 'SALESMAN';

--15. Znajdź wszystkich pracowników zatrudnionych na stanowisku MANAGER, lub na stanowisku SALESMAN z pensją powyżej 1500. 

--16. Znajdź wszystkich pracowników zatrudnionych na stanowisku MANAGER ze wszystkich departamentów, wraz ze wszystkimi pracownikami zatrudnionymi na stanowisku CLERK w departamencie 10. 

SELECT *
FROM emp
WHERE job = 'MANAGER' OR (job = 'CLERK' AND deptno = 10);

--17. Wypisz wszystkie dane z tabeli SALGRADE. 

SELECT *
FROM salgrade;

--18. Wypisz wszystkie dane z tabeli DEPT. 

SELECT *
FROM dept;

--19. Znajdź dane tych pracowników zatrudnionych na stanowisku CLERK, których zarobki nie mieszczą się w przedziale <1000, 2000>. 

SELECT *
FROM emp
WHERE job = 'CLERK' AND (sal < 1000 OR sal > 2000);

--20. Wypisz numery i nazwy departamentów, sortując wynikowe rekordy rosnąco według numerów departamentów. 

SELECT deptno, dname
FROM dept
ORDER BY deptno;

--21. Wypisz wszystkie wzajemnie różne (niepowtarzające się) stanowiska pracy. 

SELECT DISTINCT job
FROM emp;

--22. Wypisz nazwiska, stanowiska i numery departamentów pracowników zatrudnionych w departamentach 10 i 20 w kolejności alfabetycznej nazwisk pracowników.


--23. Wypisz nazwiska, stanowiska i numery departamentów wszystkich pracowników z departamentu 20 zatrudnionych na stanowisku CLERK. 


--24. Wypisz nazwiska, w których występuje ciąg liter „TH” lub „LL”. 

SELECT ename
FROM emp
WHERE ename LIKE '%TH%' OR ename LIKE '%LL%';

--25. Wypisz nazwisko, stanowisko i pensję pracowników, którzy posiadają szefa. 

SELECT ename, job, sal
FROM emp
WHERE mgr IS NOT null;

--26. Dla każdego pracownika wypisz jego nazwisko i całoroczne dochody. 

SELECT ename, sal*12 + NVL(comm,0) "Roczna Pensja"
FROM emp;

--27. Wypisz numer departamentu i datę zatrudnienia pracowników, którzy zostali zatrudnieni w 1982 r. 

SELECT deptno, hiredate
FROM emp
WHERE hiredate >= '82/01/01' AND hiredate <= '82/12/31';

--28. Wypisz nazwiska, roczną pensję oraz prowizję tych wszystkich SALESMAN’ów, których miesięczna pensja przekracza prowizję. Wyniki posortuj według malejących zarobków, potem nazwisk (rosnąco). 

 SELECT ename, sal*12 "Roczna Pensja", NVL(comm,0) comm
 FROM emp
 WHERE job = 'SALESMAN' AND sal > NVL(comm,0)
 ORDER BY sal DESC, ename;
 
 
 -- ========= Czesc 3 samemu =========
 
 -- Zapytania operujące na złączeniu tabel. 
 
--1. Wypisz wszystkie dane z tabel EMP i DEPT. 

SELECT *
FROM emp, dept;

--2. Wybierz nazwiska wszystkich pracowników, oraz nazwy departamentów w których są zatrudnieni. Zwracane rekordy posortuj w kolejności alfabetycznej nazwisk. 

SELECT ename, dname
FROM emp
NATURAL JOIN dept;

--3. Wybierz nazwiska wszystkich pracowników, wraz z numerami, nazwami i lokalizacjami departamentów, w których są oni zatrudnieni. 

SELECT ename, deptno, dname, loc
FROM emp
NATURAL JOIN dept;

--4. Dla pracowników o miesięcznej pensji powyżej 1500 podaj ich nazwiska, miejsca usytuowania ich departamentów, oraz nazwy tych departamentów.

SELECT ename, loc, dname
FROM emp
NATURAL JOIN dept;

--5. Utwórz listę pracowników podając ich nazwisko, zawód, pensję i stopień zaszeregowania (grupę zarobkową). 

SELECT ename, job, sal
FROM emp
JOIN salgrade
ON sal BETWEEN losal AND hisal;

--6. Wypisz informacje o pracownikach, których zarobki odpowiadają 3 klasie zarobkowej.

SELECT *
FROM emp
JOIN salgrade
ON grade = 3;

--7. Wybierz pracowników zatrudnionych w DALLAS. 

SELECT ename, loc
FROM emp
NATURAL JOIN dept
WHERE loc = 'DALLAS';

--8. Wybierz pracowników z działu 30 i 40 (nazwisko, nr. działu, nazwa działu, lokalizacja). Wypisz również dane działu, 40 w którym niema  pracowników. 

--9. Wypisz nazwisko, nazwę i lokalizacje działu wszystkich pracowników. Uwzględnij także tych pracowników, którzy nie są przypisani do żadnego działu. 

SELECT ename, dname, loc
FROM emp
LEFT OUTER JOIN dept ON emp.deptno = dept.deptno;

--10. Wypisz nazwiska wszystkich pracowników oraz nazwy wszystkich działów. W wyniku maja pojawić się nazwiska pracowników nie przypisanych do żadnych działów, a także nazwy działów, w których nie są zatrudnieni pracownicy. 

SELECT ename, dname
FROM emp
FULL OUTER JOIN dept ON emp.deptno = dept.deptno;

--11. Wypisz nazwiska pracowników, którzy zarabiają mniej od swoich kierowników. 

SELECT Prac.ename
FROM emp Prac
INNER JOIN emp Kier
ON Prac.mgr = Kier.empno
WHERE Prac.sal < Kier.sal;

--12. Do rozwiązania zadania 11 dołącz nazwiska szefów, oraz płace szefów i ich podwładnych. 

SELECT Prac.ename pracownik, Kier.ename kierownik, Kier.sal placa_szefa, Prac.sal placa_pracownika
FROM emp Prac
INNER JOIN emp Kier
ON Prac.mgr = Kier.empno
WHERE Prac.sal < Kier.sal;

--13. Wykorzystując operację na zbiorach wyników, wypisz stanowiska występujące w dziale 10 lub w dziale 30. 

SELECT job FROM emp WHERE deptno = 10
UNION
SELECT job FROM emp WHERE deptno = 30;

--14. Wykorzystując operację na zbiorach wyników, wypisz stanowiska występujące zarówno w dziale 10, jak i w dziale 30. 

SELECT job FROM emp WHERE deptno = 10
INTERSECT
SELECT job FROM emp WHERE deptno = 30;

--15. Wykorzystując operację na zbiorach wyników, wypisz stanowiska występujące w dziale 10, a nie występujące w dziale 30.

SELECT job FROM emp WHERE deptno = 10
MINUS
SELECT job FROM emp WHERE deptno = 30;

 -- ========= Czesc 4 samemu =========
 
 -- Zapytania z użyciem funkcji agregujących. Grupowanie rekordów. 

--1. Oblicz średni zarobek w firmie, nazywając wynikową kolumnę Średnia płaca 

SELECT AVG(sal) "Srednia placa" FROM emp;

--2. Znajdź minimalne zarobki na stanowisku CLERK. 

SELECT MIN(sal) FROM emp
WHERE job = 'CLERK';

--3. Policz pracowników zatrudnionych w departamencie 20. 

SELECT COUNT(1) FROM emp
WHERE deptno = 20;

--4. Oblicz średnie zarobki na każdym ze stanowisk pracy. 

SELECT job, AVG(sal) FROM emp
GROUP BY job;

--5. Obliczy średnie zarobki na każdym ze stanowisk pracy, z wyjątkiem stanowiska MANAGER. 

SELECT job, AVG(sal)FROM emp
WHERE job != 'MANAGER'
GROUP BY job;

--6. Obliczy średnie zarobki na każdym ze stanowisk pracy w każdym departamencie. 

SELECT dname, job, AVG(sal)FROM emp
INNER JOIN dept ON emp.deptno = dept.deptno
GROUP BY dname, job;

--7. Oblicz maksymalne zarobki dla każdego stanowiska. 

--8. Wybierz średnie zarobki tych departamentów, które zatrudniają więcej niż trzech pracowników. 

--9. Wybierz stanowiska, na których średni zarobek wynosi 3000 lub więcej. 

SELECT job, AVG(sal)FROM emp
GROUP BY job
HAVING AVG(sal) >= 3000;

--10. Znajdź średnie miesięczne pensje oraz średnie roczne dochody  dla każdego stanowiska (pamiętaj o prowizji). 

SELECT job, AVG(sal) srednia_pensja, AVG((sal * 12) + NVL(comm, 0))roczna_srednia_pensja
FROM emp GROUP BY job;

--11. Znajdź departamenty zatrudniające więcej niż trzech pracowników. 

SELECT deptno, COUNT(1)
FROM emp
GROUP BY deptno
HAVING count(1) > 3;

--12. Sprawdź, czy wszystkie numery pracowników są rzeczywiście wzajemnie różne. 

SELECT MAX(COUNT(*))
FROM emp
GROUP BY empno;

--13. Podaj najniższe pensje wypłacane podwładnym swoich kierowników. Wyeliminuj grupy o minimalnych zarobkach niższych niż 1000. Uporządkuj wyniki malejąco według wielkości pensji. 

--14. Policz, ilu pracowników ma dział mający siedzibę w DALLAS. 


--15. Podaj maksymalne zarobki dla każdej grupy zarobkowej. 

SELECT grade, MAX(sal)
from emp, salgrade
WHERE sal BETWEEN losal AND hisal
GROUP BY grade;

--16. Sprawdź, które wartości zarobków powtarzają się i ilu pracowników je otrzymuje. 

--17. Podaj średni zarobek pracowników z drugiej grupy zarobkowej 

--18. Sprawdź, ilu podwładnych ma każdy kierownik, podając nazwisko kierownika. 

--19. Podaj sumę, którą zarabiają razem wszyscy pracownicy z pierwszej grupy zarobkowej. 

SELECT SUM(sal)
FROM emp, salgrade
WHERE sal BETWEEN losal AND hisal AND grade = 1;

 -- ========= Czesc 5 samemu =========
 
 -- Zapytania z podzapytaniem
 
--1. Znajdź pracowników z pensją równą minimalnemu zarobkowi w firmie.

SELECT ename, sal
FROM emp
WHERE sal = (SELECT MIN(Sal)FROM Emp);

--2. Znajdź wszystkich pracowników zatrudnionych na tym samym stanowisku, co BLAKE.

SELECT ename, job
FROM emp
WHERE job = (SELECT job FROM emp WHERE ename = 'BLAKE');

--3. Znajdź pracowników, których płace wynoszą tyle, ile najniższe zarobki w poszczególnych departamentach.


--4. Znajdź pracowników o najniższych zarobkach w ich departamentach.
-----------------------------------------------------------------------------------------------------------
--      UWAGA: różnica pomiędzy zadaniem 3 i 4 polega na tym, że w zadaniu 3 warunkiem jest tylko płaca równa najniższej
--      płacy w DOWOLNYM departamencie; w zadaniu 4 szukamy najmniej zarabiających w SWOIM departamencie. W
--      ORACLE możemy porównywać listy wartości (w tym przypadku pary Sal i Deptno). W MS SQL Server taka możliwość
--      nie istnieje - zadanie należy rozwiązać stosując zapytanie skorelowane z podzapytaniem.
---------------------------------------------------------------------------------------------------------------------------

--5. Stosując kwantyfikator ANY wybierz pracowników zarabiających powyżej najniższego zarobku z departamentu 30 
--(czyli więcej od dowolnego pracownika z departamentu 30).

SELECT ename, sal 
FROM emp
WHERE sal > ANY (SELECT sal FROM emp
                 WHERE deptno = 30);

--6. Stosując kwantyfikator ALL znajdź pracowników, których zarobki są wyższe od pensji każdego pracownika
--z departamentu 30 (czyli większe od najwyższej pensji w departamencie 30).

SELECT ename, sal 
FROM emp
WHERE sal > ALL (SELECT sal FROM emp
                 WHERE deptno = 30);

--7. Wybierz departamenty, których średnie zarobki przekraczają średni zarobek departamentu 30.
                            
--8. Znajdź stanowisko, na którym są najwyższe średnie zarobki.

SELECT job, AVG(sal) srednie_zarobki 
FROM emp
GROUP BY job
HAVING AVG(sal) = (SELECT MAX(AVG(sal)) 
		   FROM emp
                   GROUP BY JOB);

---------------------------------------------------------------------------------------------------------------------------
--      WSKAZÓWKA: w ORACLE można stosować zagnieżdżenia funkcji agregujących. W MS SQL Server należy posłużyć się
--      albo zapytaniem skorelowanym (patrz dział VI), albo użyć kwantyfikatora ALL.
---------------------------------------------------------------------------------------------------------------------------

--9. Znajdź pracowników, których zarobki przekraczają najwyższe pensje z departamentu SALES.

SELECT ename, sal
FROM emp
WHERE sal > (SELECT MAX(e.sal) 
             FROM emp e
             INNER JOIN dept d ON e.deptno = d.deptno
             WHERE d.dname = 'SALES');

--10. Znajdź pracowników, którzy pracują na tym samym stanowisku, co pracownik o numerze 7369 i których zarobki są większe niż pracownika o numerze 7876.

SELECT ename, job, sal 
FROM emp
WHERE job = (SELECT job FROM emp
                WHERE empno = 7369)
	AND
    sal > (SELECT sal FROM emp
                WHERE empno = 7876);


--11. Wypisz nazwy działów w których pracują urzędnicy (CLERK).

SELECT DISTINCT dname 
FROM dept d
INNER JOIN emp e ON d.deptno = e.deptno
WHERE e.job = 'CLERK';


 -- ========= Czesc 6 samemu =========
 
 --Zapytania skorelowane z podzapytaniem. Nietypowe rozwiązania. 
 
 --1. Znajdź pracowników, którzy zarabiają najwięcej w swoich departamentach.  
 
 SELECT e1.ename, e1.sal, e1.deptno
 FROM emp e1
 WHERE e1.sal = (SELECT MAX(e2.sal)
                    FROM emp e2
                    WHERE e1.deptno = e2.deptno);
 
 --2. Znajdź pracowników, którzy zarabiają powyżej średniej w ich departamentach. 
 
 SELECT e1.ename, e1.sal, e1.deptno
 FROM emp e1
 WHERE sal > (SELECT AVG(sal)
                FROM emp e2
                WHERE e1.deptno = e2.deptno);
 
 --3. Znajdź pracowników o najniższych zarobkach w ich stanowiskach. 
 
 SELECT ename, sal, job
 FROM emp a
 WHERE sal = (SELECT MIN(sal)
                FROM emp b
                WHERE a.job = b.job);
 
 --4. Znajdź za pomocą predykatu EXISTS pracowników, którzy posiadają podwładnych. 
 
SELECT ename 
FROM emp a
WHERE EXISTS (SELECT 1 
              FROM emp b
              WHERE a.empno = b.mgr);
 
 --5. Znajdź pracowników, których departament nie występuje w tabeli DEPT. 
 
 --6. Stosując podzapytanie, znajdź nazwy i lokalizację departamentów, które nie zatrudniają żadnych pracowników. 
 
 --7. Znajdź pracowników zarabiających maksymalną pensję na ich stanowiskach pracy. Wynikowe rekordy uporządkuj według malejących zarobków. 
 
SELECT a.job, a.ename, a.sal 
FROM emp a
WHERE a.sal = (SELECT MAX(b.sal)
                    FROM emp b
                    where a.job = b.job)
ORDER BY sal DESC;   
 
 --8. Znajdź pracowników zarabiających minimalną pensję w ich grupach zarobkowych. Wynikowe rekordy uporządkuj według malejących grup zarobkowych.
 
 SELECT s.grade, a.ename, a.sal 
FROM emp a, salgrade s
 WHERE a.sal BETWEEN s.losal AND s.hisal AND a.sal = (SELECT MIN(b.sal)
                                                FROM emp b
                                                where a.job = b.job)
ORDER BY s.grade DESC;   
 
 --9. Wskaż dla każdego departamentu ostatnio zatrudnionych pracowników. Wynikowe rekordy uporządkuj według dat zatrudnienia. 
 
 SELECT a.deptno, a.hiredate FROM emp a
 WHERE hiredate = (SELECT MAX(hiredate) FROM emp b WHERE a.deptno = b.deptno)
 ORDER BY a.hiredate;
 
 --10. Podaj nazwisko, pensję i nazwę departamentu pracowników, których płaca przekracza średnią ich grup zarobkowych.
 
 --11. Stosując podzapytanie znajdź pracowników przypisanych do nieistniejących departamentów. 

 
 --12. Wskaż trzech najlepiej zarabiających pracowników w firmie. Podaj ich nazwiska i pensje. 
 
 --13. Wskaż pracowników, których płace należą do trzech najwyższych płac w firmie. Podaj ich nazwiska i pensje. 
 
 ---------------------------------------------------------------------------------------------------------------------------
 --      UWAGA: Zadanie 12 ma bardzo eleganckie rozwiązanie, gdy założymy, że w firmie wartości płac się nie powtarzają. 
 --      Ponieważ takie założenie jest mało prawdopodobne (i w naszym przypadku fałszywe), należy rozwiązać zadanie 13, 
 --      mające więcej wspólnego z rzeczywistością. Zadań tych NIE należy rozwiązywać przy użyciu funkcji Rownum (ORACLE) 
 --      lub Row_number Over (MS SQL Server). 
 ---------------------------------------------------------------------------------------------------------------------------
 
--14. Wypisz nazwisko, płacę, numer departamentu i średnią zarobków w departamencie (w jednym wyniku!) dla pracowników, 
--których zarobki przekraczają średnią ich departamentów (rozwiązanie nie wymaga użycia korelacji). 
--15. Napisz zapytanie generujące listę pracowników i ich dat zatrudnienia, z gwiazdką (*) w wierszu ostatnio zatrudnionego. 
--Kolumnę z gwiazdką zatytułuj MAXDATE.