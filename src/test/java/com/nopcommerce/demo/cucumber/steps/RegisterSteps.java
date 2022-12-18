package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.RegisterSuccessPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterSteps {
    @Given("^I am on home page for registration$")
    public void iAmOnHomePageForRegistration() {
    }

    @And("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I am on register page$")
    public void iAmOnRegisterPage() {
    }

    @Then("^I should be navigate to register page successfully$")
    public void iShouldBeNavigateToRegisterPageSuccessfully() {

    }

    @And("^I should be able to see register text$")
    public void iShouldBeAbleToSeeRegisterText() {
        String expactedText="Register";
        Assert.assertEquals("displayed message is wrong ",expactedText,new RegisterPage().getTextFromRegisterFiled());
    }

    @When("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should get errror for first name field \"([^\"]*)\" message$")
    public void iShouldGetErrrorForFirstNameFieldMessage(String errorMessage)  {
        Assert.assertEquals("displayed message is wrong for fname : ",errorMessage,new RegisterPage().geTextFromFNameErrorMessageField());

    }

    @And("^I should get  error for last name field \"([^\"]*)\" message$")
    public void iShouldGetErrorForLastNameFieldMessage(String errorMessage)  {
        Assert.assertEquals("Displayed message is wrong for lName : ",errorMessage,new RegisterPage().geTextFromlNameErrorMessageField());

    }

    @And("^I should get error for email field \"([^\"]*)\" message$")
    public void iShouldGetErrorForEmailFieldMessage(String errorMessage)  {
        Assert.assertEquals("Displayed message is worng for email field : ",errorMessage,new RegisterPage().geTextFromEmailErrorMessageField());

    }

    @And("^I should get error for password  field \"([^\"]*)\" message$")
    public void iShouldGetErrorForPasswordFieldMessage(String errorMessage)  {
        Assert.assertEquals("Displayed message is wrong : ",errorMessage,new RegisterPage().geTextFromPasswordErrorMessageField());

    }

    @And("^I should get  error for confirm password field \"([^\"]*)\" message$")
    public void iShouldGetErrorForConfirmPasswordFieldMessage(String errorMessage)  {
        Assert.assertEquals("displayed message is wrong : ",errorMessage,new RegisterPage().geTextFromConfirmPasswordErrorMessageField());


    }

    @And("^I Enter FirstName$")
    public void iEnterFirstName() {
        new RegisterPage().enterFirstName("Manish");
    }

    @And("^I Enter LastName$")
    public void iEnterLastName() {
        new RegisterPage().enterLastName("Vora");
    }

    @And("^I select Day$")
    public void iSelectDay() {
        new RegisterPage().selectDay("10");
    }

    @And("^I select Month$")
    public void iSelectMonth() {
        new RegisterPage().selectMonth("April");
    }

    @And("^I select Year$")
    public void iSelectYear() {
        new RegisterPage().selectYear("1998");
    }



    @And("^I enter valid password  in password registration field for register$")
    public void iEnterValidPasswordInPasswordRegistrationFieldForRegister(String password) {
        new RegisterPage().enterPassword(password);

    }

    @Then("^I should creat account successfully$")
    public void iShouldCreatAccountSuccessfully() {
    }
    @And("^I should able to see Your registration completed message$")
    public void iShouldAbleToSeeYourRegistrationCompletedMessage() {
        String expactedText="Your registration completed";
        Assert.assertEquals("Displayed message is wrong : ",expactedText,new RegisterSuccessPage().getTextFromRegSuccesfull());

    }


    @Then("^I should create account successfully$")
    public void iShouldCreateAccountSuccessfully() {
    }


    @And("^I enter valid \"([^\"]*)\"$")
    public void iEnterValid(String email)  {
        new RegisterPage().enterEmail(email);
    }


    @And("^I enter valid confirmpassword in confirmpassword field for register \"([^\"]*)\"$")
    public void iEnterValidConfirmpasswordInConfirmpasswordFieldForRegister(String confirmpassword)  {
        new RegisterPage().enterConfirmPassword(confirmpassword);
    }

    @When("^I select gender male$")
    public void iSelectGenderMale() {
        new RegisterPage().clickOnmaleRadioButton();
    }
}
