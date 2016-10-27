package cucumber.stepsimpl;

import cucumber.api.java.en.Then;
import cucumber.businessobjects.HeaderMenuBO;
import cucumber.businessobjects.LettersPageBO;
import cucumber.util.Actions;

import static org.junit.Assert.*;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class Letters {
    private LettersPageBO lettersPageBO;
    private HeaderMenuBO headerMenuBO;

    public Letters() {
        lettersPageBO = new LettersPageBO();
        headerMenuBO = new HeaderMenuBO();
    }

    //  THEN

    @Then("^message appeared on sent page \"([^\"]*)\"$")
    public void message_appeared_on_sent_page(String subject) {
        headerMenuBO.openSentPage();
        headerMenuBO.waitForSentPageToLoad();
        Actions.refreshPage();
        headerMenuBO.waitForSentPageToLoad();
        assertEquals(subject, lettersPageBO.getMessageSubject(0));
    }

    @Then("^receiver received message and it appeared on inbox page \"([^\"]*)\"$")
    public void receiver_received_message_and_it_appeared_on_inbox_page(String subject) {
        headerMenuBO.openInboxPage();
        headerMenuBO.waitForInboxPageToLoad();
        Actions.refreshPage();
        headerMenuBO.waitForInboxPageToLoad();
        assertEquals(subject, lettersPageBO.getMessageSubject(0));
    }
}
