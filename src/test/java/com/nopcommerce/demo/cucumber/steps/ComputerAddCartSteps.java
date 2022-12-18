package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerAddCartSteps {
    @Given("^I am on home page for shopping$")
    public void iAmOnHomePageForShopping() {
    }

    @When("^I click on Computers tab$")
    public void iClickOnComputersTab() {
        new HomePage().clickOnComputerPage();
    }

    @Then("^I should be navigated to computer page$")
    public void iShouldBeNavigatedToComputerPage() {
    }

    @And("^Computer text should be visible$")
    public void computerTextShouldBeVisible() {
        String expactedtext = "Computers";
        Assert.assertEquals("displayed message is wrong :", expactedtext, new ComputerPage().gettextFromComputerField());
    }

    @And("^I click on desktops link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOndeskTop();
    }

    @Then("^I should be navigated to desktop page$")
    public void iShouldBeNavigatedToDesktopPage() {

    }

    @And("^Desktop Text should be visible$")
    public void desktopTextShouldBeVisible() {
        String expactedText = "Desktops";
        Assert.assertEquals("displayed message is wrong : ", expactedText, new DesktopPage().getTextfromDesktopFiled());
    }

    @And("^I select desktop product Build your own computer$")
    public void iSelectDesktopProductBuildYourOwnComputer() {
        new DesktopPage().clickOnBuildYoueOwnComputer();

    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processer) {
        new BuildYourOwnComputerPage().selectProcessorFromDropDown(processer);

    }

    @And("^I select ram \"([^\"]*)\"$")
    public void iSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRamFromDropDown(ram);

    }

    @And("^I select hdd \"([^\"]*)\"$")
    public void iSelectHdd(String hdd) {
        new BuildYourOwnComputerPage().clickOnHddFormRadioButton(hdd);

    }

    @And("^I select os \"([^\"]*)\"$")
    public void iSelectOs(String os) {
        new BuildYourOwnComputerPage().clickOnOsFormRadioButton(os);
    }

    @And("^I select software \"([^\"]*)\"$")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftwareCheckBox(software);

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^I am successfully select my own build computer$")
    public void iAmSuccessfullySelectMyOwnBuildComputer() {
    }

    @And("^I can see the addtocart message \"([^\"]*)\"$")
    public void iCanSeeTheAddtocartMessage(String expactedMessage) {
        Assert.assertEquals("displayed message is wrong :",expactedMessage,new BuildYourOwnComputerPage().getVerifyAddToCartText());

    }


}
