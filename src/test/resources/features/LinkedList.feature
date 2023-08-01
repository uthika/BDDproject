Feature: Linked list module of dsalgo portal


  Scenario: User navigates from home page to linkedlist page
  	Given User is on ninja home page after logging in
    When User clicks on getstarted button of Linked List
    Then User navigates to linked list page

  Scenario: User navigates from linked list page to text editor page in introduction
    Given User is in the Linked List page after logged in to test introduction link
    When The user clicks Introduction "Introduction" link
    Then The user should be directed to Introduction of Linked List Page
    When User clicks "Try Here" button on Introduction page
    Then User navigates to try editor page with a run button to test introduction link
    
  Scenario Outline:  The user runs the code in tryEditor with valid input for Introduction page
   Given The user is in a page having an tryEditor with a Run button to test introduction link
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> to test introduction link
   And The user clicks on run button to test introduction link
   Then The user should be presented with Run result for introduction link
   
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
  Scenario Outline: The user getting error message with invalid python code for Introduction page	 																				
	 Given The user is in a page having an tryEditor with a Run button to test invalid scenario for introduction page
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> to test invalid scenario for introduction page
   And The user clicks on run button to test invalid scenario for introduction page
   Then The user should be presented with error message for invalid scenario for introduction page
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
  

  Scenario: User navigates from linked list page to text editor page in creating linked list
    Given User is in the Linked List page after logged in to test creating linked list
    When The user clicks Creating Linked List "Creating Linked List" link
    Then The user should be directed to Creating Linked List of Linked List Page
    When User clicks "Try Here" button on Creating Linked List page
    Then User navigates to try editor page with a run button to test Creating Linked List link
    
  Scenario Outline:  The user runs the code in tryEditor with valid input for Creating Linked List page
   Given The user is in a page having an tryEditor with a Run button to test Creating Linked List link
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> to test Creating Linked List link
   And The user clicks on run button to test Creating Linked List link
   Then The user should be presented with Run result for Creating Linked List link
   
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
  Scenario Outline: The user getting error message with invalid python code for Creating Linked List page	 																				
	 Given The user is in a page having an tryEditor with a Run button to test invalid scenario for Creating Linked List page
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> to test invalid scenario for Creating Linked List page
   And The user clicks on run button to test invalid scenario for Creating Linked List page
   Then The user should be presented with error message for invalid scenario for Creating Linked List page
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
  Scenario: User navigates from linked list page to text editor page in types of linked list
    Given User is in the Linked List page after logged in to test types of linked list
    When The user clicks Types of Linked List "Types of Linked List" link
    Then The user should be directed to Types of Linked List of Linked List Page
    When User clicks "Try Here" button on Types of Linked List page
    Then User navigates to try editor page with a run button to test Types of Linked List link
    
  Scenario Outline:  The user runs the code in tryEditor with valid input for Types of Linked List page
   Given The user is in a page having an tryEditor with a Run button to test Types of Linked List link
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> to test Types of Linked List link
   And The user clicks on run button to test Types of Linked List link
   Then The user should be presented with Run result for Types of Linked List link
   
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
  Scenario Outline: The user getting error message with invalid python code for Types of Linked List page	 																				
	 Given The user is in a page having an tryEditor with a Run button to test invalid scenario for Types of Linked List page
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> to test invalid scenario for Types of Linked List page
   And The user clicks on run button to test invalid scenario for Types of Linked List page
   Then The user should be presented with error message for invalid scenario for Types of Linked List page
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      

  Scenario: User navigates from linked list page to text editor page in implement linked list in python
    Given User is in the Linked List page after logged in to test implement linked list in python
    When The user clicks Implement Linked List in Python "Implement Linked List in Python" link
    Then The user should be directed to Implement Linked List in Python of Linked List Page
    When User clicks "Try Here" button on Implement Linked List in Pythont page
    Then User navigates to try editor page with a run button to test Implement Linked List in Python link
    
  Scenario Outline:  The user runs the code in tryEditor with valid input for Implement Linked List in Python page
   Given The user is in a page having an tryEditor with a Run button to test Implement Linked List in Python link
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> to test Implement Linked List in Python link
   And The user clicks on run button to test Implement Linked List in Python link
   Then The user should be presented with Run result for Implement Linked List in Python link
   
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
  Scenario Outline: The user getting error message with invalid python code for Implement Linked List in Python page	 																				
	 Given The user is in a page having an tryEditor with a Run button to test invalid scenario for Implement Linked List in Python page
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> to test invalid scenario for Implement Linked List in Python page
   And The user clicks on run button to test invalid scenario for Implement Linked List in Python
   Then The user should be presented with error message for invalid scenario for Implement Linked List in Python
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: User navigates from linked list page to text editor page in traversal
    Given User is in the Linked List page after logged in to test traversal
    When The user clicks traversal "Traversal" link
    Then The user should be directed to traversal of Linked List Page
    When User clicks "Try Here" button on traversal page
    Then User navigates to try editor page with a run button to test traversal link
    
  Scenario Outline:  The user runs the code in tryEditor with valid input for traversal page
   Given The user is in a page having an tryEditor with a Run button to test traversal link
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> to test traversal link
   And The user clicks on run button to test traversal link
   Then The user should be presented with Run result for traversal link
   
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
  Scenario Outline: The user getting error message with invalid python code for traversal link	 																				
	 Given The user is in a page having an tryEditor with a Run button to test invalid scenario for traversal page
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> to test invalid scenario for traversal page
   And The user clicks on run button to test invalid scenario for traversal link
   Then The user should be presented with error message for invalid scenario for traversal link
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: User navigates from linked list page to text editor page in Insertion
    Given User is in the Linked List page after logged in to test insertion
    When The user clicks Insertion "Insertion" link
    Then The user should be directed to Insertion of Linked List Page
    When User clicks "Try Here" button on Insertion page
    Then User navigates to try editor page with a run button to test Insertion link
    
  Scenario Outline:  The user runs the code in tryEditor with valid input for Insertion page
   Given The user is in a page having an tryEditor with a Run button to test Insertion link
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> to test Insertion link
   And The user clicks on run button to test Insertion link
   Then The user should be presented with Run result for Insertion link
   
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
  Scenario Outline: The user getting error message with invalid python code for Insertion page	 																				
	 Given The user is in a page having an tryEditor with a Run button to test invalid scenario for Insertion page
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> to test invalid scenario forInsertion page
   And The user clicks on run button to test invalid scenario for Insertion link
   Then The user should be presented with error message for invalid scenario for Insertion link
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: User navigates from linked list page to text editor page in Deletion
    Given User is in the Linked List page after logged in to test deletion
    When The user clicks Deletion "Deletion" link
    Then The user should be directed to Deletion of Linked List Page
    When User clicks "Try Here" button on Deletion page
    Then User navigates to try editor page with a run button to test Deletion link
    
  Scenario Outline:  The user runs the code in tryEditor with valid input for Deletion page
   Given The user is in a page having an tryEditor with a Run button to test Deletion link
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> to test Deletion link
   And The user clicks on run button to test Deletion link
   Then The user should be presented with Run result for Deletion link
   
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
  Scenario Outline: The user getting error message with invalid python code for Deletion page	 																				
	 Given The user is in a page having an tryEditor with a Run button to test invalid scenario for Deletion page
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> to test invalid scenario for Deletion page
   And The user clicks on run button to test invalid scenario for Deletion link
   Then The user should be presented with error message for invalid scenario for Deletion link
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |