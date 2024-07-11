BEGIN
  FOR c IN ( SELECT table_name FROM user_tables)
  LOOP
    EXECUTE IMMEDIATE 'DROP TABLE ' || c.table_name || ' CASCADE CONSTRAINTS' ;
  END LOOP;
END;

/

-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2020-03-24 08:20:58.774

-- tables
-- Table: Drozyna
CREATE TABLE Drozyna (
    id_drozyny integer  NOT NULL,
    nazwa varchar2(50)  NOT NULL,
    fame_team integer  NOT NULL,
    ilosc_pky integer  NOT NULL,
    Region_id_regionu integer  NOT NULL,
    CONSTRAINT Drozyna_pk PRIMARY KEY (id_drozyny)
) ;

-- Table: Gracz
CREATE TABLE Gracz (
    id_gracza integer  NOT NULL,
    nickname varchar2(50)  NOT NULL,
    pozycja varchar2(50)  NOT NULL,
    fame_player integer  NOT NULL,
    dywizja varchar2(50)  NOT NULL,
    CONSTRAINT Gracz_pk PRIMARY KEY (id_gracza)
) ;

-- Table: Mecze
CREATE TABLE Mecze (
    id_meczy integer  NOT NULL,
    czas_trwania number(10,2)  NOT NULL,
    winner varchar2(50)  NOT NULL,
    przeciwnik_red varchar2(50)  NOT NULL,
    przeciwnik_blue varchar2(50)  NOT NULL,
    Drozyna_id_drozyny integer  NOT NULL,
    Drozyna_2_id_drozyny integer  NOT NULL,
    CONSTRAINT Mecze_pk PRIMARY KEY (id_meczy)
) ;

-- Table: Mistrzostwa
CREATE TABLE Mistrzostwa (
    id_mistrzostw integer  NOT NULL,
    data date  NOT NULL,
    zwyciezca varchar2(50)  NOT NULL,
    CONSTRAINT Mistrzostwa_pk PRIMARY KEY (id_mistrzostw)
) ;

-- Table: Region
CREATE TABLE Region (
    id_regionu integer  NOT NULL,
    ilosc_drozyn integer  NOT NULL,
    CONSTRAINT Region_pk PRIMARY KEY (id_regionu)
) ;

-- Table: Sponsor
CREATE TABLE Sponsor (
    id_sponsora integer  NOT NULL,
    imie varchar2(20)  NOT NULL,
    nazwisko varchar2(20)  NOT NULL,
    CONSTRAINT Sponsor_pk PRIMARY KEY (id_sponsora)
) ;

-- Table: droz_gracz
CREATE TABLE droz_gracz (
    id integer  NOT NULL,
    Drozyna_id_drozyny integer  NOT NULL,
    Gracz_id_gracza integer  NOT NULL,
    CONSTRAINT droz_gracz_pk PRIMARY KEY (id)
) ;

-- Table: droz_spons
CREATE TABLE droz_spons (
    id integer  NOT NULL,
    Drozyna_id_drozyny integer  NOT NULL,
    Sponsor_id_sponsora integer  NOT NULL,
    CONSTRAINT droz_spons_pk PRIMARY KEY (id)
) ;

-- Table: gracz_spons
CREATE TABLE gracz_spons (
    id integer  NOT NULL,
    Gracz_id_gracza integer  NOT NULL,
    Sponsor_id_sponsora integer  NOT NULL,
    CONSTRAINT gracz_spons_pk PRIMARY KEY (id)
) ;

-- Table: reg_mistrz
CREATE TABLE reg_mistrz (
    id integer  NOT NULL,
    Region_id_regionu integer  NOT NULL,
    Mistrzostwa_id_mistrzostw integer  NOT NULL,
    CONSTRAINT reg_mistrz_pk PRIMARY KEY (id)
) ;

-- foreign keys
-- Reference: Drozyna_Region (table: Drozyna)
ALTER TABLE Drozyna ADD CONSTRAINT Drozyna_Region
    FOREIGN KEY (Region_id_regionu)
    REFERENCES Region (id_regionu);

-- Reference: Mecze_Drozyna_BlueSide (table: Mecze)
ALTER TABLE Mecze ADD CONSTRAINT Mecze_Drozyna_BlueSide
    FOREIGN KEY (Drozyna_2_id_drozyny)
    REFERENCES Drozyna (id_drozyny);

-- Reference: Mecze_Drozyna_RedSide (table: Mecze)
ALTER TABLE Mecze ADD CONSTRAINT Mecze_Drozyna_RedSide
    FOREIGN KEY (Drozyna_id_drozyny)
    REFERENCES Drozyna (id_drozyny);

-- Reference: Table_10_Gracz (table: gracz_spons)
ALTER TABLE gracz_spons ADD CONSTRAINT Table_10_Gracz
    FOREIGN KEY (Gracz_id_gracza)
    REFERENCES Gracz (id_gracza);

-- Reference: Table_10_Sponsor (table: gracz_spons)
ALTER TABLE gracz_spons ADD CONSTRAINT Table_10_Sponsor
    FOREIGN KEY (Sponsor_id_sponsora)
    REFERENCES Sponsor (id_sponsora);

-- Reference: Table_11_Drozyna (table: droz_spons)
ALTER TABLE droz_spons ADD CONSTRAINT Table_11_Drozyna
    FOREIGN KEY (Drozyna_id_drozyny)
    REFERENCES Drozyna (id_drozyny);

-- Reference: Table_11_Sponsor (table: droz_spons)
ALTER TABLE droz_spons ADD CONSTRAINT Table_11_Sponsor
    FOREIGN KEY (Sponsor_id_sponsora)
    REFERENCES Sponsor (id_sponsora);

-- Reference: Table_9_Mistrzostwa (table: reg_mistrz)
ALTER TABLE reg_mistrz ADD CONSTRAINT Table_9_Mistrzostwa
    FOREIGN KEY (Mistrzostwa_id_mistrzostw)
    REFERENCES Mistrzostwa (id_mistrzostw);

-- Reference: Table_9_Region (table: reg_mistrz)
ALTER TABLE reg_mistrz ADD CONSTRAINT Table_9_Region
    FOREIGN KEY (Region_id_regionu)
    REFERENCES Region (id_regionu);

-- Reference: _Drozyna (table: droz_gracz)
ALTER TABLE droz_gracz ADD CONSTRAINT droz_gracz_Drozyna
    FOREIGN KEY (Drozyna_id_drozyny)
    REFERENCES Drozyna (id_drozyny);

-- Reference: _Gracz (table: droz_gracz)
ALTER TABLE droz_gracz ADD CONSTRAINT droz_gracz_Gracz
    FOREIGN KEY (Gracz_id_gracza)
    REFERENCES Gracz (id_gracza);

-- End of file.

