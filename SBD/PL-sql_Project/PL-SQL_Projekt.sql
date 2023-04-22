set serveroutput on;

select * from gracz;
select * from druzyna;
select * from region;
select * from sponsor;
select * from mecz;


--procedura sprawdzajaca czy  dany gracz ma fame wiêkszy od 'vmin' lub wiêksza od 'vmax' o wartosc dana w 'vdiff', nastêpnie 
--zwraca wartosc sumy fame wszystkich graczy
create or replace procedure proc_cur_1  
    (vmin gracz.fame_player%type, vmax gracz.fame_player%type, vdiff gracz.fame_player%type, fame_sum out gracz.fame_player%type)
is
    cursor cur_zad1 is select ID_gracza, nickname, fame_player
                                from gracz;
    vid int; vnickname gracz.nickname%type; vfame int;
begin
    open cur_zad1;
    loop
        fetch cur_zad1 into vid, vnickname, vfame;
        exit when cur_zad1%notfound;
        if vfame<vmin then
            update gracz
            set fame_player=fame_player+vdiff
            where id_gracza=vid;
            dbms_output.put_line('gracz bêdzie mieæ wy¿szy fame');
        elsif vfame>vmax then
            update gracz
            set fame_player=fame_player-vdiff
            where id_gracza=vid;
            dbms_output.put_line('gracz ma za du¿y fame i go obni¿amy');
        else
            dbms_output.put_line('gracz ma fame miêdzy '||vmin||' a '||vmax||' czyli jest w normie');
        end if;
        select sum(fame_player) into fame_sum from gracz;
    end loop;
    close cur_zad1;
end;


--w tym miejscu sa uzywana ww procedura 
DECLARE
    vmin2 gracz.fame_player%type;
    vmax2 gracz.fame_player%type;
    vdiff2 gracz.fame_player%type;
    vresp gracz.fame_player%type;
BEGIN
    vmin2:= 10;
    vmax2 := 90;
    vdiff2 := 5;
    proc_cur_1 (vmin2, vmax2, vdiff2, vresp);
    dbms_output.put_line('Zmiana punktów fame  graczy. aktualna suma pkt fame wynosi ' || vresp|| 'punktów');
END;



select * from gracz;
execute proc_cur_1(20,80,15);

--========================================================================================================


--przedstawiony trigger ma za zadanie sprawdzaæ czy wstawione lub updejtowane rekordy do tabeli gracz nie ma punktów famu
--poza wyznaczonymi wartosciamy od 0 do 100
create or replace trigger trig_zad_2
before insert or update on gracz
for each row
declare
vfame gracz.fame_player%type;
vnick gracz.nickname%type;
begin
    vfame:= :new.fame_player;
    vnick:= :old.nickname;
    if vfame<0 then
        if updating then
            dbms_output.put_line('Wartoœæ fame nie mo¿e byæ mniejsza od zera, gracz '||vnick||'ma z dalej'||:old.fame_player||' s³awy');
        elsif inserting then
            raise_application_error(-20100, 'Za niski fame!');
        end if;
    elsif vfame>010 then
        if updating then
            dbms_output.put_line('Wartoœæ fame nie mo¿e byæ wiêkasz od stu, gracz '||vnick||'ma z dalej'||:old.fame_player||' s³awy');
        elsif inserting then
            raise_application_error(-20100, 'Za wysoki fame!');
        end if;
    end if;
end;

select * from gracz;


--jest tutaj przedstawiony przykad teog jak trigger bloku
INSERT INTO  Gracz (ID_Gracza, nickname, pozycja, fame_player, dywizja, Druzyna_ID_druzyny) 
VALUES (20, 'testowy', 'jungle', 150, 'diamond', 1);














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

CREATE TRIGGER	triger1 
ON				gracz 
FOR				update
AS
begin

	declare kursor2 CURSOR FOR	SELECT IDgracz, nickname, fame_player
								FROM Gracz
	declare @numer2 int, @nazwa2 varchar(30), @fame2 int, @help int;
	OPEN kursor2;
	fetch next from Curzad1 into @numer2, @nazwa2, @fame2;
	WHILE @@FETCH_STATUS = 0
	BEGIN
		select @last_fame=fame_player from deleted where deleted.IDGracz=@numer2;
		if @fame2<0
			begin
				update gracz
				set fame_plyer=@last_fame
				where IDGracz=@numer2;
				print 'Wartoœæ fame nie mo¿e byæ mniejsza od zera, gracz '+@nazwa2+'ma z powrotem'+cast(@fame2 as varchar)+' s³awy';
			end;
		else if @fame2>100
			begin
				update gracz
				set fame_plyer=@last_fame
				where IDGracz=@numer2;
				print 'Wartoœæ fame nie mo¿e byæ wiêksza od stu, gracz '+@nazwa2+'ma z powrotem'+cast(@fame2 as varchar)+' s³awy';
			end;
		fetch next from kursor2 into @numer2, @nazwa2, @fame2;
	END;
	CLOSE kursor2;
	DEALLOCATE kursor2;
END;


