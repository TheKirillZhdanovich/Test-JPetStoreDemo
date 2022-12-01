package pages.JPetStorePages.birds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.shopping.ShoppingCard;

public class AmazonParrotPage extends BasePage {
    public AmazonParrotPage(WebDriver driver) {
        super(driver);
    }

    private final By addToCardButton = By.xpath("//a[@class]");

    public ShoppingCard clickToAddToCardButton() {
        driver.findElement(addToCardButton).click();
        return new ShoppingCard(driver);
    }
}
