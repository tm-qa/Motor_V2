package com.qa.turtlemint.pages.universal_search;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.qa.turtlemint.util.TestUtil.getScreenShot;

public class universalSearchPage extends TestBase{

    @FindBy(xpath = "//div[@class='input_wrapper']")
    WebElement SearchBar;

    @FindBy(xpath = "//input[@id='search']")
    WebElement SearchInput;

    @FindBy(xpath = "//input[@id='search']//parent::div//parent::div//a")
    WebElement insuranceText;

    @FindBy(xpath = "//span[contains(text(),'Leads')]")
    WebElement LeadPage;

  //  @FindBy(xpath = "//span[@class='profile']") //non verified
    @FindBy(xpath = "//img[@class='profile_img']")
    WebElement ProfilePage;

    @FindBy(xpath = "//span[normalize-space()='Business']")
    WebElement BusinessPage;

    @FindBy(xpath = "//span[contains(text(),'Insurance Sales')]")
    WebElement InsuranceSalesPage;

    @FindBy(xpath = "//span[contains(text(),'Activity Points')]")
    WebElement ActivityPointsPage;

    @FindBy(xpath = "//span[normalize-space()='Renewals']")
    WebElement RenewalsPage;

    @FindBy(xpath = "//span[contains(text(),'Grow')]")
    WebElement GrowPage;

    @FindBy(xpath = "//span[text()='All']")
    WebElement AllTab;

    @FindBy(xpath = "//span[text()='My Contents']")
    WebElement MyContentTab;

    @FindBy(xpath = "//span[text()='My Policies']")
    WebElement MyPolicyTab;

    @FindBy(xpath = "//span[text()='My Leads']")
    WebElement MyLeadsTab;

    @FindBy(xpath = "//div[text()='The Difference Between Term Insurance and Life Insurance']")
    WebElement Article;

    @FindBy(xpath = "//div[@class='leadName']")
    WebElement MyLeadsPresent;

    @FindBy(xpath = "//span[text()='Try something new']")
    WebElement TrySomethingNew;

    @FindBy(xpath = "//span[text()='Posters']")
    WebElement PosterChip;

    @FindBy(xpath = "//span[text()='Videos']")
    WebElement VideosChip;

    @FindBy(xpath = "//span[text()='Articles']")
    WebElement ArticlesChip;

    @FindBy(xpath = "//span[text()='Lead Forms']")
    WebElement LeadFormsChip;

    @FindBy(xpath = "//span[text()='Brochures']")
    WebElement BrochuresChip;

    @FindBy(xpath = "//div[@class='contentInfo']")
    WebElement Content;

    @FindBy(xpath = "//span[contains(text(),'Download & Share')]")
    WebElement DownloadandShare;

    @FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
    WebElement YTContent;

    @FindBy(xpath = "//span[text()='WhatsApp']")
    WebElement Whatsapp;

    @FindBy(xpath = "//a[@class='plansHeading']")
    WebElement BrochurePlans;

    @FindBy(xpath = "//span[text()='Recent searches']//parent::div//div[@class='result']/a")
    WebElement RecentSearch;

    @FindBy(xpath = "//span[text()='Popular searches']//parent::div//div[@class='result']/a")
    WebElement PopularSearch;

    @FindBy(xpath = "//span[text()='Posters']")
    WebElement Posters;

    @FindBy(xpath = "//span[text()='Courses']")
    WebElement courses;
    @FindBy(xpath = "(//div[text()='Course'])[1]")
    WebElement course;
    @FindBy(xpath = "//span[text()='Videos']")
    WebElement Videos;
    @FindBy(xpath = "(//div[text()='Video'])[1]")
    WebElement Video;
    @FindBy(xpath = "//span[text()='Articles']")
    WebElement Articles;
    @FindBy(xpath = "(//div[text()='Article'])[1]")
    WebElement firstArticle;
    @FindBy(xpath = "//span[text()='Lead Forms']")
    WebElement Lead_forms;
    @FindBy(xpath = "(//div[text()='Lead form'])[1]")
    WebElement Lead_form;
    @FindBy(xpath = "//span[text()='Brochures']")
    WebElement Brochures;
    @FindBy(xpath = "(//div[text()='Brochure'])[1]")
    WebElement Brochure;

    @FindBy(xpath = "//span[text()='Flashcard']")
    WebElement Flashcard;
    @FindBy(xpath = "(//div[text()='Flashcard'])[1]")
    WebElement first_Flashcard;
    @FindBy(xpath = "//span[text()='Partner Website']")
    WebElement PartnerWebsite;

    @FindBy(xpath = "(//div[text()='Poster'])[1]")
    WebElement Poster;

    @FindBy(xpath = "//img[@alt='logo']")
    WebElement MintacademyLogo;


    public universalSearchPage() {
        PageFactory.initElements(driver, this);
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void ValidateSearchBar() {
        TestUtil.IsDisplayed(SearchBar,"Search Bar is Displayed");
    }

    public void navigatingDifferentPagesOfMintpro(){
        TestUtil.click(LeadPage,"Lead Page Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        ValidateSearchBar();
        WebCommands.staticSleep(2000);
        TestUtil.click(ProfilePage,"Profile Page Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        ValidateSearchBar();
        TestUtil.click(BusinessPage,"Business Page Dropdown");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(InsuranceSalesPage,"Insurance Sales Page Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        ValidateSearchBar();
        TestUtil.click(BusinessPage,"Business Page Dropdown");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(ActivityPointsPage,"Insurance Sales Page Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        ValidateSearchBar();
        TestUtil.click(GrowPage,"Back to Grow Page");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
       // TestUtil.click(RenewalsPage,"Insurance Sales Page Clicked");
       // TestUtil.getScreenShot();
        ValidateSearchBar();
    }

    public void autoCompleteSearch() {
        TestUtil.click(SearchBar,"");
        TestUtil.sendKeys(SearchInput,"The Difference Between Term Insurance and Life Insurance","Insurance word typed and checking auto population");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(insuranceText,"The list is successfully auto-populated");
        LogUtils.info(insuranceText.getText());
        TestUtil.getScreenShot();
    }

    public void allTabsDisplayed(){
      //  autoCompleteSearch();

        TestUtil.click(insuranceText,"");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(AllTab,"All tab is successfully displayed");
        TestUtil.IsDisplayed(MyContentTab, "My contents tab is successfully displayed");
        TestUtil.IsDisplayed(MyPolicyTab, "My policies tab is successfully displayed");
        TestUtil.IsDisplayed(MyLeadsTab, "My Leads tab is successfully displayed");
        TestUtil.IsDisplayed(Article,"Searched Element found");
    }

    public void checkMyLeadsPresent() {
        TestUtil.click(SearchBar,"");
        TestUtil.sendKeys(SearchInput,"test","Insurance word typed and checking auto population");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
        SearchInput.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", MyLeadsPresent);

        TestUtil.IsDisplayed(MyLeadsPresent,"Test Name is Displayed");
    }

    public void checkTrySomethingNewMessage() {
        TestUtil.click(SearchBar,"");
        TestUtil.sendKeys(SearchInput,"h3h47rhd","Insurance word typed and checking auto population");
        TestUtil.getScreenShot();
        SearchInput.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(TrySomethingNew,"Try something new displayed");
    }

    public void queryPageChips(){
        String parent = driver.getWindowHandle();
        TestUtil.click(SearchBar,"");
        TestUtil.click(PosterChip,"Poster chip clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(Content,"First Article Clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(DownloadandShare,"Download and share button Displayed");
        WebCommands.staticSleep(2000);
        TestUtil.click(SearchBar,"");
        TestUtil.click(LeadFormsChip,"Poster chip clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(Content,"First Article Clicked");
        WebCommands.staticSleep(2000);
        driver.switchTo().window(parent);
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Whatsapp,"Whatsapp button Displayed");
        WebCommands.staticSleep(2000);
        TestUtil.click(SearchBar,"");
        TestUtil.click(BrochuresChip,"Poster chip clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(Content,"First Article Clicked");
        WebCommands.staticSleep(2000);
        driver.switchTo().window(parent);
        WebCommands.staticSleep(3000);
 //      TestUtil.IsDisplayed(BrochurePlans,"Download and share button Displayed");
 //       WebCommands.staticSleep(2000);
//
        TestUtil.click(SearchBar,"");
        TestUtil.click(ArticlesChip,"Articles chip clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(Content,"First Article Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
  //
        TestUtil.click(SearchBar,"");
        TestUtil.click(VideosChip,"video chip clicked");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(Content,"First Article Clicked");
        WebCommands.staticSleep(2000);
        WebElement required_frame = driver.findElement(By.xpath("//iframe[contains(@src,'https://www.youtube.com')]"));
        driver.switchTo().frame(required_frame);
        WebCommands.staticSleep(2000);
        WebElement element = driver.findElement(By.xpath("//button[@aria-label='Play']"));
        element.click();
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();

//        Actions action = new Actions(driver);
//        action.moveByOffset(0, 0).click().build().perform();
//
//
//        WebCommands.staticSleep(8000);
//
//        TestUtil.getScreenShot();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", SearchBar);
    //    SearchBar.click();
//        TestUtil.click(SearchBar,"");
//        TestUtil.click(ArticlesChip,"Articles chip clicked");
//        WebCommands.staticSleep(1000);
//        TestUtil.getScreenShot();
//        TestUtil.click(Content,"First Article Clicked");
//        WebCommands.staticSleep(2000);

    }

    public void recentAndPopularSearch() {
        TestUtil.click(SearchBar,"Clicked on Search Bar");
        TestUtil.click(RecentSearch,"Recent Search Clicked");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
        js.executeScript("arguments[0].click();", SearchBar);
    //    TestUtil.click(SearchBar,"Clicked on Search Bar");
        WebCommands.staticSleep(2000);
        PopularSearch.click();
        WebCommands.staticSleep(4000);
        getScreenShot();
    }

    public void suggestedFeatures() {
        TestUtil.click(SearchBar,"");
        TestUtil.click(Posters,"Share Poster Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(Poster,"clicked on 1st poster from search result");
        getScreenShot();
        TestUtil.click(SearchBar,"");
        TestUtil.click(courses,"courses Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(course,"displayed 1st course from search result");
        getScreenShot();

        TestUtil.click(SearchBar,"");
        TestUtil.click(Videos,"Videos Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Video,"Videos displayed");
        getScreenShot();

        TestUtil.click(SearchBar,"");
        TestUtil.click(Articles,"Articles Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(firstArticle,"1st Article displayed");
        getScreenShot();


        TestUtil.click(SearchBar,"");
        TestUtil.click(Brochures,"Brochures Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Brochure," Brochures displayed");
        getScreenShot();

        TestUtil.click(SearchBar,"");
        TestUtil.click(Flashcard,"Brochures Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(first_Flashcard,"1st first_Flashcard displayed");
        getScreenShot();

        TestUtil.click(SearchBar,"");
        TestUtil.click(Lead_forms,"lead forms Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Lead_form,"1st lead form Clicked");
        getScreenShot();
    }
}
