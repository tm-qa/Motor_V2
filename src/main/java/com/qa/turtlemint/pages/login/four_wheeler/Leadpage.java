package com.qa.turtlemint.pages.login.four_wheeler;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Leadpage extends TestBase {
    public Leadpage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='customerName']")
    WebElement name;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;




    public void SaveLead(String LeadName) throws InterruptedException {
        //   waitUntilTextToPresent(SaveQuotePageVisibilty,"Save your quote now","Save your quote now is loaded properly");
        TestUtil.sendKeys(name,LeadName,"All detail Filled and Lead name Entered");
        TestUtil.waitElementToBeClickable(NextButton);
        TestUtil.click(NextButton,"Next Button is Clicked.........");
    }


}
