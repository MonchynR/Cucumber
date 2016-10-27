package cucumber.stepsimpl;

import cucumber.api.java.After;
import cucumber.util.DriverRepository;

/**
 * Created by Roman on 27.10.2016.
 */
public class Hooks {
    @After
    public void tearDown() {
        DriverRepository.closeBrowser();
    }
}
