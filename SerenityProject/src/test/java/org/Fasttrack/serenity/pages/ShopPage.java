package org.Fasttrack.serenity.pages;

import Utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")
public class ShopPage extends PageObject {

    @FindBy(css=".woocommerce-products-header")
    private WebElementFacade shopHeader;

    @FindBy(css=".woocommerce-result-count")
    private WebElementFacade resultsCount;

    @FindBy(css=".orderby")
    private WebElementFacade sortByDropDownList;

    @FindBy(css="option[value='popularity']")
    private WebElementFacade sortByOptionPopularity;
    @FindBy(css="option[value='rating']")
    private WebElementFacade sortByOptionRating;

    @FindBy(css="option[value='date']")
    private WebElementFacade sortByOptionDate;

    @FindBy(css="option[value='price']")
    private WebElementFacade sortByOptionPriceLowHigh;

    @FindBy(css="option[value='price-desc']")
    private WebElementFacade sortByOptionPriceHighLow;

    @FindBy(css=".columns-4")
    private WebElementFacade productsDisplay;

    @FindBy(css=".type-product")
    private WebElementFacade oneSingleProductDisplay;

    @FindBy(css=".onsale")
    private WebElementFacade onSaleBanner;

    @FindBy(css=".wp-post-image")
    private WebElementFacade productImage;

    @FindBy(css=".woocommerce-loop-product__title")
    private WebElementFacade productTitle;

    @FindBy(css=".price")
    private WebElementFacade productPrice;

    @FindBy(css=".add_to_cart_button ")
    private WebElementFacade productAddToCartButton;

    @FindBy(css=".current")
    private WebElementFacade currentPageNumberLink;

    @FindBy(css=".next")
    private WebElementFacade nextPageNumberLink;

    @FindBy(css=".prev")
    private WebElementFacade previousPageNumberLink;
    @FindBy(css = ".fa-shopping-cart")
    private WebElementFacade viewShoppingCart;


    public boolean checkHeaderTitle(){
        return shopHeader.containsText(Constants.SHOP_PAGE_HEADER);
    }
    public void clickViewShoppingCart() {
        clickOn(viewShoppingCart);
    }











}
