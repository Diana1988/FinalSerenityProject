package org.Fasttrack.serenity.steps.serenity;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.Fasttrack.serenity.pages.ProductPage;
import org.junit.Assert;

public class ProductsSteps extends PageObject {
    ProductPage productPage;

    @Step
    public void verifyTheProductName(String productName){
        Assert.assertTrue(productPage.checkProductTitle(productName));
    }

}
