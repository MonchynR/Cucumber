package cucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

;

/**
 * Created by Roman on 25.10.2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/cucumber/features/smoke"},
        glue = {"cucumber.stepsimpl"},
        plugin = {"html:target/cucumber-html-report"})
public class SmokeTestRunner {

}
