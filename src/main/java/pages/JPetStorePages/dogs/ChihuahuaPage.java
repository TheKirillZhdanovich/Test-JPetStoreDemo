package pages.JPetStorePages.dogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class ChihuahuaPage extends BasePage {
    public ChihuahuaPage(WebDriver driver) {
        super(driver);
    }

    private final By maleChihuahua = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-26']");
    private final By femaleChihuahua = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-27']");

    public ShoppingCard addFemaleChihuahua() {
        driver.findElement(femaleChihuahua).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addMaleChihuahua() {
        driver.findElement(maleChihuahua).click();
        return new ShoppingCard(driver);
    }
}
