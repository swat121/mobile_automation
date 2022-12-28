package pm.academy.cases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import pm.academy.base.BaseTest;
import pm.academy.pages.*;

public class AcademyTests extends BaseTest {

    private static final Logger LOG = LogManager.getRootLogger();
    @Test
    public void mainMenuTest() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(new MainPage().isHeadTitleDisplayed()).as("Head title is not displayed").isTrue();
        softAssertions.assertThat(new MainPage().isMenuButtonDisplayed()).as(" Menu button is not displayed").isTrue();
        softAssertions.assertThat(new MainPage().isPromoPanelDisplayed()).as("Promo title is not displayed").isTrue();
        softAssertions.assertAll();
    }

    @Test
    public void menuButtonTest2() {
        Assertions.assertThat(new MainPage().isMenuButtonDisplayed())
                .as("not displayed")
                .isTrue();
    }

    @Test
    public void setBetOnSportPageTest() {
        SignUpPage signUpPage = new SignUpPage();
        MainPage mainPage = new MainPage();
        SportPage sportPage = new SportPage();
        LoginPage loginPage = new LoginPage();
        CouponPage couponPage = new CouponPage();

        if (signUpPage.isSignUpPageLoaded()) {
            signUpPage.clickCloseButton();
            LOG.info("Authorization page was displayed and closed");
        }

        Assertions.assertThat(mainPage.isMenuButtonDisplayed()).as("Menu button is not displayed").isTrue();
        mainPage.clickSportPage();

        Assertions.assertThat(sportPage.isSportPageDisplayed()).as("Sport page is not displayed").isTrue();
        sportPage.clickFootballTab();
        //Двенадцать часов выберается,чтобы не было live игр и можно было нормально выбрать коефициент
        sportPage.clickOneTwelveHoursButton();
        sportPage.clickOnFirstNotSelectedCoef();

        couponPage.clickOnAddToBetButton();

        sportPage.clickOnFirstNotSelectedCoef();

        couponPage.clickSelectedOutcomeCount();
        couponPage.clickOnPlaceBetButton();

        Assertions.assertThat(loginPage.isLoginPageLoaded()).as("Login page is not displayed").isTrue();
    }
}
