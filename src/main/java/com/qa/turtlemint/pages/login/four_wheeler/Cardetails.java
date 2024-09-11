package com.qa.turtlemint.pages.login.four_wheeler;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cardetails extends TestBase {
    public Cardetails() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "container-next-btn")
    WebElement NextButton;
    @FindBy(xpath = "//input[@type='search']")
    WebElement CarModel;
    @FindBy(xpath = "//span[text()='Hyundai I10']")
    WebElement SelectModelTask;
    @FindBy(xpath = "//span[text()='2019']")
    WebElement RollRegYear1;
    @FindBy(xpath = "//span[text()='Petrol']")
    WebElement FuelType1;
    @FindBy(id = "variant-uiSelect")
    WebElement ClickVariant;
    @FindBy(xpath = "//span[text()='Asta (1197 CC)']")
    WebElement Selecti10_ASTA;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void FW_CAR_DETAILS(String CarName){
        TestUtil.sendKeys(CarModel, CarName, "Car Name Entered");
        TestUtil.click(SelectModelTask, "Model Selected");
        js.executeScript("arguments[0].click();", RollRegYear1);
        LogUtils.info("Year Selected");
        js.executeScript("arguments[0].click();", FuelType1);
        LogUtils.info("Fuel Type selected");
        TestUtil.click(ClickVariant, "Car variant Selection is in process");
        TestUtil.getScreenShot();
        js.executeScript("window.scrollBy(0,-700)");
        TestUtil.getScreenShot();
        TestUtil.click(Selecti10_ASTA,"Car Variant Selected");
        js.executeScript("arguments[0].click();", NextButton);
        LogUtils.info("Clicked on nxt Button");
    }


}
