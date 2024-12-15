@tag
Feature: Application login

Background:
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@SmokeTest
Scenario: Admin page default login

Given User is on NetBanking login page
When User login into application with "admin" and password "1234"
Then Home Page is displayed
And Card are displayed


#Reusable as using same steps
Scenario: Userpage login

Given User is on NetBanking login page
When User login into application with "user" and password "9087"
Then Home Page is displayed
And Card are displayed

#sending data in tables
@RegressionTest
Scenario Outline: Userpage login multiple users

Given User is on NetBanking login page
When User login into application with <user> and password "<password>"
Then Home Page is displayed
And Card are displayed

Examples:
	| user 		| password | 
	| debituser 	| hello12 | 
	| creditUser 	| cred123 | 
	
@SmokeTest @RegressionTest
Scenario: User signup on the application

Given User is on NetBanking login page
When user enters the mentioned data 
| dinesh |
|choudhary |
|dchoudhary442000@gmail.com |
|37864873 |
Then Home Page is displayed
And Card are displayed
	