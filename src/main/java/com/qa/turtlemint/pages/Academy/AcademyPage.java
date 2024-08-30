package com.qa.turtlemint.pages.Academy;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademyPage extends TestBase {


    @FindBy(xpath = "//h3[@class='title']")
    WebElement Lead;

    @FindBy(xpath = "//span[text()='Academy']")
    WebElement AcademyChip;

    @FindBy(xpath = "//img[@src='/static/media/TurtlemintAcademyLogo.4aac403b.svg']")
    WebElement AcademyLogo;

    @FindBy(xpath = "//span[text()='Back To Home']")
    WebElement BackToHome;

    public AcademyPage() {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions a = new Actions(driver);

    public void AcademyMethod() {
        WebCommands.staticSleep(2000);
        TestUtil.click(AcademyChip,"Clicked on academy vertical");
        WebCommands.staticSleep(4000);
        AcademyLogo.isDisplayed();
        TestUtil.click(BackToHome,"Clicked on bank to home button");
        WebCommands.staticSleep(2000);
        String GrowUrl = driver.getCurrentUrl();
        GrowUrl.contains("Grow");
        TestUtil.getScreenShot();
    }
}
