package com.qa.turtlemint.pages.sell;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowPageSellButton extends TestBase {

    @FindBy(xpath = "//span[text()='Sell']")
    WebElement SellBtn;

    public GrowPageSellButton() {
        PageFactory.initElements(driver, this);
    }
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    public void ValidateSellButton() {
        WebCommands.staticSleep(5000);
        jse.executeScript("arguments[0].click();", SellBtn);

     //   TestUtil.click(SellBtn,"Sell button clicked")
        ;
     //   SellBtn.click();
        System.out.println("Sell page clicked");
    }
}
