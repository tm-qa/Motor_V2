package com.qa.turtlemint.pages.login.MintPro;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowPageSellButton extends TestBase {

    public GrowPageSellButton() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellBtn;
    JavascriptExecutor js = (JavascriptExecutor) driver;


    public void ValidateSellButton() {
        WebCommands.staticSleep(3000);
        TestUtil.waitUntilVisibilityOfElement(SellBtn);
        LogUtils.info("SellBtn is Visible....");
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].click();", SellBtn);

    }

}
