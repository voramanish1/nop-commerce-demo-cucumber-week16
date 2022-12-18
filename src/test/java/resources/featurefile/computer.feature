@computerpage
Feature: computer page test
  As a user I should be able to buy computer

  Background: user is on homepage page
    Given I am on home page for shopping

@smoke
  Scenario: verify User Should Navigate To Computer Page Successfully
    When I click on Computers tab
    Then I should be navigated to computer page
    And  Computer text should be visible

@sanity
  Scenario: verify User Should Navigate To Desktops Page Successfully
    When I click on Computers tab
    And  I click on desktops link
    Then I should be navigated to desktop page
    And  Desktop Text should be visible

@regression
  Scenario Outline: I should able to select my own build computer
    When            I click on Computers tab
    And             I click on desktops link
    And             I select desktop product Build your own computer
    And             I select processor "<Processor>"
    And             I select ram "<RAM>"
    And             I select hdd "<HDD>"
    And             I select os "<OS>"
    And             I select software "<Software>"
    And             I click on add to cart button
    Then            I am successfully select my own build computer
    And             I can see the addtocart message "The product has been added to your shopping cart"

    Examples:
      | Processor                                       | RAM           | HDD               | OS                      | Software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |