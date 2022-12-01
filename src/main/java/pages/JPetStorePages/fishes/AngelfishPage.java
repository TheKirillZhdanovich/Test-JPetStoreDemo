package pages.JPetStorePages.fishes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class AngelfishPage extends BasePage {
    public AngelfishPage(WebDriver driver) {
        super(driver);
    }

    private final By largeAngelfish = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-1']");
    private final By smallAngelfish = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-2']");

    public ShoppingCard addLargeAngelfish() {
        driver.findElement(largeAngelfish).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addSmallAngelfish() {
        driver.findElement(smallAngelfish).click();
        return new ShoppingCard(driver);
    }
}
