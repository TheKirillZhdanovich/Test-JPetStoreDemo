package pages.JPetStorePages.dogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class PoodlePage extends BasePage {
    public PoodlePage(WebDriver driver) {
        super(driver);
    }

    private final By malePoodle = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-8']");

    public ShoppingCard addMalePoodle() {
        driver.findElement(malePoodle).click();
        return new ShoppingCard(driver);
    }
}
