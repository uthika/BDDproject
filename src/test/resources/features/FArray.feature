Feature: Array
  I want to use this template for my feature file
  


  Scenario: User is navigated to tryEditor text in Arrays page 
    Given User is on "Home Page" 
    When  User clicks on "Array" getstarted button
    Then The user is navigated to "Arrays" data structure page 
    When User clicks on "Arrays in Python" link
    Then User should be redirected to Arrays in Python page
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test

 
    Scenario Outline: The user is able run code in tryEditor for Arrays in Python page
    Given The user is in Arrays page having an tryEditor with a Run button to test
    When The user enters valid python code in Arrays tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for valid code
    Then The user should be presented with Run result for Arrays in Python 
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |


   Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays in Python page
    Given The user is in Arrays module having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in Arrays tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User clicks on run button for invalid code
    Then User The user should be presented with error message
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
    
   
              
    Scenario:  User is navigated to tryEditor text in Arrays Using List page
    Given The user is on the "Array home page" 
    When The user clicks Arrays Using List link
    Then The user should be redirected to "Arrays Using List" page in Arrays using List page
    When The user clicks "Try Here" button on "Arrays Using List" page in Arrays using List page
    Then The user should be redirected to Try Here page
    
           
   
    Scenario Outline: The user is able run code in tryEditor for Arrays Using List page
    Given The user is in array page having an tryEditor with a Run button to test
    When   The user enter valid python code in Arrays using List page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for valid code in list
    Then The user should be presented with Run result for Arrays using List page
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
    
    
    Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays Using List page
    Given The user is in array page having an tryEditor with a Run button to test for invalid syntax
    When The user enter python code with invalid syntax in Arrays using list page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for invalid code in list
    Then The user should be presented with error message for Arrays using List page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
    
   
    Scenario:  User is navigated to tryEditor text in Basic Operations in Lists page
    Given The user is on the "Array home page" to perform basic operations 
    When The user clicks Basic Operations in Lists link
    Then The user should be redirected to "Basic Operations in Lists" page in Basic Operations in Lists page
    When The user clicks "Try Here" button on "Basic Operations in Lists" in Basic Operations in Lists page
    Then The user should be redirected to Try Here page in Basic Opeartions
    
      
   
    Scenario Outline: The user is able run code in tryEditor for Basic Operations in Lists page
    Given The user is in array page having an tryEditor with a Run button to test for valid code in basic operations 
    When The user enter valid python code in Basic Operations in Lists tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for valid code in Basic Operations in Lists
    Then The user should be presented with Run result for Basic Operations in Lists page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
    
    
    Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Basic Operations in Lists page
    Given The user is in array page having an tryEditor with a Run button to test for invalid code in basic operations
    When The user enter python code with invalid syntax in Basic Operations in Lists page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for invalid code in Basic Operations in Lists
    Then The user should be presented with error message for Basic Operations in Lists page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
    

    Scenario: User is navigated to tryEditor text in Applications of Array page
    Given The user is on the "Array home page" for performing in Applications of Array page
    When The user clicks Applications of Array link
    Then The user is redirected to "Applications of Array" page
    When The user clicks on "Try Here" button on "Applications of Array" page
    Then The user should be redirected to Try Here page in Applications of Array
    
       
  
    Scenario Outline: The user is able run code in tryEditor for Applications of Array page
    Given The user is in array page having an tryEditor with a Run button to test for valid code in Applications of Array page
    When The user enter valid python code in Applications of Array page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for valid code in Applications of Array page
    Then The user should be presented with Run result for Applications of Array page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
    
    
    
    Scenario Outline:The user is presented with error message for code with invalid syntax in tryEditor for Applications of Array page
    Given The user is in array page having an tryEditor with a Run button to test invalid code Applications of Array page
    When The user enter python code with invalid syntax in Applications of Array page tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button for invalid code Applications of Array page
    Then The user should be presented with error message for Applications of Array page
    
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
      
      Scenario: The user is able to navigate to Question page from Search the array link
      Given The user is on the "Arrays in Python" page 
      When The user clicks Practice Questions link
      Then The user should be redirected to Practice page
      When The user clicks the Search the array link
      Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
      
                 
      
      Scenario Outline: The user is able to run and submit code in tryEditor for Search the array link
      Given The user is on "Question" page of "Search the array" 
      When The user enter valid python code in tryEditor in Search the array link from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button for valid code in "Question" page
      Then The user should be presented with Run result for Search the array link
      When The user clicks on Submit button on question one
      Then The user should be presented with successful submission message for Search the array
      
       Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
      
      
      
      Scenario Outline:  The user is presented with error message for code with invalid syntax in tryEditor for Search the array link
      Given The user is on "Question" page of Search the array
      When The user enter invalid python code in tryEditor in Search the array link from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button for valid code in "Question" page
      Then The user should be presented with error message for Search the array link
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
      
      Scenario: The user is able to navigate to Question page from Max Consecutive Ones
      Given The user is on the Practice page to check  Max Consecutive Ones
      When The user clicks the "Max Consecutive Ones" link
      Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons for question two
      
     
      Scenario Outline: The user is able to run and submit code in tryEditor for Max Consecutive Ones
      Given The user is on Question page of Max Consecutive Ones 
      When The user enter valid python code in tryEditor in Max Consecutive Ones from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button for valid code in Max Consecutive Ones
      Then The user should be presented with Run result for Max Consecutive Ones
      When The user clicks on Submit button on question two
      Then The user should be presented with successful submission message on question two
      
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
      
      
      Scenario Outline: The user is presented with error message for invalid code in tryEditor for Max Consecutive Ones
      Given The user is on Question page of Max Consecutive Ones 
      When The user enter invalid python code in tryEditor in Max Consecutive Ones from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button for invalid code in Max Consecutive Ones
      Then The user should be presented with error message for Max Consecutives Ones
      
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
    
          
      Scenario: The user is able to navigate to Question page from Find Numbers with Even Number of Digits
      Given The user is on the Practice page to check Even Number of Digits
      When The user clicks the "Find Numbers with Even Number of Digits" link after logging in
      Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons for question three
            
     
      Scenario Outline: The user is able to run code in tryEditor for Find Numbers with Even Number of Digits
      Given The user is on Question page of Find Numbers with Even Number of Digits
      When The user enter valid python code in tryEditor in Even Number of Digits from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button for valid code in Find Numbers with Even Number of Digits
      Then The user should be presented with Run result for Even Number of Digits
      When The user clicks on Submit button on question three
      Then The user should be presented with successful submission message on question three
      
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
     
                 
      Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Find Numbers with Even Number of Digits
      Given The user is on Question page of Find Numbers with Even Number of Digits after logged in
      When The user enter invalid python code in tryEditor in  Even Number of Digits from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button for invalid code in Find Numbers with Even Number of Digits
      Then The user should be presented with error message for Even Number of Digits
      Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
      
      Scenario: The user is able to navigate to Question page from Squares of a Sorted Array
      Given The user is on the Practice page after logged in
      When The user clicks the Squares of a Sorted Array link
      Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
      
      
      Scenario Outline: The user is able to run code in tryEditor for Squares of a Sorted Array
      Given The user is on Question page of Squares of a Sorted Array a
      When The user enter valid python code in tryEditor in Squares of a Sorted Array from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button for valid code in Sorted Array
      Then The user should be presented with Run result for Squares of Sorted Array
      When The user clicks on Submit button on question four
      Then The user should be presented with successful submission message on question four
       Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
          
      Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Squares of a Sorted Array
      Given The user is on Question page of Squares of a Sorted Array 
      When The user enter invalid python code in tryEditor in Squares of a Sorted Array from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button for invalid code in Sorted Array
      Then The user should be presented with error message for Squares of Sorted Array
       Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      