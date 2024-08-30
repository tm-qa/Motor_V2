package Ninja_Mis_flow_test;
import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.ninja_mis_flow.ninja_mis_flow_page;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.pages.sell.SellPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"mis_mintpro_flow","mintpro"})
public class ninja_mis_flow_test extends TestBase {
    public ninja_mis_flow_test() {
        super();
    }

    GrowPageSellButton sellButton;
    LoginPage loginpage;
    SellPage sell;
    ninja_mis_flow_page ninja;

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        sellButton = new GrowPageSellButton();
        sell = new SellPage();
        ninja = new ninja_mis_flow_page();
        loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        WebCommands.staticSleep(2000);
        sellButton.ValidateSellButton();


    }

    @BeforeMethod()
    public void less() {
        TestUtil.LoginLess();
        WebCommands.staticSleep(3000);
        sellButton.ValidateSellButton();
        WebCommands.staticSleep(2000);

    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void policyThroughNinja() throws Exception {
        ninja.CompToCompFlowWithExpiringInFewDay();
        ninja.issuedPolicyThroughNinja();
        ninja.Mintprofinalflow();

    }



    @AfterClass
    public void Close() {
        driver.quit();
    }
}





