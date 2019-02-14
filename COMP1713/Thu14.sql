


CREATE TABLE League(
		LeagueID INT PRIMARY KEY IDENTITY,
		Name VARCHAR(40),
	);
CREATE TABLE Team(
		TeamID INT PRIMARY KEY IDENTITY,
		Name VARCHAR(40),
		LeagueID INT,
		CONSTRAINT fk_LeagueID FOREIGN KEY (LeagueID)
					REFERENCES League(LeagueID)
);
CREATE TABLE Result(
		ResultID INT PRIMARY KEY IDENTITY,
		HomeTeamID INT,
		AwayTeamID INT,
		HomeScore INT,
		AwayScore INT,
		HomePoints INT,
		AwayPoints INT,
		LeagueID INT,
		CONSTRAINT fk_HomeTeamID FOREIGN KEY (HomeTeamID)
						 REFERENCES Team(TeamID),
		CONSTRAINT fk_AwayTeamID FOREIGN KEY (AwayTeamID)
						REFERENCES Team(TeamID),
		CONSTRAINT fk_ResultLeagueID FOREIGN KEY (LeagueID)
						REFERENCES League(LeagueID)
);
CREATE TABLE Player(
    PlayerID PRIMARY KEY IDENTITY,
    FirstName VARCHAR(20),
    LastName VARCHAR(20),
    DOB INT(8),
    Sex VARCHAR,
    CONSTRAINT fk_TeamID FOREIGN KEY (TeamID)
                    REFERENCES Team(TeamID),
)




INSERT INTO League VALUES ('League One');
INSERT INTO League VALUES ('World Cup A');
INSERT INTO League VALUES ('World Cup B');



INSERT INTO Team VALUES ('Liverpool',1);
INSERT INTO Team VALUES ('Arsenal',1);
INSERT INTO Team VALUES ('BarneyDaBest',1);
INSERT INTO Team VALUES ('BrandonLoser',1);
INSERT INTO Team VALUES ('RealBoitar',1);
INSERT INTO Team VALUES ('BouftonRouge',1);
INSERT INTO Team VALUES ('TofuLegs',1);

SELECT * FROM Team

INSERT INTO Player (FirstName,LastName) VALUES ('Ryan','Renold',2);
INSERT INTO Player (FirstName,LastName) VALUES ('Hugh','Jackman',2);
INSERT INTO Player (FirstName,LastName) VALUES ('Tom','Cruise',2);

INSERT INTO Team (Name,LeagueID) VALUES ('Liverpool',1);


INSERT INTO result VALUES (1,2,4,0,3,0,1);

SELECT * FROM Result,

SELECT * FROM team WHERE leagueID = 1;
SELECT * FROM team WHERE leagueID = 2;

SELECT Name FROM team WHERE leagueID = 2;
SELECT FirstName FROM Player WHERE 
