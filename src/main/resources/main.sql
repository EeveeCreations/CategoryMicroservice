BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "category" (
	"category_id"	integer,
	"description"	varchar,
	"name"	varchar NOT NULL UNIQUE,
	CONSTRAINT "category_pk" PRIMARY KEY("category_id")
);
INSERT INTO category(description, name) VALUES ("description1", "name1");
INSERT INTO category(description, name) VALUES ("description2", "name2");
INSERT INTO category(description, name) VALUES ("description3", "name3");
INSERT INTO category(description, name) VALUES ("description4", "name4");
INSERT INTO category(description, name) VALUES ("description5", "name5");

COMMIT;
