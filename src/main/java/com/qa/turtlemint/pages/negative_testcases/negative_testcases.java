package com.qa.turtlemint.pages.negative_testcases;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class negative_testcases extends TestBase {

    @FindBy(xpath = "//img[@class='profile_img']")
    WebElement profileButton;
    @FindBy(xpath = "//h5[text()='Edit Personal Brand']")
    WebElement editBrand;

    @FindBy(id = "fname")
    WebElement fname;

    @FindBy(id = "mobile")
    WebElement mobile;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(xpath = "//button[@class='jss103 jss77 jss79 jss82 applyEverywhereDisable']")
    WebElement Applydisabled;
    @FindBy(xpath = "//button[@class='jss103 jss77 jss79 jss82 applyEverywhere']")
    WebElement Apply;

    @FindBy(xpath = "//span[text()='Leads']")
    WebElement LeadsChips;

    @FindBy(xpath = "(//span[@class='title'])[1]")
    WebElement FirstLead;
    @FindBy(xpath = "//div[@class='leadName']")
    WebElement Name;
    @FindBy(xpath = "//button[text()='Add Reminder']")
    WebElement AddReminder;

    @FindBy(xpath = "//span[text()='Call Client']//parent::label")
    WebElement CallClientReminder;

    @FindBy(xpath = "//input[@id='date_picker']")
    WebElement SetDate;
    @FindBy(xpath = "//span[text()='OK']")
    WebElement OK;

    @FindBy(xpath = "//span[text()='Set Reminder']")
    WebElement SetReminder;
    @FindBy(xpath = "//p[text()='You can have a maximum of 3 reminders at a time. ']")
    WebElement MaxReminderMsg;
    @FindBy(xpath = "//button[text()='Add More']")
    WebElement AddMore;
    String LeadNameInReminder;
    Date myDate;
    String msg;

    public negative_testcases() {
        PageFactory.initElements(driver, this);
    }

    public void edit_personal_brand() {
        TestUtil.click(editBrand,"Edit Personal Brand Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Applydisabled,"apply everything and go back disabled");
        TestUtil.clear(mobile,"mobile no cleared");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Applydisabled,"mobile no cleared and apply everything and go back disabled ");
        driver.navigate().refresh();
        WebCommands.staticSleep(2000);
        TestUtil.clear(email,"email cleared");
        TestUtil.IsDisplayed(Applydisabled,"email cleared and apply everything and go back disabled ");
        WebCommands.staticSleep(1000);
        driver.navigate().refresh();
        TestUtil.clear(mobile,"mobile no cleared");
        TestUtil.sendKeys(mobile,"987654321","9 digit mobile no entered");
        TestUtil.IsDisplayed(Applydisabled,"mo no cleared and apply everything and go back disabled ");
        driver.navigate().refresh();
        TestUtil.clear(mobile,"mobile no cleared");
        TestUtil.sendKeys(mobile,"98765432187","11 digit mobile no entered");
        TestUtil.IsDisplayed(Applydisabled,"11 digit mo no entered and apply everything and go back disabled ");
    }
    public void VerifyLeadsChips() {
        LeadsChips.isDisplayed();
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(LeadsChips, "Clicked on Leads Chips");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
    }
    public String FutureDate(int no_of_days) {
        DateFormat dateFormat = new SimpleDateFormat("dd");
        myDate = new Date(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        cal.setTime(myDate);
        cal.add(Calendar.DATE, +no_of_days);
        return (dateFormat.format(cal.getTime()));
    }
    public void AddReminder() {

        VerifyLeadsChips();
        TestUtil.click(FirstLead, "Clicked on first lead");
        WebCommands.staticSleep(5000);
        LeadNameInReminder = Name.getText();
        TestUtil.click(AddReminder, "Add Reminder Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(SetDate, "Select date is clicked to set reminder date");
        WebCommands.staticSleep(2000);
        driver.findElement(By.xpath("(//span[text()=" + FutureDate(1) + "])[1]")).click();
        WebCommands.staticSleep(2000);
        TestUtil.click(OK, "Reminder date is selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(OK, "Time is set");
        WebCommands.staticSleep(2000);
        TestUtil.click(CallClientReminder, "Reminder type is selected");
        TestUtil.click(SetReminder, "Reminder is set");
        for (int i = 1; i <= 2; i++) {
            TestUtil.click(AddMore, "Add More Clicked");
            WebCommands.staticSleep(2000);
            TestUtil.click(SetDate, "Select date is clicked to set reminder date");
            WebCommands.staticSleep(2000);
            driver.findElement(By.xpath("(//span[text()=" + FutureDate(1) + "])[1]")).click();
            WebCommands.staticSleep(2000);
            TestUtil.click(OK, "Reminder date is selected");
            WebCommands.staticSleep(2000);
            TestUtil.click(OK, "Time is set");
            WebCommands.staticSleep(2000);
            TestUtil.click(CallClientReminder, "Reminder type is selected");
            TestUtil.click(SetReminder, "Reminder is set");
        }

        WebCommands.staticSleep(2000);
      //  msg = MaxReminderMsg.getText();
      //  Assert.assertEquals(msg, "You can have a maximum of 3 reminders at a time.");
    }
    public void otp() {
        LeadsChips.isDisplayed();
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(LeadsChips, "Clicked on Leads Chips");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
    }









    }
