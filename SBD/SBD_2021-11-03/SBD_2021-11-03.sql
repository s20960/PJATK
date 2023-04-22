select * from emp;



--1
declare Curzad1 cursor for	select empno, ename, sal
							from emp;
declare @numer int, @nazwa varchar(30), @hajs money;
open Curzad1;
fetch next from Curzad1 into @numer, @nazwa, @hajs;
while @@FETCH_STATUS =0
	begin
		if @hajs<1000
			begin	
					--print'jestem tutaj';
					update emp 
					set @hajs=@hajs*1.1
					where empno=@numer;
					print 'pracownik '+@nazwa+' o numerze '+cast(@numer as varchar)+' zarabia teraz: '+cast(@hajs as varchar);
			end
		else if @hajs>1500
			begin	
					--print 'a teraz tutaj';
					update emp 
					set @hajs=@hajs*0.9
					where empno=@numer;
					print 'pracownik '+@nazwa+' o numerze '+cast(@numer as varchar)+' zarabia teraz: '+cast(@hajs as varchar);
			end
			fetch next from Curzad1 into @numer, @nazwa, @hajs;
	end
close Curzad1;
deallocate Curzad1;



--2
alter procedure proczad2
	@prog1 as money=1000,
	@prog2 as money=1500
as
begin
SET NOCOUNT ON;
	declare Curzad1 cursor for	select empno, ename, sal
								from emp;
	declare @numer2 int, @nazwa2 varchar(30), @hajs2 money;
	open Curzad1;
	fetch next from Curzad1 into @numer2, @nazwa2, @hajs2;
	while @@FETCH_STATUS =0
		begin
			if @hajs2<@prog1
				begin	
						--print'jestem tutaj';
						update emp 
						set @hajs2=@hajs2*1.1
						where empno=@numer2;
						print 'pracownik '+@nazwa2+' o numerze '+cast(@numer2 as varchar)+' zarabia teraz: '+cast(@hajs2 as varchar);
				end
			else if @hajs2>1500
				begin	
						--print 'a teraz tutaj';
						update emp 
						set @hajs2=@hajs2*0.9
						where empno=@numer2;
						print 'pracownik '+@nazwa2+' o numerze '+cast(@numer2 as varchar)+' zarabia teraz: '+cast(@hajs2 as varchar);
				end
				fetch next from Curzad1 into @numer2, @nazwa2, @hajs2;
		end
	close Curzad1;
	deallocate Curzad1;
end;

exec proczad2 2000, 2500;
drop procedure proczad2;

--3
alter procedure proczad3
	@dzial as int
as
begin
--set nocount on;
	declare curzad3 cursor for	select ename, comm
								from emp
								where sal<(	select avg(sal)
											from emp)
									and Deptno=@dzial;
	declare @nazwa3 varchar(30), @help1 money;
	open curzad3;
	fetch next from curzad3 into @nazwa3, @help1;
	while @@FETCH_STATUS=0
		begin
			update emp
			set comm=sal*0.05
			where Deptno=@dzial;
			--declare @help1 money=(select comm from emp);
			print 'pracownik '+@nazwa3+' ma teraz comm o wartosci: '+cast(@help1 as varchar);
			fetch next from curzad3 into @nazwa3, @help1;
		end;
	close Curzad3;
	deallocate Curzad3;
end;

exec proczad3 10;
drop procedure proczad3;

--4
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

select * from Warehouse;

--lol