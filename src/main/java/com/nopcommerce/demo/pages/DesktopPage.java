package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {
public static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
    public DesktopPage() {
        PageFactory.initElements(driver, this);

    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopFiled;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buidYourOwnComputerLink;

    public  String getTextfromDesktopFiled(){
        log.info("getting desktop field text "+ desktopFiled.toString());
        return getTextFromElement(desktopFiled);
    }
    public void clickOnBuildYoueOwnComputer(){
        clickOnElement(buidYourOwnComputerLink);
        log.info("click on build own computer "+ buidYourOwnComputerLink.toString());

    }
}
