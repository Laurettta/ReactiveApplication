CREATE TABLE students(
    id SERIAL NOT NULL PRIMARY KEY,
    firstname VARCHAR(250),
    lastname VARCHAR(250),
    age integer
)

-- Please note the id should be not null because it's an id so we needs its numbers
-- we gave the firstname and last name the length of 250
-- and then age which is of type integer