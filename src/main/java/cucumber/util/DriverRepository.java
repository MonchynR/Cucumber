package cucumber.util;

import cucumber.pageobjects.LogInPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Roman on 25.10.2016.
 */
public class DriverRepository {

    private static WebDriver driver;
    private static final Logger LOG = Logger.getLogger(DriverRepository.class);

    private DriverRepository() {
    }

    public static LogInPage createDriver(String browser) {
        if (browser.equalsIgnoreCase(Data.BROWSER_CHROME)) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Data.WEBSITE);

        LOG.info("Driver created.");
        return new LogInPage();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeBrowser() {
        try {
            if (driver != null) {
                driver.quit();
                driver = null;
                LOG.info("Driver closed.");
            }
        } catch (Exception e) {
            LOG.error(e.toString());
        }
    }
}
