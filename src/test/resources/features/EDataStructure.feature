Feature: DS-Algo DataStructure feature



Scenario: Logging into DS-ALgo portal
Given The user is on Signin page of DS Algo portal
When The user enter valid "agileninjas" and "ninjasquad4"
Then The user click on login button

Scenario: The user is able to navigate to Data Structure introduction page
Given The user is on the "home page" after logged in
When The user clicks the "Getting Started" button in Data Structure Page introduction Panel
Then The user should be redirected to data structure introduction page

Scenario: The user is able to navigate to Time Complexity page
Given The user is on "Data Structures Introduction" after logged in
When The user clicks Time Complexity link
Then The user should be redirected to "Time Complexity" page

Scenario: The user is able to navigate to a page having an tryEditor from Time Complexity page
Given The user is now on "Time Complexity" after logged in
When The user clicks "Try Here" button on "Time Complexity" page
Then The user should be directed to a tryEditor page

Scenario Outline: The user is able run code in tryEditor for Time Complexity page
Given The user is in a page having an tryEditor with a Run button to test
When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
Then The user should be presented with Run result
Examples:
      | Sheetname  | RowNumber |
      | pythonCode |        0 |


Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Time Complexity page
Given The user is in a page having an tryEditor with a Run button to test
When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
Then The user should be presented with error message


    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |        1 |

