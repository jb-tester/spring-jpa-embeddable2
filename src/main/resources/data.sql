DROP table IF EXISTS person;
CREATE TABLE person (
    passport_number VARCHAR(255) NOT NULL,
    valid_from VARCHAR(255) NOT NULL ,
    valid_until VARCHAR(255) NOT NULL ,
    city VARCHAR(255),
    street VARCHAR(255),
    building VARCHAR(255),
    name VARCHAR(255),
    surname VARCHAR(255),
    birthday VARCHAR(255)
);
ALTER TABLE person ADD PRIMARY KEY (passport_number, valid_from, valid_until);
INSERT INTO person VALUES ( '111111', '01.01.2000', '01.01.2010', 'moscow', 'arbat', '10/12', 'ivan', 'ivanov', '29.02.1984' );
INSERT INTO person VALUES ( '111112', '02.01.2000', '02.01.2010', 'moscow', 'krasnaya pl', '1', 'petr', 'petrov', '07.11.1937' );
INSERT INTO person VALUES ( '333333', '01.03.2010', '01.03.2020', 'sankt-petersburg', 'nevsky pr', '100', 'maria', 'sidorova', '08.03.1990' );