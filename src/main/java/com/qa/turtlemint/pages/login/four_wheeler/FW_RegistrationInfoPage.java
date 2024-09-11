package com.qa.turtlemint.pages.login.four_wheeler;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FW_RegistrationInfoPage extends TestBase {
    public FW_RegistrationInfoPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@type='search']")
    WebElement Search;
    @FindBy(xpath = "//span[text()='MH-01-Tardeo']")
    WebElement SelectRegLocationfw;
    @FindBy(xpath = "//input[@id='calendarCheckbox']")
    WebElement  CheckBox;
    @FindBy(id = "container-next-btn")
    WebElement NextButton;




    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void SelectFWRegistrationLocation(String no){
        TestUtil.sendKeys(Search, no, "No RegistrationDate");
        LogUtils.info("Car Reg No is Entered...");
        TestUtil.getScreenShot();
        js.executeScript("arguments[0].click();", SelectRegLocationfw);
        WebCommands.staticSleep(1000);
        TestUtil.moveToElement(CheckBox);
        LogUtils.info("Car new bussiness selected...");
        WebCommands.staticSleep(1000);
        TestUtil.click(NextButton, "Next Button Pressed");
    }

}
