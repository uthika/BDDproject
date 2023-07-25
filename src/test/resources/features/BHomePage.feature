
Feature: DS-Algo Home Page feature

Scenario: User launch home page of an dsalgo project
Given The user opens DS Algo portal link
When The user clicks the "Get Started" button
Then The user should be redirected to homepage

Scenario Outline: User is on Home page and click getstarted link on  home page without sign in
Given The user is on Home page
When The user clicks on Get Started link on homepage "<option>" without login
Then It should alert the user with a message "<message>"

Examples: 
      | option         |message  |
      | Datastructures |You are not logged in|
      | Arrays         |You are not logged in|
      | Linkedlist     |You are not logged in|
      | Stack          |You are not logged in|
      | Queue          |You are not logged in|
      | Tree           |You are not logged in|
      | Graph          |You are not logged in|

Scenario Outline: User is on Home page and click on dropdown without sign in
Given The user is on Home page
When  The user clicks on dropdown "<option>" without login
Then It should alert the user with a message "<message>"

 Examples: 
      | option         |message  |
      | Arrays         |You are not logged in|
      | Linked List     |You are not logged in|
      | Stack          |You are not logged in|
      | Queue          |You are not logged in|
      | Tree           |You are not logged in|
      | Graph          |You are not logged in|

Scenario: User is on Home page and click on sign in
Given The user is on Home page
When The user clicks "Sign in"
Then The user should be redirected to Sign in page

Scenario:  User is on Home page and click on Register
Given The user is on Home page
When The user clicks "Register"
Then The user should be redirected to Register form

