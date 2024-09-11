package com.qa.turtlemint.pages.login.MintPro;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends TestBase {

    @FindBy(name = "mobileNumber")
    WebElement MobileNumber;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement ContinueBtn;

    @FindBy(xpath = "//input[@class='OTPInput']")
    WebElement OTPField;

    @FindBy(xpath = "//span[text()='Verify OTP']")
    WebElement VerifyOTPBtn;

    public Loginpage() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateLogin (String username , String otp){
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        TestUtil.sendKeys(MobileNumber, username, "Mobile Number Entered");
        TestUtil.click(ContinueBtn, "Continue pressed");
        TestUtil.sendKeys(OTPField, otp, "OTP Entered");
        TestUtil.click(VerifyOTPBtn, "Login Successful");
        WebCommands.staticSleep(2000);
    }


}
