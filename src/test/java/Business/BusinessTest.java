package Business;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.business.Business_Page;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"business","mintpro"})
public class BusinessTest extends TestBase {

    LoginPage loginpage;
    Business_Page insuranceSales;

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        insuranceSales = new Business_Page();
        loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        WebCommands.staticSleep(2000);
    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
    }


    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Business_ActivityPointFlow() throws InterruptedException{
        insuranceSales.ActivityPointFlow();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Business_InsuranceFlow() throws InterruptedException{
        insuranceSales.InsurnaceSalesFlow();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Business_MutualFundFlow() throws InterruptedException{
        insuranceSales.MutualFundSalesFlow();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Business_PerformanceReportFlow() throws InterruptedException{
        insuranceSales.PerformanceReport();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Business_RenewalBusinessFlow() throws InterruptedException{
        insuranceSales.RenewalBusiness();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Business_claimsFlow() throws InterruptedException{
        insuranceSales.claims();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ReportASale() throws InterruptedException{
        insuranceSales.ReportA_Sale();
    }
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void mutual_fund() throws InterruptedException{
        insuranceSales.Mutual_Fund_sales();
    }
    @AfterClass
    public void Close() {
        driver.quit();
    }

}