package org.Fasttrack.serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.Fasttrack.serenity.pages.CartPage;
import org.Fasttrack.serenity.pages.ProductPage;
import org.junit.Assert;

    public class CartSteps extends ScenarioSteps {
        CartPage cartPage;
        ProductPage productPage;
        @Step
        public void openCartPage(){
            cartPage.open();
        }
        @Step
        public void openSelectedProduct(){
            productPage.open();
        }

        @Step
        public void addToCart(){
            cartPage.clickAddToCartButton();
        }
        @Step
        public void verifyIfAddedToCart(){
            Assert.assertTrue(cartPage.checkProductAddedToCart());
        }

        @Step
        public void removeFromCart() {
            cartPage.clickRemoveFromCartButton();
        }

        }

