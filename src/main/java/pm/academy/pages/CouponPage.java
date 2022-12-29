package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CouponPage extends BasePage{

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'tvAddToBetslip')]")
    private MobileElement addToBetButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@content-desc, 'selectedOutcomeCount')]")
    private MobileElement selectedOutcomeCount;

    @AndroidFindBy(xpath = "(//*[contains(@content-desc, 'quickBetPlaceButton')])")
    private MobileElement placeBetButton;

    public void clickOnPlaceBetButton() {
        waitForExpectedElement(placeBetButton).click();
    }

    public void clickSelectedOutcomeCount() {
        waitForExpectedElement(selectedOutcomeCount).click();
    }

    public void clickOnAddToBetButton() {
        waitForExpectedElement(addToBetButton).click();
    }
}
