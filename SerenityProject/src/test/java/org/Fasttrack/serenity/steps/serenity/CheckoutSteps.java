package org.Fasttrack.serenity.steps.serenity;

import Utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.Fasttrack.serenity.pages.*;
import org.junit.Assert;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class CheckoutSteps extends ScenarioSteps {

    CheckoutPage checkoutPage;
    ShopPage shopPage;
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;
    CartPage cartPage;

    private static String newPasswordCheckoutAccount = randomAlphabetic(7);
    private static String newEmailCheckoutAccount = randomAlphabetic(10) + "@yahoo.com";


    @Step
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void addToCart() {
        productPage.clickAddToCart();
    }

    @Step
    public void addedToCartSuccess() {
        productPage.checkAddedToCartSuccess();
    }

    @Step
    public void viewCart() {
        productPage.clickViewCart();
    }
    @Step
    public void goToCheckoutPage() {
        checkoutPage.open();
    }

    @Step
    public void verifyIfCheckOutPageIsDisplayed() {
        Assert.assertTrue(checkoutPage.checkHeaderTitle());
    }

    @Step
    public void redirectToShop() {
        checkoutPage.clickReturnToShop();
    }

    @Step
    public void setBillingDetailsAnonimUser() {
        checkoutPage.setFirstNameFieldBilling(Constants.VALID_FIRST_NAME_BILLING);
        checkoutPage.setLastNameFieldBilling(Constants.VALID_LAST_NAME_BILLING);
        //choose a country
        checkoutPage.setStreetAddressFirstFieldBilling(Constants.ADDRESS_FIRST_FIELD_BILLING);
        checkoutPage.setStreetAddressSecondFieldBilling(Constants.ADDRESS_SECOND_FIELD_BILLING);
        checkoutPage.setCityFieldBilling(Constants.CITY_BILLING);
        //choose a county
        checkoutPage.setPostcodeFieldBilling(Constants.POSTCODE_BILLING);
        checkoutPage.setPhoneFieldBilling(Constants.PHONE_NUMBER_BILLING);
        checkoutPage.setEmailFieldBilling(newEmailCheckoutAccount);

    }


    @Step
    public void setShippingDetailsAnonimUser() {
        checkoutPage.setFirstNameFieldShipping(Constants.VALID_FIRST_NAME_SHIPPING);
        checkoutPage.setLastNameFieldShipping(Constants.VALID_LAST_NAME_SHIPPING);
        //choose a country
        checkoutPage.setStreetAddressFirstFieldShipping(Constants.ADDRESS_FIRST_FIELD_SHIPPING);
        checkoutPage.setStreetAddressSecondFieldShipping(Constants.ADDRESS_SECOND_FIELD_SHIPPING);
        checkoutPage.setCityFieldShipping(Constants.CITY_SHIPPING);
        //choose a county
        checkoutPage.setPostcodeFieldShipping(Constants.POSTCODE_SHIPPING);
    }

    @Step
    public void placeTheOrder() {
        checkoutPage.clickPlaceOrder();
    }

    @Step
    public void verifyOrderPlaced() {
        Assert.assertTrue(checkoutPage.placedOrderSuccesMessage());
    }

    @Step
    public void placeAnOrderAnonimUserWithoutBillingDetails() {
        cartPage.clickProceedToCheckOut();
    }


    public void checkBoxDifferentShipping() {
        checkoutPage.checkShipToDifferentAddressOption();
    }

    @Step
    public void checkBoxCreateAccount() {
        checkoutPage.checkCreateAnAccountOption();
        checkoutPage.setPasswordNewAccount(newPasswordCheckoutAccount);
    }

    @Step
    public void verifyOutOfStockMessage() {
        Assert.assertTrue(checkoutPage.checkOutOfStockMessage());
    }
}



