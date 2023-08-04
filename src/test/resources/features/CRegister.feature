Feature: DS-Algo Portal Register Page

Scenario: The user is presented with error message for empty fields below Username textbox
Given The user opens Register Page
When he user clicks "Register" button with all fields empty
Then It should display an error "Please fill out this field." below Username textbox

Scenario: The user is presented with error message for empty fields below Password textbox
Given The user opens Register Page
When The user clicks "Register" button after entering username with other fields empty
      | username     |
      | AgileNinjas@sdet120_1 |
Then It should display an error "Please fill out this field" below Password textbox

Scenario: The user is presented with error message for empty fields below Password Confirmation textbox
Given The user opens Register Page
When The user clicks "Register" button after entering "username" and "password" with Password Confirmation field empty
      | username     | password     |
      | AgileNinjas@sdet120_1 | testpassword |
Then It should display an error "Please fill out this field." below Password Confirmation textbox

Scenario: The user is presented with error message for invalid username
Given The user opens Register Page
When The user enters a "username" with characters other than Letters, digits and "@/./+/-/_"
      | username | password     | password confirmation |
      | &**&**&  | testpassword | testpassword          |
Then It should display an error message "Please enter a valid username"

Scenario: The user is presented with error message for username already exists
Given The user opens Register Page
When The user enters a valid existing "username" with "password" and "password confirmation"
      | username     | password  | password confirmation |
      | AgileNinjas@sdet120_1 | RT56YUabc | RT56YUabc  |
Then It should display an error message "Username already exists"

Scenario: The user is presented with error message for password mismatch
Given The user opens Register Page
When The user clicks "Register" button after entering valid "username" and different passwords in "password" and "password confirmation" fields
      | username     | password     | password confirmation |
      | AgileNinjas@sdet120_1 | testpassword | testpassword1   | 
Then It should display an error message saying "password_mismatch:The two password fields didn’t match."

Scenario: The user is presented with error message for password with characters less than 8
Given The user opens Register Page
When The user enters a valid "username" and "password" with characters less than 8
      | username     | password | password confirmation |
      | AgileNinjas@sdet120_1 | a1b2c3d  | a1b2c3d            |
Then It should display an error message "Password should contain at least 8 characters"

Scenario: The user is presented with error message for password with only numbers
Given The user opens Register Page
When The user enters a valid "username" and "password" with only numbers
      | username     | password | password confirmation |
      | AgileNinjas@sdet120_1 | 12345678 |              12345678 |
Then It should display an error message "Password can’t be entirely numeric."

Scenario: The user is presented with error message for password too similar to your other personal information
Given The user opens Register Page
When The user enters a valid "username" and "password" similar to username
      | username     | password   | password confirmation |
      | AgileNinjas@sdet120_1 | testsdet84 | testsdet84          |
Then It should display an error message "password can’t be too similar to your other personal information."

Scenario: The user is presented with error message for commonly used password
Given The user opens Register Page
When The user enters a valid "username" and commonly used password "password"
      | username     | password | password confirmation |
      | AgileNinjas@sdet120_1 | Welcome1 | Welcome1          |
Then It should display an error message "Password can’t be commonly used password"

Scenario: The user is succesfully able to register
Given The user opens Register Page
When The user enters a valid "username" and "password" and "password confirmation"
      | username     | password  | password confirmation |
      | AgileNinjas@sdet120_1 | RT56YU@78 | RT56YU@78       |
Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"
