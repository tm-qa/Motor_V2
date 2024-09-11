package com.qa.turtlemint.pages.login.four_wheeler;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


public class FW_CreatePage extends TestBase {
    public FW_CreatePage() {
        PageFactory.initElements(driver, this);
    }
    TestUtil tl = new TestUtil();
    public String regisNo;
    @FindBy(xpath = "//div[text()='Quote without vehicle number']")
    WebElement WithoutRegNumberLink;
    @FindBy(xpath = "//input[@type='text']")
    WebElement EnterRegNum;
    @FindBy(xpath = "//button[@ng-click='withVehicleNumber(registrationNumber)']")
    WebElement ClickGetQuote;


    public void CreatePage(String CreatePage) throws IOException {
        if (CreatePage == "newBS") {
            TestUtil.click(WithoutRegNumberLink,"Clicked on Quote without RegNo....");
        } else {
            TestUtil.waitUntilVisibilityOfElement(EnterRegNum);
            tl.GenerateRegNo();
            TestUtil.sendKeys(EnterRegNum, tl.RegNo, "Reg number entered");
            regisNo = tl.RegNo;
            TestUtil.getFullPageScreenShot();
            TestUtil.click(ClickGetQuote, "Get Quote button clicked");

        }
    }

}
