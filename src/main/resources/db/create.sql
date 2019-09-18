SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS heroes (
   id serial PRIMARY KEY ,
   name VARCHAR,
   age INTEGER,
   power VARCHAR,
   weakness VARCHAR,
   squadId INTEGER
);

CREATE TABLE IF NOT EXISTS squads (
  id serial PRIMARY KEY ,
    name VARCHAR,
    size INTEGER,
     cause VARCHAR
);