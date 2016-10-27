package cucumber.businessobjects;

import cucumber.pageobjects.LogInPage;
import cucumber.util.Actions;
import cucumber.util.Data;
import cucumber.util.DriverRepository;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class LogInBO {
    private LogInPage logInPage;

    public LogInBO() {
        logInPage = DriverRepository.createDriver(Data.BROWSER_CHROME);
    }

    public void logIn(String email, String password) {
        Actions.type(logInPage.getEmailField(), email);
        Actions.click(logInPage.getNextButton());

        Actions.type(logInPage.getPassField(), password);
        Actions.click(logInPage.getSignInButton());
    }

    public void enterEmail(String email) {
        Actions.type(logInPage.getEmailField(), email);
        Actions.click(logInPage.getNextButton());
    }

    public void enterPassword(String password) {
        Actions.type(logInPage.getPassField(), password);
        Actions.click(logInPage.getSignInButton());
    }
}
