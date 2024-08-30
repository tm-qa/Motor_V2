package NegativeTest;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.negative_testcases.negative_testcases;
import com.qa.turtlemint.pages.profile.ProfilePage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"Negative","mintpro"})
public class NegativeTestCasesTest extends TestBase {
    LoginPage loginpage;
    ProfilePage profile;
    negative_testcases negative_TC;

    public NegativeTestCasesTest() {
        super();
    }


    @BeforeClass()
    public void start()  {
        initialization();
        loginpage = new LoginPage();
        profile = new ProfilePage();
        negative_TC = new negative_testcases();

        loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        WebCommands.staticSleep(2000);

    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
        WebCommands.staticSleep(2000);
        profile.setProfileButton();
    }


    @Test(retryAnalyzer = RetryAnalyser.class)
    public void personal_brand() {
        negative_TC.edit_personal_brand();
    }

//    @Test(retryAnalyzer = RetryAnalyser.class)
//    public void remainder_max3_allowed() {
//        negative_TC.AddReminder();
//    }
// commenting this test case since max remainder text will not shown to user

    @AfterClass
    public void Close() {
        driver.quit();
    }

}

