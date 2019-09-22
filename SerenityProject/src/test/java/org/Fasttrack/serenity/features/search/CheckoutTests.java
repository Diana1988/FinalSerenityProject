package org.Fasttrack.serenity.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.Fasttrack.serenity.steps.serenity.CartSteps;
import org.Fasttrack.serenity.steps.serenity.CheckoutSteps;
import org.Fasttrack.serenity.steps.serenity.HomepageSteps;
import org.Fasttrack.serenity.steps.serenity.ShopSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;


    @Steps
    CheckoutSteps checkoutSteps;
    @Steps
    ShopSteps shopSteps;
    @Steps
    HomepageSteps homepageSteps;
    @Steps
    CartSteps cartSteps;


    @Before
    public void maximizeScreen() {
        driver.manage().window().maximize();
    }

    @Test
    public void goToAndVerifyCheckOutPageIsDisplay(){
        homepageSteps.openHomepage();
        homepageSteps.searchAProduct();
        cartSteps.addToCart();
        shopSteps.viewShoppingCart();
        checkoutSteps.verifyIfCheckOutPageIsDisplayed();
    }
    @Test
    public void placeAnOrderAnonimUser() {
        homepageSteps.openHomepage();
        homepageSteps.searchAProduct();
        cartSteps.addToCart();
        shopSteps.viewShoppingCart();
        checkoutSteps.placeAnOrderAnonimUserWithoutBillingDetails();
        checkoutSteps.setBillingDetailsAnonimUser();
        checkoutSteps.placeTheOrder();
        checkoutSteps.sleep(2);
        checkoutSteps.verifyOrderPlaced();
    }


}