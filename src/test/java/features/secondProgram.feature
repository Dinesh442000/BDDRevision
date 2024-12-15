@tag
Feature: Application login

Background:                                                                                                                                          
When launch the browser from config variables
And hit the home page url of banking site


@MobileTest @NetBanking
Scenario: Userpage login

Given User is on NetBanking login page
When User login into application with "user" and password "9087"
Then Home Page is displayed
And Card are displayed

#sending data in tables
@RegressionTest @SmokeTest @Mortgage
Scenario Outline: Userpage login multiple users

Given User is on NetBanking login page
When User login into application with <user> and password "<password>"
Then Home Page is displayed
And Card are displayed

Examples:
	| user 		| password | 
	| debituser 	| hello12 | 
	| creditUser 	| cred123 | 
	
