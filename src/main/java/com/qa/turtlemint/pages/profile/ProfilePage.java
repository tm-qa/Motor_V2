package com.qa.turtlemint.pages.profile;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class ProfilePage extends TestBase {

    @FindBy(xpath = "//img[@class='profile_img']")
    WebElement profileButton;
    @FindBy(xpath = "//span[@class='profile']")
    WebElement profileButtonNonverified;
    @FindBy(xpath = "//span[text()='Call Relationship Manager']")
    WebElement relatonshipManager;

    @FindBy(xpath = "//span[text()='Contact Number']")
    WebElement ContactNumber;

    @FindBy(xpath = "//span[@class='closeIcon']")
    WebElement ClosePOPup;

    @FindBy(xpath = "//div[@role='presentation']")
    WebElement NoRelatonshipManager;

    @FindBy(xpath = "//*[text()='My Account']")
    WebElement myAcc;

    @FindBy(xpath = " //*[@class='removeButton']")
    WebElement removeutton;

    @FindBy(xpath = "//*[text()='Aadhaar Details']")
    WebElement adharUpload;

    @FindBy(xpath = "//*[text()='Bank Details']")
    WebElement bankDetails;

    @FindBy(xpath = "//*[text()='Discard']")
    WebElement discard;

    @FindBy(xpath = "//*[text()='Education Details']")
    WebElement EducationalDetails;

    @FindBy(xpath = "//*[text()='Personal Details']")
    WebElement personalDetails;

    @FindBy(xpath = "//*[text()='Need Help? Chat with us.']")
    WebElement helpCenter;

    @FindBy(xpath = "//*[@id=\"adhaarCardBackNumberFile\"]")
    WebElement UploadFile2;

    @FindBy(xpath = "//div[text()='Help Center']")
    WebElement helpCenterText;

    @FindBy(xpath = "//*[text()='Verified']")
    WebElement verified;

    @FindBy(xpath = "//h5[text()='POSP Certification ']")
    WebElement posp_certification;
    @FindBy(xpath = "//span[text()='POSP training and certification']")
    WebElement POSP_training_and_certification;

    @FindBy(xpath = "//a[text()='pospsupport@turtlemint.com']")
    WebElement POSP_verification_text;
    @FindBy(xpath = "//span[text()='Complete the training to become eligible for selling general insurance products (non life) such as motor, health, fire, etc.']")
    WebElement POSP_verification_GI_text_for_verified;
    @FindBy(xpath = "//span[text()='Complete the training to become eligible for selling life insurance products.']")
    WebElement POSP_verificationLI_text_for_verified;
    @FindBy(xpath = "//span[text()='POSP-GI Certification & Exam']")
    WebElement GI_text_for_verified;
    @FindBy(xpath = "//span[text()='POSP-LI Certification & Exam']")
    WebElement LI_text_for_verified;

    @FindBy(xpath = "//div[text()='Download Certificate']")
    WebElement DOWNLOAD;

    @FindBy(xpath = "//div[@class='explorMintAccdemy']")
    WebElement explorMintAccdemy;

    @FindBy(xpath = "//h2[text()='Certificates']")
    WebElement Certificates;

    @FindBy(xpath = "//h4[text()='Get Certified for Free']")
    WebElement getCertifiedforFree;

    @FindBy(xpath = "//h5[text()='Settings']")
    WebElement Settings;

    @FindBy(xpath = "//span[text()='Log Out']")
    WebElement LogOut;

    @FindBy(xpath = "//span[text()='Create an account/ Sign in']")
    WebElement CreateAccount;

    @FindBy(xpath = "//h5[text()='Edit Personal Brand']")
    WebElement editBrand;

    @FindBy(id = "fname")
    WebElement fname;

    @FindBy(id = "mobile")
    WebElement mobile;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(xpath = "//span[text()='Apply Everywhere & Go Back']")
    WebElement Apply;

    @FindBy(xpath = "(//span[text()='Logout'])[2]")
    WebElement finalLogOut;

    @FindBy(xpath = "//h5[text()='KYC Verification']")
    WebElement KYCverificationCTA;

    @FindBy(xpath = "//div[text()='SUCCESSFULLY VERIFIED']")
    WebElement SUCCESSFULLYVERIFIED;

    @FindBy(xpath = "//h5[text()='Bank Details']")
    WebElement BankDetailsCTA;

    @FindBy(xpath = "//div[@class='button_right  ']")
    WebElement SaverAndProceedCTA;

    @FindBy(xpath = "//div[@class='button_left']")
    WebElement GoBackProfileCTA;

    @FindBy(xpath = "//h5[text()='Mintpay']")
    WebElement MintPayCTA;

    @FindBy(xpath = "//span[text()='Manage My Website']")
    WebElement ManageMyWebsite;

    @FindBy(xpath = "//span[text()='Create Website']")
    WebElement CreateWebsite;

    @FindBy(xpath = "//span[text()='Complete your KYC']")
    WebElement CompleteYourKYC;

    @FindBy(xpath = "//section[@class='verifiedButton']")
    WebElement GetVerified;

    @FindBy(xpath = "//span[text()='Upload Front ']")
    WebElement AdharFrontUpload;

    @FindBy(xpath = "//span[text()='Upload Back ']")
    WebElement AdharBackUpload;

    @FindBy(xpath = "//span[text()='Ok']")
    WebElement OkButton;
    @FindBy(name = "mobileNumber")
    WebElement MobileNumber;

    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public void setProfileButton() {
        TestUtil.click(profileButton, "click on profile button");
    }
    public void setProfileButtonNonverified() {
        TestUtil.click(profileButtonNonverified, "click on profile button");
    }
    public void relatonshipManager() {
        TestUtil.click(relatonshipManager, "Relationship manager clicked");
        TestUtil.IsDisplayed(ContactNumber, "Checking if contact number is present");
        TestUtil.getScreenShot();
    }

    public void ManageMyWebsite() {
        TestUtil.click(ManageMyWebsite, "Manage My Website clicked");

        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }

    public void CreateWebsiteTabForNonVerified() {
        TestUtil.click(CreateWebsite, "Create My Website clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        CompleteYourKYC.isDisplayed();
        TestUtil.click(GetVerified, "Get verified button clicked");
        TestUtil.getScreenShot();
    }

    public void relatonshipManagerforNonverified() {

        TestUtil.IsDisplayed(NoRelatonshipManager, "Checking if Health Insurance Card is Present"); //No Relationship Manager Assigned

    }

    public void myAcc(){

        WebCommands.staticSleep(2000);
        TestUtil.click(myAcc, "click on my acc");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(AdharFrontUpload, "KYC verification CTA clicked");
        TestUtil.click(AdharBackUpload, "KYC verification CTA clicked");
    }

    public void uploadDeleteFile(){
        WebCommands.staticSleep(3000);
        TestUtil.uploadFile("ubuntu");
        WebCommands.staticSleep(9000);
        TestUtil.click(removeutton , "remove uploaded file");
        TestUtil.click(adharUpload, "adhar");
        TestUtil.click(discard , "delete file");
        TestUtil.uploadFile( "ubuntu");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.uploadFile( "ubuntu");
       // UploadFile2.sendKeys("/Users/hemant/Downloads/dog.png");
        WebCommands.staticSleep(9000);
        TestUtil.getScreenShot();
        TestUtil.click(removeutton , "remove uploaded file");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(bankDetails, "adhar");
        TestUtil.click(discard , "delete file");
        TestUtil.uploadFile("ubuntu");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(9000);
        TestUtil.click(removeutton , "remove uploaded file");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(EducationalDetails , "click on Educational Details");
        TestUtil.click(discard , "delete file");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.uploadFile( "ubuntu");
        WebCommands.staticSleep(9000);
        TestUtil.click(removeutton , "remove uploaded file");
        TestUtil.click(personalDetails, "click on personal Details");
        TestUtil.click(discard , "delete file");
        TestUtil.uploadFile("ubuntu");
        WebCommands.staticSleep(9000);
        TestUtil.click(removeutton , "remove uploaded file");
    }

    public void setHelpCenter(){
        TestUtil.click(helpCenter,"click on help center");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(helpCenterText , "help Center is displayed");
    }

    public void setHelpCenterForNonVerified(){
        TestUtil.click(helpCenter,"click on help center");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(helpCenterText , "help Center is displayed");
    }

    public void myAccDetails(){
        TestUtil.IsDisplayed(verified , "Pan details verified");
        TestUtil.click(adharUpload, "Click on Adhar");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(verified , "adhar details verified");
        TestUtil.click(bankDetails, "click on bank ");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(verified , "bank details verified");
        TestUtil.click(EducationalDetails , "click on educational details ");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(verified , "eduactional details verified");
        TestUtil.click(personalDetails, "personal details ");
        TestUtil.IsDisplayed(verified , "personal details verified");
    }

    public void KYCverification() {
        TestUtil.click(KYCverificationCTA, "KYC verification CTA clicked");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(SUCCESSFULLYVERIFIED, "SUCCESSFULLY VERIFIED displayed");
    }

    public void KYCverificationForNonVerified() {
        TestUtil.click(KYCverificationCTA, "KYC verification CTA clicked");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
    }

    public void BankDetail() {
        TestUtil.click(BankDetailsCTA, "Bank Details Button clicked");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(1000);

        try {
            TestUtil.click(SaverAndProceedCTA, "Save And Proceed Button clicked");
            System.out.println("Element is clickable");
        }
        catch(Exception e) {
            System.out.println("Save And Proceed Button isn't clickable");
        }
     //   Assert.assertEquals(SaverAndProceedCTA.isEnabled(),SaverAndProceed,"Saver And Proceed is not clickable");
        TestUtil.click(GoBackProfileCTA, "Go Back Profile CTA clicked");
        WebCommands.staticSleep(4000);

    }

    public void Mintpay() {
        TestUtil.click(MintPayCTA, "Mintpay Button clicked");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        boolean MintPayURL = driver.getCurrentUrl().contains("mintpay");
        Assert.assertEquals(MintPayURL,true,"Redirected to mintpay");
        WebCommands.staticSleep(2000);
//        TestUtil.click(BackToHomeCTA, "Back to Home CTA clicked");
//        TestUtil.click(OkButton, "Ok button clicked");
    }

//    public void training() {
//        TestUtil.click(trainButton, "Training Button clicked");
//        WebCommands.staticSleep(4000);
//        TestUtil.IsDisplayed(certificates, "verified user landed on MA certificates page");
//        TestUtil.getScreenShot();
//        driver.navigate().back();
//    }
    // removing this sonce it will fails for automation no and will show same as non verified

    public void posp_certification_forNonverified() {
        TestUtil.IsDisplayed(POSP_training_and_certification, "POSP_training_and_certification sub title displayed");
        TestUtil.click(posp_certification, "posp_certification clicked");
        WebCommands.staticSleep(4000);
        TestUtil.IsDisplayed(POSP_verification_text, "verification text displayed");
        TestUtil.getScreenShot();

    }
    public void posp_certification_for_verified() {
        TestUtil.IsDisplayed(POSP_training_and_certification, "POSP_training_and_certification sub title displayed");
        TestUtil.click(posp_certification, "posp_certification clicked");
        WebCommands.staticSleep(4000);
        TestUtil.IsDisplayed(POSP_verification_GI_text_for_verified, "GI  text displayed");
        TestUtil.IsDisplayed(POSP_verificationLI_text_for_verified, "LI text displayed");
        TestUtil.IsDisplayed(GI_text_for_verified, "GI  text displayed");
        TestUtil.IsDisplayed(LI_text_for_verified, "LI text displayed");
        TestUtil.IsDisplayed(DOWNLOAD, "Downlaod certificate cta displayed");
        TestUtil.click(DOWNLOAD, "Downlaod certificate cta  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(Certificates, " certificates page of MA  displayed");
        TestUtil.getScreenShot();    }

        public void LogOut() {
        TestUtil.click(Settings,"Settings clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(LogOut,"LogOut clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(finalLogOut,"Logged Out Now");
        TestUtil.getScreenShot();
       // TestUtil.IsDisplayed(CreateAccount,"Logged Out Successfully");
        TestUtil.IsDisplayed(MobileNumber,"Logged Out Successfully");

    }

    public void editPersonalBrand() {
        TestUtil.click(editBrand,"Edit Personal Brand Clicked");
        TestUtil.uploadFile("ubuntu");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.clear(fname,"fname cleared");
        TestUtil.sendKeys(fname,"Test","fname updated");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.clear(mobile,"Mobile Number cleared");
        TestUtil.sendKeys(mobile,"9999888812","fname updated");
        TestUtil.clear(email,"email cleared");
        TestUtil.sendKeys(email,"auto@rickshaw.com","fname updated");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(Apply,"Applied and Saved");
        WebCommands.staticSleep(5000);
        TestUtil.click(editBrand,"Edit Personal Brand Clicked");
        TestUtil.clear(fname,"fname cleared");
        TestUtil.sendKeys(fname,"automation","Reverted back to automation");
        TestUtil.clear(mobile,"Mobile Number cleared");
        TestUtil.sendKeys(mobile,"6999912345","Reverted back to default number");
        TestUtil.clear(email,"email cleared");
        TestUtil.sendKeys(email,"automationtesting@turtlemint.com","email reverted");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(Apply,"Applied and Saved");
    }

    public void editPersonalBrandforNonVerifiedUser() {
        TestUtil.click(editBrand,"Edit Personal Brand Clicked");
        TestUtil.uploadFile("ubuntu");
        TestUtil.clear(fname,"fname cleared");
        TestUtil.sendKeys(fname,"Test","fname updated");
        TestUtil.clear(mobile,"Mobile Number cleared");
        TestUtil.sendKeys(mobile,"9999888812","fname updated");
        TestUtil.clear(email,"email cleared");
        TestUtil.sendKeys(email,"auto@rickshaw.com","fname updated");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(Apply,"Applied and Saved");
        WebCommands.staticSleep(5000);
        TestUtil.click(editBrand,"Edit Personal Brand Clicked");
        TestUtil.clear(fname,"fname cleared");
        TestUtil.sendKeys(fname,"google play user","Reverted back to automation");
        TestUtil.clear(mobile,"Mobile Number cleared");
        TestUtil.sendKeys(mobile,"6888812345","Reverted back to default number");
        TestUtil.clear(email,"email cleared");
        TestUtil.sendKeys(email,"googleplayconsole@turtlemint.com","email reverted");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(Apply,"Applied and Saved");
    }

    }