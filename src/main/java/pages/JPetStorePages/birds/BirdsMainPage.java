package pages.JPetStorePages.birds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.MainPage;

public class BirdsMainPage extends BasePage {
    public BirdsMainPage(WebDriver driver) {
        super(driver);
    }

    private final By returnToMainPageButton = By.xpath("//div[@id='BackLink']//a");
    private final By amazonParrotLinks = By.xpath("//a[contains(text(), 'CB-01')]");
    private final By finchLinks = By.xpath("//a[contains(text(), 'SB-02')]");

    public MainPage returnToMainPage() {
        driver.findElement(returnToMainPageButton).click();
        return new MainPage(driver);
    }

    public AmazonParrotPage amazonParrotLinkClick() {
        driver.findElement(amazonParrotLinks).click();
        return new AmazonParrotPage(driver);
    }

    public FinchPage finchLinkClick() {
        driver.findElement(finchLinks).click();
        return new FinchPage(driver);
    }
}
