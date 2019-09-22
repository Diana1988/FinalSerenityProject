package org.Fasttrack.serenity.pages;

import Utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class HomePage extends PageObject {
    @FindBy(css = "a[title='Login']")
    private WebElementFacade signInButton;
    @FindBy(css = ".fa-shopping-cart")
    private WebElementFacade viewShoppingCart;
    @FindBy(css = ".search-btn")
    private WebElementFacade searchButton;
    @FindBy(css = ".search-block .search-field")
    private WebElementFacade searchField;
    @FindBy(css = ".search-block .search-submit")
    private WebElementFacade searchSubmitButton;
    @FindBy(css = "a[title='FastTrackIT']")
    private WebElementFacade fastTrackItButton;
    @FindBy(css = "#menu-item-1642")
    private WebElementFacade homePageLink;
    @FindBy(css = "#menu-item-1643")
    private WebElementFacade blogPageLink;
    @FindBy(css = "#menu-item-1728")
    private WebElementFacade shopPageLink;
    @FindBy(css = "#menu-item-1729")
    private WebElementFacade checkOutPageLink;
    @FindBy(css = "#menu-item-1730")
    private WebElementFacade myAccountPageLink;
    @FindBy(css = ".home-slider")
    private WebElementFacade homepageSlides;
    @FindBy(css = ".home-slider-next")
    private WebElementFacade nextSlideButton;
    @FindBy(css = ".")
    private WebElementFacade previousSlideButton;
    @FindBy(css = ".entry-content")
    private WebElementFacade descriptionTextHomepage;
    @FindBy(css = ".site-footer-bottom-bar-left a")
    private WebElementFacade themeForSiteLink;
    @FindBy(css = ".site-footer-bottom-bar-right a")
    private WebElementFacade platformForSiteLink;
    @FindBy(css = "img[src*=\"default_01\"]")
    private WebElementFacade firstImage;



    public void clickSigninButton() {
        clickOn(signInButton);
    }

    public void clickShoppingCart() {
        clickOn(viewShoppingCart);
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void setSearchField(String searchTerm) {
        typeInto(searchField, searchTerm);
    }

    public void clickSearchSubmitButton() {
        clickOn(searchSubmitButton);
    }

    public void clickHomePageLink() {
        clickOn(homePageLink);
    }

    public void clickBlogPageLink() {
        clickOn(blogPageLink);
    }

    public void clickShopPageLink() {
        clickOn(shopPageLink);
    }

    public void clickCheckOutPageLink() {
        clickOn(checkOutPageLink);
    }

    public void clickAccountPageLink() {
        clickOn(myAccountPageLink);
    }

    public boolean checkFirstSlide() {
        return firstImage.isDisplayed();
    }

    public boolean checkSigninButtonIsDisplayed() {
        return signInButton.isDisplayed();
    }


    }






