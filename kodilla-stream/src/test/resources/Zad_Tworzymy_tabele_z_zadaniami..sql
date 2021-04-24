-- Zadanie: Tworzymy tabele z zadaniami.
CREATE TABLE ISSUESLISTS
(
    ID  SERIAL PRIMARY KEY,
    NAME VARCHAR(160) NOT NULL,
);

CREATE TABLE ISSUES (
	ID SERIAL PRIMARY KEY,
	ISSUESLISTS_ID BIGINT UNSIGNED NOT NULL,
	SUMMARY VARCHAR(250),
	DESCRIPTION VARCHAR(1024),
	USER_ID_ASSIGNEDTO INTEGER,
	FOREIGN KEY (ISSUESLISTS_ID) REFERENCES ISSUESLISTS(ID)
);

INSERT INTO ISSUESLISTS (NAME)
VALUES ("ToDo", "In progress", "Done");

COMMIT;

--  ToDo TASKS
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'ToDo')
      , "SUMMARY TASK 1 toDo task"
      , "EXAPLE DESCRIPTION TASK");
	  
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'ToDo')
      , "SUMMARY TASK 2"
      , "DESCRIPTION TASK 2  example text for exaple task");
	  
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'ToDo')
      , "SUMMARY TASK 3"
      , "EXAPLE DESCRIPTION TASK 3");
	  
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'ToDo')
      , "SUMMARY FOR TASK 4 Lorem ipsum"
      , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'ToDo')
      , "SUMMARY TASK 5"
      , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");


-- In Progress TASKS
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'In progress')
      , "SUMMARY TASK 1 In progress task"
      , "EXAPLE DESCRIPTION TASK In progress");
	  
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'In progress')
      , "SUMMARY TASK 2 In progress"
      , "DESCRIPTION TASK 2  example text for exaple task");
	  
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'In progress')
      , "SUMMARY TASK 3 In progress"
      , "EXAPLE DESCRIPTION TASK 3");
	  
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'In progress')
      , "SUMMARY FOR TASK 4 Lorem ipsum - In progress"
      , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'In progress')
      , "SUMMARY TASK  In progress task 5"
      , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");


-- Done TASKS
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'Done')
      , "SUMMARY TASK 1 Done task"
      , "EXAPLE DESCRIPTION TASK");
	  
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'Done')
      , "SUMMARY TASK 2 - Done"
      , "DESCRIPTION TASK 2  example text for exaple task Done");
	  
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'Done')
      , "SUMMARY TASK 3 - Done"
      , "EXAPLE DESCRIPTION TASK 3 DoneDoneDoneDoneDone");
	  
INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'Done')
      , "SUMMARY FOR TASK 4 Lorem ipsum- Done"
      , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

INSERT INTO ISSUES (ISSUESLISTS_ID, SUMMARY, DESCRIPTION)
VALUES(
          (SELECT ID FROM ISSUESLISTS WHERE NAME = 'Done')
      , "SUMMARY TASK - Done"
      , "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");

COMMIT;