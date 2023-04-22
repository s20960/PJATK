-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2021-11-16 21:23:40.103

-- tables
-- Table: Druzyna
CREATE TABLE Druzyna (
    id_druzyny integer  NOT NULL,
    nazwa varchar2(50)  NOT NULL,
    fame_team integer  NOT NULL,
    ilosc_pky integer  NOT NULL,
    Region_id_regionu integer  NOT NULL,
    CONSTRAINT Druzyna_pk PRIMARY KEY (id_druzyny)
) ;

-- Table: Gracz
CREATE TABLE Gracz (
    id_gracza integer  NOT NULL,
    nickname varchar2(50)  NOT NULL,
    pozycja varchar2(50)  NOT NULL,
    fame_player integer  NOT NULL,
    dywizja varchar2(50)  NOT NULL,
    Druzyna_id_druzyny integer  NOT NULL,
    CONSTRAINT Gracz_pk PRIMARY KEY (id_gracza)
) ;

-- Table: Mecze
CREATE TABLE Mecze (
    id_meczy integer  NOT NULL,
    czas_trwania number(150,2)  NOT NULL,
    winner varchar2(50)  NOT NULL,
    przeciwnik_red varchar2(50)  NOT NULL,
    przeciwnik_blue varchar2(50)  NOT NULL,
    Druzyna_id_drozyny integer  NOT NULL,
    Druzyna_2_id_drozyny integer  NOT NULL,
    CONSTRAINT Mecze_pk PRIMARY KEY (id_meczy)
) ;

-- Table: Mistrzostwa
CREATE TABLE Mistrzostwa (
    id_mistrzostw integer  NOT NULL,
    data date  NOT NULL,
    zwyciezca varchar2(50)  NOT NULL,
    Druzyna_id_druzyny integer  NOT NULL,
    CONSTRAINT Mistrzostwa_pk PRIMARY KEY (id_mistrzostw)
) ;

-- Table: Region
CREATE TABLE Region (
    id_regionu integer  NOT NULL,
    ilosc_druzyn integer  NOT NULL,
    CONSTRAINT Region_pk PRIMARY KEY (id_regionu)
) ;

-- Table: Sponsor
CREATE TABLE Sponsor (
    id_sponsora integer  NOT NULL,
    imie varchar2(20)  NOT NULL,
    nazwisko varchar2(20)  NOT NULL,
    CONSTRAINT Sponsor_pk PRIMARY KEY (id_sponsora)
) ;

-- Table: druz_spons
CREATE TABLE druz_spons (
    id integer  NOT NULL,
    Druzyna_id_drozyny integer  NOT NULL,
    Sponsor_id_sponsora integer  NOT NULL,
    CONSTRAINT druz_spons_pk PRIMARY KEY (id)
) ;

-- Table: gracz_spons
CREATE TABLE gracz_spons (
    id integer  NOT NULL,
    Gracz_id_gracza integer  NOT NULL,
    Sponsor_id_sponsora integer  NOT NULL,
    CONSTRAINT gracz_spons_pk PRIMARY KEY (id)
) ;

-- foreign keys
-- Reference: Drozyna_Region (table: Druzyna)
ALTER TABLE Druzyna ADD CONSTRAINT Drozyna_Region
    FOREIGN KEY (Region_id_regionu)
    REFERENCES Region (id_regionu);

-- Reference: Gracz_Drozyna (table: Gracz)
ALTER TABLE Gracz ADD CONSTRAINT Gracz_Drozyna
    FOREIGN KEY (Druzyna_id_druzyny)
    REFERENCES Druzyna (id_druzyny);

-- Reference: Mecze_Drozyna_BlueSide (table: Mecze)
ALTER TABLE Mecze ADD CONSTRAINT Mecze_Drozyna_BlueSide
    FOREIGN KEY (Druzyna_2_id_drozyny)
    REFERENCES Druzyna (id_druzyny);

-- Reference: Mecze_Drozyna_RedSide (table: Mecze)
ALTER TABLE Mecze ADD CONSTRAINT Mecze_Drozyna_RedSide
    FOREIGN KEY (Druzyna_id_drozyny)
    REFERENCES Druzyna (id_druzyny);

-- Reference: Mistrzostwa_Drozyna (table: Mistrzostwa)
ALTER TABLE Mistrzostwa ADD CONSTRAINT Mistrzostwa_Drozyna
    FOREIGN KEY (Druzyna_id_druzyny)
    REFERENCES Druzyna (id_druzyny);

-- Reference: Table_10_Gracz (table: gracz_spons)
ALTER TABLE gracz_spons ADD CONSTRAINT Table_10_Gracz
    FOREIGN KEY (Gracz_id_gracza)
    REFERENCES Gracz (id_gracza);

-- Reference: Table_10_Sponsor (table: gracz_spons)
ALTER TABLE gracz_spons ADD CONSTRAINT Table_10_Sponsor
    FOREIGN KEY (Sponsor_id_sponsora)
    REFERENCES Sponsor (id_sponsora);

-- Reference: Table_11_Drozyna (table: druz_spons)
ALTER TABLE druz_spons ADD CONSTRAINT Table_11_Drozyna
    FOREIGN KEY (Druzyna_id_drozyny)
    REFERENCES Druzyna (id_druzyny);

-- Reference: Table_11_Sponsor (table: druz_spons)
ALTER TABLE druz_spons ADD CONSTRAINT Table_11_Sponsor
    FOREIGN KEY (Sponsor_id_sponsora)
    REFERENCES Sponsor (id_sponsora);

-- End of file.

