select *
from gosc
order by nazwisko, imie;

select *
from kategoria;

select *
from pokoj;

select *
from rezerwacja
order by nrpokoju;

--1
select imie, nazwisko
from gosc
order by nazwisko, imie;

--2
select DISTINCT nvl(procent_rabatu,0)
from gosc
order by nvl(procent_rabatu,0);

--3
select imie, nazwisko, idrezerwacja, nrpokoju
from gosc, rezerwacja
where gosc.idgosc=rezerwacja.idgosc and imie='Ferdynand' and nazwisko='Kiepski';

--4
select imie, nazwisko, nrpokoju, dataod
from gosc, rezerwacja
where  gosc.idgosc=rezerwacja.idgosc and 
    (nazwisko like 'K%' or nazwisko like 'L%') and 
    extract(year from dataod)=2008;

--5
select imie, nazwisko, nrpokoju
from gosc, rezerwacja
where gosc.idgosc=rezerwacja.idgosc and imie='Andrzej' and nazwisko='Nowak';

--6
select imie, nazwisko, nrpokoju --nvl(nrpokoju, 'brak rezerwacji')
from gosc
left join rezerwacja
on gosc.idgosc=rezerwacja.idgosc;

--7
select imie, nazwisko, zaplacona
from gosc, rezerwacja
where gosc.idgosc=rezerwacja.idgosc and zaplacona=1;

--8
select g.imie ||' '|| g.nazwisko, r.dataod, r.datado, p.nrpokoju, k.nazwa
from gosc g
    inner join rezerwacja r on g.idgosc=r.idgosc
    inner join pokoj p on r.nrpokoju=p.nrpokoju
    inner join kategoria k on p.idkategoria=k.idkategoria;
    
--9
select zaplacona, count(1)
from rezerwacja
where zaplacona=1
group by zaplacona;

--10
select g.imie, g.nazwisko, k.nazwa
from gosc g
    inner join rezerwacja r on r.idgosc=g.idgosc
    inner join pokoj p on p.nrpokoju=r.nrpokoju
    inner join kategoria k on k.idkategoria=p.idkategoria
where k.nazwa='Luksusowy';

--11
select nrpokoju
from pokoj p, rezerwacja r
where p.nrpokoju=r.nrpokoju;

select distinct nrpokoju
from rezerwacja
order by nrpokoju;

--12
select imie, nazwisko, dataod, nrpokoju 
from gosc g
inner join rezerwacja r on g.idgosc=r.idgosc
where nrpokoju=101;

--13
select imie, nazwisko
from gosc;

--14
select nrpokoju, idkategoria, liczba_miejsc, count(liczba_miejsc)
from pokoj
where idkategoria=1;

--11
select pokoj.nrpokoju, liczba_miejsc
from pokoj left join rezerwacja on pokoj.nrpokoju=rezerwacja.nrpokoju
where rezerwacaj.nrpokoju is null;

--12
select imie, nazwisko, dataod
from gosc join rezerwacja on gosc.idgosc=rezerwacja.idgosc
where nrpokoju=101
union
select imie, nazwisko, 'brak'
from gosc left join rezerwacja on gosc.idgosc=rezerwacja.idgosc
where rezerwacja.idgosc is null;

--13
select r.idgosc, imie, nazwisko
from rezerwacja r join gosc g on r.idgosc=g.idgosc
--inner join pokoj p on r.nrpokoju=p.nrpokoju
--inner join kategoria k 
group by r.idgosc;

--POWTÓRZENIE II

select *
from emp;

select *
from dept;

select *
from salgrade;

--1
select ename, sal
from emp e
where e.sal=  (select min(sal)
             from emp);

--2
select ename
from emp
where job=(select job 
            from emp
            where ename='BLAKE');
            
--3
SELECT *
from emp
where sal in (select min(sal)
            from emp
            group by deptno);

--4



