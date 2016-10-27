package cucumber.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class Actions {
    private static final Logger LOG = Logger.getLogger(Actions.class);

    public static void refreshPage() {
        DriverRepository.getDriver().navigate().refresh();
    }

    public static void waitUntilElementsNotVisible(List<WebElement> elements, int sec) {
        LOG.info("Waiting sec until elements won't be visible.");
        Wait wait = new WebDriverWait(DriverRepository.getDriver(), sec);
        wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
    }

    public static void highLightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverRepository.getDriver();

        js.executeScript(
                "arguments[0].setAttribute('style', 'background: yellow;');",
                element);
    }

    public static void click(WebElement element) {
        LOG.info("Clicking on a button.");
        highLightElement(element);
        element.click();
    }

    public static void type(WebElement element, String str) {
        LOG.info("Typing into field text : " + str);
        highLightElement(element);
        element.sendKeys(str);
    }

    public static void waitForUrlToBe(String url) {
        LOG.info("Waiting for the url to be : " + url);
        Wait wait = new WebDriverWait(DriverRepository.getDriver(), 10);
        wait.until(ExpectedConditions.urlToBe(url));
    }
}