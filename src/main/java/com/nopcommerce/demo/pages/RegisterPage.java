package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    int num=generateRandomNumber();
    private  static final Logger  log = LogManager.getLogger(RegisterPage.class.getName());
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerTextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleradioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayDropDownField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthDropDwonField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearDropDwonField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passWordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassowordField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButtonField;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement fNameErrorMessageField;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lNameErrorMessageField;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailErrorMessageField;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordErrorMessageField;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordErrorMessageField;




    public String getTextFromRegisterFiled(){
        log.info("Get text from register field : "+ registerTextField.toString());
        return getTextFromElement(registerTextField);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButtonField);
        log.info("click on register button : "+ registerButtonField.toString());
    }
    public String geTextFromFNameErrorMessageField(){
        log.info(" Get text from firs name error message : "+ fNameErrorMessageField.toString());
        return getTextFromElement(fNameErrorMessageField);
    }
    public String geTextFromlNameErrorMessageField(){
        log.info("Get text from last name error message : "+ lNameErrorMessageField.toString());
        return getTextFromElement(lNameErrorMessageField);
    }public String geTextFromEmailErrorMessageField(){
        log.info("Get text from email error message : "+ emailErrorMessageField.toString());
        return getTextFromElement(emailErrorMessageField);
    }public String geTextFromPasswordErrorMessageField(){
        log.info("Get text from password error message : "+ passwordErrorMessageField.toString());
        return getTextFromElement(passwordErrorMessageField);
    }public String geTextFromConfirmPasswordErrorMessageField(){
        log.info("Get text from confirm password error message : "+ confirmPasswordErrorMessageField.toString());
        return getTextFromElement(confirmPasswordErrorMessageField);
    }
    public void clickOnmaleRadioButton(){
        clickOnElement(maleradioButton);
        log.info(" click on male radio button : "+ maleradioButton.toString());
    }
    public void enterFirstName(String fName){
        sendTextToElement(firstNameField,fName);
        log.info("Enter first name : "+ fName + " to first name field "+firstNameField.toString());
    }
    public void enterLastName(String lName){
        sendTextToElement(lastNameField,lName);
        log.info(" Enter last name: "+lName+" to last name field "+ lastNameField.toString());

    }
    public void selectDay(String text){
        selectByVisibleTextFromDropDown(dayDropDownField,text);
        log.info(" select day : "+ text+ " frome drop down "+ dayDropDownField.toString());
    }
    public  void selectMonth(String text){
        selectByVisibleTextFromDropDown(monthDropDwonField,text);
        log.info(" select month : "+ text+ " from drop down field "+ monthDropDwonField.toString());

    }
    public void selectYear(String text){
        selectByVisibleTextFromDropDown(yearDropDwonField,text);
        log.info(" select year : "+ text+ " from drop down menu "+ yearDropDwonField.toString());
    }
    public void enterEmail(String emailAddress){
        sendTextToElement(emailField, emailAddress);
        log.info("Enter email : "+"jpmorgan1" + num + "@gmail.com"+" to email field "+ emailField.toString());
    }
    public void enterPassword(String password){
        sendTextToElement(passWordField,password);
        log.info(" Enter password : "+password+ " to password field "+ passWordField.toString());
    }
    public void enterConfirmPassword(String confirmpasword){
        sendTextToElement(confirmPassowordField,confirmpasword);
        log.info(" Enter confirm Password : "+ confirmpasword+ " to confirm password field "+ confirmPassowordField.toString());
    }



}
