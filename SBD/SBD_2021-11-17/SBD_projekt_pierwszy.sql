-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2021-11-17 15:16:43.37

-- tables
-- Table: Druzyna
CREATE TABLE Druzyna (
    IDdruzyna int  NOT NULL,
    nazwa varchar(50)  NOT NULL,
    fame_team int  NOT NULL,
    pkt_val int  NOT NULL,
    Region_IDRegion int  NOT NULL,
    CONSTRAINT Druzyna_pk PRIMARY KEY  (IDdruzyna)
);

-- Table: Gracz
CREATE TABLE Gracz (
    IDGracz int  NOT NULL,
    nickname varchar(50)  NOT NULL,
    pozycja varchar(20)  NOT NULL,
    fame_player int  NOT NULL,
    dywizja varchar(20)  NOT NULL,
    Druzyna_IDdruzyna int  NOT NULL,
    CONSTRAINT Gracz_pk PRIMARY KEY  (IDGracz)
);

-- Table: Mecz
CREATE TABLE Mecz (
    IDMecz int  NOT NULL,
    czas_trwania time(1)  NOT NULL,
    winner varchar(50)  NOT NULL,
    enemy_red varchar(50)  NOT NULL,
    enemy_blue varchar(50)  NOT NULL,
    Druzyna_IDdruzyna int  NOT NULL,
    Druzyna_2_IDdruzyna int  NOT NULL,
    CONSTRAINT Mecz_pk PRIMARY KEY  (IDMecz)
);

-- Table: Mistrzostwa
CREATE TABLE Mistrzostwa (
    IDMistrzostwa int  NOT NULL,
    data date  NOT NULL,
    zwyciezca varchar(50)  NOT NULL,
    Druzyna_IDdruzyna int  NOT NULL,
    CONSTRAINT Mistrzostwa_pk PRIMARY KEY  (IDMistrzostwa)
);

-- Table: Region
CREATE TABLE Region (
    IDRegion int  NOT NULL,
    ilosc_druz int  NOT NULL,
    CONSTRAINT Region_pk PRIMARY KEY  (IDRegion)
);

-- Table: Sponsor
CREATE TABLE Sponsor (
    ID int  NOT NULL,
    nickname varchar(50)  NOT NULL,
    CONSTRAINT Sponsor_pk PRIMARY KEY  (ID)
);

-- Table: druzyna_sponsor
CREATE TABLE druzyna_sponsor (
    ID_druz_spons int  NOT NULL,
    Sponsor_ID int  NOT NULL,
    Druzyna_IDdruzyna int  NOT NULL,
    CONSTRAINT druzyna_sponsor_pk PRIMARY KEY  (ID_druz_spons)
);

-- Table: gracz_sponsor
CREATE TABLE gracz_sponsor (
    ID_gracz_spon int  NOT NULL,
    Sponsor_ID int  NOT NULL,
    Gracz_IDGracz int  NOT NULL,
    CONSTRAINT gracz_sponsor_pk PRIMARY KEY  (ID_gracz_spon)
);

-- foreign keys
-- Reference: Druzyna_Region (table: Druzyna)
ALTER TABLE Druzyna ADD CONSTRAINT Druzyna_Region
    FOREIGN KEY (Region_IDRegion)
    REFERENCES Region (IDRegion);

-- Reference: Gracz_Druzyna (table: Gracz)
ALTER TABLE Gracz ADD CONSTRAINT Gracz_Druzyna
    FOREIGN KEY (Druzyna_IDdruzyna)
    REFERENCES Druzyna (IDdruzyna);

-- Reference: Mecz_Druzyna_BlueSide (table: Mecz)
ALTER TABLE Mecz ADD CONSTRAINT Mecz_Druzyna_BlueSide
    FOREIGN KEY (Druzyna_2_IDdruzyna)
    REFERENCES Druzyna (IDdruzyna);

-- Reference: Mecz_Druzyna_RedSide (table: Mecz)
ALTER TABLE Mecz ADD CONSTRAINT Mecz_Druzyna_RedSide
    FOREIGN KEY (Druzyna_IDdruzyna)
    REFERENCES Druzyna (IDdruzyna);

-- Reference: Mistrzostwa_Druzyna (table: Mistrzostwa)
ALTER TABLE Mistrzostwa ADD CONSTRAINT Mistrzostwa_Druzyna
    FOREIGN KEY (Druzyna_IDdruzyna)
    REFERENCES Druzyna (IDdruzyna);

-- Reference: druzyna_sponsor_Druzyna (table: druzyna_sponsor)
ALTER TABLE druzyna_sponsor ADD CONSTRAINT druzyna_sponsor_Druzyna
    FOREIGN KEY (Druzyna_IDdruzyna)
    REFERENCES Druzyna (IDdruzyna);

-- Reference: druzyna_sponsor_Sponsor (table: druzyna_sponsor)
ALTER TABLE druzyna_sponsor ADD CONSTRAINT druzyna_sponsor_Sponsor
    FOREIGN KEY (Sponsor_ID)
    REFERENCES Sponsor (ID);

-- Reference: gracz_sponsor_Gracz (table: gracz_sponsor)
ALTER TABLE gracz_sponsor ADD CONSTRAINT gracz_sponsor_Gracz
    FOREIGN KEY (Gracz_IDGracz)
    REFERENCES Gracz (IDGracz);

-- Reference: gracz_sponsor_Sponsor (table: gracz_sponsor)
ALTER TABLE gracz_sponsor ADD CONSTRAINT gracz_sponsor_Sponsor
    FOREIGN KEY (Sponsor_ID)
    REFERENCES Sponsor (ID);

-- End of file.

INSERT INTO  Gracz (IDGracz, nickname, pozycja, fame_player, dywizja, Druzyna_IDdruzyna) 
--VALUES (1, 'jankos', 'jungle', 100, 'diamond', 100);
--VALUES (2, 'Caps', 'midlane', 90, 'challenger', 100);
--VALUES (3, 'mikyx', 'support', 60, 'master', 100);
--VALUES (4, 'wunder', 'toplane', 10, 'bronz', 100);
--VALUES (5, 'rekkles', 'adc', 100, 'challenger', 100);

--VALUES (6, 'Elyoya', 'jungle', 70, 'silver', 101);
--VALUES (7, 'Humanoid', 'midlane', 60, 'diamond', 101);
--VALUES (8, 'Kaiser', 'support', 60, 'master', 101);
--VALUES (9, 'Armut', 'toplane', 80, 'challenger', 101);
--VALUES (10, 'Carzzy', 'adc', 200, 'bronz', 101);

--VALUES (11, 'Bwipo', 'jungle', 100, 'challenger', 102);
--VALUES (12, 'Nisqy', 'midlane', 90, 'gold', 102);
--VALUES (13, 'Hylissang', 'support', 60, 'iron', 102);
--VALUES (14, 'Adam', 'toplane', 10, 'master', 102);
--VALUES (15, 'Upset', 'adc', 100, 'challenger', 102);


INSERT INTO Druzyna (IDdruzyna, nazwa, fame_team, pkt_val, Region_IDRegion) 
--VALUES (100, 'G2', 100, 0, 1000);
--VALUES (101, 'MadLions', 90, 10, 1000);
--VALUES (102, 'Fnatic', 70, 10, 1000);

INSERT INTO Region (IDRegion, ilosc_druz) 
--VALUES (1000, 3)


INSERT INTO Sponsor (ID, nickname) 
--VALUES (10000, 'Carlos');
--VALUES (10001, 'Grabbz');

INSERT INTO Mecz (IDMecz, czas_trwania, winner, enemy_red, enemy_blue, Druzyna_IDdruzyna, Druzyna_2_IDdruzyna)
--VALUES (100000, hmm, 'G2', 'G2', 'Fnatic', 100, 102);




create procedure prcedura
	@zmienna1 as int=10,
	@zmienna2 as int=90,
	@zmienna3 as int=10
as
begin
SET NOCOUNT ON;
	declare kursor1 cursor for	select IDgracz, nickname, fame_player
								from gracz;
	declare @numer1 int, @nazwa1 varchar(30), @fame1 int;
	open Curzad1;
	fetch next from Curzad1 into @numer1, @nazwa1, @fame1;
	while @@FETCH_STATUS =0
		begin
			if @fame1<@zmienna1
				begin	
						update gracz
						set fame_player=@fame1+@zmienna3
						where IDGracz=@numer1;
						print 'Gracz '+@nazwa1+' o numerze '+cast(@numer1 as varchar)+' ma teraz : '+cast(@fame1 as varchar)+' s³awy';
				end
			else if @fame1>@zmienna2
				begin	
						update gracz
						set fame_player=@fame1-@zmienna3
						where IDGracz=@numer2;
						print 'Gracz '+@nazwa1+' o numerze '+cast(@numer1 as varchar)+' ma teraz : '+cast(@fame1 as varchar)+' s³awy';
				end
				fetch next from kursor1 into @numer1, @nazwa1, @fame1;
		end
	close kursor1;
	deallocate kursor1;
end;





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