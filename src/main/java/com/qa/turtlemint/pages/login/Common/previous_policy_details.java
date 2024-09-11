package com.qa.turtlemint.pages.login.Common;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.util.TestUtil.waitUntilTextToPresent;

public class previous_policy_details extends TestBase {
    public previous_policy_details() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//input[@name=\"expiryDate-datepicker\"]")
    WebElement expiryDate;
    @FindBy(xpath = "//p[text()='Previous Policy Details']")
    WebElement PreviouspolicypageVisiblity;
    @FindBy(xpath = "//span[text()='Expiry date']")
    WebElement clickoutsidde;
    @FindBy(xpath = "//span[text()='Comprehensive']")
    WebElement Comprehensive;
    @FindBy(xpath = "//span[text()='Own Damage']")
    WebElement OwnDamage;
    @FindBy(xpath = "//span[text()='Third Party']")
    WebElement Thirdparty;
    @FindBy(xpath = "//span[text()='No']")
    WebElement MadeclaimNo;
    @FindBy(xpath = "//span[text()='Yes']")
    WebElement MedeclamYes;
    @FindBy(xpath = "//span[text()='No']")
    WebElement NO;
    @FindBy(xpath = "//span[text()='Yes']")
    WebElement Yes;
    @FindBy(xpath = "//span[text()='0%']")
    WebElement ncb_0;
    @FindBy(id = "container-next-btn")
    WebElement next;
    @FindBy(xpath = "//span[text()='Acko General Insurance']")
    WebElement Acko;
    @FindBy(xpath = "//label[text()='Previous policy expired more than 90 days ago']")
    WebElement Expired_more_than_90_days_ago;
    @FindBy(xpath = "//span[text()='Standalone Own Damage']")
    WebElement SAOD;
    @FindBy(xpath = "//Span[text()='1yr Own Damage + 3yr Third Party']")
    WebElement LTOD;
    @FindBy(xpath = "//Span[text()='3yr Third Party Only']")
    WebElement TMHD;
    @FindBy(xpath = "//span[text()='20%']")
    WebElement ncb_20;




    public void madeclaimsNo(String Clamins){
        if (Clamins == "No"){
            TestUtil.click(Acko, "Bharti_Axa selected");
            TestUtil.waitElementToBeClickable(MadeclaimNo);
            TestUtil.click(MadeclaimNo, "Comprehensive Selected");
            TestUtil.click(next,"clicked next button");

        }else {
            TestUtil.click(Acko, "Bharti_Axa selected");
            TestUtil.waitElementToBeClickable(MedeclamYes);
            TestUtil.click(MedeclamYes, "Comprehensive Selected");
            TestUtil.click(next,"clicked next button");

        }

    }
    public void madeclaimsNo_od(String Clamins){
        if (Clamins == "No"){
            TestUtil.click(Acko, "Comprehensive Selected");
            TestUtil.click(next,"clicked next button");

        }else {
            TestUtil.click(Acko, "Comprehensive Selected");
            TestUtil.click(next,"clicked next button");

        }

    }


    public void Expiring_today_or_tomorrow_OD(String Policytype) throws InterruptedException {
        if (Policytype == "SAOD"){
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.waitUntilVisibilityOfElement(expiryDate);
            TestUtil.sendKeys(expiryDate, TestUtil.PresentDate(), "Present Date Selected");
            TestUtil.moveToElement(clickoutsidde);
            TestUtil.click(SAOD,"Clikced SAOD..");

        } else if (Policytype == "LTOD"){
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.waitUntilVisibilityOfElement(expiryDate);
            TestUtil.sendKeys(expiryDate, TestUtil.PresentDate(), "Present Date Selected");
            TestUtil.moveToElement(clickoutsidde);
            TestUtil.click(LTOD,"Clikced LTOD...");
        } else {
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.waitUntilVisibilityOfElement(expiryDate);
            TestUtil.sendKeys(expiryDate, TestUtil.PresentDate(), "Present Date Selected");
            TestUtil.moveToElement(clickoutsidde);
            TestUtil.click(TMHD,"Clikced LTOD...");
            TestUtil.click(next,"clikced nect button");

        }

    }


    public void Expiring_today_or_tomorrow(String Policytype) throws InterruptedException {
           if (Policytype == "Com"){
               waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
               TestUtil.waitUntilVisibilityOfElement(expiryDate);
               TestUtil.sendKeys(expiryDate, TestUtil.PresentDate(), "Present Date Selected");
               TestUtil.moveToElement(clickoutsidde);
               TestUtil.waitElementToBeClickable(Comprehensive);
               TestUtil.click(Comprehensive, "Comprehensive Selected");

           } else {
               waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
               TestUtil.waitUntilVisibilityOfElement(expiryDate);
               TestUtil.sendKeys(expiryDate, TestUtil.PresentDate(), "Present Date Selected");
               TestUtil.moveToElement(clickoutsidde);
               TestUtil.waitElementToBeClickable(Thirdparty);
               TestUtil.click(Thirdparty, "Comprehensive Selected");
               TestUtil.click(next,"Clikced next button");
           }

    }
    public void Expiring_today_or_tomorrow_OD_OD() throws InterruptedException {
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.waitUntilVisibilityOfElement(expiryDate);
            TestUtil.sendKeys(expiryDate, TestUtil.PresentDate(), "Present Date Selected");
            TestUtil.moveToElement(clickoutsidde);
            TestUtil.waitElementToBeClickable(SAOD);
            TestUtil.click(SAOD, "OwnDamage Selected");

    }

    public void claimselect_NCB_IS_Zero(String selector) throws InterruptedException {

        if (selector == "no") {
            TestUtil.waitUntilVisibilityOfElement(NO);
            TestUtil.click(NO, "No Clicked on - claims in previous year");
            TestUtil.waitUntilVisibilityOfElement(ncb_0);
            TestUtil.click(ncb_0, "NCB 0% Selected");
            TestUtil.click(Acko, "Bharti_Axa selected");
            TestUtil.getScreenShot();
            TestUtil.waitElementToBeClickable(NO);
            TestUtil.click(NO, "Previous policy from turtlemint Selected");
            TestUtil.waitElementToBeClickable(next);
            TestUtil.click(next, "Clicked Next Button");
        } else {
            TestUtil.waitUntilVisibilityOfElement(Yes);
            TestUtil.click(Yes, "No Clicked on - claims in previous year");
            TestUtil.waitUntilVisibilityOfElement(next);
            TestUtil.click(next, "Clicked Next Button");
        }
    }

    public void claimselect(String selector) throws InterruptedException {

        if (selector == "no") {
            TestUtil.waitUntilVisibilityOfElement(NO);
            TestUtil.click(NO, "No Clicked on - claims in previous year");
            TestUtil.waitUntilVisibilityOfElement(ncb_20);
            TestUtil.click(ncb_20, "NCB 20% Selected");
            TestUtil.click(Acko, "Bharti_Axa selected");
            TestUtil.getScreenShot();
            TestUtil.waitElementToBeClickable(NO);
            TestUtil.click(NO, "Previous policy from turtlemint Selected");
            TestUtil.waitElementToBeClickable(next);
            TestUtil.click(next, "Clicked Next Button");
        } else {
            TestUtil.waitUntilVisibilityOfElement(Yes);
            TestUtil.click(Yes, "No Clicked on - claims in previous year");
            TestUtil.waitUntilVisibilityOfElement(next);
            TestUtil.click(next, "Clicked Next Button");
        }
    }

    public void Expired_less_than_90_days_ago(String Policytype) throws InterruptedException {
        if (Policytype == "Com"){
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.sendKeys(expiryDate, TestUtil.PastDate(30), "Less than 90 Date Selected");
            TestUtil.moveToElement(clickoutsidde);
            TestUtil.click(Comprehensive, "Comprehensive Selected");
        } else {
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.sendKeys(expiryDate, TestUtil.PastDate(30), "Less than 90 Date Selected");
            TestUtil.moveToElement(clickoutsidde);
            TestUtil.click(Thirdparty, "Comprehensive Selected");
        }

    }

    public void Expired_more_than_90_days_ago(String Policytype) {
        if (Policytype == "Com"){
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.waitUntilVisibilityOfElement(Expired_more_than_90_days_ago);
            TestUtil.click(Expired_more_than_90_days_ago, "Expired more than 90 days ago");
            TestUtil.click(next, "Clicked Next Button");
        } else {
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.waitUntilVisibilityOfElement(Expired_more_than_90_days_ago);
            TestUtil.click(Expired_more_than_90_days_ago, "Expired more than 90 days ago");
            TestUtil.click(next, "Clicked Next Button");
        }

    }

    public void Expired_less_than_90_days_ago_TP(String Policytype) throws InterruptedException {
        if (Policytype == "less"){
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.sendKeys(expiryDate, TestUtil.PastDate(30), "Less than 90 Date Selected");
            TestUtil.moveToElement(clickoutsidde);
            TestUtil.click(TMHD,"third party ....");
            TestUtil.click(next, "Clicked Next Button");

        } else {
            waitUntilTextToPresent(PreviouspolicypageVisiblity,"Previous Policy Details","Previous Policy Detail page is Loaded properly");
            TestUtil.waitUntilVisibilityOfElement(Expired_more_than_90_days_ago);
            TestUtil.click(Expired_more_than_90_days_ago, "Expired more than 90 days ago");
            TestUtil.click(next, "Clicked Next Button");
        }

    }


    }