package com.qa.turtlemint.pages.login.Common;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Product_page extends TestBase {
    @FindBy(xpath = "//span[text()='Car']")
    WebElement fw;
    @FindBy(xpath = "//span[text()='Bike']")
    WebElement tw;


    public Product_page() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateMotorFWClick() throws InterruptedException {
        TestUtil.waitUntilVisibilityOfElement(fw);
        TestUtil.click(fw,"Clicked on four wheeler Icon");
    }

    public void ValidateMotorTWClick() throws InterruptedException {
        TestUtil.waitUntilVisibilityOfElement(tw);
        TestUtil.click(tw,"Clicked on Tw..");
    }

}
