package com.qa.turtlemint.pages.Home;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class HomePageForVerified extends TestBase {
    String url;
    @FindBy(xpath = "//span[text()='POSTER']//parent::div")
    WebElement Posters;

    @FindBy(xpath = "//span[text()='WEBSITE']//parent::div")
    WebElement Website;

    @FindBy(xpath = "//span[text()='LEAD FROMS']//parent::div")
    WebElement LeadForm;

    @FindBy(xpath = "//span[text()='PLANS']//parent::div")
    WebElement Plans;

    @FindBy(xpath = "//span[text()='COURSES']//parent::div")
    WebElement Courses;

    @FindBy(xpath = "//span[text()='FLASH CARDS']//parent::div")
    WebElement FlashCards;

    @FindBy(xpath = "//span[text()='PARTNER CONTENT']//parent::div")
    WebElement PartnerContent;

    @FindBy(xpath = "//span[text()='HEALTH']//parent::div")
    WebElement Health;

    @FindBy(xpath = "//span[text()='BIKE']//parent::div")
    WebElement Bike;

    @FindBy(xpath = "//span[text()='CAR']//parent::div")
    WebElement Car;

    @FindBy(xpath = "//span[text()='COMMERCIAL VEHICLE']//parent::div")
    WebElement CummercialVehical;

    @FindBy(xpath = "//div[text()='What you can do using ']")
    WebElement What_you_can_do_using_text;
    @FindBy(xpath = "//b[text()='Turtlemint PRO']")
    WebElement Turtlemint_PRO_text;
    @FindBy(xpath = "//span[text()='SELL']")
    WebElement sell;

    @FindBy(xpath = "//span[text()='SELL']//parent::div//span[text()='Watch Video']")
    WebElement sell_watch_video;
    @FindBy(xpath = "//span[text()='GROW']")
    WebElement grow;
    @FindBy(xpath = "//span[text()='GROW']//parent::div//span[text()='Watch Video']")
    WebElement grow_watch_video;
    @FindBy(xpath = "//span[text()='LEARN']//parent::div//span[text()='Watch Video']")
    WebElement learn_watch_video;
    @FindBy(xpath = "//span[text()='LEARN']")
    WebElement learn;
    public HomePageForVerified() throws AWTException {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions act = new Actions(driver);
    Robot r = new Robot();

    public void GrowYourBusiness() {
        TestUtil.click(Posters, "Clicked on Posters");
        WebCommands.staticSleep(4000);
        String posterUrl = driver.getCurrentUrl();
        boolean PosterUrlText = posterUrl.contains("Poster");
        Assert.assertEquals(PosterUrlText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(Website, "Clicked on Website");
        WebCommands.staticSleep(4000);
        String websiteUrl = driver.getCurrentUrl();
        boolean websiteUrlText = websiteUrl.contains("my-website");
        Assert.assertEquals(websiteUrlText,true);
        TestUtil.getScreenShot();
        driver.get("https://app.mintpro.in/home");
        WebCommands.staticSleep(2000);

        TestUtil.click(LeadForm, "Clicked on Lead Forms");
        WebCommands.staticSleep(4000);
        String LeadFormUrl = driver.getCurrentUrl();
        boolean LeadFormUrlText = LeadFormUrl.contains("leadGenerationForms");
        Assert.assertEquals(LeadFormUrlText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(Plans, "Clicked on plans");
        WebCommands.staticSleep(4000);
        String PlansUrl = driver.getCurrentUrl();
        boolean PlansUrlText = PlansUrl.contains("plans");
        Assert.assertEquals(PlansUrlText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

    }
    public void LearnWithUs() {
        TestUtil.click(Courses, "Clicked on Courses");
        WebCommands.staticSleep(4000);
        String CoursesUrl = driver.getCurrentUrl();
        boolean CoursesUrlText = CoursesUrl.contains("branches");
        Assert.assertEquals(CoursesUrlText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(FlashCards, "Clicked on Flash Cards");
        WebCommands.staticSleep(4000);
        String FlashCardsUrl = driver.getCurrentUrl();
        boolean FlashCardsUrlText = FlashCardsUrl.contains("content");
        Assert.assertEquals(FlashCardsUrlText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(PartnerContent, "Clicked on Partner Content");
        WebCommands.staticSleep(4000);
        String PartnerContentUrl = driver.getCurrentUrl();
        boolean PartnerContentUrlText = PartnerContentUrl.contains("channels");
        Assert.assertEquals(PartnerContentUrlText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }

    public void SellAndEarn() {
        TestUtil.click(Health, "Clicked on Health");
        WebCommands.staticSleep(4000);
        String HealthUrl = driver.getCurrentUrl();
        boolean HealthText = HealthUrl.contains("health");
        Assert.assertEquals(HealthText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(Bike, "Clicked on Bike");
        WebCommands.staticSleep(4000);
        String BikeUrl = driver.getCurrentUrl();
        boolean BikeUrlText = BikeUrl.contains("two-wheeler-insurance");
        Assert.assertEquals(BikeUrlText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(Car, "Clicked on Car");
        WebCommands.staticSleep(4000);
        String CarUrl = driver.getCurrentUrl();
        boolean CarUrlText = CarUrl.contains("car-insurance");
        Assert.assertEquals(CarUrlText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(CummercialVehical, "Clicked on Cummercial Vehical");
        WebCommands.staticSleep(4000);
        String CummercialVehicalUrl = driver.getCurrentUrl();
        boolean CummercialVehicalUrlText = CummercialVehicalUrl.contains("commercial-vehicle-insurance");
        Assert.assertEquals(CummercialVehicalUrlText,true);
        TestUtil.getScreenShot();
        driver.navigate().back();
        driver.navigate().back();
        WebCommands.staticSleep(2000);
    }
    public void What_you_can_do_using_Turtlemint_PRO() {
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(What_you_can_do_using_text, "What_you_can_do_using_text displayed");
        TestUtil.IsDisplayed(Turtlemint_PRO_text, "Turtlemint_PRO_text displayed");
        TestUtil.IsDisplayed(sell, "sell banner displayed");
        TestUtil.IsDisplayed(grow, "grow banner displayed");
        TestUtil.IsDisplayed(learn, "learn banner displayed");
        WebCommands.staticSleep(2000);
        act.moveToElement(sell_watch_video).build().perform();
        System.out.println("clicked on sell_watch_video");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
        WebCommands.staticSleep(2000);
        act.moveToElement(grow_watch_video).build().perform();
        System.out.println("clicked on grow_watch_video");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
        WebCommands.staticSleep(2000);
        act.moveToElement(learn_watch_video).build().perform();
        System.out.println("clicked on learn_watch_video");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);

    }

}
