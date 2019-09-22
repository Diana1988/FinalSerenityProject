package org.Fasttrack.serenity.pages;

import Utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")
public class ProductPage extends PageObject {

    @FindBy(css=".woocommerce-breadcrumb")
    private WebElementFacade breadcrumb;
    @FindBy(css=".woocommerce-product-gallery__wrapper")
    private WebElementFacade productImage;
    @FindBy(css=".woocommerce-product-gallery__trigger")
    private WebElementFacade zoomInIcon;
    @FindBy(css=".onsale")
    private WebElementFacade onSaleBanner;
    @FindBy(css=".product_title")
    private WebElementFacade productName;
    @FindBy(css="del .woocommerce-Price-amount")
    private WebElementFacade oldPrice;
    @FindBy(css="ins .woocommerce-Price-amount")
    private WebElementFacade newPrice;
    @FindBy(css=".out-of-stock")
    private WebElementFacade productOutOfStock;
    @FindBy(css=".woocommerce-product-rating .star-rating")
    private WebElementFacade  productStarRating;
    @FindBy(css=".woocommerce-review-link")
    private WebElementFacade productReviewsLink;
    @FindBy(css="short-description")
    private WebElementFacade productShortDescription;
    @FindBy(css="#quantity_5c06a6e03e536")
    private WebElementFacade productQuantity;
    @FindBy(css="button[name='add-to-cart']")
    private WebElementFacade addToCartButton;
    @FindBy(css=".sku")
    private WebElementFacade productSkuWrapper;
    @FindBy(css=".posted_in")
    private WebElementFacade productPostedInCategory;
    @FindBy(css="#tab-title-description")
    private WebElementFacade productDescriptionTab;
    @FindBy(css="#tab-title-reviews")
    private WebElementFacade productReviewsTab;
    @FindBy(css=".woocommerce-Tabs-panel--description")
    private WebElementFacade productDescription;
    @FindBy(css=".related")
    private WebElementFacade productRelatedProductsTitleSection;
    @FindBy(css=".columns-4")
    private WebElementFacade relatedProductsDisplay;
    @FindBy(css=".columns-4 .product")
    private WebElementFacade relatedProducts;
    @FindBy(css=".woocommerce-loop-product__link")
    private WebElementFacade relatedProductsLink;
    @FindBy(css=".columns-4 .wp-post-image")
    private WebElementFacade relatedProductsImages;
    @FindBy(css=".columns-4 .woocommerce-loop-product__title")
    private WebElementFacade relatedProductsTitles;
    @FindBy(css=".columns-4 .price")
    private WebElementFacade relatedProductsPrices;
    @FindBy(css=".columns-4 .add_to_cart_button")
    private WebElementFacade relatedProductsAddToCartButton;
    @FindBy(css=".woocommerce-message")
    private WebElementFacade addedToCartSuccessMessage;
    @FindBy(css=".wc-forward")
    private WebElementFacade viewCartLink;
    @FindBy(css="a[href*=2627")
    private WebElementFacade selectedProduct;

    public void getProductName(){
        productName.getText();
    }
    public boolean checkProductTitle(String searchTerm) {

        return productName.getText().contains(searchTerm);
    }
        public void clickAddToCart(){
            clickOn(addToCartButton);
        }

        public boolean checkAddedToCartSuccess(){
            return addedToCartSuccessMessage.getText().contains(Constants.PRODUCT_ADDED_TO_CART_SUCCES);
        }

        public void clickViewCart(){
            clickOn(viewCartLink);
        }

        public void clickSelectedProduct(){
        clickOn(selectedProduct);
}
    }
