package org.Fasttrack.serenity.features.search;

import Utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.Fasttrack.serenity.steps.serenity.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class ShopTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    ShopSteps shopSteps;
    @Steps
    BlogSteps blogSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    HomepageSteps homepageSteps;
    @Steps
    SearchResultsSteps searchResultsSteps;
    @Steps
    ProductsSteps productSteps;
    @Steps
    CheckoutSteps checkoutSteps;
    @Steps
    CartSteps cartSteps;

    @Before
    public  void maximizeScreen() {
        driver.manage().window().maximize();
    }

    @Test
    public void verifyShopPageIsDisplay() {
        shopSteps.openShopPage();
        shopSteps.verifyIfShopPageIsDisplayed();

    }
    @Test
    public void verifyAddedToCart(){
        homepageSteps.openHomepage();
        homepageSteps.searchAProduct();
        cartSteps.addToCart();
        cartSteps.verifyIfAddedToCart();
    }

    }
