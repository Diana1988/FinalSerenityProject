package org.Fasttrack.serenity.pages;

import Utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/blog")
public class BlogPage extends PageObject {


    @FindBy(css = "entry-title")
    private WebElementFacade blogTitle;

    @FindBy(css = ".entry-header")
    private WebElementFacade blogHeader;

    @FindBy(css = "textarea[name='comment']")
    private WebElementFacade commentField;

    @FindBy(css = "#submit")
    private WebElementFacade postCommentButton;

    @FindBy(css = "#author")
    private WebElementFacade blogNameField;
    @FindBy(css="#email")
    private WebElementFacade blogEmailField;



    public boolean checkHeaderTitle() {
        return blogHeader.containsText(Constants.HEADER_BLOG_PAGE);
    }

    public void clickInCommentField() {
        clickOn(commentField);
    }

    public void typeIntoCommentField(String comment) {
        typeInto(commentField, comment);
    }

    public String getTextFromCommentField() {
        return commentField.getText();
    }

    public void clickOnPostCommentButton() {
        clickOn(postCommentButton);
    }

    public boolean checkCommentDisplayed() {
        return commentField.containsText(Constants.BLOG_COMMENT);
    }

    public void typeIntoNameField(String name) {
        typeInto(blogNameField, name);
    }

    public void typeIntoEmailField(String email) {
        typeInto(blogEmailField, email);

    }
}