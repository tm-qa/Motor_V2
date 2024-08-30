package com.qa.turtlemint.pages.ninja_mis_flow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class ninja_mis_flow_page extends TestBase {
    public String regisNo;
    String Mintprowindow;

    TestUtil tl = new TestUtil();
    public String p;
    public String c;

    public String getUrl;
    public String orderID;
    public String mintproW;
    public String ninjaW;
    public String ninjasignupW;
    public String reqID;


    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions act = new Actions(driver);

    @FindBy(xpath = "//span/a[@id='google-signin-button']")
    WebElement SignInbtn;

    @FindBy(xpath = "//input[@type='email']")
    WebElement Email;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement Nextbtn1;

    @FindBy(xpath = "//div[@id='password']/div/div/div/input[@type='password']")
    WebElement Password;

    @FindBy(xpath = "//div[@id='passwordNext']")
    WebElement Nextbtn2;

    @FindBy(xpath = "//input[@placeholder=\"Search by Reg Number, Customer Name, DP Name, DP Phone Number\"]")
    WebElement SearchBar;

    @FindBy(xpath = "//a[contains(text(),'Policy Issuance')]")
    WebElement PolicyIssuance;

    @FindBy(xpath = "//tr[@tabindex=\"0\"][@data-auto='0-issuance-detail']")
    WebElement select_issuance;

    @FindBy(xpath = "//button[text()='OWN']")
    WebElement OWNbtn;

    @FindBy(xpath = "//button[normalize-space()='Save Issuance']")
    WebElement saveissuance;

    @FindBy(xpath = "//input[@id=\"requestId\"]")
    WebElement reqid;

    @FindBy(xpath = "//md-select[@id='proposerTitle']")//
    WebElement proposerTitle;

    @FindBy(xpath = "//md-option[@value='mr']")//
    WebElement mrProposerTitle;

    @FindBy(xpath = "//input[@id='proposerMobile']")
    WebElement Proposer_Phone;

    @FindBy(xpath = "//md-select[@id='paymentStatus']")//
    WebElement paymentStatus;

    @FindBy(xpath = "//md-option[@value='COMPLETED']")//
    WebElement paymentStatusComplete;

    @FindBy(xpath = "//md-checkbox[@name='paymentVerified']//child::div[@class='md-icon']")//
    WebElement paymentVerifyChkBox;

    @FindBy(xpath = "//md-select[@id='policyIssuanceStatus']")//
    WebElement issuanceStsDrpdwn;

    @FindBy(xpath = "//div[text()='Issued']")//
    WebElement issuanceStatus;

    @FindBy(xpath = "//md-datepicker[@id='policyIssuanceDate']")//
    WebElement issuanceDate;

    @FindBy(xpath = "//td[@class='md-calendar-date md-calendar-date-today md-focus']")//
    WebElement issuanceDateSlct;

    @FindBy(xpath = "//input[@id='policyNumber']")//
    WebElement enterPolicyNumber;
    @FindBy(xpath = "//md-radio-button[@value='POLICY']")//
    WebElement policytag;
    @FindBy(xpath = "//button[text()='Done']")//
    WebElement Done;

    @FindBy(xpath = "//input[@type='file']")
    WebElement plusicon;

    @FindBy(xpath = "//button[@data-auto='open-policy-fields']")//
    WebElement drpdwn;

    @FindBy(xpath = "//md-datepicker[@name='policyStartDate']")
    WebElement StartDatePicker;
    @FindBy(xpath = "//md-datepicker[@name='policyEndDate']")
    WebElement EndDatePicker;
    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement Today;
    @FindBy(xpath = "//textarea[@name='chequeDetails']")
    WebElement Cheque_details;

    @FindBy(xpath = "//span[text()='Car']")
    WebElement fw;

    @FindBy(xpath = "//input[@ng-model='registrationNumber']")
    WebElement EnterRegNum;

    @FindBy(xpath = "//button[contains(text(),'Get Quote')]")
    WebElement ClickGetQuote;

    @FindBy(xpath = "//p[text()='Your Car detail']")
    WebElement Carlbl;

    @FindBy(xpath = "//input[@type='search']")
    WebElement CarModel;

    @FindBy(xpath = "//span[text()='Hyundai I20 Active']")
    WebElement SelectModel;
  @FindBy(xpath = "(//span[@ng-click='$select.activate()'])[2]")
  WebElement manufacture_dropdown;

    @FindBy(xpath = "//span[text()='2023']")
    WebElement RollRegYear;

    @FindBy(xpath = "//span[text()='Petrol']")
    WebElement FuelType;

 @FindBy(xpath = "//span[text()='Type name or select']")
    WebElement ClickVariant;

    @FindBy(xpath = "//span[text()='Base (1197 CC)']")
    WebElement SelectVariant;

    @FindBy(id = "container-next-btn")
    WebElement NextButton;

    @FindBy(xpath = "//span[text()='Comprehensive']")
    WebElement Comprehensive;

    @FindBy(id = "container-next-btn")
    WebElement next;

    @FindBy(xpath = "//input[@name=\"expiryDate-datepicker\"]")
    WebElement expiryDate;


    @FindBy(xpath = "//p[text()='Previous Policy Details']")
    WebElement clickoutsidde;


    @FindBy(xpath = "//span[text()='No']")
    WebElement NO;

    @FindBy(xpath = "//span[text()='Yes']")
    WebElement Yes;

    @FindBy(xpath = "//span[text()='0%']")
    WebElement ncb_0;

    @FindBy(xpath = "//span[text()='Bajaj Allianz']")
    WebElement Prv_Pol_insur;
    @FindBy(xpath = "//input[@id='customerName']")
    WebElement name;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement ConBtn;

    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement confirm;

    @FindBy(xpath = "//div[@id='title-uiSelect']")
    WebElement ClickOntitle;

    @FindBy(xpath = "//span[text()='Mr']")
    WebElement SelectTitle;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='mobile']")
    WebElement mobile;

    @FindBy(xpath = "//a[@data-auto=\"HDFC-web\"]")
    WebElement SelectHDFCArgoplan;

    @FindBy(xpath = "//input[@id='alternateMobile']")
    WebElement scroll;

    @FindBy(xpath = "//span[text()='Male']")
    WebElement SelectGender;
    @FindBy(xpath = "//input[@name='engineNum']")
    WebElement EngineNum;

    @FindBy(xpath = "//input[@name='chassisNum']")
    WebElement ChNum;

    @FindBy(xpath = "//span[text()='Cheque']")
    WebElement SelPayOpt;

    @FindBy(xpath = "//input[@id='previousPolicyNumber']")
    WebElement prevPolicyNumber;


    @FindBy(xpath = "//span[text()='Individual']")
    WebElement IndividualSelect;

    @FindBy(xpath = "//input[@id='kyc-form_dob']")
    WebElement DOBField;

    @FindBy(xpath = "//input[@id='kyc-form_pan']")
    WebElement PanNo;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement ContinueBtn;

    @FindBy(xpath = "//span[text()='Confirm']")
    WebElement KYCconfirm;

    @FindBy(xpath = "//div[text()='Got It!']")
    WebElement got_it ;
    @FindBy(xpath = "//span[text()='Closed']")
    WebElement ClosedChips;
    @FindBy(xpath = "//span[text()='Leads']")
    WebElement LeadsChips;
    @FindBy(xpath = "//span[contains(text(),'Insurance Sales')]")
    WebElement InsuranceSales;
    @FindBy(xpath = "//div[@class=\"style__PolicyDetailsContainer-sc-3x9aob-0 cnRqYF\"]")
    WebElement ClickOn1stLead;

    @FindBy(xpath = "//*[text()=\"View Policy\"]")
    WebElement ViewPolicyButton;

    @FindBy(xpath = "//*[text()=\"Share Policy\"]")
    WebElement SharePolicyButton;

    @FindBy(xpath = "//*[text()=\"Send\"]")
    WebElement SendButton;

    @FindBy(xpath = "//span[normalize-space()='Business']")
    WebElement Business;
    @FindBy(xpath = "//span[contains(text(),'Activity Points')]")
    WebElement ActvityPointsButton;
    @FindBy(xpath = "//md-datepicker[(@name='paymentCompleteDate')]/button[@class='md-datepicker-button md-icon-button md-button md-ink-ripple']")
    WebElement PaymentCompleteDatePicker;
    @FindBy(xpath = "//table[@class='md-calendar']/tbody[4]/tr[4]/td[6]/span[@class='md-calendar-date-selection-indicator']")
    WebElement PaymentCompleteDate;
    @FindBy(xpath = "//input[@name='registrationDate-datepicker']")
    WebElement SelectDate;
    @FindBy(xpath = "//img[@alt=\"Turtlemint - Online Insurance\"]")
    WebElement tm_logo;
    @FindBy(xpath = "//div[@class='flex layout-column layout-align-top-center tm-profile-img hidden-xs']")
    WebElement CloseDatePicker;
    public ninja_mis_flow_page() {
        PageFactory.initElements(driver, this);
    }

    public void NinjaLogin(String NinjaEmail, String NinjaPassword) throws Exception {

        driver.get(prop.getProperty("ninjaurl"));

        Thread.sleep(2000);
        LogUtils.info("Ninja Website Opened");
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        SignInbtn.click();
        Thread.sleep(4000);
        LogUtils.info("Clicked on Sign In with Google Button");

        Set<String> allWindowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
        System.out.println("No. of tabs: " + tabs.size());

        if (tabs.size() <= 2) {
            Set<String> window = driver.getWindowHandles();
            Iterator<String> it = window.iterator();
            p = it.next();
            c = it.next();
            driver.switchTo().window(c);
            System.out.println("If code Run");
        } else {
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            mintproW = it.next();
            ninjaW = it.next();
            ninjasignupW = it.next();
            driver.switchTo().window(ninjasignupW);
            System.out.println("Else code run");
        }
        LogUtils.info("Switched to child window");
        Email.sendKeys(NinjaEmail);
        LogUtils.info("Email Entered");
        Nextbtn1.click();
        LogUtils.info("Clicked on Next button");
        Password.sendKeys(NinjaPassword);
        LogUtils.info("Password entered");
        WebCommands.staticSleep(2000);
        Nextbtn2.click();
        LogUtils.info("Clicked on Next button after password");
        if (tabs.size() <= 2) {
            driver.switchTo().window(p);
        } else {
            driver.switchTo().window(ninjaW);
        }
        LogUtils.info("Switched Back to Parent window");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
    }



    public void issuedPolicyThroughNinja() throws Exception {
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(5000);
        System.out.println(orderID);
        PolicyIssuance.click();
        LogUtils.info("Clicked on PolicyIssuance btn");
        Thread.sleep(5000);
        SearchBar.click();
        WebCommands.staticSleep(2000);
        SearchBar.sendKeys(orderID);
        LogUtils.info("Clicked on Searchbar and put unique ID");
        Thread.sleep(2000);
        SearchBar.sendKeys(Keys.RETURN);
        LogUtils.info("Enter on Search bar");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        TestUtil.click(select_issuance, "Clicked On searched issuance");
        Thread.sleep(2000);
        TestUtil.click(OWNbtn, "Clicked on OWN button");
        WebCommands.staticSleep(3000);
        reqID = reqid.getAttribute("value");
        WebCommands.staticSleep(4000);
        TestUtil.click(drpdwn, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(proposerTitle, "");//
        TestUtil.click(mrProposerTitle, "Mr. Title selected");//
        TestUtil.clear(Proposer_Phone,"6999 phone no cleared");
        TestUtil.sendKeys(Proposer_Phone, TestUtil.getRandomPhoneNumber(), "Proposer_Phone Number Entered");//
        WebCommands.staticSleep(2000);
        TestUtil.click(StartDatePicker, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(Today, "Selected for risk start date");
        WebCommands.staticSleep(3000);
        TestUtil.click(EndDatePicker, "");
        WebCommands.staticSleep(2000);
        TestUtil.click(Today, "Selected for risk start date");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(Cheque_details,"hggkjhghnm","cheque details entered");
        WebCommands.staticSleep(3000);
        TestUtil.click(paymentStatus, "Clicked on PaymentStatus DrpDwn");//
        TestUtil.click(paymentStatusComplete, "PaymentStatus Complete Selected");
        WebCommands.staticSleep(3000);
        PaymentCompleteDatePicker.click();
        PaymentCompleteDate.click();
        js.executeScript("arguments[0].click()", paymentVerifyChkBox);
        LogUtils.info("Payment Verify CheckBox Tick");
        TestUtil.click(issuanceStsDrpdwn, "Click on Issuance Status Dropdown");//
        WebCommands.staticSleep(2000);
        TestUtil.click(issuanceStatus, "Issuance Status Issued Selected");//
        WebCommands.staticSleep(2000);
        TestUtil.click(issuanceDate, "");//
        WebCommands.staticSleep(2000);
        TestUtil.click(issuanceDateSlct, "13th April 2023 Issuance Date Selected");//
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(enterPolicyNumber, TestUtil.generateRandomPolicyNo(7), "Policy Number Entered");//
        WebCommands.staticSleep(2000);
      //  plusicon.sendKeys("/Users/bandewadganeshbaiaji/Desktop/abcd.pdf");
        plusicon.sendKeys("/home/ubuntu/storage/dog.pdf");
        WebCommands.staticSleep(15000);
        TestUtil.click(policytag,"policy tab selected");
        TestUtil.click(Done,"done selected");
        WebCommands.staticSleep(5000);
        TestUtil.click(saveissuance, "Click on Save Issuance");
        WebCommands.staticSleep(5000);
        LogUtils.info("Policy Issued Successfully");



    }

    public String CreateQuoteWithRegNumber() throws InterruptedException {
        tl.GenerateRegNo();
        TestUtil.sendKeys(EnterRegNum, tl.RegNo, "Reg number entered");
        regisNo = tl.RegNo;
        TestUtil.click(ClickGetQuote, "Get Quote button clicked");
        WebCommands.staticSleep(10000);
        return regisNo;
    }
    public void SelectRegDate() throws InterruptedException {
        TestUtil.sendKeys(SelectDate, TestUtil.PastDate(5), "Date selected");
        WebCommands.staticSleep(2000);
        act.moveToElement(CloseDatePicker).click().perform();
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Next Button Pressed");
        WebCommands.staticSleep(2000);
    }

    public void SaveCarDetails(String CarName) throws InterruptedException {
        WebCommands.staticSleep(4000);
        Carlbl.isDisplayed();
        LogUtils.info("Car Details Entering Started");
        TestUtil.sendKeys(CarModel, CarName, "Car Name Entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(SelectModel, "Model Selected");
        WebCommands.staticSleep(4000);
        TestUtil.click(manufacture_dropdown, "manufacture_dropdown Selected");
        WebCommands.staticSleep(3000);
        TestUtil.click(manufacture_dropdown, "manufacture_dropdown Selected");
        TestUtil.click(RollRegYear, "Car Reg Year Selected");
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].click();", FuelType);
        TestUtil.click(ClickVariant, "Car variant Selection is in process");
        WebCommands.staticSleep(4000);
        WebCommands.staticSleep(4000);
        TestUtil.click(SelectVariant, "Car Variant Selected");
        WebCommands.staticSleep(4000);
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].click();", NextButton);
    }
    public void comprehensiveSelect() throws InterruptedException {
        WebCommands.staticSleep(4000);
        TestUtil.click(Comprehensive, "Comprehensive Selected");
        try {
            next.click();
            LogUtils.info("Clicked Next Button");
        } catch (Exception e) {
            System.out.println("Next Button Not Found: " + e);
        }
    }
    public void Expiring_in_few_days() throws InterruptedException {
        TestUtil.sendKeys(expiryDate, TestUtil.FutureDate(300), "Future Date Selected");
        act.moveToElement(clickoutsidde).click().perform();
        WebCommands.staticSleep(2000);
    }
    public void claimselect(String selector) throws InterruptedException {
        WebCommands.staticSleep(4000);
        if (selector == "no") {
            TestUtil.click(NO, "No Clicked on - claims in previous year");
            WebCommands.staticSleep(2000);
            TestUtil.click(ncb_0, "NCB 0% Selected");
        } else {
            TestUtil.click(Yes, "Yes Clicked on - claims in previous year");
            WebCommands.staticSleep(2000);
            TestUtil.click(next, "Clicked Next Button");
        }
    }
    public void previousPolicyInsurerSelect() throws InterruptedException {
        WebCommands.staticSleep(3000);
        TestUtil.click(Prv_Pol_insur, "Bajaj Allianz selected");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
    }
    public void TurtlemintPreviousPolicy() throws InterruptedException {
        WebCommands.staticSleep(3000);
        TestUtil.click(NO, "Previous policy from turtlemint Selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(next, "Clicked Next Button");
        LogUtils.info("Comprehensive Profile Done");
    }
    public void SaveLead(String LeadName) throws InterruptedException {
        name.sendKeys(LeadName);
        LogUtils.info("All Details Filled and Lead Name Entered");
        WebCommands.staticSleep(2000);
        NextButton.click();
        WebCommands.staticSleep(4000);
    }
  public void gotIt() {
    WebCommands.staticSleep(7000);
    js.executeScript("arguments[0].click()", got_it);
      WebCommands.staticSleep(4000);
  }
    public void HDfC_argo_instant_ProccedtoBuy() throws InterruptedException {
        WebCommands.staticSleep(10000);
        TestUtil.click(SelectHDFCArgoplan, "Clicked Buy Button");
        WebCommands.staticSleep(2000);
        TestUtil.click(confirm, "Clicked Proceed to Buy Button");
        WebCommands.staticSleep(5000);
    }
    public void KycFormFilling(){
        WebCommands.staticSleep(11000);
        js.executeScript("arguments[0].click();", IndividualSelect);
        TestUtil.click(DOBField,"DOB Field Clicked");
        DOBField.sendKeys("02/05/2000","DOB Entered");
        TestUtil.sendKeys(PanNo,"BNUPT2084B","Pan Number Entered");
        TestUtil.click(ContinueBtn,"KYC Form Filled Successfully and Continue Button pressed");
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].click();", KYCconfirm);
        WebCommands.staticSleep(4000);
    }

    public void scroll() {
        js.executeScript("arguments[0].scrollIntoView();", scroll);
    }
        public void contactDetails() {
        ClickOntitle.click();
        SelectTitle.click();
        LogUtils.info("Name Filled!");
        email.sendKeys("test@example.com");
        LogUtils.info("Email Filled!");
        mobile.sendKeys("6999912345");
        LogUtils.info("Mobile Number Filled!");
        WebCommands.staticSleep(3000);
            js.executeScript("arguments[0].click();", ConBtn);

            WebCommands.staticSleep(2000);
}

    public void ContinueButton() {
        ConBtn.click();
        WebCommands.staticSleep(3000);
    }
    public void personalDetailsGenderDOBWithoutAddon() throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(SelectGender).click().perform();
        ContinueButton();
        WebCommands.staticSleep(2000);
    }
    public void vehicleDetail() throws InterruptedException { // Chola, Bajaj, Digit, HDFC
        EngineNum.sendKeys("230620221135YES");
        WebCommands.staticSleep(2000);
        ChNum.sendKeys("230620221135YESOK");
        WebCommands.staticSleep(2000);
        LogUtils.info("Engine and Chassis number filled!");
        ContinueButton();
    }
    public void previousPolicy_No() throws InterruptedException {
        WebCommands.staticSleep(3000);
        prevPolicyNumber.sendKeys("55443214");
        WebCommands.staticSleep(2000);
        ContinueButton();
    }

    public void paymentcheque() throws InterruptedException { // All insurer except HDFC
        TestUtil.click(SelPayOpt, "");
        LogUtils.info("Payment Option cheque Selected!");
        WebCommands.staticSleep(10000);
        ContinueButton();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }


    public String getUniqueID() throws InterruptedException {
        getUrl = driver.getCurrentUrl();
        System.out.println(getUrl);
        String[] result = getUrl.split("results/");
        System.out.println("Order ID = " + result[1]);
        orderID = result[1];
        WebCommands.staticSleep(2000);
        return orderID;
    }



    public void Mintprofinalflow() throws Exception {
        driver.switchTo().window(Mintprowindow);
        WebCommands.staticSleep(2000);
        backtohome();
        WebCommands.staticSleep(2000);
        TestUtil.click(LeadsChips, "Clicked on Leads Chips");
        WebCommands.staticSleep(2000);
        TestUtil.click(ClosedChips, "Closed Chips clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Business, "click On Buisness Button");
        TestUtil.click(InsuranceSales, "Click on Insurance Sale DropDown");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(ClickOn1stLead, "Click on 1st Lead");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(SharePolicyButton, "Click on Share policy Button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(SendButton, "Click on send Button");
        WebCommands.staticSleep(1000);
        Assert.assertEquals("Policy Sent", "Policy Sent");
        WebCommands.staticSleep(2000);
        TestUtil.click(ViewPolicyButton, "Click on View Policy Button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Business, "click On Buisness Button");
        TestUtil.click(ActvityPointsButton, "Click on Activity Points Button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

//"- in activity point section Policy should update in cycle 1 if we are in date of 1 to 15 and
//it should go in cycle 2 if we are in date of 16 to 31"


    }
    public void savemintprowindow()  {
        Mintprowindow = driver.getWindowHandle();

    }
    public void backtohome()  {
        WebCommands.staticSleep(2000);
        TestUtil.click(tm_logo, "click On tm logo");
    }

        public void CompToCompFlowWithExpiringInFewDay() throws Exception {
            WebCommands.staticSleep(2000);
            TestUtil.click(fw,"clicked on car");
            WebCommands.staticSleep(2000);
            CreateQuoteWithRegNumber();
            SelectRegDate();
            SaveCarDetails(prop.getProperty("Model"));
            comprehensiveSelect();
            Expiring_in_few_days();
            comprehensiveSelect();
            claimselect("no");
            previousPolicyInsurerSelect();
            TurtlemintPreviousPolicy();
            SaveLead(tl.NameGenerator());
            gotIt();
            getUniqueID();
            HDfC_argo_instant_ProccedtoBuy();
            KycFormFilling();
            contactDetails();
            personalDetailsGenderDOBWithoutAddon();
            vehicleDetail();
            previousPolicy_No();
            paymentcheque();
            savemintprowindow();
    }



}
