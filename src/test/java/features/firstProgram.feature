@tag
Feature: Application login

#Scenario: Admin page default login
#
#Given User is on NetBanking login page
#When User login into application with "admin" and password "1234"
#Then Home Page is displayed
#And Card are displayed
#
#
#Reusable as using same steps
#Scenario: Userpage login
#
#Given User is on NetBanking login page
#When User login into application with "user" and password "9087"
#Then Home Page is displayed
#And Card are displayed
#
#sending data in tables

Scenario Outline: Userpage login multiple users

Given User is on NetBanking login page
When User login into application with "<user>" and password "<password>"
Then Home Page is displayed
And Card are displayed

Examples:
	| user 		| password | 
	| debituser 	| hello12 | 
	| creditUser 	| cred123 | 
	
	