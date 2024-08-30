package com.qa.turtlemint.pages.sell;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SellPage extends TestBase {

    @FindBy(xpath = "//span[text()='Car']")
    WebElement fw;

    @FindBy(xpath = "//div[text()='Four Wheelers']")
    WebElement displayFourWheelers;

    @FindBy(xpath = "//span[text()='Bike']")
    WebElement tw;

    @FindBy(xpath = "//div[text()='Two Wheelers']")
    WebElement displayTwoWheelers;

    @FindBy(xpath = "//span[text()='Commercial Vehicle']")
    WebElement cv;

    @FindBy(xpath = "//div[text()='Commercial Vehicle']")
    WebElement displayCV;

    @FindBy(xpath = "//span[text()='Health']")
    WebElement health;

    @FindBy(xpath = "//div[text()='Health Insurance']")
    WebElement displayHealthInsurance;

    @FindBy(xpath = "//div[text()='Super Top-up']")
    WebElement displaySuperTopUp;

    @FindBy(xpath = "//div[text()='Personal Accident']")
    WebElement displayPersonalAccident;

    @FindBy(xpath = "//span[text()='Personal Accident']")
    WebElement personalAccident;

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement xButton;

    @FindBy(xpath = "//span[text()='PA Covers These Types Of Accidents']")
    WebElement displayPA;

   @FindBy(xpath = "//span[text()='Life']")
    WebElement termLife;

    @FindBy(xpath = "//div[text()='Get Quotes & BI for']")
    WebElement Get_Quotes_and_BIfor_TermLife;
    @FindBy(xpath = "//div[text()='Sell life Insurance like ']")
    WebElement displaySell_life_Insurance_like_PROe;

    @FindBy(xpath = "//div[text()='Investment']//parent::div")
    WebElement displayInvestment;

    @FindBy(xpath = "//div[text()='Child Saving']")
    WebElement displayChildSaving;

    @FindBy(xpath = "//div[text()='Retirement']")
    WebElement displayRetirement;

    @FindBy(xpath = "//div[text()='PoS Product']")
    WebElement displayPosProduct;

    @FindBy(xpath = "//span[text()='Mutual Funds']")
    WebElement mf;

    @FindBy(xpath = "//button[text()='I am Interested']")
    WebElement displayMF;

    @FindBy(xpath = "//span[text()='Life - Investment']")
    WebElement life_investment;

    @FindBy(xpath = "//span[text()='Mobile']")
    WebElement mobile;

    @FindBy(xpath = "//span[contains(text(),'Safeguard your phone with')]")
    WebElement displayTrinng;

    @FindBy(xpath = "//span[text()='Autos']")
    WebElement Autos;
    @FindBy(xpath = "//span[text()='Taxis']")
    WebElement Taxis;
    @FindBy(xpath = "//span[text()='Goods Carrying Vehicles']")
    WebElement Goods_carrying_vehicles;
    @FindBy(xpath = "//span[text()='Buses & Coaches']")
    WebElement BusesAndcoaches;
    @FindBy(xpath = "//span[text()='Two Wheelers']")
    WebElement twoWheelers;
    @FindBy(xpath = "//span[text()='Fire']")
    WebElement Fire;
    @FindBy(xpath = "//span[text()='Marine']")
    WebElement Marine;
    @FindBy(xpath = "//span[contains(text(),'Workmen’s Compensation')]")
    WebElement Workmens_Compensation;
    @FindBy(xpath = "//span[text()='Credit Card']")
    WebElement Credit_card;
    @FindBy(xpath = "//span[text()='Personal Loan']")
    WebElement Personal_loan;
    @FindBy(xpath = "//span[text()='OPD Healthcare+']")
    WebElement opd_healthCare;
    @FindBy(xpath = "//h2[contains(text(),'Who needs a Fire Insurance?')]")
    WebElement FireQuestionOnFirePage;
    @FindBy(xpath = "//div[text()='You are not authorised to sell this product.']")
    WebElement YouAreNotAuthorised;
    @FindBy(xpath = "//h2[contains(text(),'Who needs Marine Insurance?')]")
    WebElement MarineQuestionOnPage;
    @FindBy(xpath = "//h2[contains(text(),'Who needs Workmen')]")
    WebElement Workmens_CompensationQuestionOnPage;
    @FindBy(xpath = "//h2[contains(text(),'Who is more likely to get a credit card?')]")
    WebElement Creadit_cardQuestionOnCreditcardPage;
    @FindBy(xpath = "//span[contains(text(),'Apply')]")
    WebElement PersonalLoanAppyNowOnPage;

    @FindBy(xpath = "//h2[contains(text(),'Who needs an OPD healthcare+?')]")
    WebElement opd_healthcareplus_QuestionOnPage;
    @FindBy(xpath = "//span[text()='Business Loan']")
    WebElement Business_loan;

    @FindBy(xpath = "//span[text()='Loan Against Mutual Fund']")
    WebElement LoanAgainstMutualFund;

    @FindBy(xpath = "//span[text()='Get Started']")
    WebElement Business_loan_Page_Get_started_CTA;
    @FindBy(xpath = "//span[text()='Fixed Deposit']")
    WebElement Fix_deposit;
    @FindBy(xpath = "//span[text()='Get Started']")
    WebElement Fix_deposit_Page_Get_started_CTA;
    @FindBy(xpath = "//span[text()='Loan Against Mutual Fund']")
    WebElement loan_against_mutual_fund;
    @FindBy(xpath = "//span[text()='Generate Link']")
    WebElement loan_against_mutual_fund_Page_Generate_Link_CTA;


    public SellPage() {
        PageFactory.initElements(driver, this);
    }

    public void validateFWMotorClick() {
        TestUtil.click(fw,"Four Wheeler Clicked");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayFourWheelers,"Checking if Four Wheeler Page is Opened");
    }

    public void validateTWMotorClick() {
        TestUtil.click(tw,"Two Wheeler Clicked");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayTwoWheelers,"Checking if Two Wheeler Page is Opened");
    }

    public void validateCVMotorClick() {
        TestUtil.click(cv,"Commercial Vehicle Clicked");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(Autos,"autos displayed after CV Page is Opened");
        TestUtil.IsDisplayed(Taxis,"Taxis displayed after CV Page is Opened");
        TestUtil.IsDisplayed(Goods_carrying_vehicles,"Goods_carrying_vehicles displayed after CV Page is Opened");
        TestUtil.IsDisplayed(BusesAndcoaches,"Buses&coaches displayed after CV Page is Opened");
        TestUtil.IsDisplayed(twoWheelers,"twoWheelers displayed after CV Page is Opened");
    }

    public void validateHealthClick() {
        TestUtil.click(health,"Health Vertical Clicked");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayHealthInsurance,"Checking if Health Insurance Card is Present");
        TestUtil.IsDisplayed(displaySuperTopUp,"Checking if Super Top Up Card is Present");
        TestUtil.IsDisplayed(displayPersonalAccident,"Checking if Personal Accident Card is Present");
    }

    public void validatePersonalAccidentClick() {
        TestUtil.click(personalAccident,"Personal Accident Clicked");
        TestUtil.getScreenShot();

    }

    public void validateTermLifeClick() {
        TestUtil.click(termLife," Life Clicked");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(Get_Quotes_and_BIfor_TermLife,"Checking if Term Life Card is Opened");

    }
    public void validateTermLifeClickNonVerified() {
        TestUtil.click(termLife," Life Clicked");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        String lifeURL = driver.getCurrentUrl();
        boolean lifeURLText = lifeURL.contains("life-insurance");
        Assert.assertEquals(lifeURLText,true, "Redirected to life page");
    }

    public void validateMFClick() {
        TestUtil.click(mf,"Mutual Fund Clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayMF,"Checking if Mutual Fund Page is Opened");
    }

    public void ValidateLifeInvestmentClick() {
        TestUtil.click(life_investment,"Life_Investment Clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(Get_Quotes_and_BIfor_TermLife,"Checking if Term Life Card is Present");
        TestUtil.IsDisplayed(displayInvestment,"Checking if Investment Card is Present");
        TestUtil.IsDisplayed(displayChildSaving,"Checking if Child Saving Card is Present");
        TestUtil.IsDisplayed(displayRetirement,"Checking if Retirement Card is Present");
        TestUtil.IsDisplayed(displayPosProduct,"Checking if Pos Product card is Present");
    }

    public void ValidateMobileClick() {
        WebCommands.staticSleep(3000);
        TestUtil.click(mobile,"Mobile Clicked");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayTrinng,"Checking if Mobile Page is Opened");
    }
    public void ValidateFireClick() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Fire,"Fire Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(FireQuestionOnFirePage,"FireQuestionOnFirePage displayed");
    }
    public void ValidateFireClickforNonverified() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Fire,"Fire Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(YouAreNotAuthorised,"You are not authorised to sell this product.displayed");
    }
    public void ValidateMarineClick() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Marine,"Marine Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(MarineQuestionOnPage,"MarineQuestionOnFirePage displayed");
    }
    public void ValidateMarineClickforNonverified() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Marine,"Marine Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(YouAreNotAuthorised,"You are not authorised to sell this product.displayed");
    }
    public void ValidateWorkmens_CompensationClick() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Workmens_Compensation,"Workmens_Compensation Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(Workmens_CompensationQuestionOnPage,"Workmens_CompensationQuestionOnPage displayed");
    }
    public void ValidateWorkmens_CompensationClickForNonverified() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Workmens_Compensation,"Workmens_Compensation Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(YouAreNotAuthorised,"You are not authorised to sell this product.displayed");
    }
    public void ValidateCreditCardClick() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Credit_card,"Credit_card Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(Creadit_cardQuestionOnCreditcardPage,"Creadit_cardQuestionOnCreditcardPage displayed");
    }
    public void ValidatePersonalLoanClick() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Personal_loan,"PersonalLoan Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(PersonalLoanAppyNowOnPage,"PersonalLoanQuestionOnPage displayed");
    }
    public void Validate_opd_healthcare_Click() {
        WebCommands.staticSleep(3000);
        TestUtil.click(opd_healthCare,"opd_healthCare Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(opd_healthcareplus_QuestionOnPage,"opd_healthcareplus_QuestionOnPage displayed");
    }
    public void ValidateBusinessLoanClick() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Business_loan,"Business_loan Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(Business_loan_Page_Get_started_CTA,"Business_loan_Page Business_loan_Page_Get_started_CTA displayed");
    }
    public void ValidateBusinessLoanClickForNonverifiedUser() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Business_loan,"Business_loan Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(Business_loan_Page_Get_started_CTA,"Business_loan_Page Business_loan_Page_Get_started_CTA displayed");

    }
    public void ValidateFixedDepositClick() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Fix_deposit,"Business_loan Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(Fix_deposit_Page_Get_started_CTA,"Fix_deposit_Page_Get_started_CTA displayed");
    }
    public void ValidateFixedDepositClickfornonverified() {
        WebCommands.staticSleep(3000);
        TestUtil.click(Fix_deposit,"Business_loan Clicked");
        WebCommands.staticSleep(10000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(YouAreNotAuthorised,"You are not authorised to sell this product.displayed");
    }

    public void unverifiedUserSellPage(){
        try{
            TestUtil.click(mobile,"Mobile Clicked");
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();
        }
        catch(Exception e){
            System.out.println("Since it is a Non-Verified user, Mobile Button will not be Visible");
        }
    }

    public void loan_against_mutual_fund_Click_verified() {
        WebCommands.staticSleep(3000);
        TestUtil.click(loan_against_mutual_fund,"loan_against_mutual_fund Clicked");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(loan_against_mutual_fund_Page_Generate_Link_CTA,"loan_against_mutual_fund_Page_Get_started_CTA displayed");
    }
    public void loan_against_mutual_fund_Click_non_verified() {
        WebCommands.staticSleep(3000);
        TestUtil.click(loan_against_mutual_fund,"loan_against_mutual_fund Clicked");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(YouAreNotAuthorised,"YouAreNotAuthorised displayed");
    }
}