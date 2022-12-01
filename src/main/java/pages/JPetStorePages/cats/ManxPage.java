package pages.JPetStorePages.cats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class ManxPage extends BasePage {
    public ManxPage(WebDriver driver) {
        super(driver);
    }

    private final By taillessManxAddButton = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-14']");
    private final By withTailManxAddButton = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-15']");

    public ShoppingCard addTaillessManx() {
        driver.findElement(taillessManxAddButton).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addWithTailManx() {
        driver.findElement(withTailManxAddButton).click();
        return new ShoppingCard(driver);
    }
}
