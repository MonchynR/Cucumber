package cucumber.pageobjects;

import cucumber.util.DriverRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class PagesWithLetters {
    @FindBy(css = "div[class *= 'y6'] span:first-child")
    private List<WebElement> allMessagesSubject;

    public PagesWithLetters() {
        PageFactory.initElements(DriverRepository.getDriver(), this);
    }

    public WebElement getAllMessagesSubject(int index) {
        return allMessagesSubject.get(index);
    }
}
