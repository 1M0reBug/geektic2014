DROP TABLE USER IF EXISTS CASCADE ;
DROP TABLE INTERESTS IF EXISTS CASCADE;
DROP TABLE USER_INTERESTS IF EXISTS CASCADE;
drop sequence user_seq if exists;
drop sequence interest_seq if exists;


CREATE TABLE USER (
  id numeric not null,
  name VARCHAR(255) not null,
  surname VARCHAR(255) not null,
  age numeric(3) not null,
  primary key(id)
);

CREATE TABLE INTERESTS (
  id numeric not null,
  value VARCHAR(255) not null,
  primary key(id)
);

CREATE TABLE USER_INTERESTS (
  id_user numeric not null,
  id_interest numeric not null,
  primary key(id_user,id_interest)
);

create sequence user_seq start with 0;
create sequence interest_seq start with 0;


/* Population */
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Jane','Weber',74,1),('Rafael','May',38,2),('Thane','Franks',54,3),('Dominique','Finley',74,4),('Brody','Lindsey',90,5),('Rebekah','Herrera',66,6),('Hiram','Harper',35,7),('Illiana','Ferrell',26,8),('Melanie','Franks',27,9),('Kevin','Webb',77,10);
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Dante','Rasmussen',33,11),('Armando','Blackburn',78,12),('Audrey','Alvarado',42,13),('Norman','Fitzpatrick',99,14),('Merrill','Spears',32,15),('Dante','Rosario',95,16),('Brianna','Butler',69,17),('Mari','Hoover',63,18),('Ignatius','Fitzgerald',64,19),('Maia','Bonner',19,20);
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Keefe','Buck',45,21),('Philip','Snow',69,22),('Erich','Berger',33,23),('Ivy','Cash',28,24),('Devin','Holman',74,25),('Hadassah','Mayo',48,26),('Kathleen','Rush',21,27),('Hyatt','Brown',46,28),('Imani','Robinson',97,29),('Dahlia','Chavez',84,30);
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Cameran','Hooper',94,31),('Thaddeus','Pugh',62,32),('Eagan','Rowland',87,33),('Quynn','Mccarthy',39,34),('Stone','Casey',96,35),('Blossom','Nielsen',83,36),('Chava','Irwin',80,37),('Melinda','Barry',89,38),('Macey','Browning',46,39),('Merritt','Cox',97,40);
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Blaine','Tate',41,41),('Francesca','Yates',83,42),('Zachery','Guzman',50,43),('Colton','Davenport',61,44),('Nyssa','Obrien',40,45),('Rigel','Acosta',56,46),('Ethan','Nash',37,47),('Ifeoma','Davis',60,48),('Thane','Hutchinson',28,49),('Carla','Cardenas',31,50);
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Galvin','Anderson',40,51),('Indira','Lewis',73,52),('Fatima','Fry',20,53),('Glenna','Potts',25,54),('Igor','Guerrero',84,55),('Quamar','Harrison',96,56),('Quincy','Warren',35,57),('Raja','Cantu',29,58),('Evan','Patrick',26,59),('Rhoda','French',60,60);
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Upton','Cameron',60,61),('Leandra','Wheeler',98,62),('Timon','Phelps',60,63),('Aaron','Guy',59,64),('Alfreda','Rush',72,65),('Adara','Turner',57,66),('Cassidy','Wilkinson',39,67),('Dacey','Montoya',52,68),('Jonas','Walls',64,69),('Yoshio','Burnett',65,70);
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Eaton','Thomas',87,71),('Silas','Osborne',49,72),('Myles','Hays',82,73),('Lee','Little',84,74),('Lionel','Wiley',74,75),('Elmo','Rios',71,76),('Ali','Mcgee',77,77),('Tanner','Green',20,78),('Moana','Blankenship',49,79),('Cassidy','Decker',78,80);
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Rafael','Frost',44,81),('Wilma','Guzman',60,82),('Forrest','Le',51,83),('Zorita','Short',33,84),('Alfonso','Sweeney',76,85),('Garrison','Morrison',96,86),('Dean','Guthrie',65,87),('Curran','Harrell',30,88),('Kieran','Hobbs',69,89),('Ori','Butler',61,90);
INSERT INTO PUBLIC.USER (name,surname,age,id) VALUES ('Joshua','Mckenzie',68,91),('Tanya','Jennings',84,92),('Quinn','Ramirez',35,93),('Geoffrey','Berger',93,94),('Mari','Rosa',52,95),('Avye','Fuentes',98,96),('George','Buchanan',30,97),('Aaron','Battle',51,98),('Erica','Tyson',86,99),('Victor','Terry',33,100);
