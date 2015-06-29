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
  sex varchar(5) not null,
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
INSERT INTO user (name,surname,age,sex,id) VALUES ('Kevyn','Oneill',42,'HOMME',0),('Lucian','Petersen',37,'FEMME',1),('Bryar','Davidson',66,'HOMME',2),('Aaron','Cook',70,'HOMME',3),('Honorato','Eaton',32,'FEMME',4),('Harper','Lloyd',54,'HOMME',5),('Samson','Walsh',56,'FEMME',6),('Erin','Church',32,'FEMME',7),('Cadman','Acevedo',54,'FEMME',8),('Anthony','Perkins',58,'FEMME',9);
INSERT INTO user (name,surname,age,sex,id) VALUES ('Rhonda','Gallagher',34,'FEMME',10),('Clare','Parrish',18,'HOMME',11),('Brynn','Espinoza',35,'FEMME',12),('McKenzie','Craft',77,'HOMME',13),('Susan','Mercer',21,'FEMME',14),('Demetria','Knox',75,'HOMME',15),('Harriet','Schmidt',95,'FEMME',16),('Carolyn','Mejia',91,'HOMME',17),('Nasim','Vazquez',71,'FEMME',18),('Lillith','Kline',29,'HOMME',19);
INSERT INTO user (name,surname,age,sex,id) VALUES ('Chanda','Navarro',87,'HOMME',20),('MacKensie','Snider',23,'FEMME',21),('Aimee','Wilkins',21,'FEMME',22),('Dexter','Goff',30,'FEMME',23),('Sylvester','Sheppard',93,'HOMME',24),('Diana','Lawson',76,'HOMME',25),('Madeline','Strickland',18,'FEMME',26),('Yen','Bright',35,'FEMME',27),('Damon','Burch',98,'FEMME',28),('Colette','Owens',70,'FEMME',29);
INSERT INTO user (name,surname,age,sex,id) VALUES ('Quemby','Carrillo',50,'HOMME',30),('Patricia','Bonner',65,'FEMME',31),('Francis','Livingston',28,'FEMME',32),('Savannah','Berg',56,'FEMME',33),('Quail','Sanford',75,'FEMME',34),('Chancellor','Richmond',77,'HOMME',35),('Nina','Snider',18,'FEMME',36),('Farrah','Meadows',54,'HOMME',37),('Imogene','Hart',38,'FEMME',38),('Amir','Reid',50,'HOMME',39);
INSERT INTO user (name,surname,age,sex,id) VALUES ('Lareina','Hawkins',41,'HOMME',40),('Lunea','Pugh',41,'HOMME',41),('Libby','Brown',53,'FEMME',42),('Shellie','Ballard',94,'FEMME',43),('Neil','Stout',55,'FEMME',44),('Dorian','Hernandez',76,'FEMME',45),('Kathleen','Shaw',33,'HOMME',46),('Aquila','English',37,'HOMME',47),('Bianca','Ballard',59,'FEMME',48),('Ulla','Harmon',38,'FEMME',49);
INSERT INTO user (name,surname,age,sex,id) VALUES ('Orson','Riggs',80,'HOMME',50),('Aiko','Meyer',48,'FEMME',51),('Jonas','Campbell',64,'HOMME',52),('Upton','Boyer',99,'HOMME',53),('Rae','Maldonado',89,'FEMME',54),('Clarke','Maddox',98,'FEMME',55),('Eagan','Morgan',23,'FEMME',56),('Francis','Griffin',44,'HOMME',57),('Bruce','Cochran',66,'FEMME',58),('Amber','Hinton',66,'HOMME',59);
INSERT INTO user (name,surname,age,sex,id) VALUES ('Phelan','Conway',99,'FEMME',60),('Buckminster','Pennington',39,'HOMME',61),('Rosalyn','Shepherd',19,'FEMME',62),('Jessamine','Warner',46,'FEMME',63),('Stone','Mckenzie',89,'FEMME',64),('Josephine','Ochoa',54,'FEMME',65),('Emma','Short',47,'FEMME',66),('Gloria','Rivas',30,'HOMME',67),('Timothy','Fuentes',59,'HOMME',68),('Diana','Pollard',98,'HOMME',69);
INSERT INTO user (name,surname,age,sex,id) VALUES ('Pamela','Caldwell',43,'FEMME',70),('Asher','Garrett',97,'FEMME',71),('Dustin','Whitehead',78,'FEMME',72),('Kameko','Mcintosh',88,'FEMME',73),('Charles','Levine',33,'FEMME',74),('Dawn','Skinner',78,'HOMME',75),('Blake','Walsh',39,'HOMME',76),('Rudyard','Waters',63,'FEMME',77),('Hasad','Conley',90,'HOMME',78),('Camille','Mcgee',69,'FEMME',79);
INSERT INTO user (name,surname,age,sex,id) VALUES ('Tanner','Hess',35,'FEMME',80),('Honorato','Carpenter',26,'FEMME',81),('Brenden','Espinoza',28,'FEMME',82),('Tallulah','Shaffer',45,'HOMME',83),('Tana','Mendez',56,'FEMME',84),('Allistair','Joseph',30,'HOMME',85),('Drew','Sanders',82,'HOMME',86),('Stuart','Chavez',79,'FEMME',87),('Hedy','Mack',64,'HOMME',88),('Scarlett','Rojas',88,'HOMME',89);
INSERT INTO user (name,surname,age,sex,id) VALUES ('Chaim','Roberts',43,'FEMME',90),('Alyssa','Elliott',56,'HOMME',91),('Avram','Calhoun',77,'HOMME',92),('Latifah','Hampton',43,'FEMME',93),('Raphael','Lloyd',20,'FEMME',94),('Sara','Blevins',86,'FEMME',95),('Amir','Bass',97,'HOMME',96),('Hall','Mcdonald',78,'FEMME',97),('Leandra','Odom',28,'HOMME',98),('Eleanor','House',28,'FEMME',99);

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

