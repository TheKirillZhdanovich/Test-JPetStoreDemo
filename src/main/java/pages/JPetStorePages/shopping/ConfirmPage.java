package pages.JPetStorePages.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ConfirmPage extends BasePage {
    public ConfirmPage(WebDriver driver) {
        super(driver);
    }

    private final By confirmButton = By.xpath("//a[@class]");

    public void clickToConfirmButton() {
        driver.findElement(confirmButton).click();
    }
}
