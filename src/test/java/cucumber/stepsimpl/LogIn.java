package cucumber.stepsimpl;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.businessobjects.HeaderMenuBO;
import cucumber.businessobjects.LogInBO;
import cucumber.pageobjects.LogInPage;
import cucumber.util.Actions;
import cucumber.util.DriverRepository;
import org.junit.Assert;

/**
 * Created by Roman on 25.10.2016.
 */
public class LogIn {

    private LogInBO logInBO;
    private HeaderMenuBO headerMenuBO;

    public LogIn() {
        logInBO = new LogInBO();
        headerMenuBO = new HeaderMenuBO();
    }

    //  GIVEN

    @Given("^log in with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void log_in_with_email_and_password(String email, String password) {
        logInBO.logIn(email, password);
    }

    //  WHEN

    @When("^enter valid email \"([^\"]*)\" and press next button$")
    public void enter_valid_email_and_press_next_button(String email) {
        logInBO.enterEmail(email);
    }

    @When("^enter valid password \"([^\"]*)\" and press log in button$")
    public void enter_valid_password_and_press_log_in_button(String password) {
        logInBO.enterPassword(password);
    }

    //  THEN

    @Then("^user \"([^\"]*)\" should be able to log in successfully$")
    public void user_should_be_able_to_log_in_successfully(String email) {
        headerMenuBO.waitForInboxPageToLoad();
        Assert.assertTrue(DriverRepository.getDriver().getTitle().contains(email));
    }

    @Then("^close the browser$")
    public void close_the_browser() {
        DriverRepository.closeBrowser();
    }
}