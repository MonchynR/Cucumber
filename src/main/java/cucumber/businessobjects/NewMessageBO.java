package cucumber.businessobjects;

import cucumber.pageobjects.NewMessagePage;
import cucumber.util.Actions;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class NewMessageBO {
    private NewMessagePage newMessagePage;

    public NewMessageBO() {
        newMessagePage = new NewMessagePage();
    }

    public void sendMessage(String to, String subject, String message) {
        Actions.type(newMessagePage.getToField(), to);
        Actions.type(newMessagePage.getSubjectField(), subject);
        Actions.type(newMessagePage.getMessageField(), message);

        Actions.click(newMessagePage.getSendButton());

        List<WebElement> elements = new ArrayList<WebElement>();
        elements.add(newMessagePage.getToField());
        elements.add(newMessagePage.getSubjectField());

        Actions.waitUntilElementsNotVisible(elements, 10);
    }
}
