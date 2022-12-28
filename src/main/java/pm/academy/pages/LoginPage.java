package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage{

    @AndroidFindBy(id = "com.parimatch:id/editText")
    private MobileElement passwordField;

    @AndroidFindBy(id = "com.parimatch:id/tvButtonTitle")
    private MobileElement singUpButton;

    public boolean isLoginPageLoaded() {
        return waitForExpectedElement(passwordField).isDisplayed() && waitForExpectedElement(singUpButton).isDisplayed();
    }
}
