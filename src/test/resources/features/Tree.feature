Feature:Tree

Scenario: The user is able to navigate to Tree Data Structure page
    Given The user is navigated to the Home Page
    When  The user clicks the Tree item from the drop down menu
    Then  The user should be presented with Tree Page
 
 Scenario Outline: The user is able to navigate to Overview of Trees
    Given The user is on the Tree Page
    When  The user clicks the Overview of Trees in Tree
    Then  The user should be navigated to Overview of Trees Page
 
    
Scenario: The user should be directed to editor page with run button to test python code
    Given The user is on the Overview of Trees Page with Tryhere link
    When  The user clicks the Tryhere link in Overview of Trees Page
    Then  The user should be navigated to editor Page with Run button in Overview of Trees Page
    
Scenario Outline: The user should be able to run valid codes in Overview of Trees Editor Page
    Given The user is on the Overview of Trees Editor Page with Run button
    When  The user enters valid code for Overview of Trees from the sheet "<Sheetname>" and <RowNumber>
    And   The user clicks "run" button for Overview of Trees for valid code
    Then  The user should be able to view the output
  Examples:
    |Sheetname|RowNumber|
    |code|0|
    
Scenario Outline: The user should be able to run invalid codes in Overview of Trees Editor Page
    Given The user is on the Overview of Trees Editor Page with Run button to test invalid code
    When  The user enters invalid code for Overview of Trees from the sheet "<Sheetname>" and <RowNumber>
    And   The user clicks "run" button for Overview of Trees for invalid code
    Then  The user should be alerted with Error Message for Overview of Trees 
  Examples:
    |Sheetname|RowNumber|
    |code|1|

 Scenario Outline: The user is able to navigate to Terminologies
    Given The user is on the Overview of Trees Page from the Editor Page
    When  The user clicks the "<treelinks>"
    And   The user click Try here link and enters the valid code from "<Sheetname>" and <RowNumber>
  
    Then   The user should be able to view the output
    
  Examples:
  |treelinks|Sheetname|RowNumber|
  |Terminologies|code|0|
  |Types of Trees|code|0|
  |Tree Traversals|code|0|
  |Traversals-Illustration|code|0|
  |Binary Trees|code|0|
  |Types of Binary Trees|code|0|
  |Implementation in Python|code|0|
  |Binary Tree Traversals|code|0|
  |Implementation of Binary Trees|code|0|
  |Applications of Binary trees|code|0|
  |Binary Search Trees|code|0|
  |Implementation Of BST|code|0|
 
  Scenario Outline: The user is able to navigate to Terminologies
    Given The user is on the Overview of Trees Page from the Editor Page
    When  The user clicks the "<treelinks>"
    And   The user click Try here link and enters the invalid code from "<Sheetname>" and <RowNumber>
    
    Then   The user should be able to get the Error Message
    
  Examples:
  |treelinks|Sheetname|RowNumber|titles|
  |Terminologies|code|1|Terminologies|
  |Types of Trees|code|1|Types of Trees|
  |Tree Traversals|code|1|Tree Traversals|
  |Traversals-Illustration|code|1|Traversals-Illustration|
  |Binary Trees|code|1|Binary Trees|
  |Types of Binary Trees|code|1|Types of Binary Trees|
  |Implementation in Python|code|1|Implementation in Python|
  |Binary Tree Traversals|code|1|Binary Tree Traversals|
  |Implementation of Binary Trees|code|1|Implementation of Binary Trees|
  |Applications of Binary trees|code|1|Applications of Binary trees|
  |Binary Search Trees|code|1|Binary Search Trees|
  |Implementation Of BST|code|1|Implementation Of BST|
  
  Scenario Outline: The user is able to navigate to all Tree Pages
    Given The user is on the Tree Page to check all titles
    When  The user clicks the "<links>" in all Tree Page
    Then  The user should be navigated to "<titles>" Pages
Examples:
   |links|titles|
  |Terminologies|Terminologies|
  |Types of Trees|Types of Trees|
  |Tree Traversals|Tree Traversals|
  |Traversals-Illustration|Traversals-Illustration|
  |Binary Trees|Binary Trees|
  |Types of Binary Trees|Types of Binary Trees|
  |Implementation in Python|Implementation in Python|
  |Binary Tree Traversals|Binary Tree Traversals|
  |Implementation of Binary Trees|Implementation of Binary Trees|
  |Applications of Binary trees|Applications of Binary trees|
  |Binary Search Trees|Binary Search Trees|
  |Implementation Of BST|Implementation Of BST|
 
 
 