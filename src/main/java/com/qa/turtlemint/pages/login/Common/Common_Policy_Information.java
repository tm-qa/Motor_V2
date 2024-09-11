package com.qa.turtlemint.pages.login.Common;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common_Policy_Information extends TestBase {
    public Common_Policy_Information() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Comprehensive']")
    WebElement Comprehensive;

    @FindBy(xpath = "//span[text()='Third Party']")
    WebElement ThirdParty;

    @FindBy(xpath = "//span[text()='Own Damage']")
    WebElement Owndamage;

    @FindBy(id = "container-next-btn")
    WebElement next;


    public void PolicyType(String policytype)  {
        if (policytype == "Comprehensive") {
            TestUtil.click(Comprehensive, "Comprehensive Selected");
        } else if (policytype == "thirdparty"){
            TestUtil.click(ThirdParty, "Comprehensive Selected");
        } else {
            TestUtil.click(Owndamage, "Comprehensive Selected");
        }
           TestUtil.click(next,"Clicked on Next Button....");
    }


}
