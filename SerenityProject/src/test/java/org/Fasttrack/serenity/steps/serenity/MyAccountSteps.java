package org.Fasttrack.serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.Fasttrack.serenity.pages.AccountPage;
import org.junit.Assert;

public class MyAccountSteps extends ScenarioSteps {
        AccountPage myAccountPage;
    @Step
    public void verifyIfMyAccountPageIsDisplayed(){
        Assert.assertTrue(myAccountPage.checkHeaderTitle());
    }

    @Step
    public void openMyAccountPage(){
        myAccountPage.open();
    }

    @Step
    public void setUsernameAddress(String username){
        myAccountPage.setUsernameField(username);
    }
    @Step
    public void setPassword(String password){
        myAccountPage.setPasswordField(password);
    }
    @Step
    public void rememberMeOptionEnable(){
        myAccountPage.clickRememberMeCheckBox();
    }
    @Step
    public void loginButton(){
        myAccountPage.clickLoginButton();
    }

}


