package org.Fasttrack.serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.Fasttrack.serenity.pages.AccountPage;
import org.Fasttrack.serenity.pages.HomePage;
import org.Fasttrack.serenity.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps {

    private AccountPage accountPage;
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void goToLogin() {
        homePage.open();
        homePage.clickAccountPageLink();
    }

    @Step
    public void doLogin(String email, String password) {
        loginPage.setUsernameField(email);
        loginPage.setPassField(password);
        loginPage.clickLoginButton();

    }

    @Step
    public void verifyLoggedIn(){
        Assert.assertTrue(accountPage.checkLoggedIn());

    }
    @Step
    public void verifyNotLoggedInBlankUsername(){
        Assert.assertTrue(accountPage.checkNotLoggedInBlankUsername());
    }

    @Step
    public void verifyNotLoggedInBlankPassword() {
        Assert.assertTrue(accountPage.checkNotLoggedInBlankPassword());
    }

    @Step
    public void verifyNotLoggedInInvalidEmailAddress(){
        Assert.assertTrue(accountPage.checkNotLoggedInInvalidEmailAddress());
    }
    @Step
    public void verifyNotLoggedInInvalidUsername() {
        Assert.assertTrue(accountPage.checkNotLoggedInInvalidUsername());

    }
    @Step
    public void verifyNotLoggedInInvalidPassword(){
        Assert.assertTrue(accountPage.checkNotLoggedInInvalidPassword());
    }

    @Step
        public void logOutFromMyAccountPage () {
            accountPage.clickLogOutButton();
        }

        @Step
        public void verifyLoggedOut () {
            Assert.assertTrue(accountPage.checkLoggedOut());

        }
    @Step
    public void register(){
        accountPage.setNewUsernameField();
        accountPage.setNewPasswordFieldPasswordField();
        accountPage.clickRegisterButton();
        Assert.assertTrue(accountPage.checkLoggedIn());
    }

}

