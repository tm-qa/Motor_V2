package UniversalSearchPageTest;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.grow.GrowPage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.pages.sell.SellPage;
import com.qa.turtlemint.pages.universal_search.universalSearchPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"universalSearch", "mintpro"})
public class UniversalSearchPageTest extends TestBase {

    LoginPage Loginpage;
    SellPage sell;
    GrowPageSellButton sellButton;
    universalSearchPage usp;
    GrowPage Growpage;

    public UniversalSearchPageTest() {
        super();
    }

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        Growpage = new GrowPage();
        sellButton = new GrowPageSellButton();
        sell = new SellPage();
        usp = new universalSearchPage();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        WebCommands.staticSleep(3000);

    }

    @BeforeMethod
    public void less() {
        TestUtil.LoginLess();
        WebCommands.staticSleep(8000);
        Growpage.grow_page();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void testUniversalSearchOnAllPages() {
        usp.navigatingDifferentPagesOfMintpro();
    }


    @Test(retryAnalyzer = RetryAnalyser.class)
    public void checkIfSearchedLeadIsPresent() {
        usp.checkMyLeadsPresent();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void checkTrySomethingNew() {
        usp.checkTrySomethingNewMessage();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void queryUniversalSearch() {
        usp.queryPageChips();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void PopularandrecentSearch() {
        usp.recentAndPopularSearch();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void FeatureSearches() {
        usp.suggestedFeatures();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void testUniversalSearch() {
        usp.autoCompleteSearch();
    }

    @Test//(retryAnalyzer = RetryAnalyser.class)
    public void checkIfAllTabsAreDisplayed() {
        usp.autoCompleteSearch();
        usp.allTabsDisplayed();
    }

    @AfterClass
    public void end() {
        driver.quit();
    }
}