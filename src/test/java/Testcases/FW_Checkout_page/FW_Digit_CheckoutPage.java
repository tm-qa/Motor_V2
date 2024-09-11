package Testcases.FW_Checkout_page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.Common.Common_Policy_Information;
import com.qa.turtlemint.pages.login.Common.Common_fw_tw_Registration_Info_Page;
import com.qa.turtlemint.pages.login.Common.Product_page;
import com.qa.turtlemint.pages.login.Common.previous_policy_details;
import com.qa.turtlemint.pages.login.MintPro.GrowPageSellButton;
import com.qa.turtlemint.pages.login.MintPro.Loginpage;
import com.qa.turtlemint.pages.login.four_wheeler.*;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.RetryAnalyser;


@Test(groups ={ "fw_motor"})
public class FW_Digit_CheckoutPage extends TestBase {

    public Loginpage loginpage;
    GrowPageSellButton growPage;
    Product_page Product;
    FW_CreatePage quotepage;
    FW_RegistrationInfoPage fw_reginfo;
    Cardetails cdp;
    Leadpage leadpage;
    TestUtil tl;
    FWResultPage fwresultpage;
    FW_CheckoutPage checkoutPage;
    FWResultPage Rel;
    FW_CheckoutPage own;
    Common_Policy_Information Poli;
    previous_policy_details pre;
    Common_fw_tw_Registration_Info_Page reg ;




    public FW_Digit_CheckoutPage() {
        super();
    }

    @BeforeClass()
    public void start() throws Exception {
        initialization();

        loginpage = new Loginpage();
        growPage = new GrowPageSellButton();
        fw_reginfo = new FW_RegistrationInfoPage();
        fwresultpage = new FWResultPage();
        checkoutPage = new FW_CheckoutPage();
        tl = new TestUtil();
        leadpage = new Leadpage();
        Rel = new FWResultPage();
        own = new FW_CheckoutPage();
        cdp = new Cardetails();
        Product = new Product_page();
        quotepage = new FW_CreatePage();
        Poli = new Common_Policy_Information();
        pre = new previous_policy_details();
        reg= new Common_fw_tw_Registration_Info_Page();

        loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        growPage.ValidateSellButton();
    }


    @Test(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_01_Digit_New_Business_TP_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("newBS");
        fw_reginfo.SelectFWRegistrationLocation("MH01");
        cdp.FW_CAR_DETAILS("Hyundai i10");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Policy_type("TP");
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }

    @Test(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_02_Digit_New_Business_Com_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("newBS");
        fw_reginfo.SelectFWRegistrationLocation("MH01");
        cdp.FW_CAR_DETAILS("Hyundai i10");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Policy_type("Com");
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }


    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_06_Digit_Com_Com_Expirytoday_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("Comprehensive");
        pre.Expiring_today_or_tomorrow("Com");
        pre.claimselect_NCB_IS_Zero("no");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Ext");
        fwresultpage.All_Addons_1();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_07_Digit_Com_Com_LessThan_90days_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("Comprehensive");
        pre.Expired_less_than_90_days_ago("Com");
        pre.claimselect_NCB_IS_Zero("yes");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Company");
        fwresultpage.All_Addons_1();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_08_Digit_Com_Com_MoreThan_90days_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("Comprehensive");
        pre.Expired_more_than_90_days_ago("Com");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Ext");
        fwresultpage.All_Addons();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }

    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_10_Digit_TP_Expirytoday_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("thirdparty");
        pre.Expiring_today_or_tomorrow("Com");
        pre.madeclaimsNo("Yes");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Ext");
        fwresultpage.All_Addons_1();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_11_Digit_OD_Expirytoday_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("thi");
        pre.Expiring_today_or_tomorrow_OD("SAOD");
        pre.claimselect("no");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Company");
        fwresultpage.All_Addons_1();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_12_Digit_OD_Expirytoday_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("third");
        pre.Expiring_today_or_tomorrow_OD("LTOD");
        pre.claimselect_NCB_IS_Zero("no");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Company");
        fwresultpage.All_Addons_1();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_13_Digit_OD_3yrTP_Expirytoday_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("third");
        pre.Expiring_today_or_tomorrow_OD("LT");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Ext");
        fwresultpage.All_Addons_2();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_14_Digit_TP_TP_Expirytoday_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("third");
        pre.Expiring_today_or_tomorrow_OD("LT");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Ext");
        fwresultpage.All_Addons_2();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_15_Digit_TP_TP_less90days_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("third");
        pre.Expired_less_than_90_days_ago_TP("less");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Company");
        fwresultpage.All_Addons_2();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_16_Digit_TP_TP_more90days_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("third");
        pre.Expired_less_than_90_days_ago_TP("more");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Value_Of_acc("Ext");
        fwresultpage.All_Addons_2();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
//    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
//    public void TC_17_Digit_Com_OD_Expirytoday_Checkout() throws Exception {
//        Product.ValidateMotorFWClick();
//        quotepage.CreatePage("Rollcase");
//        reg.SelectRegDate();
//        cdp.FW_CAR_DETAILS("Hyundai i10");
//        Poli.PolicyType("third");
//        pre.Expired_less_than_90_days_ago_TP("more");
//        leadpage.SaveLead(tl.NameGenerator());
//        fwresultpage.GotIT();
//        fwresultpage.Value_Of_acc("Ext");
//        fwresultpage.All_Addons_2();
//        fwresultpage.utilUpdate();
//        fwresultpage.DIGIT_ONE_ProccedtoBuy();
//        fwresultpage.cKycFourWheeler();
//        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);
//
//    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_18_Digit_Com_OD_Expirytoday_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("Comprehensive");
        pre.Expiring_today_or_tomorrow("thr");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.All_Addons_2();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_19_Digit_Com_OD_Expirytoday_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("Comprehensive");
        pre.Expiring_today_or_tomorrow("thr");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.All_Addons_2();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }
    @Test//(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TC_20_Digit_OD_OD_Expirytoday_Checkout() throws Exception {
        Product.ValidateMotorFWClick();
        quotepage.CreatePage("Rollcase");
        reg.SelectRegDate();
        cdp.FW_CAR_DETAILS("Hyundai i10");
        Poli.PolicyType("od");
        pre.Expiring_today_or_tomorrow_OD_OD();
        pre.claimselect("no");
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.All_Addons_2();
        fwresultpage.utilUpdate();
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }





















    @AfterClass
    public void Close() {

        //driver.quit();
    }

}
