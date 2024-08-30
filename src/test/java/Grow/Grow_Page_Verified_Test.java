package Grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.grow.GrowPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"grow","mintpro"})
public class Grow_Page_Verified_Test extends TestBase {
    LoginPage Loginpage;
    GrowPage Growpage;

    public Grow_Page_Verified_Test() {super();}

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();

        Loginpage = new LoginPage();
        Growpage = new GrowPage();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        Growpage.grow_page();
    }

    @BeforeMethod
    public void less(){
        TestUtil.LoginLess();
        Growpage.grow_page();

    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void growPagquickLinksTest(){Growpage.quickLinks();}


    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Recommended_Posters() {
        Growpage.Recommended_Posters();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void share_your_personal_website_Verified(){Growpage.share_your_personal_website_Verified();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void growPageallSeemoreTest(){Growpage.allSeemore();}

    @AfterClass
    public void Close() {
       driver.quit();
    }

}
