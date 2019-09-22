package org.Fasttrack.serenity.pages;

import Utils.Constants;
import net.bytebuddy.implementation.bind.annotation.Default;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")
public class CheckoutPage extends PageObject {
    @FindBy(css = ".entry-header")
    private WebElementFacade checkOutHeaderTitle;
    @FindBy(css = ".cart-empty")
    private WebElementFacade cartEmptyMessageAnonimUser;
    @FindBy(css = ".wc-backward")
    private WebElementFacade returnToShopButton;
    @FindBy(css = ".showlogin")
    private WebElementFacade loginOption;
    @FindBy(css = ".showcoupon")
    private WebElementFacade enterCodeOption;
    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameFieldBilling;
    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameFieldBilling;
    @FindBy(css = "#billing_company")
    private WebElementFacade companyNameFieldBilling;
    @FindBy(css = "#select2-billing_country-container")
    private WebElementFacade countryNameDropDownBilling;
    @FindBy(css = ".form-row #billing_address_1")
    private WebElementFacade streetAddressFirstFieldBilling;
    @FindBy(css = ".form-row #billing_address_2")
    private WebElementFacade streetAddressSecondFieldBilling;
    @FindBy(css = ".form-row #billing_city")
    private WebElementFacade cityNameFieldBilling;
    @FindBy(css = ".form-row #select2-billing_state-container")
    private WebElementFacade countyNameDropDownBilling;
    @FindBy(css = ".form-row #billing_postcode")
    private WebElementFacade postcodeFieldBilling;
    @FindBy(css = ".form-row #billing_phone")
    private WebElementFacade phoneFieldBilling;
    @FindBy(css = ".form-row #billing_email")
    private WebElementFacade emailAddressFieldBilling;
    @FindBy(css = "#createaccount")
    private WebElementFacade createAnAccountCheckBoxBilling;
    @FindBy(css = "#ship-to-different-address-checkbox")
    private WebElementFacade shipDifferentAddressCheckBox;
    @FindBy(css = "#order_comments")
    private WebElementFacade orderCommentsBilling;

    @FindBy(css = "#order_review_heading")
    private WebElementFacade orderReviewHeading;
    @FindBy(css = "#order_review")
    private WebElementFacade orderReview;
    @FindBy(css = ".cart_item")
    private WebElementFacade cartItem;
    @FindBy(css = ".cart_item .product-name")
    private WebElementFacade productName;
    @FindBy(css = ".cart_item .product-quantity")
    private WebElementFacade productQuantity;
    @FindBy(css = ".cart_item .amount")
    private WebElementFacade price;
    @FindBy(css = "cart-subtotal")
    private WebElementFacade subtotalCart;
    @FindBy(css = ".shipping")
    private WebElementFacade shipping;
    @FindBy(css = ".order-total")
    private WebElementFacade totalOrderAmount;

    @FindBy(css = ".wc_payment_methods ")
    private WebElementFacade paymentMethod;
    @FindBy(css = "#place_order")
    private WebElementFacade placeOrderButton;


    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @FindBy(css = "#username")
    private WebElementFacade usernameFieldCheckOut;
    @FindBy(css = "#password")
    private WebElementFacade passwordFieldCheckOut;
    @FindBy(css = "button[name='login']")
    private WebElementFacade loginButtonCheckOut;
    @FindBy(css = "#rememberme")
    private WebElementFacade rememberMeCheckBoxCheckOut;
    @FindBy(css = ".lost_password")
    private WebElementFacade lostPasswordLinkCheckOut;
    @FindBy(css = "#account_password")
    private WebElementFacade passwordNewAccount;
    @FindBy(css = "#shipping_first_name")
    private WebElementFacade firstNameFieldShipping;
    @FindBy(css = "#shipping_last_name")
    private WebElementFacade lastNameFieldShipping;
    @FindBy(css = "#shipping_company")
    private WebElementFacade companyNameFieldShipping;
    @FindBy(css = "#select2-shipping_country-container")
    private WebElementFacade countryNameDropDownShipping;
    @FindBy(css = ".form-row #shipping_address_1")
    private WebElementFacade streetAddressFirstFieldShipping;
    @FindBy(css = ".form-row #shipping_address_2")
    private WebElementFacade streetAddressSecondFieldShipping;
    @FindBy(css = ".form-row #shipping_city")
    private WebElementFacade cityNameFieldShipping;
    @FindBy(css = ".form-row #select2-shipping_state-container")
    private WebElementFacade countyNameDropDownShipping;
    @FindBy(css = ".form-row #shipping_postcode")
    private WebElementFacade postcodeFieldShipping;

    @FindBy(css = ".woocommerce-notice--success")
    private WebElementFacade placedOrderMessage;

    @FindBy(css=".woocommerce-error")
    private WebElementFacade outOfStockMessage;


    public boolean checkOutOfStockMessage(){
        return outOfStockMessage.containsText(Constants.OUT_OF_STOCK_MESSAGE);
    }

    public void setFirstNameFieldBilling(String firstName) {
        typeInto(firstNameFieldBilling, firstName);
    }

    public void setLastNameFieldBilling(String lastName) {
        typeInto(lastNameFieldBilling, lastName);
    }

    public void setCompanyNameFieldBilling(String companyName) {
        typeInto(companyNameFieldBilling, companyName);
    }

    public boolean checkHeaderTitle() {
        return checkOutHeaderTitle.containsText(Constants.CART_HEADER);
    }

    public boolean checkCartEmptyMessageAnonimUser() {
        return cartEmptyMessageAnonimUser.containsText(Constants.EMPTY_CART_MESSAGE);

    }

    public void setCompanytNameFieldBilling(String companyName) {
        typeInto(companyNameFieldBilling, companyName);
    }

    public void setStreetAddressFirstFieldBilling(String addressFirstField) {
        typeInto(streetAddressFirstFieldBilling, addressFirstField);
    }
    public void setStreetAddressSecondFieldBilling(String addressSecondField) {
        typeInto(streetAddressFirstFieldBilling, addressSecondField);
    }
    public void setCityFieldBilling(String cityField) {
        typeInto(cityNameFieldBilling, cityField);
    }

    public void setPostcodeFieldBilling(String postcode) {
        typeInto(postcodeFieldBilling, postcode);
    }

    public void setPhoneFieldBilling(String phone) {
        typeInto(phoneFieldBilling, phone);
    }

    public void setEmailFieldBilling(String email) {
        typeInto(emailAddressFieldBilling, email);
    }

    public boolean returnToShopButtonIsDisplayed() {
        return returnToShopButton.isDisplayed();
    }
    public void checkCreateAnAccountOption() {
        clickOn(createAnAccountCheckBoxBilling);
    }

    public void checkShipToDifferentAddressOption() {
        clickOn(shipDifferentAddressCheckBox);
    }

    public void setFirstNameFieldShipping(String firstName) {
        typeInto(firstNameFieldShipping, firstName);
    }

    public void setLastNameFieldShipping(String lastName) {
        typeInto(lastNameFieldShipping, lastName);
    }

    public void setCompanytNameFieldShipping(String companyName) {
        typeInto(companyNameFieldShipping, companyName);
    }

    public void setStreetAddressFirstFieldShipping(String addressFirstField) {
        typeInto(streetAddressFirstFieldShipping, addressFirstField);
    }

    public void setStreetAddressSecondFieldShipping(String addressSecondField) {
        typeInto(streetAddressFirstFieldShipping, addressSecondField);
    }

    public void setCityFieldShipping(String cityField) {
        typeInto(cityNameFieldShipping, cityField);
    }

    public void setPostcodeFieldShipping(String postcode) {
        typeInto(postcodeFieldShipping, postcode);
    }


    public void clickReturnToShop() {
        clickOn(returnToShopButton);
    }
    public void clickPlaceOrder() {
        clickOn(placeOrderButton);
    }

    public boolean placedOrderSuccesMessage() {
        return placedOrderMessage.isDisplayed();
    }
    public void setPasswordNewAccount(String password) {
        typeInto(passwordNewAccount, password);
    }


}
