package com.qa.turtlemint.pages.login.two_wheeler;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bike_details extends TestBase {
    public Bike_details() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[text()='2023']|//span[text()='2021']|//span[text()='2018']")
    WebElement RegYear;

    @FindBy(xpath = "//span[text()='Petrol']")
    WebElement Tw_FuelType;

    @FindBy(id = "variant-uiSelect")
    WebElement ClickVariant;

    @FindBy(xpath = "//span[text()='3G (110 CC)']")
    WebElement Activa3G;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;

    @FindBy(xpath = "//input[@type='search']")
    WebElement BikeModel;

    @FindBy(xpath = "//span[text()='Honda Activa']")
    WebElement SelectTWModel;


    public void SaveBikeDetails(String BikeName) throws InterruptedException
    {
        TestUtil.sendKeys(BikeModel, BikeName, "Bike Model Entered");
        TestUtil.click(SelectTWModel, "Selected Honda Activa");
        TestUtil.click(RegYear, "Registration Year Selected");
        TestUtil.click(Tw_FuelType, "Fuel Type Selected");
        TestUtil.click(ClickVariant, "Trying to Select variant...");
        TestUtil.click(Activa3G, "3G variant Selected...");
        TestUtil.waitElementToBeClickable(NextButton);
        TestUtil.click(NextButton, "Clicked on Next Button");

    }
}
