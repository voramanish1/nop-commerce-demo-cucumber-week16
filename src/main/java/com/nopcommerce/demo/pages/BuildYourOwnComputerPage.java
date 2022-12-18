package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourComputerTextField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDownField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDownField;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']/descendant::li/child::label")
    List<WebElement> hddRadioButtonField;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']/descendant::li/child::label")
    List<WebElement> osRadioButtonField;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']/descendant::li")
    List<WebElement> softwareCheckBoxField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButtonField;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addToCartTextField;

    public String getVerifyBuildYourComputerText(){
        log.info("Get build your computer text : "+ buildYourComputerTextField.toString());
        return getTextFromElement(buildYourComputerTextField);
    }

    public void selectProcessorFromDropDown(String processor){
        selectByVisibleTextFromDropDown(processorDropDownField,processor);
        log.info("select processer : "+ processor+ processorDropDownField.toString());
    }

    public void selectRamFromDropDown(String ram){
        selectByVisibleTextFromDropDown(ramDropDownField,ram);
        log.info("select ram: "+ ram + ramDropDownField.toString());
    }
    public void clickOnHddFormRadioButton(String hdd){
        for(WebElement element : hddRadioButtonField){
            if(element.getText().equalsIgnoreCase(hdd)){
                element.click();
                log.info("click on element :"+ hdd + hddRadioButtonField.toString());
                break;
            }
        }
    }

    public void clickOnOsFormRadioButton(String os){
        for(WebElement element : osRadioButtonField){
            if(element.getText().equalsIgnoreCase(os)){
                element.click();
                log.info("click on radio button : "+ os + osRadioButtonField.toString());

                break;
            }
        }
    }

    public void selectSoftwareCheckBox(String software) {
        for (WebElement element : softwareCheckBoxField)
            if (element.getText().equalsIgnoreCase(software)) {
                element.click();
                log.info("click on software check box : "+ software+ softwareCheckBoxField.toString());
                break;
            }
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButtonField);
        log.info(" Click on add to cart button : " + addToCartButtonField.toString() );

    }
    public String getVerifyAddToCartText(){
        log.info("Get verify add to cart text : "+ addToCartTextField.toString());
        return getTextFromElement(addToCartTextField);
    }
}


