@loginpage
Feature: Login Test
  As user I want to login into nop commerce website

  @smoke
  Scenario: User should navigate to the log in page successfully
    Given I am on home page
    When  I click on login link
    Then  I should navigate to log in page successfully

  @sanity
  Scenario Outline:  verify the error message with  invalid credentials
    Given I am on home page
    When I click on login link
    And  I enter invalid email "<email>"
    And  I enter invalid password "<password>"
    And  I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  @regression
  Scenario: User should login successfully with valid credentials
    Given I am on home page
    When I click on login link
    And I enter valid email "jpmorgan12@gmail.com"
    And I enter valid password "jpmorgan123"
    And I click on login button
    Then I should login successfully


  @regression
  Scenario: Verify That User Should LogOut SuccessFully
    Given I am on home page
    When I click on login link
    And I enter valid email "jpmorgan12@gmail.com"
    And I enter valid password "jpmorgan123"
    And I click on login button
    And I should login successfully
    And I click on logOut link
    Then I should be able to see log in link