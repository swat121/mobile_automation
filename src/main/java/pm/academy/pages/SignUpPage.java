package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpPage extends BasePage{

    @AndroidFindBy(id = "com.parimatch:id/etPassword")
    private MobileElement passwordField;

    @AndroidFindBy(id = "com.parimatch:id/tvButtonTitle")
    private MobileElement singUpButton;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@content-desc,'close_button')]")
    private MobileElement exitButton;

    public boolean isSignUpPageLoaded() {
        return waitForExpectedElement(passwordField).isDisplayed() && waitForExpectedElement(singUpButton).isDisplayed();
    }

    public void clickCloseButton() {
        waitForExpectedElement(exitButton).click();
    }
}
