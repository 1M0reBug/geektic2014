DROP TABLE USER IF EXISTS CASCADE ;
DROP TABLE INTERESTS IF EXISTS CASCADE;
DROP TABLE USER_INTERESTS IF EXISTS CASCADE;


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

