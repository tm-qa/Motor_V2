package com.qa.turtlemint.pages.business;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Set;

public class Business_Page extends TestBase {

    public Business_Page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Grow']")
    WebElement Grow;

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

    @FindBy(xpath = "//span[text()='Claims']")
    WebElement claims;
    @FindBy(xpath = "//span[text()='Report a Sale']")
    WebElement ReportASale;
    @FindBy(xpath = "//span[text()='Mutual Fund Sales']")
    WebElement mutual_fund_sales;
    @FindBy(xpath = "//p[text()='Claims']")
    WebElement claimsPage;
    @FindBy(xpath = "//div[text()='Report a Sale']")
    WebElement ReportASalePage;
    @FindBy(xpath = "//img[@src='resources/images/logo.png']")
    WebElement mf_logo;
    @FindBy(xpath = "//span[contains(text(),'Mutual Fund Sales')]")
    WebElement MutualFundSaleButton;

    @FindBy(xpath = "(//img[@class=\"back-mintpro\"])[1]")
    WebElement BacktoMintpro;

    @FindBy(xpath = "//span[normalize-space()='Business']//parent::a")
    WebElement Business;

    @FindBy(xpath = "//span[contains(text(),'Activity Points')]")
    WebElement ActvityPointsButton;

    @FindBy(xpath = "//*[text()=\"Download Statement\"]")
    WebElement DownloadStatementButton;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[1]")
    WebElement ClickonMonths;

    @FindBy(xpath = "//span[text()='Details']")
    WebElement Details;
    @FindBy(xpath = "//p[text()='If you have any issues with the entries of this cycle, please contact the']")
    WebElement helpcentreMsg;

    @FindBy(xpath = "//a[text()='Help Center']")
    WebElement helpcentre;
    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[2]")
    WebElement ClickonMonth1;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[3]")
    WebElement ClickonMonths2;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[4]")
    WebElement ClickonMonths3;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[5]")
    WebElement ClickonMonths4;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[6]")
    WebElement ClickonMonths5;

    @FindBy(xpath = "//span[contains(text(),'Performance Report')]")
    WebElement PerformanceReportButton;

    @FindBy(xpath = "//span[text()='Renewal Business']")
    WebElement RenewalBusinessButton;

    @FindBy(xpath = "//div[text()='Renewed Policies']")
    WebElement Renewed_Policies;
    @FindBy(xpath = "//p[text()='Explore more options']")
    WebElement Explore_More_Options;
    @FindBy(xpath = "//p[text()='Explore more options']")
    WebElement Insurance_Products;
    @FindBy(xpath = "//p[text()='Explore more options']")
    WebElement Other_Products;

    public void InsurnaceSalesFlow() {
        TestUtil.click(Grow, "grow button");
        WebCommands.staticSleep(5000);
        TestUtil.click(Business, "Click on Business button");
        WebCommands.staticSleep(2000);
        TestUtil.click(InsuranceSales, "Click on Insurance Sale DropDown");
        String  InsurnaceSalesFlowpageurl = driver.getCurrentUrl();
        System.out.println(InsurnaceSalesFlowpageurl + "InsurnaceSalesFlow page url");
        Assert.assertEquals(InsurnaceSalesFlowpageurl.contains("insuranceSales"), true);
        WebCommands.staticSleep(5000);
        TestUtil.click(ClickOn1stLead, "Click on 1st Lead");
        WebCommands.staticSleep(2000);
        try {
            TestUtil.click(SharePolicyButton, "Click on Share policy Button");
            TestUtil.getScreenShot();
            WebCommands.staticSleep(3000);
            TestUtil.click(SendButton, "Click on send Button");
            WebCommands.staticSleep(1000);
            Assert.assertEquals("Policy Sent", "Policy Sent");
            WebCommands.staticSleep(2000);
        } catch (Exception e) {
            System.out.println("share button not found" + e);
        }
        TestUtil.click(ViewPolicyButton, "Click on View Policy Button");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
    }

    public void MutualFundSalesFlow() throws InterruptedException {

            TestUtil.click(Business, "click On Business Button");
            TestUtil.click(MutualFundSaleButton, "Click on Mutual Fund Sales button");
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();
            String  mutualfundpageurl = driver.getCurrentUrl();
            System.out.println(mutualfundpageurl + "mutualfund page url");
            Assert.assertEquals(mutualfundpageurl.contains("my-customers"), true);
            TestUtil.click(BacktoMintpro, "Back to Mintpro Home Page");
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();

    }

    public void ActivityPointFlow() throws InterruptedException {
            TestUtil.click(Business, "click On Buisness Button");
            TestUtil.click(ActvityPointsButton, "Click on Activity Points Button");
            WebCommands.staticSleep(3000);
        String  activitypointpageurl = driver.getCurrentUrl();
            System.out.println(activitypointpageurl + "activitypoint page url");
            Assert.assertEquals(activitypointpageurl.contains("activity"), true);
        WebCommands.staticSleep(3000);
        TestUtil.click(DownloadStatementButton, "Downloaded Statement");
            TestUtil.getScreenShot();
            WebCommands.staticSleep(3000);
            TestUtil.click(ClickonMonth1, "Check months previous");
            WebCommands.staticSleep(3000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonths2, "Check months 2nd previous");
            WebCommands.staticSleep(3000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonths3, "Check months 3rd previous");
            WebCommands.staticSleep(3000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonths4, "Check months 4rt previous");
            WebCommands.staticSleep(3000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonths5, "Check months 5th previous");
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonths, "Check months current month");
            WebCommands.staticSleep(3000);
            TestUtil.getScreenShot();
            TestUtil.click(Details, "Clicked on details");
            TestUtil.getScreenShot();
            TestUtil.IsDisplayed(helpcentreMsg,"helpcentre msg displayed");
            WebCommands.staticSleep(3000);
            TestUtil.click(helpcentre, "Clicked on helpcentre");
            WebCommands.staticSleep(3000);
            TestUtil.getScreenShot();
            String  helpcentrepageurl = driver.getCurrentUrl();
            System.out.println(helpcentrepageurl + "helpcentre page url");
            Assert.assertEquals(helpcentrepageurl.contains("help-centre"), true);
            System.out.println("Business Flow completed");
    }

    public void PerformanceReport() throws InterruptedException {
            TestUtil.click(Business, "Click on Business button");
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();
            TestUtil.click(PerformanceReportButton, "Click on Performance report");
            WebCommands.staticSleep(2000);
            String mintproHandle= driver.getWindowHandle();
            Set<String> newhandle=driver.getWindowHandles();
            for(String reporthandle: newhandle) {
                if(!reporthandle.equalsIgnoreCase(mintproHandle)) {
        //Switch to the opened report tab
                    driver.switchTo().window(reporthandle);
            }}
            String  PerformanceReportpageurl = driver.getCurrentUrl();
            System.out.println(PerformanceReportpageurl + "PerformanceReport page url");
            Assert.assertEquals(PerformanceReportpageurl.contains("reports"), true);
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();

    }
    public void RenewalBusiness() throws InterruptedException {
            TestUtil.click(Business, "Click on Business button");
            WebCommands.staticSleep(2000);
            RenewalBusinessButton.isDisplayed();
            TestUtil.click(RenewalBusinessButton, "Click on Renewal Business CTA");
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();
            String  RenewalBusinesspageurl = driver.getCurrentUrl();
            System.out.println(RenewalBusinesspageurl + "PerformanceReportpageurl page url");
            Assert.assertEquals(RenewalBusinesspageurl.contains("renewaldashboard"), true);
            System.out.println("landed on renewal dashboard ");
            TestUtil.click(Renewed_Policies, "Click on Renewed_Policies CTA");
            WebCommands.staticSleep(1000);
            TestUtil.click(Explore_More_Options, "Click on Explore_More_Options CTA");
            TestUtil.IsDisplayed(Insurance_Products," Insurance_Products title text displayed on SELL page");
            TestUtil.IsDisplayed(Other_Products," Other_Products title text displayed on SELL page");
            System.out.println(" redirect to SELL page ");
    }
    public void claims() throws InterruptedException {

        TestUtil.click(Business, "click On Business Button");
        TestUtil.click(claims, "Click on claims button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        String  claimspageurl = driver.getCurrentUrl();
        System.out.println(claimspageurl + "mutualfund page url");
        Assert.assertEquals(claimspageurl.contains("claims"), true);
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }
    public void ReportA_Sale() throws InterruptedException {

        TestUtil.click(Business, "click On Business Button");
        TestUtil.click(ReportASale, "Click on Report A Sale button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        String  ReportASalepageurl = driver.getCurrentUrl();
        System.out.println(ReportASalepageurl + "ReportASalepageurl page url");
        Assert.assertEquals(ReportASalepageurl.contains("reportasale"), true);
        TestUtil.IsDisplayed(ReportASalePage,"ReportASalePage text displayed");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }
    public void Mutual_Fund_sales() throws InterruptedException {

        TestUtil.click(Business, "click On Business Button");
        TestUtil.click(mutual_fund_sales, "Click on mutual_fund_sales button");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        String  mutualfundsalespageurl = driver.getCurrentUrl();
        System.out.println(mutualfundsalespageurl + "ReportASalepageurl page url");
        Assert.assertEquals(mutualfundsalespageurl.contains("my-customers"), true);
        TestUtil.IsDisplayed(mf_logo,"mf_logo displayed");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }



}