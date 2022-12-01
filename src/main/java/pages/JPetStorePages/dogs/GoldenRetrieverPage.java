package pages.JPetStorePages.dogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class GoldenRetrieverPage extends BasePage {
    public GoldenRetrieverPage(WebDriver driver) {
        super(driver);
    }
    private final By femaleGoldenRetriever = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-28']");

    public ShoppingCard addFemaleGoldenRetriever() {
        driver.findElement(femaleGoldenRetriever).click();
        return new ShoppingCard(driver);
    }

}
