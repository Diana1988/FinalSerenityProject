package org.Fasttrack.serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.Fasttrack.serenity.pages.HomePage;
import org.Fasttrack.serenity.pages.ShopPage;
import org.junit.Assert;

public class ShopSteps extends ScenarioSteps {

HomePage homePage;
    ShopPage shopPage;

    @Step
    public void openShopPage(){
        shopPage.open();
    }

    @Step
    public void verifyIfShopPageIsDisplayed(){
        Assert.assertTrue(shopPage.checkHeaderTitle());
    }

    @Step
    public void verifyHeaderTitle(){
        shopPage.checkHeaderTitle();
    }

    @Step
    public void viewShoppingCart(){
        shopPage.clickViewShoppingCart();

    }
}
