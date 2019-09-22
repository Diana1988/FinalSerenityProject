package org.Fasttrack.serenity.features.search;

import Utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.Fasttrack.serenity.pages.AccountPage;
import org.Fasttrack.serenity.pages.BlogPage;
import org.Fasttrack.serenity.steps.serenity.BlogSteps;
import org.Fasttrack.serenity.steps.serenity.HomepageSteps;
import org.Fasttrack.serenity.steps.serenity.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@RunWith(SerenityRunner.class)
public class BlogTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    BlogSteps blogSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    HomepageSteps homepageSteps;

    BlogPage blogPage;
    AccountPage myAccountPage;
    private static String differentComments = randomAlphabetic(15);

    @Before
    public void maximizeScreen() {
        driver.manage().window().maximize();
    }

    @Test
    public void goToAndVerifyBlogPageIsDisplay() {
        blogPage.open();
        blogSteps.verifyIfBlogPageIsDisplayed();
    }


    @Test
    public void writeJustInCommentFieldAndPostIt() {
        goToAndVerifyBlogPageIsDisplay();
        blogPage.typeIntoCommentField(differentComments);
        blogPage.clickOnPostCommentButton();
        blogSteps.verifyRequiredFieldsErrorPage();
    }


    @Test
    public void writeCommentAndNameAndPostIt() {
        goToAndVerifyBlogPageIsDisplay();
        blogPage.typeIntoCommentField(differentComments);
        blogPage.typeIntoNameField(Constants.NAME);
        blogPage.clickOnPostCommentButton();
        blogSteps.verifyRequiredFieldsErrorPage();

    }


    @Test
    public void writeCommentNameAndInvalidEmailAndPostIt() {
        goToAndVerifyBlogPageIsDisplay();
        blogPage.typeIntoCommentField(differentComments);
        blogPage.typeIntoNameField(Constants.NAME);
        blogPage.typeIntoEmailField(Constants.BLOG_INVALID_EMAIL);
        blogPage.clickOnPostCommentButton();
        blogSteps.verifyValidEmailAddress();
    }


    @Test
    public void writeDuplicateComment() {
        goToAndVerifyBlogPageIsDisplay();
        blogPage.typeIntoCommentField(Constants.BLOG_COMMENT);
        blogPage.typeIntoNameField(Constants.NAME);
        blogPage.typeIntoEmailField(Constants.VALID_USERNAME);
        blogPage.clickOnPostCommentButton();
        blogSteps.sleep(1);
        blogPage.typeIntoCommentField(Constants.BLOG_COMMENT);
        blogPage.clickOnPostCommentButton();
        blogSteps.sleep(1);
        blogSteps.verifyDuplicateCommentErrorPage();

    }
}
