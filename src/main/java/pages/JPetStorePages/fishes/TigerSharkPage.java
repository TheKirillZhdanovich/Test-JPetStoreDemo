package pages.JPetStorePages.fishes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class TigerSharkPage extends BasePage {
    public TigerSharkPage(WebDriver driver) {
        super(driver);
    }

    private final By tigerShark = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-3']");

    public ShoppingCard addTigerShark() {
        driver.findElement(tigerShark).click();
        return new ShoppingCard(driver);
    }
}
