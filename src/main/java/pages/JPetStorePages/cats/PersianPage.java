package pages.JPetStorePages.cats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class PersianPage extends BasePage {
    public PersianPage(WebDriver driver) {
        super(driver);
    }

    private final By femalePersianAddButton = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-16']");
    private final By malePersianAddButton = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-17']");

    public ShoppingCard addFemalePersian() {
        driver.findElement(femalePersianAddButton).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addMalePersian() {
        driver.findElement(malePersianAddButton).click();
        return new ShoppingCard(driver);
    }
}
