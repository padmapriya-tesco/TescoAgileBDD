package Tesco;

import cucumber.annotation.After;
import cucumber.annotation.Before;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 24/04/2017.
 */
public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser(){
        browserSelector.selectBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
