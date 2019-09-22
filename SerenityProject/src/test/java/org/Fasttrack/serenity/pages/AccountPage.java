package org.Fasttrack.serenity.pages;

import Utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class
AccountPage extends PageObject {
    HomePage homePage;

    @FindBy(id = "username")
    private WebElementFacade usernameField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(css = ".col-1 .woocommerce-Button.button")
    private WebElementFacade loginButton;
    @FindBy(css="#rememberme")
    private WebElementFacade rememberMeBoxCheck;
    @FindBy(css = ".woocommerce-MyAccount-content")
    private WebElementFacade welcomeTextParagraph;
    @FindBy(css = ".entry-title")
    private WebElementFacade myAccountHeader;
    @FindBy(css = ".hello strong")
    private WebElementFacade helloText;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade loginError;
    @FindBy(css = ".woocommerce-MyAccount-content a[href*=\"logout\"]")
    private WebElementFacade logOutButton;
    @FindBy(css = "#customer_login")
    private WebElementFacade loginForm;
    @FindBy(css="#reg_email")
    private WebElementFacade newUsernameField;
    @FindBy(css="#reg_password")
    private WebElementFacade newPasswordField;
    @FindBy(css=".woocommerce-Button[name='register']")
    private WebElementFacade registerButton;

    public void setNewUsernameField() {
        String newUsername= randomAlphabetic(8) +"@yahoo.com";
        typeInto(newUsernameField,newUsername);
    }
    public void setNewPasswordFieldPasswordField() {
        String newPassword= randomAlphabetic(13);
        typeInto(newPasswordField, newPassword);
    }
    public void clickRegisterButton() {
        clickOn(registerButton);

    }

        public void setUsernameField(String username) {
        typeInto(usernameField, username);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public void clickRememberMeCheckBox(){
        clickOn(rememberMeBoxCheck);
    }


    public boolean isLoggedIn(String username) {
        return helloText.containsText("Hello" + username);
    }

    public boolean checkNotLoggedInBlankPassword() {
        return loginError.containsText(Constants.PASSWORD_FIELD_EMPTY_MESSAGE);
    }

    public void clickLogOutButton() {
        clickOn(logOutButton);
    }

    public boolean checkLoggedOut() {
        return loginForm.containsText(Constants.LOGIN_FORM_DISPLAYED);
    }

    public boolean checkLoggedIn() {
        return welcomeTextParagraph.containsText(Constants.LOGIN_SUCCESS_MESSAGE);
    }

    public boolean checkNotLoggedInInvalidEmailAddress() {
        return loginError.containsText((Constants.INVALID_EMAIL_ADDRESS_MESSAGE));
    }

    public boolean checkNotLoggedInInvalidUsername() {
        return loginError.containsText(Constants.INVALID_USERNAME_MESSAGE);
    }
    public boolean checkNotLoggedInInvalidPassword(){
        return loginError.containsText(Constants.INVALID_PASSWORD_MESSAGE);
    }


    public boolean checkNotLoggedInBlankUsername(){
        return loginError.containsText(Constants.USERNAME_REQUIRED_MESSAGE);
    }
    public boolean checkHeaderTitle(){
        return myAccountHeader.containsText(Constants.MY_ACCOUNT_HEADER);
    }

}


