
Feature: Graph
  
 
 Scenario: The user is able to navigate to Graph Data Structure page
    Given The user is on the Home Page
    When  The user clicks the graph item from the drop down menu
    Then  The user should be presented with Graph Page
 
 Scenario: The user is able to navigate to Graph Page in Graph
    Given The user is on the Graph Page
    When  The user clicks the Graph link
    Then  The user should be navigated to Graph Page
 
 Scenario: The user should be directed to editor page with run button to test python code
    Given The user is on the Graph Page with Tryhere link
    When  The user clicks the Tryhere link
    Then  The user should be navigated to editor Page with Run button
 
 Scenario Outline: The user should be able to run valid codes in Editor Page
    Given The user is on the Editor Page with Run button
    When  The user enters valid code from the sheet "<Sheetname>" and <RowNumber>
    And   The user clicks "run" button for valid code
    Then  The user should be presented with the output
  Examples:
    |Sheetname|RowNumber|
    |code|0|
    
 Scenario Outline: The user should be able to run invalid codes in Editor Page
    Given The user is on the Editor Page
    When  The user enters invalid code from the sheet "<Sheetname>" and <RowNumber>
    And   The user clicks "run" button for invalid code
    Then  The user should be presented with the desired output
  Examples:
    |Sheetname|RowNumber|
    |code|1|
    
  Scenario: The user is able to navigate to Graph Representations Page in Graph
    Given The user is on the Graph Page with Graph Representations link
    When  The user clicks the Graph Representations link
    Then  The user should be navigated to Graph Representations Page
    
  Scenario: The user is able to navigate to Graph Representations Editor Page 
    Given The user is on the Graph Representations Page
    When  The user clicks "Try here" link
    Then  The user should be navigated to Graph Representations Editor Page 
    And   The user should be presented with Edit Textbox and Run button
    
   Scenario Outline: The user is able to enter valid codes in Graph Representation Page
    Given The user is on Graph Represenation Editor Page
    When  The user enters valid code for Graph Respresentation from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks run button on Graph Representation Editor Page
    Then  The user should be able to get the required doutput
    Examples:
    |Sheetname|RowNumber|
    |code|0|
    
   Scenario Outline: The user is able to enter invalid codes in Graph Representation Page
    Given The user is on Graph Represenation Editor Page with Run button
    When  The user enters invalid code for Graph Respresentation from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks run button on Graph Representation Editor Page
    Then  The user should be alerted with Error Message
    Examples:
    |Sheetname|RowNumber|
    |code|1|
 