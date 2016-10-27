package cucumber.pageobjects;

import cucumber.util.DriverRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class NewMessagePage {
    @FindBy(name = "to")
    private WebElement toField;
    @FindBy(name = "subjectbox")
    private WebElement subjectField;
    @FindBy(css = "div[class *= 'editable LW']")
    private WebElement messageField;
    @FindBy(css = "td[class *= 'gU Up']")
    private WebElement sendButton;

    public NewMessagePage() {
        PageFactory.initElements(DriverRepository.getDriver(), this);
    }

    public WebElement getToField() {
        return toField;
    }

    public WebElement getSubjectField() {
        return subjectField;
    }

    public WebElement getMessageField() {
        return messageField;
    }

    public WebElement getSendButton() {
        return sendButton;
    }
}
