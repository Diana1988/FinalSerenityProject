package org.Fasttrack.serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.Fasttrack.serenity.pages.AccountPage;
import org.Fasttrack.serenity.pages.BlogErrorPage;
import org.Fasttrack.serenity.pages.BlogPage;
import org.junit.Assert;

public class BlogSteps extends ScenarioSteps {
    BlogPage blogPage;
    AccountPage myAccountPage;
    BlogErrorPage blogErrorPage;


    @Step
    public void verifyIfBlogPageIsDisplayed() {
        Assert.assertTrue(blogPage.checkHeaderTitle());
    }

    @Step
    public void verifyRequiredFieldsErrorPage() {
        Assert.assertTrue(blogErrorPage.checkNameEmailErrorText());
    }

    @Step
    public void verifyValidEmailAddress() {
        Assert.assertTrue(blogErrorPage.checkEmailErrorText());
    }

    @Step
    public void verifyIfDisplayedTheTypedComment() {
        Assert.assertTrue(blogPage.checkCommentDisplayed());
    }

    @Step
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        @Step
        public void verifyDuplicateCommentErrorPage() {
            Assert.assertTrue(blogErrorPage.checkDuplicateCommentErrorText());
        }

    }

