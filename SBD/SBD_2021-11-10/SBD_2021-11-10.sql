select * from emp;


--1
create trigger	trigzad1
on				emp
for				delete
as
begin
	print'nie mo¿na usuwaæ z tabeli emp'
	rollback;
end;

disable trigger trigzad1 on emp;

delete from emp
where empno=7937;

--2===============================================
alter trigger	trigzad2
on				emp
for				insert
as
begin
	declare @help int;
	select @help =empno from inserted;
	if not exists(select comm from inserted)
		begin	update emp
				set comm=100
				where empno=@help;
		end;
		print 'ustawiono "comm" na wartoœæ 100';
end;
	
--albo---------------------------------------------

alter trigger	trigzad2
on				emp
for				insert
as
begin
	declare @help1 money;
	declare @help2 int;
	select @help1=comm from inserted;
	select @help2=empno from inserted;
	if @help1 is null
		begin	
				update emp
				set comm=100
				where empno=@help2;
		end;
		print 'ustawiono "comm" na wartoœæ 100';
end;

insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(9998, 'sdads','lolxD', null, getdate(),1000,null,10);

delete  from emp
where empno=9999 or empno=9998;

disable trigger trigzad2 on emp;

--3=============================================================

create trigger	trigzad3
on				emp
for				insert, update
as
begin
	declare @numer int;
	declare @hajs money;
	select @hajs =sal from inserted;
	select @numer=empno from inserted;
	if @hajs <1000
		begin 
			rollback;
			raiserror('zg³aszam b³¹d i nie dopuszczam do wstawienia rekordu',4,10)
		end;
end;

insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(9998, 'sdads','lolxD', null, getdate(),900,null,10);

update emp
set sal=900
where empno=7937;

disable trigger trigzad3 on emp;

--4=================================================================================
Create TABLE budzet (wartosc INT NOT NULL);
INSERT INTO budzet (wartosc)
SELECT SUM(sal) FROM emp;
select * from budzet;

alter trigger	trigzad4
on				emp
for				insert, delete, update
as
begin

	declare @szmal int;
	declare @napis int;
	select @napis=wartosc from budzet;
	select @szmal=sal from inserted;
	if exists (select 1 from inserted where sal is not null)
		begin
			print 'wartosc budzet zmienila sie z '+cast(@napis as varchar);
			INSERT INTO budzet (wartosc)
			SELECT SUM(sal) FROM emp;
			select @napis=wartosc from budzet;
			print ' na '+cast(@napis as varchar) ;
		end;
end;
		
update emp
set sal=1500
where empno=7937;

disable trigger trigzad4 on emp;

--zad5=========================================================================

select * from dept;

create trigger	trigzad5
on				dept
for				update
as
begin
	--declare @numer int;
	declare @nazwa varchar(50);
	select @nazwa=(select dname from inserted)
	if (@nazwa is not null)
		begin
			print 'no kolego nie dam Ci zmieniæ nazwy dzia³u :P';
			rollback;
		end;
end;

disable trigger trigzad5 on dept;

update dept
set dname='kupa'
where deptno =50;

insert into dept(deptno, dname, loc)
values(50, 'lolalepadaka', 'wwa_udaje_narnie');

delete from dept
where dname ='kupa';

--zad6=================================================================

alter trigger	trigzad6
on				emp
for				delete, update, insert
as
begin
	declare @hajsiwo money, @nazwa_upd varchar(30),@nazwa_ins varchar(30);
	select @nazwa_upd=ename from deleted;
	select @nazwa_ins=ename from inserted;
	select @hajsiwo=sal from deleted;
	if @hajsiwo>0
		begin
			print 'sory kolego ale nie mo¿na usun¹æ tego pracownika bo ma sal wiêksze ni¿ 0';
			rollback;
		end
	else if @nazwa_upd is not null
		begin
			print'niestety ale nie mo¿esz mu zmieniæ imienia'
			rollback;
		end;
	else if @nazwa_ins is not null
		begin
			print'tutaj powinien byc kursor'	
		end;
end;
select* from emp;

delete from emp
where empno=7937;
declare @qqq int; select @qqq=(select max(empno)+1 from emp); print 'siema'+cast(@qqq as varchar);

insert into emp(empno, ename, job, hiredate, sal, deptno)
values(7938, 'lubie_placki','jakapraca', getdate(),900,50);



--zad7===============================================================

