package PocztaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'AKCEPTUJĘ I PRZECHODZĘ DO SERWISU')]")
    WebElement cookies;

    public void clickCookies() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cookies));
        cookies.click();
    }


    @FindBy(xpath = "//*[@id=\"header-menu\"]/li[1]/label/span")
    WebElement poczta;

    public void clickPoczta() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(poczta));
        poczta.click();
    }

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/input")
    WebElement oknoLogowania;

    public boolean isLoginWindowVisible() {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(oknoLogowania)).isDisplayed();
            return true;
        } catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void uzupelnienieLoginu(String loginDoEmail) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(oknoLogowania));
        oknoLogowania.clear();
        oknoLogowania.sendKeys(loginDoEmail);
    }

    public void klikniecieWoknoLoginu() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(oknoLogowania));
        oknoLogowania.click();

    }

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div[2]/input")
    WebElement oknoHasla;

    public boolean isPasswordWindowVisible() {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(oknoHasla)).isDisplayed();
            return true;
        } catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void uzupelnienieHasla(String haslo) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(oknoHasla));
        oknoHasla.clear();
        oknoHasla.sendKeys(haslo);
    }

    public void klikniecieWoknoHasla() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(oknoHasla));
        oknoHasla.click();
    }

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div[3]/button")
    WebElement kliknijZaloguj;

    public MailPage klikniecieWzaloguj() {
        webDriverWait.until(ExpectedConditions.visibilityOf(kliknijZaloguj));
        kliknijZaloguj.click();
        return new MailPage(driver);
    }

}

