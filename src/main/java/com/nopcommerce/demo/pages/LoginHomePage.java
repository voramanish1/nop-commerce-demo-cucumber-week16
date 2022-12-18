package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHomePage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginHomePage.class.toString());

    public void LogInHomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutLink;


    // public boolean logOutButonDisplayed(){
    //   log.info("log out button displayed : "+ logoutLink.toString());
    //  return logoutLink.isDisplayed();
    // }
    public void clickOnLogOut() {
        clickOnElement(logoutLink);
        log.info("click on logout : " + logoutLink.toString());
    }
}






