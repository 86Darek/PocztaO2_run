package PocztaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'AKCEPTUJĘ I PRZECHODZĘ DO SERWISU')]")
    WebElement cookies;

    public void clickCookies(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cookies));
        cookies.click();
    }


    @FindBy(xpath = "//*[@id=\"header-menu\"]/li[1]/label/span")
    WebElement poczta;
    public void clickPoczta(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(poczta));
        poczta.click();


    }
}
