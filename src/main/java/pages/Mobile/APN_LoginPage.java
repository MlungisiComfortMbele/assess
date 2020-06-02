package pages.Mobile;

import driver_handlers.MobileDriverHandler;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class APN_LoginPage extends MobileDriverHandler {

    //Page objects
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'COULD NOT LOGIN')]")
    MobileElement _loginbutton2;
    MobileElement _unsuccessful;

    //Initialize Page Objects
    public APN_LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver), this);

    }

    //Perform action on Page Objects
    public String getunsuccessfulLoginName() {
        return _unsuccessful.getText();
    }


}
