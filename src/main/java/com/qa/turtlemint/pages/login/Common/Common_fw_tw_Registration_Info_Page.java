package com.qa.turtlemint.pages.login.Common;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common_fw_tw_Registration_Info_Page extends TestBase {
    public Common_fw_tw_Registration_Info_Page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "container-next-btn")
    WebElement NextButton;
    @FindBy(xpath = "//input[@name='registrationDate-datepicker']")
    WebElement SelectDate;
    @FindBy(xpath = "//div[@class='flex layout-column layout-align-top-center tm-profile-img hidden-xs']")
    WebElement CloseDatePicker;




    public void SelectRegDate() throws InterruptedException {
        TestUtil.clear(SelectDate,"Clear Previous date..");
        TestUtil.sendKeys(SelectDate, TestUtil.PastDate(2000), "Date selected");
        WebCommands.staticSleep(1000);
        TestUtil.waitUntilVisibilityOfElement(CloseDatePicker);
        TestUtil.moveToElement(CloseDatePicker);
        TestUtil.waitUntilVisibilityOfElement(NextButton);
        TestUtil.click(NextButton, "Next Button Pressed");
    }


}
