package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterSuccessPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterSuccessPage.class.getName());
    public RegisterSuccessPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement regSuccessFullField;

    public String getTextFromRegSuccesfull(){
        log.info(" Get register Success Text: "+ regSuccessFullField.toString());
        return  getTextFromElement(regSuccessFullField);
    }
}
