Set Serveroutput on;


--1
declare
    tmp int:=69;
begin
    select count(1) into tmp from emp ;
    dbms_output.put_line('W tablei emp jest '|| tmp||' osób');
end;

--2
--select * from emp;
--
--declare
--    tmp int; help int;
--begin
--    select max(empno) into tmp from emp;
--    dbms_output.put_line('Zmienna tmp jest równa '||tmp);
--    select max(empno)+1 into help from emp;
--    dbms_output.put_line('Zmienna tmp jest równa '||help);
--    dbms_output.put_line(sysdate);
--end;


declare 
 tmp int; help int;
begin
    select max(empno)+1 into help from emp;
    select count(*) into tmp from emp;
    if tmp <16 then
        insert into emp
        values (help, 'KOWALSKI', 'biedak', 7566, sysdate, 600, null, 20);
        dbms_output.put_line('Dodany zostal pracownik Kowalski');
    else
        dbms_output.put_line('Pracowników jest wiêcej ni¿ 16');
    end if;    
end;

--3
select * from dept;

create or replace procedure NewDept
    (vnum dept.deptno%type, vname dept.dname%type, vlocation dept.loc%type) 
is
    vmax dept.deptno%type;
    vhelp dept.deptno%type; 
begin
    --select max(deptno)+10 into vmax from dept;
    select count(*) into vhelp from dept where dname=vname or loc=vlocation;
    if vhelp>0 then
        dbms_output.put_line('Chuja a nie wstawisz taki dzial lamusie XD');
    else
        insert into dept--(DEPTNO, DNAME,LOC)
        values(vnum, vname, vlocation);
    end if;
end;


execute NewDept(50, 'ACCOUNTINGgg', 'NEW YORK');


--4
select * from emp;
select max(empno)+1 from emp;

create or replace procedure proc_zad4
    (vdeptno emp.deptno%type, vename emp.ename%type)
is
    vminsal emp.sal%type;
    vmax emp.empno%type;
    vczyistnieje dept.deptno%type;
begin
    select min(sal) into vminsal from emp where deptno=vdeptno;
    select max(empno)+1 into vmax from emp;
    select count(*) into vczyistnieje from dept where dept.deptno=vdeptno;
    if vczyistnieje=0 then
        dbms_output.put_line('Taki dzial nie istnieje ziomeczku');
    else 
        insert into emp
        values(vmax, vename,'nie_wiem', null, sysdate, vminsal, null, vdeptno);
    end if;
end;

execute proc_zad4(50, 'no_elo');

delete from emp
where empno=50;

--5
CREATE TABLE Magazyn (
    IdPozycji int,
    nazwa varchar(255),
    Ilosc int
);
ALTER TABLE Magazyn
ADD CONSTRAINT Magazyn_PK PRIMARY KEY(IdPozycji);

select * from magazyn;

INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);

insert into magazyn(idpozycji, nazwa, ilosc)
values(1, 'ziemniaki', 53);
insert into magazyn(idpozycji, nazwa, ilosc)
values  (2, 'salata', 81);
insert into magazyn
values  (3, 'pomidory', 56);
insert into magazyn(idpozycji, nazwa, ilosc)
values  (4, 'ryz', 42);

update magazyn
set ilosc=1
where idpozycji=1;

select max(ilosc)  from magazyn;

declare 
    v_exc exception;
    vhelp1 magazyn.ilosc%type;
    vhelp2 int;
begin
    select max(ilosc) into vhelp1 from magazyn;
    --select idpozycji into vhelp2 from magazyn where ilosc=vhelp2;
    if vhelp1>5 then
        update magazyn
        set ilosc=ilosc-5
        where ilosc=vhelp1;
        dbms_output.put_line('zmniejszono ilosc produktu kapitanie');
    else
        dbms_output.put_line('widzê, ¿e ktoœ uruchamia wyjatek kapitanie');
        raise v_exc;
    end if;
    
    exception
        when v_exc then
         dbms_output.put_line('za mao produktów kapitanie zloty');
    
end;
select *from magazyn;

--====================================================================cwiczenia_2

select * from emp;
rollback;
--1
declare 
    vnr emp.empno%type; vname emp.ename%type; vhajs emp.sal%type;
    cursor cur_zad1 is select empno, ename, sal from emp;
begin
    open cur_zad1;
    loop
        fetch cur_zad1 into vnr, vname, vhajs;
        exit when cur_zad1%notfound;
        if vhajs<1000 then
            update emp
            set sal=sal*1.1
            where vnr=empno;
            dbms_output.put_line('typ ma podwy¿ke, ¿ona zrobi mu laske, profit');
        elsif vhajs>1500 then
            update emp
            set sal=sal*0.9
            where vnr=empno;        
            dbms_output.put_line('i chuj i wylondowa XDD');
        else
            dbms_output.put_line('koleœ zarabia 1000-1500 czyli jest biedakiem');
        end if;
        end loop;
    close cur_zad1;
end;


--2

create or replace procedure proc_zad2v2(
    vminimum int, vmaksimum int)
is
    vnr emp.empno%type; vname emp.ename%type; vhajs emp.sal%type;
    cursor cur_zad1 is select empno, ename, sal from emp;
begin
    open cur_zad1;
    loop
        fetch cur_zad1 into vnr, vname, vhajs;
        exit when cur_zad1%notfound;
        if vhajs<vminimum then
            update emp
            set sal=sal*1.1
            where vnr=empno;
            dbms_output.put_line('typ ma podwy¿ke, ¿ona zrobi mu laske, profit');
        elsif vhajs>vmaksimum then
            update emp
            set sal=sal*0.9
            where vnr=empno;
            dbms_output.put_line('i chuj i wylondowa XDD');
        else
            dbms_output.put_line('koleœ zarabia '||vminimum||'-'||vmaksimum||' czyli jest biedakiem');
        end if;
    end loop;
    close cur_zad1;
end;
rollback;
select * from emp;
execute proc_zad2v2(800, 2000);

--3



create or replace procedure proc_zad3v2(
    vdeptno dept.deptno%type)
is
    vsrednia int; vwiersz emp%rowtype;
    cursor cur_zad3 is select * from emp;
begin
    select avg(sal) into vsrednia from emp where deptno=vdeptno;
    open cur_zad3;
    loop
        fetch cur_zad3 into vwiersz;
        exit when cur_zad3%notfound;
        if vwiersz.sal<vsrednia then
            update emp
            set comm=vwiersz.sal*0.05     --isnull(vwiersz.comm,0)
            where empno=vwiersz.empno and deptno=vdeptno;
            dbms_output.put_line('Pracownikowi: '||vwiersz.empno||' '||vwiersz.ename||' '||vwiersz.sal||' zostala przyznana premia');
        else
            dbms_output.put_line('Pracownikowi: '||vwiersz.empno||' '||vwiersz.ename||' '||vwiersz.sal||' zarabaia wystarczajaco');
        end if;
    end loop;
    close cur_zad3;
end;

rollback;

select * from emp where deptno=10;
select avg(sal) from emp where deptno=10;
execute proc_zad3v2(10);

declare 
    vwiersz emp%rowtype;
    cursor cur_zad is select * from emp;
begin
    open cur_zad;
    loop
        fetch cur_zad into vwiersz;
        exit when cur_zad%notfound;
        dbms_output.put_line('testowañsko: '||vwiersz.empno||' '||vwiersz.ename||' '||vwiersz.sal||' ');
    end loop;
    close cur_zad;
end;


-- tables
-- Table: Marka
CREATE TABLE Marka (
    IdMarka integer  NOT NULL,
    Marka varchar2(50)  NOT NULL,
    CONSTRAINT Marka_pk PRIMARY KEY (IdMarka)
) ;

-- Table: Przeglad
CREATE TABLE Przeglad (
    IdPrzeglad integer  NOT NULL,
    DataPrzegladu timestamp  NOT NULL,
    IdSamochod integer  NOT NULL,
    DoZaplaty number(3,2)  NOT NULL,
    CONSTRAINT Przeglad_pk PRIMARY KEY (IdPrzeglad)
) ;

-- Table: Samochod
CREATE TABLE Samochod (
    IdSamochod integer  NOT NULL,
    RocznikProd integer  NOT NULL,
    IdMarka integer  NOT NULL,
    IdWlasciciel integer  NOT NULL,
    CONSTRAINT Samochod_pk PRIMARY KEY (IdSamochod)
) ;

-- Table: Usluga
CREATE TABLE Usluga (
    IdUsluga integer  NOT NULL,
    Nazwa varchar2(40)  NOT NULL,
    CenaBazowa number(3,2)  NOT NULL,
    CONSTRAINT Usluga_pk PRIMARY KEY (IdUsluga)
) ;

-- Table: UslugaWPrzegladzie
CREATE TABLE UslugaWPrzegladzie (
    IdUsluga integer  NOT NULL,
    IdPrzeglad integer  NOT NULL,
    Usluga_IdUsluga integer  NOT NULL,
    CONSTRAINT UslugaWPrzegladzie_pk PRIMARY KEY (IdUsluga)
) ;

-- Table: Wlasciciel
CREATE TABLE Wlasciciel (
    IdWlasciciel integer  NOT NULL,
    Imie varchar2(30)  NOT NULL,
    Nazwisko varchar2(50)  NOT NULL,
    CONSTRAINT Wlasciciel_pk PRIMARY KEY (IdWlasciciel)
) ;

-- foreign keys
-- Reference: Samochod_Marka (table: Samochod)
ALTER TABLE Samochod ADD CONSTRAINT Samochod_Marka
    FOREIGN KEY (IdMarka)
    REFERENCES Marka (IdMarka);

-- Reference: Samochod_Wlasciciel (table: Samochod)
ALTER TABLE Samochod ADD CONSTRAINT Samochod_Wlasciciel
    FOREIGN KEY (IdWlasciciel)
    REFERENCES Wlasciciel (IdWlasciciel);

-- Reference: Table_7_Samochod (table: Przeglad)
ALTER TABLE Przeglad ADD CONSTRAINT Table_7_Samochod
    FOREIGN KEY (IdSamochod)
    REFERENCES Samochod (IdSamochod);

-- Reference: UslugaWPrzegladzie_Table_7 (table: UslugaWPrzegladzie)
ALTER TABLE UslugaWPrzegladzie ADD CONSTRAINT UslugaWPrzegladzie_Table_7
    FOREIGN KEY (IdPrzeglad)
    REFERENCES Przeglad (IdPrzeglad);

-- Reference: UslugaWPrzegladzie_Usluga (table: UslugaWPrzegladzie)
ALTER TABLE UslugaWPrzegladzie ADD CONSTRAINT UslugaWPrzegladzie_Usluga
    FOREIGN KEY (IdUsluga)
    REFERENCES Usluga (IdUsluga);

-- End of file.

select p.idprzeglad, p.dataprzegladu, p.idsamochod, p.dozaplaty, usl.nazwa
into row_przeglad 
from przeglad p
    left join UslugaWPrzegladzie uwp on p.idprzeglad=uwp.idprzeglad
    join usluga usl on usl.idusluga=uwp.idusluga;


dbms_output.put_line('testowañsko: '||row_przeglad.przeglad||' '||row_przeglad.dataprzegladu||' '||vwiersz.sal||' ');

cursor cur_zad1 is  select p.idprzeglad, p.dataprzegladu, p.idsamochod, p.dozaplaty, usl.nazwa
                        from przeglad p
                            left join UslugaWPrzegladzie uwp on p.idprzeglad=uwp.idprzeglad
                            join usluga usl on usl.idusluga=uwp.idusluga;






create or replace procedure wklejKurwe(p_id_samochod samochod.idsamochod%type)
is
row_num int;
curidprzeglad przeglad.idprzeglad%type;
curdataprzegladu przeglad.dataprzegladu%type;
curidsamochod przeglad.idsamochod%type;
curdozaplaty przeglad.dozaplaty%type;
curnazwa usluga.nazwa%type;
cursor cur_zad1 is  select p.idprzeglad, p.dataprzegladu, p.idsamochod, p.dozaplaty, usl.nazwa
                    from przeglad p
                        left join UslugaWPrzegladzie uwp on p.idprzeglad=uwp.idprzeglad
                        join usluga usl on usl.idusluga=uwp.idusluga
                    where IdSamochod=p_id_samochod;
begin
    select count(*) into row_num from przeglad where IdSamochod=p_id_samochod;
    if row_num > 0 then
        open cur_zad1;
        loop
            fetch cur_zad1 into curidprzeglad,curdataprzegladu,curidsamochod,curdozaplaty,curnazwa;
            exit when cur_zad1%notfound;
            dbms_output.put_line('dane samochodu'||curidprzeglad||' '||curdataprzegladu);
        end loop;
        close cur_zad1;
    else
        raise_application_error(-20000, 'Nie znalezniono zadnego przegladu dla danego samochodu');
    end if;
end;




/
select p.idprzeglad, p.dataprzegladu, u.nazwa from przeglad p
left join uslugawprzegladzie uwp
on p.idprzeglad=uwp.idprzeglad
left join usluga u on
uwp.idusluga=u.idusluga;
select p.idprzeglad, p.dataprzegladu, p.idsamochod, p.dozaplaty, usl.nazwa
from przeglad p
    left join UslugaWPrzegladzie uwp on p.idprzeglad=uwp.idprzeglad
    join usluga usl on usl.idusluga=uwp.idusluga;



