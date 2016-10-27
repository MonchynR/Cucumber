package cucumber.pageobjects;

import cucumber.util.DriverRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Roman on 25.10.2016.
 */
public class LogInPage {
    @FindBy(id = "Email")
    private WebElement emailField;
    @FindBy(id = "Passwd")
    private WebElement passField;
    @FindBy(id = "next")
    private WebElement nextButton;
    @FindBy(id = "signIn")
    private WebElement signInButton;

    public LogInPage() {
        PageFactory.initElements(DriverRepository.getDriver(), this);
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPassField() {
        return passField;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }
}
