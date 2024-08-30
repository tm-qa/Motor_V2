package Academy;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Academy.AcademyPage;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"business", "mintpro"})
public class Academy extends TestBase {

    LoginPage loginpage;
    AcademyPage Academy;

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        Academy = new AcademyPage();
        loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        WebCommands.staticSleep(2000);
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void AcademyTest(){
        Academy.AcademyMethod();
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }

}
