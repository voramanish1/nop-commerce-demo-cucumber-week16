package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to log in page successfully$")
    public void iShouldNavigateToLogInPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage= new LoginPage().getWelcomeText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^I enter invalid email \"([^\"]*)\"$")
    public void iEnterInvalidEmail(String email)  {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter invalid password \"([^\"]*)\"$")
    public void iEnterInvalidPassword(String password)  {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage)  {
        Assert.assertEquals("Error message not displayed", errorMessage, new LoginPage().getErrorMessage());


    }

    @And("^I enter valid email \"([^\"]*)\"$")
    public void iEnterValidEmail(String email)  {
        new LoginPage().enterEmailId("jpmorgan1@gmail.com");

    }

    @And("^I enter valid password \"([^\"]*)\"$")
    public void iEnterValidPassword(String password)  {
        new LoginPage().enterPassword("jpmorgan123");

    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
    }


    @And("^I click on logOut link$")
    public void iClickOnLogOutLink() {
        new LoginPage().clickOnLogOut();
    }

    @Then("^I should be able to see log in link$")
    public void iShouldBeAbleToSeeLogInLink() {
        new HomePage().loginLinkDisplayed();
    }


    }

