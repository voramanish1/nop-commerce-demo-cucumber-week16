@registerpage
Feature: register Page test

  As user I want to register on nopcommerce website

  Background: User is on register page
    Given I am on home page for registration
    And  I click on register link
    Then I am on register page

  @smoke
  Scenario: verify User Should Navigate To Register Page Successfully
    When I click on register link
    Then I should be navigate to register page successfully
    And  I should be able to see register text

  @sanity
  Scenario Outline: verify That FirstName LastName Email Password And ConfirmPassword Fields Are Mandatory
    When I click on Register button
    Then I should get errror for first name field "<FnameEerrorMessage>" message
    And  I should get  error for last name field "<LnameErrorMessage>" message
    And  I should get error for email field "<emilErrorMessage>" message
    And  I should get error for password  field "<passwordErrorMessage>" message
    And  I should get  error for confirm password field "<ConfirmPasswordErrorMessage>" message
    Examples:
      | FnameEerrorMessage      | LnameErrorMessage      | emilErrorMessage   | passwordErrorMessage  | ConfirmPasswordErrorMessage |
      | First name is required. | Last name is required. | Email is required. | Password is required. | Password is required.       |

  @regression
  Scenario: verify That User Should Create Account Successfully
    When I select gender male
    And  I Enter FirstName
    And  I Enter LastName
    And  I select Day
    And  I select Month
    And  I select Year
    And  I enter valid "jpmorgan12@gmail.com"
    And  I enter valid password "jpmorgan123"
    And  I enter valid confirmpassword in confirmpassword field for register "jpmorgan123"
    And  I click on Register button
    Then I should create account successfully
    And  I should able to see Your registration completed message


