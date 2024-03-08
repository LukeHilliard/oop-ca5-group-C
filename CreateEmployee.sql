DROP DATABASE IF EXISTS `user_database`;
CREATE DATABASE `user_database`;
USE `user_database`;
DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
                        `EMPLOYEE_ID` int(11) NOT NULL AUTO_INCREMENT,
                        `FIRST_NAME` varchar(50) NOT NULL,
                        `LAST_NAME` varchar(50) NOT NULL,
                        `SALARY` int(20) NOT NULL,
                        `ROLE` varchar(20) NOT NULL,
                        PRIMARY KEY  (`USER_ID`)
);

INSERT INTO Employee VALUES (null, "John", "Smith", 15000, "IT"),
                        (null, "Mary", "Byrne", 40000, "IT"),
                        (null, "Frankie", "Cocozza", 30000, "HR"),
                        (null, "Patrick", "Jones", 20000, "HR"),
                        (null, "John", "Smyth", 17500, "IT");
