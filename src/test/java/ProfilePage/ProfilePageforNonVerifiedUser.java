package ProfilePage;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.profile.ProfilePage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"profile","mintpro"})
public class ProfilePageforNonVerifiedUser extends TestBase {

    LoginPage Loginpage;
    ProfilePage profile;


    public ProfilePageforNonVerifiedUser() {
        super();
    }

    @BeforeClass()
    public void start() {
        initialization();
        Loginpage = new LoginPage();
        profile = new ProfilePage();

        Loginpage.ValidateLogin("6888812345", "1234");

    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
        profile.setProfileButtonNonverified();
    }

    @Test
    public void relatonshipManagerforNonverified(){
        profile.relatonshipManagerforNonverified();
    }

 //   @Test(retryAnalyzer = RetryAnalyser.class)
//    public void myAccountDetails(){
//        profile.myAcc();
//        profile.uploadDeleteFile();
//        profile.setHelpCenterForNonVerified();
//    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void posp_certification_forNonverified() {profile.posp_certification_forNonverified();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void editBrandforNonVerified() {profile.editPersonalBrandforNonVerifiedUser();}

    @AfterClass
    public void Close() {
        driver.quit();
    }
}

