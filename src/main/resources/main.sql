BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "category"
(
    "category_id"	integer,
    "description"	varchar,
    "name"	varchar NOT NULL UNIQUE,
    CONSTRAINT "category_pk" PRIMARY KEY("category_id")
);
INSERT INTO category(description, name) VALUES ('testDescription', 'Test1');
INSERT INTO category(description, name) VALUES ('testDescription Ole', 'Test2');
INSERT INTO category(description, name) VALUES ('testDescription Heloow', 'Test3');
INSERT INTO category(description, name) VALUES ('testDescription Howdy', 'Test4');
INSERT INTO category(description, name) VALUES ('testDescription haha', 'Test5');


COMMIT;
