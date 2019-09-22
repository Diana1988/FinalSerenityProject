package org.Fasttrack.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends PageObject {
    //@FindBy(css="#main .entry-title")
    //@FindBy(css="#main article")
    //@FindBy(css="#main h3")
    //@FindBy(css="#main .entry-title a")
    @FindBy(css=".entry-title a")
    //@FindBy(css="#main article .entry-title")
    private List<WebElementFacade> resultsList;
    @FindBy(xpath="//*[@id=\"post-60\"]/div[2]/header/h3/a")
    private WebElementFacade cap;

    public boolean readSearchResults(String searchTerm) {
        for (WebElementFacade result : resultsList) {
            if (result.getText().contains(searchTerm)) {
                return true;
            }
        }
        return false;
    }

    @FindBy(css="#main article .entry-title")
    private List<WebElementFacade> listResults;

    public boolean verifySearchResults(String searchTerm){
        boolean rezultat=false;
        String textProdus=listResults.get(0).getText();
        if (textProdus.contains(searchTerm)){
            rezultat= true;
        }
        return rezultat;
    }

    public void clickOnTheSearchedProduct(String searchTerm) {
        for (WebElementFacade result : resultsList) {
            if (result.getText().contains(searchTerm)) {
                result.click();
            }
        }
    }
    public void clickOnTheSearchedProduct2(String searchTerm) {
        WebElementFacade result = resultsList.get(0);
        if (result.getText().contains(searchTerm)) {
            result.click();
        }

    }


}
