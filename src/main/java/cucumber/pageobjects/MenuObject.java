package cucumber.pageobjects;

import cucumber.util.DriverRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class MenuObject {
    @FindBy(className = "z0")
    private WebElement newMessage;
    @FindBy(css = "a[href *= 'https://mail.google.com/mail/u/0/#inbox']")
    private WebElement inbox;
    @FindBy(css = "a[href *= 'https://mail.google.com/mail/u/0/#sent']")
    private WebElement sent;

    public MenuObject() {
        PageFactory.initElements(DriverRepository.getDriver(), this);
    }

    public WebElement getNewMessage() {
        return newMessage;
    }

    public WebElement getInbox() {
        return inbox;
    }

    public WebElement getSent() {
        return sent;
    }
}
