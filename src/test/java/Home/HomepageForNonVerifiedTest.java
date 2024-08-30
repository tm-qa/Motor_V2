package Home;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Home.HomePageForNonVerified;
import com.qa.turtlemint.pages.Home.HomePageForVerified;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

import java.awt.*;

@Listeners(iTestListener.class)
    @Test(groups = {"business","mintpro"})
    public class HomepageForNonVerifiedTest extends TestBase {

        LoginPage loginpage;
        HomePageForVerified Hpverified;

        HomePageForNonVerified HPnonVerified;

    @BeforeClass()
    public void start() throws InterruptedException, AWTException {
        initialization();
        loginpage = new LoginPage();
        Hpverified = new HomePageForVerified();
        HPnonVerified = new HomePageForNonVerified();
        loginpage.ValidateLogin("6888812345", "1234");
        WebCommands.staticSleep(2000);
    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
    }


        @Test(retryAnalyzer = RetryAnalyser.class)
        public void BusinessUpdatTest() throws InterruptedException{
            HPnonVerified.GrowYourBusiness();
        }
        @Test(retryAnalyzer = RetryAnalyser.class)
        public void LearnWithUsTest() throws InterruptedException{
            HPnonVerified.LearnWithUs();
        }
        @Test(retryAnalyzer = RetryAnalyser.class)
        public void SellAndEarnTest() throws InterruptedException{
            HPnonVerified.SellAndEarn();
        }
        @Test(retryAnalyzer = RetryAnalyser.class)
        public void What_you_can_do_using_Turtlemint_PRO_Test() throws InterruptedException{
            Hpverified.What_you_can_do_using_Turtlemint_PRO();
        }
        @AfterClass
        public void Close() {
            driver.quit();
        }

    }
