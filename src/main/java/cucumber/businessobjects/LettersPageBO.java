package cucumber.businessobjects;

import cucumber.pageobjects.PagesWithLetters;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class LettersPageBO {
    private PagesWithLetters pagesWithLetters;

    public LettersPageBO() {
        pagesWithLetters = new PagesWithLetters();
    }

    public String getMessageSubject(int index) {
        return pagesWithLetters.getAllMessagesSubject(index).getText();
    }
}
