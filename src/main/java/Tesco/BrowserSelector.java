package Tesco;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Dell on 24/04/2017.
 */
public class BrowserSelector extends BasePage {

    LoadProp loadprop = new LoadProp();
    //This will Run Browser From Intellij
    String browser = loadprop.getProperty("browser");


    public void selectBrowser(){

        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();

        }else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\IdeaProjects\\Tesco\\src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
            DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\Users\\Dell\\IdeaProjects\\Tesco\\src\\test\\Resources\\BrowserDrivers\\IEDriverServer.exe");
            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
            driver = new InternetExplorerDriver();

        }else{
            System.out.println("Browser Name is Wrong");
        }
    }
}
