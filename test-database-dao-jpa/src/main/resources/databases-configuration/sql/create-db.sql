--DROP TABLE users IF EXISTS;

CREATE TABLE USERS (
  id INTEGER IDENTITY PRIMARY KEY,
  nombre VARCHAR(15),
  apellido VARCHAR(15),
  edad INTEGER,
  soltero BOOLEAN,
  dni  VARCHAR(9),
  telefono  VARCHAR(9),
  email  VARCHAR(50)  
);
