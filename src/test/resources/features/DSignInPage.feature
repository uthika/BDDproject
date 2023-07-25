Feature: DS-Algo SignIn Page feature

Scenario: Verifying Register link
Given  The user is on signin page
When The user clicks on register link on signin page
Then The user redirected to Registration page from signin page

Scenario Outline: User on login page and login with invalid inputs
Given  The user is on signin page
When  The user enter invalid "<username>" and "<password>"
Then click login button
Examples: 
      | username | password |
      | user     |          |
      |          | password |
      |          |          |

Scenario Outline: Useinvalid and valid inputs from Excelr on login page and login with 
Given The user is on signin page
When The user enter sheet "<Sheetname>" and <RowNumber>
Then click login button to verify
 Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |

Scenario Outline: The user is able to signin with registered credential
Given The user is on the Sign in page
When The user enters a valid "<username>" and "<password>"
Then click login button to verify
Examples: 
      | username   | password  |
      | uthika | ninja@study |


Scenario: Verifying signout link
Given The user is in the Home page with valid  log in
When The user clicks on "Sign out" 
Then It should display the success message "Logged out successfully"


