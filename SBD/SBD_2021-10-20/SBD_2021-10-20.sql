select * from emp;

delete from emp
where empno=9999;

--1
declare @zmienna1 int=(select count(1) from emp);

print 'W tabeli jest '+cast(@zmienna as varchar)+' osób';

--2
declare @zmienna2 int=(select count(1) from emp);

if @zmienna2 < 16
	begin 
		declare @numerID integer;
		select @numerID = max(empno)+1 from emp;
		
		insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
		values(@numerID,'Kowalski', 'Employee', null, getdate(), 1000, null, 10)
		print 'wstawiono nowego pracownika '+cast(@numerID as varchar)
	end
else
	print 'Nie wstawiono danych'

--3
create procedure procv3
	@hajs int
as
begin
	declare kursorv3 cursor for	select ename, sal
								from emp
	declare @ename varchar(30), @sal money;
	open kursorv3;
	fetch next from kursorv3 into @ename, @sal;
	while @@FETCH_STATUS=0
	begin
		if @hajs <@sal
		begin
			print 'pracownik '+cast(@ename as varchar)+' zarabia wiêcej ni¿ '+cast(@hajs as varchar)+' czyli dok³adnie '+cast(@sal as varchar)
		end
		fetch next from kursorv3 into @ename, @sal;
	end;
	close kursorv3;
	deallocate kursorv3;
end;

exec procv3 2000;
drop procedure procv3;


---mo¿na te¿ tak

create procedure czyZarabiaWincyj
	@kasa int
as
begin
	select *
	from emp
	where sal>@kasa
end;

exec czyZarabiaWincyj 1000;
exec czyZarabiaWincyj 2000;

drop procedure czyZarabiaWincyj;

--4
select * from dept;

create procedure procv4
	@nr_dzialu int, @nazwa varchar(50), @loc varchar(50)
as
begin
	if exists(	select * 
				from dept d
				where d.Deptno=@nr_dzialu or d.Dname=@nazwa or d.Loc=@loc)
		begin
			print 'dzia³ o wskazanych danych ju¿ istnieje'
		end
	else
		begin
			--declare @numer_dzialu int
			--set @numer_dzialu=(select max(deptno)+1 from dept)
			insert into dept(deptno, dname, loc)
			values(@nr_dzialu, @nazwa, @loc)
		end
end;

exec procv4 15, 'sprzedarze', 'Pcim';
delete from dept where deptno=15;

--5
alter procedure procv5
	@nazwisko varchar(30), @nr_dzialu int
as
begin
	if not exists(	select ename, deptno 
					from emp
					where @nazwisko=ename or @nr_dzialu=Deptno)
		begin
			raiserror('department does not exist',11,-1);
		end
	else 
		begin
			declare @numer int=(select max(empno)+1 from emp)
			declare @pensja int=(select min(sal) from emp)
			insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
			values(@numer, @nazwisko, 'employee', null, getdate(), @pensja, null, @nr_dzialu)
		end
end;

exec procv5 'pcimski', 10;

select * from emp;
