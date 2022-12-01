package pages.JPetStorePages.cats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.MainPage;

public class CatsMainPage extends BasePage {
    public CatsMainPage(WebDriver driver) {
        super(driver);
    }

    private final By returnToMainPageButton = By.xpath("//div[@id='BackLink']//a");
    private final By manxLinks = By.xpath("//a[contains(text(), 'DSH-01')]");
    private final By persianLinks = By.xpath("//a[contains(text(), 'DLH-02')]");

    public MainPage returnToMainPage() {
        driver.findElement(returnToMainPageButton).click();
        return new MainPage(driver);
    }

    public ManxPage manxLinkClick() {
        driver.findElement(manxLinks).click();
        return new ManxPage(driver);
    }

    public PersianPage persianLinksClick() {
        driver.findElement(persianLinks).click();
        return new PersianPage(driver);
    }
}
