

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

INSERT INTO Player (FirstName,LastName) VALUES ('Ryan','Renold');
INSERT INTO Player (FirstName,LastName) VALUES ('Hugh','Jackman');
INSERT INTO Player (FirstName,LastName) VALUES ('Tom','Cruise');

INSERT INTO Team (Name,LeagueID) VALUES ('Liverpool',1);


INSERT INTO result VALUES (1,2,4,0,3,0,1);

SELECT * FROM Result;

SELECT * FROM Team WHERE leagueID = 1;
SELECT * FROM Team WHERE leagueID = 2;

SELECT Name FROM Team WHERE leagueID = 2;
SELECT FirstName FROM Player	 ;

SELECT * FROM League;
SELECT * FROM Team;
SELECT * FROM Result;
SELECT * FROM Player;

SELECT Name FROM team WHERE leagueID = 2;

SELECT FirstName+' '+LastName FROM Player;



SELECT Team.Name, League.Name FROM team INNER JOIN 
League ON Team.LeagueID = League.LeagueID 
WHERE Team.LeagueID=1;

 
SELECT COUNT(ResultID) AS HomeGamesPlayed, HomeTeamID FROM Result 
GROUP BY HomeTeamID;

SELECT SUM(HomePoints) AS "Home Points", HomeTeamID  FROM Result 
GROUP BY HomeTeamID;


/* Example 1: COUNT home games played and join the result to Team to show the Team.Name  */ 

SELECT COUNT(ResultID) AS HomeGamesPlayed, Team.Name
FROM Result INNER JOIN Team ON Team.TeamID=Result.HomeTeamID 
GROUP BY Team.Name;

/* Example 2: SUM home games points and join the result to Team to show the Team name */ 

SELECT SUM(HomePoints) AS "Home Points", Team.Name  
FROM Result INNER JOIN Team ON Team.TeamID=Result.HomeTeamID 
GROUP BY Team.Name;

/* Example 3: SUM home and away points and join the result to Team to show the Team name, note: the use of HomeTeamID OR AwayTeamID */ 

SELECT SUM(HomePoints) AS "Home Points", SUM(AwayPoints) as "Away Points", 
	Team.Name  
FROM Result INNER JOIN Team ON 
Team.TeamID=Result.HomeTeamID OR Team.TeamID=Result.AwayTeamID 
GROUP BY Team.Name;


SELECT (PointsResultSet.HomePoints + PointsResultSet.AwayPoints) as Points,
 PointsResultSet.Name from
(SELECT SUM(HomePoints) AS "HomePoints", SUM(AwayPoints) as
"AwayPoints", Team.Name  
FROM Result INNER JOIN Team ON Team.TeamID=Result.HomeTeamID OR Team.TeamID=Result.AwayTeamID 
GROUP BY Team.Name) as PointsResultSet;


SELECT (PointsResultSet.HomePoints + PointsResultSet.AwayPoints) as Points,
 PointsResultSet.Name from
(SELECT SUM(HomePoints) AS "HomePoints", SUM(AwayPoints) as
"AwayPoints", Team.Name  
FROM Result INNER JOIN Team ON Team.TeamID=Result.HomeTeamID OR Team.TeamID=Result.AwayTeamID 
GROUP BY Team.Name) as PointsResultSet ORDER BY Points DESC;

UPDATE Team SET Name='Liverpool FC' WHERE Name='Liverpool'

UPDATE Team SET Name='Liverpool FC' WHERE TeamID=1

