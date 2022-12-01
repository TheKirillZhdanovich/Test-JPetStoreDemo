package pages.JPetStorePages.dogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class BulldogPage extends BasePage {
    public BulldogPage(WebDriver driver) {
        super(driver);
    }

    private final By maleBulldog = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-6']");
    private final By femaleBulldog = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-7']");

    public ShoppingCard addFemaleBulldog() {
        driver.findElement(femaleBulldog).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addMaleBulldog() {
        driver.findElement(maleBulldog).click();
        return new ShoppingCard(driver);
    }
}
