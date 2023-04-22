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

