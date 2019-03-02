CREATE table person(
id integer not  null,
name varchar (255) not null,
location varchar (255),
birth_date timestamp,
primary key (id)
);


INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001, 'Rajesh', 'Pune', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'Rajeev', 'Indore', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10003, 'Raju', 'Mumbai', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10004, 'Abhishek', 'Mumbai', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10005, 'Alok', 'Mumbai', sysdate());

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10006, 'Vijay', 'Nagpur', sysdate());