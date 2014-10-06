CREATE TABLE WTFuser
(
LastName varchar(255),
FirstName varchar(255),
username varchar(255) NOT NULL,
email varchar(255),
password varchar(255),
CONSTRAINT primary_key_user PRIMARY KEY (username)
);

CREATE TABLE WTFtasks
(
TaskID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
Taskname varchar(255),
Taskpoints varchar(255),
Duedate date,
CONSTRAINT primary_key_task PRIMARY KEY (TaskID)
);

CREATE TABLE WTFtaskallocation
(
TaskID INTEGER,
username varchar(255),
FOREIGN KEY(TaskID) REFERENCES WTFtasks(TaskID),
FOREIGN KEY(username) REFERENCES WTFuser(username)
);

CREATE TABLE WTFFriends
(
mainusername varchar(255),
friendname varchar(255),
FOREIGN KEY(mainusername) REFERENCES WTFuser(username),
CONSTRAINT primary_key_friends PRIMARY KEY (mainusername,friendname)
);
drop table WTFFriends;

Alter table WTFtasks
add column owner varchar(255)

CREATE TABLE WTFuser1
(
UserID int,
LastName varchar(255),
Primary key (UserID)
);

SELECT COUNT(USERID) FROM WTFuser;
SELECT * FROM WTFFriends;
DELETE from WTFuser;
DELETE from WTFtasks;
DELETE from WTFtaskallocation;

select * from WTFuser;
select * from WTFtasks;
select * from WTFtaskallocation;

ALTER TABLE WTFuser
DROP COLUMN USERID

DROP TABLE WTFuser
DROP TABLE WTFtasks

INSERT INTO WTFuser VALUES ('Talreja', 'Vishesh', 'vtalreja', 'vtalreja@indiana.edu', 'firewaterthunder');
INSERT INTO WTFuser VALUES ('Rajagopalan', 'Vinay', 'vinaraja', 'vinaraja@indiana.edu', 'firewaterthunder');
INSERT INTO WTFuser VALUES ('Kanade', 'Aashish', 'akanade', 'akanade@indiana.edu', 'firewaterthunder');

INSERT INTO WTFtasks(Taskname,Taskpoints,Duedate,owner) VALUES ('Clean', '50', '09/10/2014', 'vtalreja');
INSERT INTO WTFtasks(Taskname,Taskpoints,Duedate,owner) VALUES ('Cook', '50', '09/10/2014', 'vinaraja');

INSERT INTO WTFtaskallocation VALUES (3,'vtalreja');
INSERT INTO WTFtaskallocation VALUES (4,'akanade');
INSERT INTO WTFtaskallocation VALUES (5,'vinaraja');
INSERT INTO WTFtaskallocation VALUES (4,'vtalreja');
INSERT INTO WTFtaskallocation VALUES (6,'akanade');
INSERT INTO WTFtaskallocation VALUES (8,'vinaraja');
INSERT INTO WTFtaskallocation VALUES (7,'akanade');