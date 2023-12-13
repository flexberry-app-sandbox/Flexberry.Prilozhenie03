﻿




CREATE TABLE СпрПользов (
 primaryKey UUID NOT NULL,
 ФИО VARCHAR(255) NULL,
 Код INT NULL,
 Должность VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE СпрЕдИзмер (
 primaryKey UUID NOT NULL,
 Код INT NULL,
 Наименование VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE СпрКонтрАг (
 primaryKey UUID NOT NULL,
 Наименование VARCHAR(255) NULL,
 КПП INT NULL,
 Телефон INT NULL,
 ИНН INT NULL,
 ОГРН INT NULL,
 КодОКВЭД INT NULL,
 КодПоОКПО INT NULL,
 Код INT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE СпрНомен (
 primaryKey UUID NOT NULL,
 Код INT NULL,
 Наименование VARCHAR(255) NULL,
 Описание VARCHAR(255) NULL,
 СпрЕдИзмер UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE СпрТранспСр (
 primaryKey UUID NOT NULL,
 ГрузПодъемВТон VARCHAR(255) NULL,
 ГосНомер VARCHAR(255) NULL,
 Код INT NULL,
 ЛицеКартНомер INT NULL,
 ВидПеревоз VARCHAR(255) NULL,
 Марка VARCHAR(255) NULL,
 Наименование VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE СпрОбъектСтр (
 primaryKey UUID NOT NULL,
 Код INT NULL,
 Наименование VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE СпрТипТрансСр (
 primaryKey UUID NOT NULL,
 Описание VARCHAR(255) NULL,
 Код INT NULL,
 Наименование VARCHAR(255) NULL,
 ВместВКубМ REAL NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE СпрВидыРаб (
 primaryKey UUID NOT NULL,
 Код INT NULL,
 Наименование VARCHAR(255) NULL,
 СпрТипТрансСр UUID NOT NULL,
 СпрЕдИзмер UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMNETLOCKDATA (
 LockKey VARCHAR(300) NOT NULL,
 UserName VARCHAR(300) NOT NULL,
 LockDate TIMESTAMP(3) NULL,
 PRIMARY KEY (LockKey));


CREATE TABLE STORMSETTINGS (
 primaryKey UUID NOT NULL,
 Module VARCHAR(1000) NULL,
 Name VARCHAR(255) NULL,
 Value TEXT NULL,
 "User" VARCHAR(255) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMAdvLimit (
 primaryKey UUID NOT NULL,
 "User" VARCHAR(255) NULL,
 Published BOOLEAN NULL,
 Module VARCHAR(255) NULL,
 Name VARCHAR(255) NULL,
 Value TEXT NULL,
 HotKeyData INT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMFILTERSETTING (
 primaryKey UUID NOT NULL,
 Name VARCHAR(255) NOT NULL,
 DataObjectView VARCHAR(255) NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMWEBSEARCH (
 primaryKey UUID NOT NULL,
 Name VARCHAR(255) NOT NULL,
 "Order" INT NOT NULL,
 PresentView VARCHAR(255) NOT NULL,
 DetailedView VARCHAR(255) NOT NULL,
 FilterSetting_m0 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMFILTERDETAIL (
 primaryKey UUID NOT NULL,
 Caption VARCHAR(255) NOT NULL,
 DataObjectView VARCHAR(255) NOT NULL,
 ConnectMasterProp VARCHAR(255) NOT NULL,
 OwnerConnectProp VARCHAR(255) NULL,
 FilterSetting_m0 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE STORMFILTERLOOKUP (
 primaryKey UUID NOT NULL,
 DataObjectType VARCHAR(255) NOT NULL,
 Container VARCHAR(255) NULL,
 ContainerTag VARCHAR(255) NULL,
 FieldsToView VARCHAR(255) NULL,
 FilterSetting_m0 UUID NOT NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE UserSetting (
 primaryKey UUID NOT NULL,
 AppName VARCHAR(256) NULL,
 UserName VARCHAR(512) NULL,
 UserGuid UUID NULL,
 ModuleName VARCHAR(1024) NULL,
 ModuleGuid UUID NULL,
 SettName VARCHAR(256) NULL,
 SettGuid UUID NULL,
 SettLastAccessTime TIMESTAMP(3) NULL,
 StrVal VARCHAR(256) NULL,
 TxtVal TEXT NULL,
 IntVal INT NULL,
 BoolVal BOOLEAN NULL,
 GuidVal UUID NULL,
 DecimalVal DECIMAL(20,10) NULL,
 DateTimeVal TIMESTAMP(3) NULL,
 PRIMARY KEY (primaryKey));


CREATE TABLE ApplicationLog (
 primaryKey UUID NOT NULL,
 Category VARCHAR(64) NULL,
 EventId INT NULL,
 Priority INT NULL,
 Severity VARCHAR(32) NULL,
 Title VARCHAR(256) NULL,
 Timestamp TIMESTAMP(3) NULL,
 MachineName VARCHAR(32) NULL,
 AppDomainName VARCHAR(512) NULL,
 ProcessId VARCHAR(256) NULL,
 ProcessName VARCHAR(512) NULL,
 ThreadName VARCHAR(512) NULL,
 Win32ThreadId VARCHAR(128) NULL,
 Message VARCHAR(2500) NULL,
 FormattedMessage TEXT NULL,
 PRIMARY KEY (primaryKey));



 ALTER TABLE СпрНомен ADD CONSTRAINT FK840c81fedf20e0a82183dd6fd7f6953d4bf35c43 FOREIGN KEY (СпрЕдИзмер) REFERENCES СпрЕдИзмер; 
CREATE INDEX Index840c81fedf20e0a82183dd6fd7f6953d4bf35c43 on СпрНомен (СпрЕдИзмер); 

 ALTER TABLE СпрВидыРаб ADD CONSTRAINT FKa7034f7bceece13908821312b7a842afbbddb0e3 FOREIGN KEY (СпрТипТрансСр) REFERENCES СпрТипТрансСр; 
CREATE INDEX Indexa7034f7bceece13908821312b7a842afbbddb0e3 on СпрВидыРаб (СпрТипТрансСр); 

 ALTER TABLE СпрВидыРаб ADD CONSTRAINT FK105cacd2a93f6230c3c135143070c3ef1c4dd0c1 FOREIGN KEY (СпрЕдИзмер) REFERENCES СпрЕдИзмер; 
CREATE INDEX Index105cacd2a93f6230c3c135143070c3ef1c4dd0c1 on СпрВидыРаб (СпрЕдИзмер); 

 ALTER TABLE STORMWEBSEARCH ADD CONSTRAINT FKc4378e39870eb056aec84088683297a01d2a6200 FOREIGN KEY (FilterSetting_m0) REFERENCES STORMFILTERSETTING; 

 ALTER TABLE STORMFILTERDETAIL ADD CONSTRAINT FK921d16269835017e2a0d0e29ad6fb175454a70d0 FOREIGN KEY (FilterSetting_m0) REFERENCES STORMFILTERSETTING; 

 ALTER TABLE STORMFILTERLOOKUP ADD CONSTRAINT FKce38ef0db3f01a53acaa49fed8853fb941ad47ba FOREIGN KEY (FilterSetting_m0) REFERENCES STORMFILTERSETTING; 
