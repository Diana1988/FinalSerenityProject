package org.Fasttrack.serenity.features.search;

import Utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import org.Fasttrack.serenity.steps.serenity.HomepageSteps;
import org.Fasttrack.serenity.steps.serenity.LoginSteps;
import org.Fasttrack.serenity.steps.serenity.MyAccountSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximiseWindow() {
        driver.manage().window().maximize();
    }

    @Before
    public void goToLoginPage(){
        loginSteps.goToLogin();
    }


    @Steps
    LoginSteps loginSteps;
    @Steps
    HomepageSteps homepageSteps;
    @Steps
    MyAccountSteps myAccountSteps;



    @Test
    public void loginWithValidCredentials(){
        loginSteps.doLogin(Constants.VALID_USERNAME, Constants.VALID_PASSWORD);
        loginSteps.verifyLoggedIn();

}

    @Test
    public void loginWithBlankPassword() {
        loginSteps.doLogin(Constants.VALID_USERNAME, Constants.BLANK_PASSWORD);
        loginSteps.verifyNotLoggedInBlankPassword();

    }
    @Test
    public void loginWithBlankUsername(){
        loginSteps.doLogin(Constants.BLANK_USERNAME, Constants.VALID_PASSWORD);
        loginSteps.verifyNotLoggedInBlankUsername();
    }


    @Test
    public void loginWithInvalidEmailAddress(){
        loginSteps.doLogin(Constants.INVALID_USERNAME_EMAIL_ADDRESS, Constants.VALID_PASSWORD);
        loginSteps.verifyNotLoggedInInvalidEmailAddress();
    }
    @Test
    public void loginWithInvalidUsername() {
        loginSteps.doLogin(Constants.INVALID_USERNAME, Constants.VALID_PASSWORD);
        loginSteps.verifyNotLoggedInInvalidUsername();
    }
    @Test
    public void loginWithInvalidPassword(){
        loginSteps.doLogin(Constants.VALID_USERNAME, Constants.INVALID_PASSWORD);
        loginSteps.verifyNotLoggedInInvalidPassword();
    }


    @Test
    public void logOut(){
        loginWithValidCredentials();
        loginSteps.logOutFromMyAccountPage();
        loginSteps.verifyLoggedOut();

    }
    @Test
    public void register(){
        loginSteps.register();

    }

    @Test
    public void rememberMeOption(){
        myAccountSteps.setUsernameAddress(Constants.VALID_USERNAME);
        myAccountSteps.setPassword(Constants.VALID_PASSWORD);
        myAccountSteps.rememberMeOptionEnable();
        myAccountSteps.loginButton();
        myAccountSteps.openMyAccountPage();
        loginSteps.verifyLoggedIn();
        loginSteps.logOutFromMyAccountPage();
        loginSteps.verifyLoggedOut();
    }

}


