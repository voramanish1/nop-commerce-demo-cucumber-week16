package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log= LogManager.getLogger(ComputerPage.class.getName());
    public  ComputerPage (){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerTextField;
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopField;
    public String gettextFromComputerField(){
        log.info("Get text from computer filed  : "+ computerTextField.toString());
        return  getTextFromElement(computerTextField);
    }
    public void clickOndeskTop(){
        clickOnElement(desktopField);
        log.info("click on desktop : "+ desktopField.toString());
    }
}

