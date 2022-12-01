package pages.JPetStorePages.fishes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class GoldfishPage extends BasePage {
    public GoldfishPage(WebDriver driver) {
        super(driver);
    }

    private final By maleGoldfish = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-20']");
    private final By femaleGoldfish = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-21']");

    public ShoppingCard addFemaleGoldfish() {
        driver.findElement(femaleGoldfish).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addMaleGoldfish() {
        driver.findElement(maleGoldfish).click();
        return new ShoppingCard(driver);
    }
}
