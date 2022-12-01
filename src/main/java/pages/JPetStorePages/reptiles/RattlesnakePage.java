package pages.JPetStorePages.reptiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class RattlesnakePage extends BasePage {
    public RattlesnakePage(WebDriver driver) {
        super(driver);
    }

    private final By venomlessRattlesnake = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-11']");
    private final By rattlessRattlesnake = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-12']");

    public ShoppingCard addVenomlessRattlesnake() {
        driver.findElement(venomlessRattlesnake).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addRattlessRattlesnake() {
        driver.findElement(rattlessRattlesnake).click();
        return new ShoppingCard(driver);
    }
}
