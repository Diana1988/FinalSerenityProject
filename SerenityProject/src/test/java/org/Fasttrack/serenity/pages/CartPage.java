package org.Fasttrack.serenity.pages;

import Utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")
public class CartPage extends PageObject {

    @FindBy(css="#quantity_5c06a6e03e536")
    private WebElementFacade productQuantity;
    @FindBy(css=".single_add_to_cart_button")
    private WebElementFacade addToCartButton;
    @FindBy(css=".column-4 .add_to_cart_button")
    private WebElementFacade relatedProductsAddToCartButton;
    @FindBy(css=".woocommerce-message")
    private WebElementFacade addedToCartSuccessMessage;
    @FindBy(css=".wc-forward")
    private WebElementFacade viewCartLink;
    @FindBy(css=".checkout-button")
    private WebElementFacade proceedToCheckOutButton;
    @FindBy(css=".remove")
    private WebElementFacade removeFromCartButton;
    @FindBy(css=".woocommerce-message")
    private WebElementFacade productRemovedSuccessMessage;

public void clickAddToCartButton(){
    clickOn (addToCartButton);
}
    public void clickProceedToCheckOut() {
        clickOn(proceedToCheckOutButton);
    }
    public void clickRemoveFromCartButton() {
        clickOn(removeFromCartButton);

    }
    public boolean checkProductAddedToCart(){
    return addedToCartSuccessMessage.containsText(Constants.PRODUCT_ADDED_TO_CART_SUCCES);
    }

}
