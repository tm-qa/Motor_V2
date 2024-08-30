package com.qa.turtlemint.pages.login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//span[text()='Create an account/ Sign in']")
    WebElement CreateAccount;
    @FindBy(xpath = "//span[text()='SIGN UP']")
    WebElement Sign_up;

    @FindBy(name = "mobileNumber")
    WebElement MobileNumber;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement ContinueBtn;

    @FindBy(xpath = "//input[@class='OTPInput']")
    WebElement OTPField;
    @FindBy(xpath = "//input[@class='OTPInput']")
    WebElement disabledOTPField;

    @FindBy(xpath = "//span[text()='Verify OTP']")
    WebElement VerifyOTPBtn;

    @FindBy(xpath = "//p[text()='Invalid OTP number. Please try again, or resend OTP.']")
    WebElement InvalidOTPNumber;

    @FindBy(xpath = "//input[@class='OTPInput error']")
    WebElement ReOTP;

    @FindBy(xpath = "//p[text()='Your account is locked. Please try after 30 minutes.']")
    WebElement OtpLock;

    @FindBy(xpath = "//span[text()='Resend OTP']")
    WebElement ResendOTPBtn;

    @FindBy(xpath = "//span[contains(text(),'Resend OTP in ')]")
    WebElement OtpTimer;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public String ValidateLoginPageTitle() {
        return driver.getTitle();
    }

    public void commonLoginElements(String username){
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
 //       TestUtil.click(CreateAccount, "Create an account/Sign in Button Clicked");
        TestUtil.sendKeys(MobileNumber, username, "Mobile Number Entered");
        TestUtil.click(ContinueBtn, "Continue pressed");
    }

    public GrowPageSellButton ValidateLogin(String username, String otp) {
        commonLoginElements(username);
        TestUtil.sendKeys(OTPField, otp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Login Successful");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        return new GrowPageSellButton();
    }

    public void InvalidLoginPage(String username, String invalidOtp) throws IOException {
        commonLoginElements(username);
        TestUtil.sendKeys(OTPField, invalidOtp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Verify OTP Clicked");
        WebCommands.staticSleep(2000);
        InvalidOTPNumber.isDisplayed();
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
    }

    public void lockWrongOtp(String username, String invalidOtp){
        commonLoginElements(username);
        TestUtil.sendKeys(OTPField, invalidOtp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Verify OTP Button Clicked");
        for(int i = 0; i<3; i++) {
            ReOTP.clear();
            TestUtil.sendKeys(ReOTP,TestUtil.getRandomOtp(),"Random OTP Entered");
            WebCommands.staticSleep(1000);
            TestUtil.click(VerifyOTPBtn, "Verify OTP Button Clicked");
        }
        WebCommands.staticSleep(2000);
        OtpLock.isDisplayed();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public void resendOtp(String username){
        commonLoginElements(username);
        WebCommands.staticSleep(32000);
        TestUtil.click(ResendOTPBtn, "Resend OTP pressed");
        WebCommands.staticSleep(2000);
        OtpTimer.isDisplayed();
        LogUtils.info("OTP Timer Verified");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }
    public void enter_without_Otp(String username) {
        commonLoginElements(username);
        TestUtil.IsDisplayed(disabledOTPField,"otp field disabled before entering otp");
    }
    public void enter_with_less_than_10_digit_number() {
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        TestUtil.sendKeys(MobileNumber, "987654321", "9 digit Mobile Number Entered");
        TestUtil.IsDisplayed(Sign_up,"sign up displayed in disable mode instead of continue due to mobile no is less than 10");
    }
    public void more_than_10_digit_number_not_accepting() {
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        TestUtil.sendKeys(MobileNumber, "98765432101", "11 digit Mobile Number Entered");
        TestUtil.click(ContinueBtn, "Continue pressed");
    }

}
