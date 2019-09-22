package org.Fasttrack.serenity.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.Fasttrack.serenity.steps.serenity.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HomepageTest {
        @Managed(uniqueSession = true)
        private WebDriver driver;


        @Steps
        HomepageSteps homepageSteps;
        @Steps
        BlogSteps blogSteps;
        @Steps
        ShopSteps shopSteps;
        @Steps
        CheckoutSteps checkoutSteps;
        @Steps
        MyAccountSteps myAccountSteps;


        @Before
        public void maximizeScreen() {
            driver.manage().window().maximize();
        }

        @Test
        public void goToAndVerifyBlogPageIsDisplayedFromHomepage() {
            homepageSteps.openHomepage();
            homepageSteps.openBlogPage();

        }

    @Test
    public void goToAndVerifyShopPageIsDisplayedFromHomepage(){
        homepageSteps.openHomepage();
        homepageSteps.openShopPage();
        shopSteps.verifyIfShopPageIsDisplayed();
    }

    @Test
    public void goToAndVerifyMyAccountPageIsDisplayedFromHomepage(){
        homepageSteps.openHomepage();
        homepageSteps.openMyAccountPage();
        myAccountSteps.verifyIfMyAccountPageIsDisplayed();
    }

    @Test
    public void goToAndVerifyCheckOutPageIsDisplayedFromHomepage() {
        homepageSteps.openHomepage();
        homepageSteps.openCheckoutPage();
        checkoutSteps.verifyIfCheckOutPageIsDisplayed();
    }

    @Test
    public void loginButtonDisplayed(){
        homepageSteps.openHomepage();
        homepageSteps.verifyLoginButtonIsDisplayed();
    }

    @Test
    public void searchAProduct(){
        homepageSteps.openHomepage();
        homepageSteps.searchAProduct();
    }

}



