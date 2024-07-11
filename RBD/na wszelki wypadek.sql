insert into REGION(ID_REGIONU, ILOSC_DRUZYN) 
values(1, 3);

insert into REGION(ID_REGIONU, ILOSC_DRUZYN) 
values(2, 3);

insert into REGION(ID_REGIONU, ILOSC_DRUZYN) 
values(2, 3);



insert into DRUZYNA(ID_DRUZYNY, NAZWA, FAME_TEAM, ILOSC_PKY, REGION_ID_REGIONU) 
values(1, 'G2', 90, 0, 1);

insert into DRUZYNA(ID_DRUZYNY, NAZWA, FAME_TEAM, ILOSC_PKY, REGION_ID_REGIONU) 
values(2, 'FNATIC', 75, 1, 1);

insert into DRUZYNA(ID_DRUZYNY, NAZWA, FAME_TEAM, ILOSC_PKY, REGION_ID_REGIONU) 
values(3, 'MAD', 35, 0, 1);

insert into DRUZYNA(ID_DRUZYNY, NAZWA, FAME_TEAM, ILOSC_PKY, REGION_ID_REGIONU) 
values(4, 'CLOUD9', 70, 0, 2);

insert into DRUZYNA(ID_DRUZYNY, NAZWA, FAME_TEAM, ILOSC_PKY, REGION_ID_REGIONU) 
values(5, '100Thieves', 40, 0, 2);

insert into DRUZYNA(ID_DRUZYNY, NAZWA, FAME_TEAM, ILOSC_PKY, REGION_ID_REGIONU) 
values(6, 'TeamLiquid', 55, 0, 2);

insert into DRUZYNA(ID_DRUZYNY, NAZWA, FAME_TEAM, ILOSC_PKY, REGION_ID_REGIONU) 
values(7, 'SKTT1', 100, 3, 3);

insert into DRUZYNA(ID_DRUZYNY, NAZWA, FAME_TEAM, ILOSC_PKY, REGION_ID_REGIONU) 
values(8, 'InvictusGaming', 85, 1, 3);

insert into DRUZYNA(ID_DRUZYNY, NAZWA, FAME_TEAM, ILOSC_PKY, REGION_ID_REGIONU) 
values(9, 'Phoenix', 85, 1, 3);






insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(1, 'Jankos', 'jg', 100, 'challenger', 1);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(2, 'CAPS', 'mid', 80, 'diament', 1);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(3, 'Rekkles', 'adc', 90, 'challenger', 2);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(4, 'Selfmade', 'jg', 50, 'diament', 2);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY)       fffffff 
values(5, 'Jankos', 'jg', 100, 'challenger', 3);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY)         ffff
values(6, 'Jankos', 'jg', 100, 'challenger', 3);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY)
values(7, 'Licorice', 'top', 50, 'challenger', 4);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(8, 'Sneaky', 'adc', 85, 'challenger', 4);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(9, 'Ssumday', 'top', 30, 'maser', 5);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(10, 'Stunt', 'supp', 40, 'master', 5);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(11, 'CoreJJ', 'supp', 50, 'challenger', 6);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(12, 'Broxah', 'jg', 60, 'challenger', 6);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(13, 'Faker', 'mid', 100, 'master', 7);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(14, 'Teddy', 'adc', 80, 'challenger', 7);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(15, 'Marge', 'adc', 20, 'diament', 8);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(16, 'Marge', 'jg', 100, 'master', 8);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(17, 'Xiaoqi', 'top', 40, 'challenger', 9);

insert into DRUZYNA(ID_GRACZA, NICKNAME, POZYCJA, FAME_PLAYER, DYWIZJA, DRUZYNA_ID_DRUZYNY) 
values(18, 'Alex', 'jg', 50, 'challenger', 9);



insert into MISTRZOSTWA(ID_MISTRZOSTW, DATA, ZWYCIEZCA, DRUZYNA_ID_DRUZYNY) 
values(1, '10/11/15', 'FNATIC', 2);

insert into MISTRZOSTWA(ID_MISTRZOSTW, DATA, ZWYCIEZCA, DRUZYNA_ID_DRUZYNY) 
values(2, '10/11/15', 'SKTT1', 7);

insert into MISTRZOSTWA(ID_MISTRZOSTW, DATA, ZWYCIEZCA, DRUZYNA_ID_DRUZYNY) 
values(3, '10/11/15', 'InvictusGaming', 8);

insert into MISTRZOSTWA(ID_MISTRZOSTW, DATA, ZWYCIEZCA, DRUZYNA_ID_DRUZYNY) 
values(4, '10/11/15', 'Phoenix', 9);




insert into SPONSOR(ID_SPONSORA, IMIE, NAZWISKO) 
values(1, 'GRABBZ', 'Lohmann');

insert into SPONSOR(ID_SPONSORA, IMIE, NAZWISKO) 
values(2, 'Mithy', ' Rodríguez');

insert into SPONSOR(ID_SPONSORA, IMIE, NAZWISKO) 
values(3, 'Reapered', 'Bok');




insert into SPONSOR(ID, DRUZYNA_ID_DROZYNY, SPONSOR_ID_SPONSORA) 
values(1, 1, 1);

insert into SPONSOR(ID, DRUZYNA_ID_DROZYNY, SPONSOR_ID_SPONSORA) 
values(2, 3, 2);

insert into SPONSOR(ID, DRUZYNA_ID_DROZYNY, SPONSOR_ID_SPONSORA) 
values(3, 4, 3);







