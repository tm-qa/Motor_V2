package SellPage;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.pages.sell.SellPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"sell_Verified", "mintpro","sell"})
public class SellPageTestforVerifiedUser extends TestBase {

    LoginPage Loginpage;
    SellPage sell;
    GrowPageSellButton sellButton;


    public SellPageTestforVerifiedUser() {
        super();
    }

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        sellButton = new GrowPageSellButton();
        sell = new SellPage();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        sellButton.ValidateSellButton();
    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
        sellButton.ValidateSellButton();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void validateFWMotorTest() throws InterruptedException {
        sell.validateFWMotorClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void validateTWMotorTest() throws InterruptedException {
        sell.validateTWMotorClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void validateCVMotorTest() throws InterruptedException {
        sell.validateCVMotorClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void validateHealthTest() throws InterruptedException {
        sell.validateHealthClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void validatePersonalAccidentTest() throws InterruptedException {
        sell.validatePersonalAccidentClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void validateTermLifeTest() throws InterruptedException {
        sell.validateTermLifeClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void validateMFTest() throws InterruptedException {
        sell.validateMFClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ValidateFireClick() throws InterruptedException {
        sell.ValidateFireClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ValidateMarineClick() throws InterruptedException {
        sell.ValidateMarineClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ValidateWorkmens_CompensationClick() throws InterruptedException {
        sell.ValidateWorkmens_CompensationClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ValidateCreditCardClick() throws InterruptedException {
        sell.ValidateCreditCardClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ValidatePersonalLoanClick() throws InterruptedException {
        sell.ValidatePersonalLoanClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Validate_opd_healthcare_Click() throws InterruptedException {
        sell.Validate_opd_healthcare_Click();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ValidateBusinessLoanClick() throws InterruptedException {
        sell.ValidateBusinessLoanClick();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ValidatefixeddepositForverifiedUser() throws InterruptedException {
        sell.ValidateFixedDepositClick();
    }

    //   @Test(retryAnalyzer = RetryAnalyser.class) //since mintpro has removed this in recent changes hence commenting this
    //   public void ValidateLifeInvestmentTest() throws InterruptedException {sell.ValidateLifeInvestmentClick();}

//    @Test(retryAnalyzer = RetryAnalyser.class)
//    public void ValidateMobileTest() throws InterruptedException {
//        sell.ValidateMobileClick();
//    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void validate_loan_against_mf_Test() throws InterruptedException {
        sell.loan_against_mutual_fund_Click_verified();
    }
    @AfterClass
    public void Close() {
        driver.quit();
    }
}
