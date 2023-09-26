Feature: Queue feature file for dsalgo project
  

Scenario: User is navigated to tryEditor text in Queue page 
Given User is on dsalgo portal home page after logged in 
When  User clicks on "Queue" getstarted button in dsalgo homepage
Then The user is navigated to "Queue" data structure page to test queue links 
When User clicks on "Implementation of Queue in Python" link from queue page
Then User should be redirected to Implementation of queue in Python page
When The user clicks "Try Here" button in implementation of queue in python page
Then The user should be redirected to a page having an tryEditor with a Run button to test implementation of queue in python

Scenario Outline: The user is able run code in tryEditor for Implementation of queue in Python page
Given The user is in Implementation of queue in python page having an tryEditor with a Run button to test
When The user enters valid python code in Implementation of queue in python tryEditor from sheet "<Sheetname>" and <RowNumber>
And The user clicks on run button for valid code in implementation in python page
Then The user should be presented with Run result for Implementation of queue in Python 
Examples: 
| Sheetname  | RowNumber |
| pythonCode |         0 |

Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Implementation of queue in Python page
    Given The user is in queue module having an tryEditor with a Run button to test invalid scenario for implementation of queue in python page
    When The user enter python code with invalid syntax in Implementation of queue in python tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User clicks on run button for invalid code for implementation of queue in python
    Then User The user should be presented with error message for implementation of queue in python
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
    
Scenario:  User is navigated to tryEditor text in Implementation using collections deque link
    Given The user is on the "Queue home page" to test Implementation using collections deque link
    When The user clicks Implementation using collections deque link 
    Then The user should be redirected to "Implementation using collections deque link" page in Implementation using collections deque link
    When The user clicks "Try Here" button on "Implementation using collections deque link" page in Implementation using collections deque link page
    Then The user should be redirected to Try Here page in Implementation using collections deque link
  
     Scenario Outline: The user is able run code in tryEditor for Implementation using collections deque page
    Given The user is in queue page having an tryEditor with a Run button to test Implementation using collections deque link
    When The user enter valid python code in Implementation using collections deque page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for valid code in list to test Implementation using collections deque link
    Then The user should be presented with Run result for Implementation using collections deque page
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

   Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Implementation using collections deque page
    Given The user is in queue page having an tryEditor with a Run button to test for invalid syntax
    When The user enter python code with invalid syntax in Implementation using collections deque page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for invalid code in list to test Implementation using collections deque link
    Then The user should be presented with error message for Implementation using collections deque page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
 
   Scenario:  User is navigated to tryEditor text in Implementation using array link page
    Given The user is on the "queue home page" to test Implementation using array 
    When The user clicks Implementation using array link
    Then The user should be redirected to "Implementation using array" page in Implementation using array
    When The user clicks "Try Here" button on "Implementation using array" in Implementation using array page
    Then The user should be redirected to Try Here page in Implementation using array

 Scenario Outline: The user is able run code in tryEditor for Implementation using array page
    Given The user is in array page having an tryEditor with a Run button to test for valid code in Implementation using array 
    When The user enter valid python code in Implementation using array tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for valid code in Implementation using array
    Then The user should be presented with Run result for Implementation using array page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

    Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Implementation using array page
    Given The user is in queue page having an tryEditor with a Run button to test for invalid code in Implementation using array 
    When The user enter python code with invalid syntax in Implementation using array page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for invalid code in Implementation using array 
    Then The user should be presented with error message for Implementation using array page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |    


 Scenario: User is navigated to tryEditor text in Queue operations page
    Given The user is on the "queue home page" for testing in Queue Operations page
    When The user clicks Queue operations link
    Then The user is redirected to "Queue Operations" page to test Queue operations link
    When The user clicks on "Try Here" button on "Queue Operations" page to test Queue operations link
    Then The user should be redirected to Try Here page in Queue Operations

 Scenario Outline: The user is able run code in tryEditor for Queue Operations page
    Given The user is in queue page having an tryEditor with a Run button to test for valid code in Queue Operations page
    When The user enter valid python code in Queue Operations page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for valid code in Queue Operations page
    Then The user should be presented with Run result for Queue Operations page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |    


Scenario Outline:The user is presented with error message for code with invalid syntax in tryEditor for Queue Operations page
    Given The user is in queue page having an tryEditor with a Run button to test invalid code Queue Operations page
    When The user enter python code with invalid syntax in Queue Operations page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for invalid code Queue Operations page
    Then The user should be presented with error message for Queue Operations page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
