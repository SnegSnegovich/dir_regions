CREATE TABLE IF NOT EXISTS DIRECTORY
(
    id         INTEGER PRIMARY KEY,
    title      VARCHAR(100) NOT NULL,
    shortTitle VARCHAR(100) NOT NULL
);

INSERT INTO DIRECTORY
VALUES (1, 'Working with MyBatis in Spring', 'Baeldung');
INSERT INTO DIRECTORY
VALUES (2, 'Spring', 'Bae');
INSERT INTO DIRECTORY
VALUES (3, 'MyBatis', 'ung');
