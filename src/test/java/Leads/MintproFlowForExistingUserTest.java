package Leads;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Leads.Leads;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"leads","mintpro"})
public class MintproFlowForExistingUserTest extends TestBase {

    public LoginPage Loginpage;
    GrowPageSellButton growPage;
    Leads lead;

    public MintproFlowForExistingUserTest() {
        super();
    }

    @BeforeClass()
    public void start() {
        initialization();
        Loginpage = new LoginPage();
        growPage = new GrowPageSellButton();
        lead = new Leads();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        WebCommands.staticSleep(2000);
    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
    }

    @Test(description = "Lead redirection from dashboard",retryAnalyzer = RetryAnalyser.class)
    public void VerifyLeadRedirection() {
        lead.VerifyLeadsChips();
        lead.VerifyLeadOnDashboard();
        lead.VerticalRedirection();
    }

//    @Test(description = "Mark Lead Won" ,retryAnalyzer = RetryAnalyser.class)
//    public void MarkLeadWon() {lead.MarkLeadWon();}
//
//    @Test(description = "Mark Lead Lost",retryAnalyzer = RetryAnalyser.class)
//    public void MarkLeadLost()
//    {
//        lead.MarkLeadLost();
//    }

    @Test(description = "Delete Lead",retryAnalyzer = RetryAnalyser.class)
    public void DeleteLead()
    {
        lead.DeleteLead();
    }

    @Test(description = "Help and support should display for all leads except TW lead",retryAnalyzer = RetryAnalyser.class)
    public void VerifyHelpAndSupportOption() { lead.HelpSection(); }

    @Test(description = "Help and support option from dashboard",retryAnalyzer = RetryAnalyser.class)
    public void HelpOptionDashboard()
    {
        lead.HelpSectionOnDashboard();
    }

    @Test(description = "Add reminder", retryAnalyzer = RetryAnalyser.class)
    public void AddReminder() throws InterruptedException {lead.AddReminder();}

    @Test(description = "Check unread lead and take screenshot",retryAnalyzer = RetryAnalyser.class)
    public void UnreadLeads()
    {
        lead.UnreadLead();
    }

    @Test(description = "Check Redirection from Explore more option" ,retryAnalyzer = RetryAnalyser.class)
    public void ExploreMoreOptions() {lead.ExploreMoreOption();}


    @Test(description = "Check show all chip Contains All leads in Customer Generated Leads,Unreds,Remainders,Closed",retryAnalyzer = RetryAnalyser.class)
    public void LeadsAllChipsValidation() {lead.CustomerGeneratedAndShowAllValidation();}

    @AfterClass()
    public void Close()
    {
        driver.quit();
    }
}
