package pages.JPetStorePages.dogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class LabradorRetrieverPage extends BasePage {

    public LabradorRetrieverPage(WebDriver driver) {
        super(driver);
    }

    private final By maleLabradorRetriever = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-22']");
    private final By femaleLabradorRetriever = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-23']");

    public ShoppingCard addFemaleLabradorRetriever() {
        driver.findElement(femaleLabradorRetriever).click();
        return new ShoppingCard(driver);
    }

    public ShoppingCard addMaleLabradorRetriever() {
        driver.findElement(maleLabradorRetriever).click();
        return new ShoppingCard(driver);
    }
}
