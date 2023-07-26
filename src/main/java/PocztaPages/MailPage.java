package PocztaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailPage extends BasePage {
    public MailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[@for='isSelectAllView']")
    WebElement selectAllMesageCheckbox;

    public void clickOdebrane() {
        webDriverWait.until(ExpectedConditions.visibilityOf(selectAllMesageCheckbox));
        selectAllMesageCheckbox.click();
    }


}