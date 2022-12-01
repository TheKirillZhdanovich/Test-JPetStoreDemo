package pages.JPetStorePages.dogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class DalmationPage extends BasePage {
    public DalmationPage(WebDriver driver) {
        super(driver);
    }

    private final By maleDalmation = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-9']");
    private final By femaleDalmation = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-10']");

    public ShoppingCard addFemaleDalmation() {
        driver.findElement(femaleDalmation).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addMaleDalmation() {
        driver.findElement(maleDalmation).click();
        return new ShoppingCard(driver);
    }
}
