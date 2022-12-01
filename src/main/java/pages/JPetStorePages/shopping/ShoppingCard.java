package pages.JPetStorePages.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class ShoppingCard extends BasePage {
    public ShoppingCard(WebDriver driver) {
        super(driver);
    }

    private final By updateCardButton = By.xpath("//input[@name='updateCartQuantities']");
    private final By proceedCheckoutButton = By.xpath("//a[contains(text(), 'Proceed')]");
    private final By removeButton = By.xpath("//a[contains(text(), 'Remove')]");
    private final By qualityField = By.xpath("//input[@size='3']");

    public ShoppingCard updateCard() {
        driver.findElement(updateCardButton).click();
        return new ShoppingCard(driver);
    }

    public PayPage proceedCheckout() {
        driver.findElement(proceedCheckoutButton).click();
        return new PayPage(driver);
    }

    public ShoppingCard removeProductById(int id) {
        List<WebElement> removeButtons = driver.findElements(removeButton);
        removeButtons.get(id).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard setQualityProductById(int id, String quality) {
        List<WebElement> qualityFields = driver.findElements(qualityField);
        qualityFields.get(id).clear();
        qualityFields.get(id).sendKeys(quality);
        return new ShoppingCard(driver);
    }
}
