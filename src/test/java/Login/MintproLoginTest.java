package Login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

import java.io.IOException;

@Listeners(iTestListener.class)
@Test(groups = {"login","mintpro"})
public class MintproLoginTest extends TestBase {

    LoginPage Loginpage;

    public MintproLoginTest() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
    }

    @Test(enabled = true)
    public void loginTest() throws InterruptedException {
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
    }

    @Test(enabled = true)
    public void invalidLoginTest() throws InterruptedException, IOException {
        Loginpage.InvalidLoginPage(TestUtil.getRandomPhoneNumber(),TestUtil.getRandomOtp());
    }

    @Test(enabled = true)
    public void lockIncorrectOtpTest() throws InterruptedException {
        Loginpage.lockWrongOtp(TestUtil.getRandomPhoneNumber(),TestUtil.getRandomOtp());
    }

    @Test(enabled = true)
    public void resendOtp() throws InterruptedException {
        Loginpage.resendOtp(TestUtil.getRandomPhoneNumber());
    }
    @Test(enabled = true)
    public void enter_without_Otp() {
        Loginpage.enter_without_Otp(TestUtil.getRandomPhoneNumber());
    }
    @Test(enabled = true)
    public void enter_with_less_than_10_digit_number() {
        Loginpage.enter_with_less_than_10_digit_number();
    }
    @Test(enabled = true)
    public void more_than_10_digit_number_not_accepting() {
        Loginpage.more_than_10_digit_number_not_accepting();
    }
    @AfterMethod
    public void Close() {
        driver.quit();
    }


}


