package PocztaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest{

    WebDriver driver;
    Service service;

    @BeforeMethod(alwaysRun = true)
    public void runBrowser() {
        driver = new ChromeDriver();
        service = new Service(driver);
        System.setProperty(service.chromeDriver(), service.getDriver());
        driver.get(service.urlStringO2());
        driver.manage().window().maximize();
    }
    @Test
    public void logowanieO2(){

    }
}
