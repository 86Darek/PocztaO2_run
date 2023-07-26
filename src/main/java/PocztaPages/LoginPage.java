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

    @FindBy(xpath = "//button[contains(text(),'Przejdź do serwisu')] | //button[@class='rodo-popup-agree']")
    WebElement cookies;
    @FindBy(xpath = "//a[@class = 'switch-mail']")
    WebElement poczta;
    @FindBy(xpath = "//*[@id='email']")
    WebElement oknoLogowania;
    @FindBy(xpath = "//*[@id='password']")
    WebElement oknoHasla;
    @FindBy(xpath = "//button[text()='Zaloguj się']")
    WebElement kliknijZaloguj;
    @FindBy(xpath = "//span[text()='Nowa wiadomość']")
    WebElement newMessageButton;





    public void clickCookies() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cookies));
        cookies.click();
    }

    public void clickPoczta() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(poczta));
        poczta.click();
    }
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

    public void uzupelnienieHasla(String haslo) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(oknoHasla));
        oknoHasla.clear();
        oknoHasla.sendKeys(haslo);
    }
    public void klikniecieWoknoHasla() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(oknoHasla));
        oknoHasla.click();
    }
    public MailPage klikniecieWzaloguj() {
        webDriverWait.until(ExpectedConditions.visibilityOf(kliknijZaloguj));
        kliknijZaloguj.click();
        return new MailPage(driver);
    }
    public boolean isPasswordWindowVisible() {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(oknoHasla)).isDisplayed();
            return true;
        } catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean isNewMessageButtonVisible() {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(newMessageButton)).isDisplayed();
            return true;
        } catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}

