package Testcases.TW_Checkout_page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.Common.Common_Policy_Information;
import com.qa.turtlemint.pages.login.Common.Common_fw_tw_Registration_Info_Page;
import com.qa.turtlemint.pages.login.Common.Product_page;
import com.qa.turtlemint.pages.login.Common.previous_policy_details;
import com.qa.turtlemint.pages.login.MintPro.GrowPageSellButton;
import com.qa.turtlemint.pages.login.MintPro.Loginpage;
import com.qa.turtlemint.pages.login.four_wheeler.*;
import com.qa.turtlemint.pages.login.two_wheeler.Bike_details;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.RetryAnalyser;

public class TW_Digit_CheckoutPage extends TestBase {

    public Loginpage loginpage;
    GrowPageSellButton growPage;
    Product_page Product;
    FW_CreatePage quotepage;
    FW_RegistrationInfoPage fw_reginfo;
    Bike_details bdp;
    Leadpage leadpage;
    TestUtil tl;
    FWResultPage fwresultpage;
    FW_CheckoutPage checkoutPage;
    FWResultPage Rel;
    FW_CheckoutPage own;
    Common_Policy_Information Poli;
    previous_policy_details pre;
    Common_fw_tw_Registration_Info_Page reg ;

    public TW_Digit_CheckoutPage() {
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
        bdp = new Bike_details();
        Product = new Product_page();
        quotepage = new FW_CreatePage();
        Poli = new Common_Policy_Information();
        pre = new previous_policy_details();
        reg= new Common_fw_tw_Registration_Info_Page();

        loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        growPage.ValidateSellButton();
    }


    @Test(enabled = true, retryAnalyzer = RetryAnalyser.class)
    public void TW_TC_01_Digit_New_Business_TP_Checkout() throws Exception {
        Product.ValidateMotorTWClick();
        quotepage.CreatePage("newBS");
        fw_reginfo.SelectFWRegistrationLocation("MH01");

        bdp.SaveBikeDetails(prop.getProperty("TW_Model"));
        leadpage.SaveLead(tl.NameGenerator());
        fwresultpage.GotIT();
        fwresultpage.Policy_type("TP");
        fwresultpage.DIGIT_ONE_ProccedtoBuy();
        fwresultpage.cKycFourWheeler();
        checkoutPage.digitCheckoutNB(tl.firstname, tl.lastname);

    }

}
