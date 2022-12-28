package pm.academy.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SportPage extends BasePage{

    @AndroidFindBy(id = "logo")
    private MobileElement sportPanel;

    @AndroidFindBy(id = "sportSectionHeaderView")
    private MobileElement sportSectionHeader;

    @AndroidFindBy(xpath = "(//*[contains(@content-desc, 'F')])")
    private MobileElement footballButton;

    @AndroidFindBy(xpath = "(//*[contains(@resource-id, 'com.parimatch:id/tvName')])[4]")
    private MobileElement twelveHoursButton;

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@content-desc='outcome_1' and @selected='false'])[1]")
    private MobileElement firstNotSelectedCoef;

    public boolean isSportPageDisplayed() {
        return waitForExpectedElement(sportSectionHeader).isDisplayed() && waitForExpectedElement(sportPanel).isDisplayed();
    }
    public void clickFootballTab() {
        waitForExpectedElement(footballButton).click();
    }
    public void clickOneTwelveHoursButton() {
        waitForExpectedElement(twelveHoursButton).click();
    }

    public void clickOnFirstNotSelectedCoef() {
        waitForExpectedElement(firstNotSelectedCoef).click();
    }
}
