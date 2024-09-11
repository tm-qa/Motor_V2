package com.qa.turtlemint.pages.login.four_wheeler;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

import static com.qa.turtlemint.util.TestUtil.waitUntilTextToPresent;

public class FWResultPage extends TestBase {
    public FWResultPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[text()='Got It!']")
    WebElement GotItBtn;
    @FindBy(xpath = "//span[text()='TP Liability']")
    WebElement TP_SELECT;

    @FindBy(xpath = "//span[text()='Comprehensive']")
    WebElement CP_SELECT;
    @FindBy(xpath = "//a[@data-auto=\"DIGIT-web\"]")
    WebElement SelectDIGITplan;
    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement Confirm;
    @FindBy(xpath = "//h3[text()='Know Your Customer']")
    WebElement KycVisibility;
    @FindBy(xpath = "//input[@id='kyc-form_dob']")
    WebElement kycdob;
    @FindBy(xpath = "//td[@title='1997-12-24']")
    WebElement selectDate1;
    @FindBy(xpath = "//td[@title='1997-12-24']")
    WebElement selectDateNew;
    @FindBy(xpath = "//input[@id='kyc-form_pan']")
    WebElement pancardDetails;
    @FindBy(xpath = "//span[normalize-space()='Individual']")
    WebElement individual;
    @FindBy(xpath = "//button[@id=\"web-submit-btn\"]")
    WebElement continuebtn;
    @FindBy(xpath = "//span[text()='Confirm']")
    WebElement verifybtn;
    @FindBy(xpath = "//h4[text()='Upload Document']")
    WebElement OtherVerificationPageVisibility;
    @FindBy(xpath = "//h4[text()='Upload Document']")
    WebElement radioBT2;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement ContinueBt2;
    @FindBy(xpath = "//label[text()='Select Document']")
    WebElement OVdPageVisibility;
    @FindBy(xpath = "//mat-form-field[@appearance=\"outline\"]")
    WebElement Selectdropdown;
    @FindBy(xpath = "//span[@class='mat-option-text']")
    List<WebElement> FecthDropdown;
    @FindBy(xpath = "//span[text()='Yes']//parent::button")
    WebElement yesBT;
    @FindBy(xpath = "//span[text()='Choose File To Upload']")
    WebElement OvdPgVisibility;
    @FindBy(xpath = "//span[text()='Submit']")
    WebElement SubmitPageVisibility;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement SubmittedBT;
    @FindBy(xpath = "//span[text()='Proceed to verify']")
    WebElement Proceedtoverify;
    @FindBy(xpath = "//button[@type='button']")
    WebElement confirmBt;
    @FindBy(xpath = "//span[text()=' Zero Depreciation ']")
    WebElement ZD_btn;
    @FindBy(xpath = "//span[text()='Engine Protect'][@class='set-title']")
    WebElement engine_protect_btn;
    @FindBy(xpath = "//span[text()='NCB Protect'][@class='set-title']")
    WebElement NCB_btn;
    @FindBy(xpath = "//span[text()='Consumable'][@class='set-title']")
    WebElement Consumable;
    @FindBy(xpath = "//span[text()='Return to Invoice'][@class='set-title']")
    WebElement Return_btn;
    @FindBy(xpath = "//span[text()='Road Side Assistance'][@class='set-title']")
    WebElement Roadside_btn;
    @FindBy(xpath = "//span[text()=' Key Replacement'][@class='set-title']")
    WebElement Key_btn;
    @FindBy(xpath = "//span[text()='Paid Driver Legal Liability'][@class='set-title']")
    WebElement Paid_btn;
    @FindBy(xpath = "//span[text()='PA Paid Driver'][@class='set-title']")
    WebElement PApaid_btn;
    @FindBy(xpath = "(//span[text()='Select Passenger PA Cover'])[2]")
    WebElement PAcover_btn;
    @FindBy(xpath = "//a[text()=' Update Results']")
    WebElement UpdateResultsBtn;
    @FindBy(xpath = "//span[text()='Share Results']")
    WebElement MoveElement;
    @FindBy(xpath = "//span[text()='PA Owner Driver'][@class='set-title']")
    WebElement PAwoner;
    @FindBy(xpath = "(//div[@ng-class=\"{'hide':isTwoWheelerReq || isPolicyTypeTP()}\"])[2]")
    WebElement ShowMore;
    @FindBy(xpath = "//span[text()=' Value of your accessories ']")
    WebElement ValueYour;
    @FindBy(xpath = "//input[@ng-change=\"setElectricalValue(this);\"]")
    WebElement Electrical;
    @FindBy(xpath = "(//input[@name=\"nonElecValue\"])[2]")
    WebElement Nonelect;
    @FindBy(xpath = "//button[@ng-click=\"toggleBiFuelDD()\"]")
    WebElement CNG;
    @FindBy(xpath = "//a[@analytics-value=\"FuelKit_CompanyFitted\"]")
    WebElement Companyfitted;
    @FindBy(xpath = "//a[@analytics-value=\"FuelKit_ExternallyFitted\"]")
    WebElement ExtenalFitted;



    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void Seemore(String Moreaddons){
        WebCommands.staticSleep(2000);
        driver.findElement(By.xpath("(//span[text()=' " + Moreaddons + " '][@class='set-title'])[2]")).click();
    }

    public void GotIT() throws InterruptedException {
        WebCommands.staticSleep(2000);
        try {
            String Yes = GotItBtn.getText();
            LogUtils.info(Yes);
            if (Yes.equals("Got It!")) {
                waitUntilTextToPresent(GotItBtn, "Got It!", "Got It! is dispalyed");
                TestUtil.click(GotItBtn, "Got It Clicked !");
                WebCommands.staticSleep(2000);
            }
        }
        catch(Exception ignored)
        {
            LogUtils.info("Exception Occur");
        }
    }

    public void Value_Of_acc(String Value){

        if (Value == "Company"){
            TestUtil.click(ValueYour,"Clikced value your CTA");
            TestUtil.sendKeys(Electrical,"10000","Entering electrical...");
            TestUtil.sendKeys(Nonelect,"10000","Enterin Non-electrical...");
            TestUtil.click(CNG,"Selected CNG");
            TestUtil.click(Companyfitted,"Selected Compant fittted");
        } else {
            TestUtil.click(ValueYour,"Clikced value your CTA");
            TestUtil.sendKeys(Electrical,"10000","Entering electrical...");
            TestUtil.sendKeys(Nonelect,"10000","Enterin Non-electrical...");
            TestUtil.click(CNG,"Selected CNG");
            TestUtil.click(ExtenalFitted,"Selected extenal fitted");
        }


    }

    public void All_Addons_1() throws IOException {
        WebCommands.staticSleep(3000);
        TestUtil.waitUntilVisibilityOfElement(PAwoner);
        TestUtil.click(PAwoner,"Clikced PA paid  addon ");
        TestUtil.waitUntilVisibilityOfElement(ZD_btn);
        TestUtil.click(ZD_btn,"Clikced PA cover  addon ");
        TestUtil.waitUntilVisibilityOfElement(engine_protect_btn);
        TestUtil.click(engine_protect_btn,"Clikced engine addon ");
        TestUtil.waitUntilVisibilityOfElement(NCB_btn);
        TestUtil.click(NCB_btn,"Clikced NCB  addon ");
        TestUtil.waitUntilVisibilityOfElement(Consumable);
        TestUtil.click(Consumable,"Clikced Consumable addon ");
        TestUtil.waitUntilVisibilityOfElement(Return_btn);
        TestUtil.click(Return_btn,"Clikced Return_btn addon ");
        TestUtil.waitUntilVisibilityOfElement(Roadside_btn);
        TestUtil.click(Roadside_btn,"Clikced Roadside_btn addon ");
        TestUtil.waitUntilVisibilityOfElement(Key_btn);
        TestUtil.click(Key_btn,"Clikced Roadside_btn addon ");
        TestUtil.waitUntilVisibilityOfElement(PApaid_btn);
        TestUtil.click(PApaid_btn,"Clikced PA paid  addon ");
        TestUtil.click(ShowMore,"Clikced show more buttton");
        Seemore("Secure Towing");
        Seemore("Tyre Secure");
        Seemore("Emergency Transport And Hotel Expense");
        Seemore("Repair of Glass Rubber Plastic Parts");
        Seemore("Daily Cash Allowance");
        Seemore("Personal Baggage");
        Seemore("Driving Tuition Coverage");
        TestUtil.getFullPageScreenShot();

    }

    public void All_Addons(){
        WebCommands.staticSleep(3000);
        TestUtil.waitUntilVisibilityOfElement(PApaid_btn);
        TestUtil.click(PApaid_btn,"Clikced PA paid  addon ");
        TestUtil.waitUntilVisibilityOfElement(PAcover_btn);
        TestUtil.click(PAcover_btn,"Clikced PA cover  addon ");
        TestUtil.waitUntilVisibilityOfElement(Paid_btn);
        TestUtil.click(Paid_btn,"Clikced  addon ");
        TestUtil.waitUntilVisibilityOfElement(PAwoner);
        TestUtil.click(PAwoner,"Clikced PA owner  addon ");

    }
    public void All_Addons_2() throws IOException {
        WebCommands.staticSleep(3000);
        TestUtil.waitUntilVisibilityOfElement(ZD_btn);
        TestUtil.click(ZD_btn,"Clikced Zore btn addon ");
        TestUtil.waitUntilVisibilityOfElement(engine_protect_btn);
        TestUtil.click(engine_protect_btn,"Clikced engine addon ");
        TestUtil.waitUntilVisibilityOfElement(NCB_btn);
        TestUtil.click(NCB_btn,"Clikced NCB  addon ");
        TestUtil.waitUntilVisibilityOfElement(Consumable);
        TestUtil.click(Consumable,"Clikced Consumable addon ");
        TestUtil.waitUntilVisibilityOfElement(Return_btn);
        TestUtil.click(Return_btn,"Clikced Return_btn addon ");
        TestUtil.waitUntilVisibilityOfElement(Roadside_btn);
        TestUtil.click(Roadside_btn,"Clikced Roadside_btn addon ");
        TestUtil.waitUntilVisibilityOfElement(Key_btn);
        TestUtil.click(Key_btn,"Clikced Roadside_btn addon ");
        TestUtil.waitUntilVisibilityOfElement(PApaid_btn);
        TestUtil.click(PApaid_btn,"Clikced PA paid  addon ");
        TestUtil.click(ShowMore,"Clikced show more buttton");
        Seemore("Secure Towing");
        Seemore("Tyre Secure");
        Seemore("Emergency Transport And Hotel Expense");
        Seemore("Repair of Glass Rubber Plastic Parts");
        Seemore("Daily Cash Allowance");
        Seemore("Personal Baggage");
        Seemore("Driving Tuition Coverage");
        TestUtil.getFullPageScreenShot();

    }
    public  void utilUpdate() throws InterruptedException {
        WebCommands.staticSleep(5000);
        TestUtil.waitUntilVisibilityOfElement(MoveElement);
        Actions ac =new Actions(driver);
        ac.moveToElement(MoveElement).build().perform();
        LogUtils.info("Move to Element for update...");
        WebCommands.staticSleep(1000);
        TestUtil.waitUntilVisibilityOfElement(UpdateResultsBtn);
        TestUtil.click(UpdateResultsBtn,"Clicked on Update Button....");
        WebCommands.staticSleep(3000);
    }

    public void Policy_type(String PC) {
        WebCommands.staticSleep(3000);
        if (PC == "TP") {
            TestUtil.waitElementToBeClickable(TP_SELECT);
            TestUtil.click(TP_SELECT,"Click on tp");
        } else {
            TestUtil.waitElementToBeClickable(CP_SELECT);
            TestUtil.click(CP_SELECT,"Click on tp");
        }
    }

    public void DIGIT_ONE_ProccedtoBuy() throws Exception {
        WebCommands.staticSleep(4000);
        js.executeScript("arguments[0].click();", SelectDIGITplan);
        LogUtils.info("Clikced DIGIT plan");
        TestUtil.click(Confirm, "Clicked on confirm");
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(3000);
    }
    public void cKycFourWheeler() {
        WebCommands.staticSleep(5000);
        waitUntilTextToPresent(KycVisibility, "Know Your Customer","Kyc page is visible");
        TestUtil.waitUntilVisibilityOfElement(KycVisibility);
        TestUtil.sendKeys(kycdob, "24/12/1997", "DOB Entered");
        TestUtil.waitUntilVisibilityOfElement(selectDate1);
        TestUtil.click(selectDateNew, "DOB Selected");
        TestUtil.waitUntilVisibilityOfElement(pancardDetails);
        TestUtil.sendKeys(pancardDetails, "BKGPC8713D", "Pancard detail entered");
        TestUtil.waitElementToBeClickable(individual);
        TestUtil.click(individual, "Clicked on Individual");
        WebCommands.staticSleep(4000);
        TestUtil.waitElementToBeClickable(continuebtn);
        TestUtil.getScreenShot();
        TestUtil.click(continuebtn, "Clicked on continue");
        WebCommands.staticSleep(15000);
        try {
            TestUtil.waitElementToBeClickable(verifybtn);
            TestUtil.click(verifybtn,"Verify Button is Clicked....");
            TestUtil.getFullPageScreenShot();
        } catch (Exception e) {
            LogUtils.info("C-kyc has failed and hence going through Ovd flow");
            TestUtil.getScreenShot();
            OVD_FW();
        }
    }


    public void OVD_FW() {
        waitUntilTextToPresent(OtherVerificationPageVisibility,"Upload Document","Try other verification methods page is loaded..");
        TestUtil.click(radioBT2, "Clicked on radio button");
        TestUtil.click(ContinueBt2, "Clicked on Continue Button");
        WebCommands.staticSleep(6000);
        TestUtil.waitUntilTextToPresent(OVdPageVisibility,"Select Document","Ovd page is visible...");
        TestUtil.click(Selectdropdown, "Click on select dropdown");
        WebCommands.staticSleep(3000);
        for(WebElement dropdownresult:FecthDropdown)
        {
            if(dropdownresult.getText().equals("Aadhaar"))
            {
                System.out.println("We are inside loop:"+dropdownresult);
                dropdownresult.click();
                break;
            }
        }
        WebCommands.staticSleep(3000);
        try{
            TestUtil.click(yesBT, "clicked yes Bt");
        }catch (Exception e){
            LogUtils.info("Aadhar is By Default selected");
        }
        WebCommands.staticSleep(3000);
        TestUtil.OvdUploadFile("/home/ubuntu/storage/Aadharfront.jpg");
        //   TestUtil.OvdUploadFile("/Users/hemantpatil/Desktop/Aadharfront.jpg");
        LogUtils.info("Aadhaar Front Page Uploaded");
        waitUntilTextToPresent(OvdPgVisibility,"Choose File To Upload","Ovd page is properly visible");
        //  WebCommands.staticSleep(6000);
        TestUtil.OvdUploadFile("/home/ubuntu/storage/Aadharback.jpg");
        //   TestUtil.OvdUploadFile("/Users/hemantpatil/Desktop/Aadharback.jpg");
        LogUtils.info("Aadhaar Back page uploaded");
        waitUntilTextToPresent(SubmitPageVisibility,"Submit","Submit page is properly visible");
        TestUtil.getScreenShot();
        TestUtil.click(SubmittedBT,"clicked submitted");
        WebCommands.staticSleep(5000);
        try {
            WebCommands.staticSleep(8000);
            TestUtil.OvdUploadFile("/home/ubuntu/storage/images.jpg");
            //    TestUtil.OvdUploadFile("/Users/hemantpatil/Desktop/Test.png");
            LogUtils.info("Image uploaded");
            WebCommands.staticSleep(5000);
            TestUtil.click(Proceedtoverify,"Proceed to verify");
        }catch (Exception e){
            LogUtils.info("Image upload not required");
        }
        WebCommands.staticSleep(5000);
        TestUtil.click(confirmBt,"Confirm");
    }

}
