package ProfilePage;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.profile.ProfilePage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"profile", "mintpro"})
public class ProfilePageforVerifiedUser extends TestBase {

    LoginPage Loginpage;
    ProfilePage profile;


    public ProfilePageforVerifiedUser() {
        super();
    }

    @BeforeClass()
    public void start() {
        initialization();
        Loginpage = new LoginPage();
        profile = new ProfilePage();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));

    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
        profile.setProfileButton();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void relatonshipManager() {profile.relatonshipManager();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void KYCverification() {profile.KYCverification();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void BankDetail() {profile.BankDetail();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void Mintpay() {profile.Mintpay();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void posp_certification_Button_for_verified() {profile.posp_certification_for_verified();}
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void zzlogOut() {profile.LogOut();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void editBrand() {profile.editPersonalBrand();}

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void ManageMyWebsite() {profile.ManageMyWebsite();}

    @AfterClass
    public void Close() {
        driver.quit();
    }
}
