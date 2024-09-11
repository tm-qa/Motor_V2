package com.qa.turtlemint.pages.login.four_wheeler;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.turtlemint.util.TestUtil.waitUntilTextToPresent;

public class FW_CheckoutPage extends TestBase {

    public FW_CheckoutPage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//b[text()='Checkout']")
    WebElement CheckoutPageVisible;

    @FindBy(xpath = "//div[@id='title-uiSelect']")
    WebElement ClickOntitle;

    @FindBy(xpath = "//span[text()='Mr']")
    WebElement SelectTitle;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstname;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//div[@id='contact-details-slide']")
    WebElement Contact_Detail;

    @FindBy(xpath = "//input[@name='mobile']")
    WebElement mobile;
    @FindBy(xpath = "//*[text()='State']")
    WebElement StateDisplay;
    @FindBy(xpath = "//div[@id='registeredPincode-uiSelect']")
    WebElement pin;
    @FindBy(xpath = "//div[@id='registeredPincode-uiSelect']/input")
    WebElement Pincode;
    @FindBy(xpath = "//input[@id='alternateMobile']")
    WebElement scroll;
    @FindBy(xpath = "//span[text()='400065']")
    WebElement SelectPincode;
    @FindBy(xpath = "//input[@name='registeredAddressLine1']")
    WebElement addressLine1;

    @FindBy(xpath = "//input[@name='registeredAddressLine2']")
    WebElement addressLine2;
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement ConBtn;
    @FindBy(xpath = "//span[text()='Male']")
    WebElement SelectGender;
    @FindBy(xpath = "//input[@name='engineNum']")
    WebElement EngineNum;
    @FindBy(xpath = "//input[@name='chassisNum']")
    WebElement ChNum;
    @FindBy(xpath = "//span[text()='Online']")
    WebElement SelPayOpt;




    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void scroll() {
        js.executeScript("arguments[0].scrollIntoView();", scroll);
    }

    public void contactDetailsKycDigit(String fname, String lname) throws Exception { //For Kyc Digit
        TestUtil.waitUntilVisibilityOfElement(ClickOntitle);
        TestUtil.click(ClickOntitle, "Clicked on title");
        TestUtil.waitUntilVisibilityOfElement(SelectTitle);
        TestUtil.click(SelectTitle, "Title selected");
        String FstName = firstname.getAttribute("value");
        String LstName = lastname.getAttribute("value");
        String Emailid = email.getAttribute("value");
        String MobileNo = mobile.getAttribute("value");
        if (FstName.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(firstname);
            TestUtil.sendKeys(firstname, fname, "First name is filled..");
        }
        if (LstName.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(lastname);
            TestUtil.sendKeys(lastname, lname, "Last Name is filled..");
        }
        if (Emailid.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(email);
            TestUtil.sendKeys(email, "test@example.com", "Email-id is Entered...");
        }
        if (MobileNo.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(mobile);
            TestUtil.sendKeys(mobile, "6999912345", "Mobile Number is Entered...");
        }
        scroll();
        WebCommands.staticSleep(2000);
    }

    public void Digit_Pin() throws Exception {
        WebCommands.staticSleep(3000);
        if (StateDisplay.isDisplayed()) {
            TestUtil.waitElementToBeClickable(pin);
            TestUtil.click(pin, "Clecik on pin....");
            TestUtil.click(pin, "Clecik on pin....");
            TestUtil.waitUntilVisibilityOfElement(Pincode);
            TestUtil.sendKeys(Pincode, "400065", "Pincode is Entered....");
            TestUtil.waitElementToBeClickable(SelectPincode);
            TestUtil.click(SelectPincode, "Select the pincode....");
        }
    }
    public void commonAddressLine() throws Exception {
        String Add1 = addressLine1.getAttribute("value");
        if (Add1.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(addressLine1);
            TestUtil.sendKeys(addressLine1, "Saki Vihar Road", "Address line one is Enetred");
            TestUtil.waitUntilVisibilityOfElement(addressLine2);
            TestUtil.sendKeys(addressLine2, "Saki Naka Metro Station", "Address line two is Enetred");
        }
    }
    public void ContinueButton() throws Exception {
        TestUtil.waitElementToBeClickable(ConBtn);
        LogUtils.info("Continue button is Clickable.....");
        WebCommands.staticSleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ConBtn);
        LogUtils.info("Clicked on continue button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }
    public void personalDetailsGenderKyc() throws InterruptedException { // Digit ONLY when there is no ADDON
        TestUtil.waitUntilVisibilityOfElement(SelectGender);
        TestUtil.moveToElement(SelectGender);
    }
    public void DIGIT_VehicleDetail() throws InterruptedException { // Chola, Bajaj, Digit, HDFC
        String EngineNo = EngineNum.getAttribute("value");
        if (EngineNo.isEmpty()) {
            TestUtil.waitUntilVisibilityOfElement(EngineNum);
            TestUtil.sendKeys(EngineNum, "78RT9067YU234RT12", "Engine number is enetred...");
            TestUtil.waitUntilVisibilityOfElement(ChNum);
            TestUtil.sendKeys(ChNum, "89T95T7876YU90812R", "Chnum number is enetred...");
        }
    }
    public void paymentSlideDigit() throws Exception { // All insurer except HDFC
        TestUtil.waitElementToBeClickable(SelPayOpt);
        TestUtil.click(SelPayOpt, "Payment Option Selected!");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void digitCheckoutNB(String fname, String lname) throws Exception {
        waitUntilTextToPresent(CheckoutPageVisible, "Checkout", "CheckoutPage is Visible");
        TestUtil.waitUntilVisibilityOfElement(CheckoutPageVisible);
        contactDetailsKycDigit(fname, lname);
        Digit_Pin();
        commonAddressLine();
        ContinueButton();
        personalDetailsGenderKyc();
        ContinueButton();
        DIGIT_VehicleDetail();
        TestUtil.getFullPageScreenShot();
        ContinueButton();
        WebCommands.staticSleep(7000);
        paymentSlideDigit();
        WebCommands.staticSleep(4000);
        TestUtil.getFullPageScreenShot();
        //  makePayment();
    }


}
