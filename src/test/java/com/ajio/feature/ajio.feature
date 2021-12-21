Feature: To Check closet functionality

Scenario: Launch Application
Given To launch the application
When user launch the browser
Then user invoke the Ajio application
Then user in homepage

Scenario: Mouse over on women category

Given To mouse over on women category 
When user mouse over on women category
Then user select the dress material category
Then  user on the dress material category


Scenario: Select price range from 300-500rs
Given  select the price range option.
When ^ user enter the minimum price^
And  ^user enter the maximum price^
And user the select the continue button
Then select the list out item