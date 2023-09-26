Feature:Stack

Scenario: The user is able to navigate to Stack Data Structure page
    Given The user is navigated to the LinkedList Deletion Page
    When  The user clicks the Stack item from the drop down menu
    Then  The user should be presented with Stack Page
 
  Scenario: The user should be directed to editor page with run button to test python code
    Given The user is on the Operations in Stack Page with Tryhere link
    When  The user clicks the Tryhere link in Stack module 
    Then  The user should be navigated to editor Page with Run button in Operations in Stack Page


 Scenario Outline: The user is able to navigate to Operations in Stack Page
    Given The user is on the Operations in Stack Page from the Editor Page
    When  The user clicks the "<stacklinks>" for Stack module
    And   The user click Try here link and enters the valid code from "<Sheetname>" and <RowNumber> for Stack module
  
    Then   The user should be able to view the output in Stack module
    
  Examples:
  |stacklinks|Sheetname|RowNumber|
  |Operations in Stack|code|0|
  |Implementation|code|0|
  |Applications|code|0|
  
 
  Scenario Outline: The user is able to navigate to Operations in Stack Page
    Given The user is on the Operations in Stack Page 
    When  The user clicks the "<stacklinks>" in  Stack module
    And   The user click Try here link and enters the invalid code from "<Sheetname>" and <RowNumber> in Stack module
    
    Then   The user should be able to get the Error Message in Stack module
  Examples:
  |stacklinks|Sheetname|RowNumber|
  |Operations in Stack|code|1|
  |Implementation|code|1|
  |Applications|code|1|
 
  
  Scenario Outline: The user is able to navigate to all Stack Pages
    Given The user is on the Stack Page to check all titles
    When  The user clicks the "<links>" in all Stack Page
    Then  The user should be navigated to "<titles>" of Stack Pages
Examples:
   |links|titles|
  |Operations in Stack|Operations in Stack|
  |Implementation|Implementation|
  |Applications|Applications|
  
 
 
 