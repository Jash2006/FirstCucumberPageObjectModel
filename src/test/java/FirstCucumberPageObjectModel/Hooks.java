package FirstCucumberPageObjectModel;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProps props = new LoadProps();
    @Before
    public void setupBrowser(){
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(props.getProperty("url"));
    }

    @After
    public void closeBrowser(){
        driver.close();
    }
}
