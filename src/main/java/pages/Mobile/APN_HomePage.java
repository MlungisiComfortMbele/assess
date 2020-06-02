package pages.Mobile;

import driver_handlers.MobileDriverHandler;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class APN_HomePage extends MobileDriverHandler {

    //Page Objects
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'AfricaPENews')]")
    MobileElement _headerNameLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Home')]")
    MobileElement _homePage;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'MENU')]")
    MobileElement _menu;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Login')]")
    MobileElement _loginbutton;

    
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Email')]")
    MobileElement _emailTextbox;

    
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Password')]")
    MobileElement _passwordTextbox;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'LOGIN')]")
    MobileElement _loginbutton2;
    
    
    
    
    //Initialize Page Objects
    public APN_HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);

    }

    //Perform action on Page Objects
    public boolean isHomePageDisplayed() {
        return _homePage.isDisplayed();
    }

   public APN_LoginPage viewLogin() {

	   _menu.click();
        return new APN_LoginPage();
    }
   
   public APN_LoginPage clickLogin() {

	   _loginbutton.click();
        return new APN_LoginPage();
    }
   
   public APN_LoginPage enteremail() {

	   _emailTextbox.sendKeys("mlu.mbele@gmail.com");
        return new APN_LoginPage();
    }
   
   public APN_LoginPage _password() {

	   _passwordTextbox.sendKeys("hooligan@heart");
        return new APN_LoginPage();
    }
   public APN_LoginPage clicklogin2() {

	   _loginbutton2.click();
        return new APN_LoginPage();
    }
   
   

}
