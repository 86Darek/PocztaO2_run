package PocztaTest;

import PocztaPages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest{

    WebDriver driver;
    Service service;
    LoginPage loginPage;



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
        LoginPage loginPage= new LoginPage(driver);

        loginPage.clickCookies();
        loginPage.clickPoczta();
        Assert.assertTrue(loginPage.isLoginWindowVisible(),"Okno logowania nie jest widoczne");
        loginPage.klikniecieWoknoLoginu();
        String nazwaUser = "darektest86@o2.pl";
        loginPage.uzupelnienieLoginu(nazwaUser);
        Assert.assertTrue(loginPage.isPasswordWindowVisible(),"Okno z hasłoem nie jest widoczne");
        loginPage.klikniecieWoknoHasla();
        String podajHaslo = "!QAZ2wsx";
        loginPage.uzupelnienieHasla(podajHaslo);
        loginPage.klikniecieWzaloguj();


    }
}
