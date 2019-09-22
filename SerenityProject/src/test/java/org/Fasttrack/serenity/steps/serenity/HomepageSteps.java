package org.Fasttrack.serenity.steps.serenity;

import Utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.Fasttrack.serenity.pages.HomePage;
import org.Fasttrack.serenity.pages.ProductPage;
import org.Fasttrack.serenity.pages.SearchResultsPage;
import org.junit.Assert;

public class HomepageSteps extends ScenarioSteps {
    HomePage homepage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;

    @Step
    public void openHomepage() {
        homepage.open();
    }

    @Step
    public void openBlogPage() {
        homepage.clickBlogPageLink();
    }

    @Step
    public void openShopPage() {
        homepage.clickShopPageLink();
    }
    @Step
    public void searchAProduct() {
        homepage.clickSearchButton();
        homepage.setSearchField(Constants.PRODUCT_TO_SEARCH);
        homepage.clickSearchSubmitButton();
        searchResultsPage.verifySearchResults(Constants.PRODUCT_TO_SEARCH);
        searchResultsPage.clickOnTheSearchedProduct2(Constants.PRODUCT_TO_SEARCH);
        Assert.assertTrue(productPage.checkProductTitle(Constants.PRODUCT_TO_SEARCH));
    }

    @Step
    public void openCheckoutPage() {
        homepage.clickCheckOutPageLink();
    }
    @Step
    public void verifyLoginButtonIsDisplayed(){
        homepage.checkSigninButtonIsDisplayed();
    }

    @Step
    public void openMyAccountPage() {
        homepage.clickAccountPageLink();
    }

    @Step
    public void verifySigninButtonIsDisplayed() {
        homepage.checkSigninButtonIsDisplayed();
    }

        @Step
        public void shouldRedirectToBlogPage() {
            homepage.open();
            homepage.clickBlogPageLink();
            //Assert.assertTrue(myAccountPage.checkLoggedIn());

        }

}