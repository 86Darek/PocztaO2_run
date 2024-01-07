package PocztaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Service {
        WebDriver driver;
        WebDriverWait webDriverWait;
        private static final int TIMEOUT = 10;

        public Service(WebDriver driver) {
            this.driver = driver;
            webDriverWait = new WebDriverWait(driver, TIMEOUT);
            PageFactory.initElements(driver, this);
        }

    public String chromeDriver() {
        return "webdriver.chrome.driver";
    }

    public String urlStringO2() {
        return "https://www.interia.pl/";
    }

    public String getDriver() {
       return "D:/drivery/chromedriver.exe";
        //return "C:/Drivers/chromedriver.exe";
    }
}
