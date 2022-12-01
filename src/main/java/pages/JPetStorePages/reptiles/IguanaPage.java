package pages.JPetStorePages.reptiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class IguanaPage extends BasePage {
    public IguanaPage(WebDriver driver) {
        super(driver);
    }

    private final By iguana = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-13']");

    public ShoppingCard addIguana() {
        driver.findElement(iguana).click();
        return new ShoppingCard(driver);
    }
}
