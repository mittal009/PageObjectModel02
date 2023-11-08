import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserManager extends Utils
{ String browserName = "Chrome";
    public void openBrowser()
    {    //to open site in Chrome browser
        if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            //to open site in firefox browser
        }else if (browserName.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            //to open site in edge browser
        }else if (browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver", "src/test/resources/Drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        } // when does not open in right browser print wrong browser name
        else {
            System.out.println("Wrong browsername  :"+browserName);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser()
    {
//        driver.quit();
    }



}
