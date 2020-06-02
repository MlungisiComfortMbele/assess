package MobileEngine;

import driver_handlers.MobileDriverHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Mobile.APN_HomePage;
import pages.Mobile.APN_LoginPage;
import pages.Mobile.APN_HomePage;

public class APN_Tests extends MobileDriverHandler {

	APN_HomePage apn_homepage;
    APN_LoginPage apn_loginpage;

    @BeforeClass
    public void setUp() {

        launchApp();
        apn_homepage = new APN_HomePage();
    }

    @Test(priority = 1)
    public void verify_if_homepage_is_displayed() {

    	apn_homepage.isHomePageDisplayed();
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void select_menu() {

    	apn_loginpage = apn_homepage.viewLogin();
    }
    
    
    @Test(priority = 4)
    public void unsuccessfulLogin() {
	
    	apn_loginpage = apn_homepage.clickLogin();
    	apn_loginpage = apn_homepage.enteremail();
    	apn_loginpage = apn_homepage._password();
    	apn_loginpage = apn_homepage.clicklogin2();
    	
    }
    

    @AfterClass
    public void tearDown() {
        closeApp();
    }
}
