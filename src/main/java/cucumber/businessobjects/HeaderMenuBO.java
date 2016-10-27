package cucumber.businessobjects;

import cucumber.pageobjects.MenuObject;
import cucumber.util.Actions;
import cucumber.util.Data;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class HeaderMenuBO {
    private MenuObject menuObject;

    public HeaderMenuBO() {
        menuObject = new MenuObject();
    }

    public void openSentPage() {
        Actions.click(menuObject.getSent());
    }

    public void openNewMessageObject() {
        Actions.click(menuObject.getNewMessage());
    }

    public void openInboxPage() {
        Actions.click(menuObject.getInbox());
    }

    public void waitForInboxPageToLoad() {
        Actions.waitForUrlToBe(Data.INBOX_PAGE);
    }

    public void waitForSentPageToLoad() {
        Actions.waitForUrlToBe(Data.SENT_PAGE);
    }
}
