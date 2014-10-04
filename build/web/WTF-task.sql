CREATE TABLE WTFuser
(
LastName varchar(255),
FirstName varchar(255),
username varchar(255) NOT NULL,
email varchar(255),
<<<<<<< HEAD
password varchar(255)
=======
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
>>>>>>> 6428c161e7367abdaed2cd5dc3a990ff9beb5566
);

CREATE TABLE WTFuser1
(
UserID int,
LastName varchar(255),
Primary key (UserID)
);

SELECT COUNT(USERID) FROM WTFuser;

DELETE from WTFuser;
DELETE from WTFtasks;

select * from WTFuser;
select * from WTFtasks;

ALTER TABLE WTFuser
DROP COLUMN USERID

DROP TABLE WTFuser
DROP TABLE WTFtasks

INSERT INTO WTFuser VALUES ('Talreja', 'Vishesh', 'vtalreja', 'vtalreja@indiana.edu', 'firewaterthunder');
INSERT INTO WTFuser VALUES ('Rajagopalan', 'Vinay', 'vinaraja', 'vinaraja@indiana.edu', 'firewaterthunder');
INSERT INTO WTFuser VALUES ('Kanade', 'Aashish', 'akanade', 'akanade@indiana.edu', 'firewaterthunder');

INSERT INTO WTFtasks(Taskname,Taskpoints,Duedate) VALUES ('Clean', '50', '09/10/2014');
INSERT INTO WTFtasks(Taskname,Taskpoints,Duedate) VALUES ('Cook', '50', '09/10/2014');

INSERT INTO WTFtaskallocation VALUES ('2','vtalreja');
INSERT INTO WTFtaskallocation VALUES ('1','akanade');
INSERT INTO WTFtaskallocation VALUES ('1','vinaraja');
