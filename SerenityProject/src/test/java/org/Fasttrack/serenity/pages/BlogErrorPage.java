package org.Fasttrack.serenity.pages;

import Utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/wp-comments-post.php")
public class BlogErrorPage extends PageObject {
    @FindBy(css="#error-page")
    private WebElementFacade blogError;

    @FindBy(css="#error-page")
    private WebElementFacade blogEmailError;

    @FindBy(css="#error-page")
    private WebElementFacade blogDuplicateComment;

    @FindBy(css="a[href*=\"back\"]")
    private  WebElementFacade backLink;
    public boolean checkNameEmailErrorText(){
        return blogError.containsText(Constants.BLOG_NAME_EMAIL_ERROR);
    }

    public void backToBlogPage(){
        backLink.click();
    }

    public boolean checkEmailErrorText(){
        return blogError.containsText(Constants.BLOG_EMAIL_ERROR);
    }

    public boolean checkDuplicateCommentErrorText(){
        return blogDuplicateComment.containsText(Constants.DUPLICATE_COMMENT);
    }

}
