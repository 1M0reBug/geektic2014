DROP TABLE USER IF EXISTS CASCADE ;
DROP TABLE INTEREST IF EXISTS CASCADE;
DROP TABLE USER_INTEREST IF EXISTS CASCADE;

drop sequence user_seq if exists;
drop sequence interest_seq if exists;


CREATE TABLE USER (
  id numeric not null,
  name VARCHAR(255) not null,
  surname VARCHAR(255) not null,
  age numeric(3) not null,
  primary key(id)
);

CREATE TABLE INTEREST (
  id numeric not null,
  value VARCHAR(255) not null,
  primary key(id)
);

CREATE TABLE USER_INTEREST (
  id_user numeric not null,
  id_interest numeric not null,
  primary key(id_user,id_interest)
);

create sequence user_seq start with 0;
create sequence interest_seq start with 0;


/* Population */
/* Users */
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

/* INTEREST */
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('malesuada',0),('ultrices.',1),('ante.',2),('id',3),('velit',4),('venenatis',5),('Nam',6),('massa.',7),('leo',8),('Nunc',9);
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('erat.',10),('sit',11),('sit',12),('hendrerit',13),('magna',14),('justo',15),('Donec',16),('nunc',17),('Nullam',18),('semper',19);
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('lacus.',20),('Aenean',21),('eget',22),('sit',23),('mauris',24),('dolor',25),('congue',26),('a',27),('egestas',28),('Nulla',29);
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('orci',30),('libero',31),('mauris',32),('lectus',33),('torquent',34),('id',35),('mauris,',36),('purus,',37),('id',38),('Sed',39);
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('nonummy',40),('Fusce',41),('arcu.',42),('est',43),('elit.',44),('nec',45),('imperdiet,',46),('consequat,',47),('dolor',48),('non',49);
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('ipsum',50),('Duis',51),('tortor',52),('eros',53),('malesuada',54),('montes,',55),('a',56),('a',57),('dolor',58),('Maecenas',59);
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('nec',60),('fermentum',61),('mauris',62),('ridiculus',63),('non',64),('Praesent',65),('Cras',66),('magna,',67),('eleifend.',68),('eros.',69);
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('nisl.',70),('lectus',71),('rutrum.',72),('Morbi',73),('Donec',74),('Sed',75),('accumsan',76),('Curabitur',77),('magna',78),('a',79);
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('mus.',80),('nec',81),('a',82),('consequat',83),('libero',84),('orci',85),('sit',86),('ac',87),('ornare,',88),('leo',89);
INSERT INTO PUBLIC.INTEREST (value,id) VALUES ('non',90),('sapien,',91),('ultricies',92),('Proin',93),('eu',94),('lorem,',95),('nunc',96),('iaculis',97),('nec,',98),('ante',99);

/* User_INTEREST */
INSERT INTO PUBLIC.USER_INTEREST (id_interest,id_user) VALUES (86,31), (86, 32), (86,33);

