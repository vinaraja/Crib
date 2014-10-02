CREATE TABLE WTFuser
(
UserID int,
LastName varchar(255),
FirstName varchar(255),
username varchar(255),
email varchar(255),
password varchar(255),
Primary key (UserID)
);
CREATE TABLE WTFuser1
(
UserID int,
LastName varchar(255),
Primary key (UserID)
);

SELECT COUNT(USERID) FROM WTFuser;

DELETE from WTFuser;

select * from WTFuser;

ALTER TABLE WTFuser
DROP COLUMN USERID

INSERT INTO WTFuser VALUES ('Talreja', 'Vishesh', 'vtalreja', 'vtalreja@indiana.edu', 'firewaterthunder');
INSERT INTO WTFuser VALUES ('Rajagopalan', 'Vinay', 'vinaraja', 'vinaraja@indiana.edu', 'firewaterthunder');
INSERT INTO WTFuser VALUES ('Kanade', 'Aashish', 'akanade', 'akanade@indiana.edu', 'firewaterthunder');
