Set Serveroutput on;

create or replace procedure wklejKurwe(p_id_samochod samochod.idsamochod%type)
is
row_num int;
curidprzeglad przeglad.idprzeglad%type;
curdataprzegladu przeglad.dataprzegladu%type;
curidsamochod przeglad.idsamochod%type;
curdozaplaty przeglad.dozaplaty%type;
curnazwa usluga.nazwa%type;
cursor cur_zad1 is select p.idprzeglad, p.dataprzegladu, p.idsamochod, p.dozaplaty, usl.nazwa
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
end



exec wklejKurwe(3);
-- Zadanie 2
--Napisz wyzwalacz, który nie pozwoli na wprowadzenie przegl¹du (równie¿ aktualizacjê) z
--dat¹ przesz³¹. Je¿eli taka sytuacja bêdzie mia³a miejsce nale¿y podnieœæ wyj¹tek.
CREATE OR REPLACE TRIGGER CheckDate
    BEFORE INSERT OR UPDATE OF dataprzegladu ON PRZEGLAD
    FOR EACH ROW
BEGIN
    IF trunc(:new.dataprzegladu) < sysdate THEN
        raise_application_error(-20000, 'Data przegladu nie moze byc dat¹ przesz³¹.');
    END IF;
END;
/


