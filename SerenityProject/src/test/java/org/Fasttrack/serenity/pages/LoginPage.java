package org.Fasttrack.serenity.pages;

import Utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class

LoginPage extends PageObject {
    @FindBy(id = "username")
    private WebElementFacade usernameField;
    @FindBy(id = "password")
    private WebElementFacade passField;
    @FindBy(css = ".woocommerce-MyAccount-content")
    private WebElementFacade welcomeTextParagraph;
    @FindBy(css=".col-1 .woocommerce-Button.button")
    private WebElementFacade loginButton;

    public void setUsernameField(String username) {
        typeInto(usernameField, username);
    }

    public void setPassField(String password) {
        typeInto(passField, password);
    }

    public void clickLoginButton() {
        clickOn(loginButton);

        }



    }







