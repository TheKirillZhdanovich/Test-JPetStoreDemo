package pages.JPetStorePages.fishes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class KoiPage extends BasePage {
    public KoiPage(WebDriver driver) {
        super(driver);
    }

    private final By spottedKoi = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-4']");
    private final By spotlessKoi = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-5']");

    public ShoppingCard addSpottedKoi() {
        driver.findElement(spottedKoi).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addSpotlessKoi() {
        driver.findElement(spotlessKoi).click();
        return new ShoppingCard(driver);
    }
}
