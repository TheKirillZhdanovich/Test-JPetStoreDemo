package pages.JPetStorePages.reptiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.MainPage;

public class ReptilesMainPage extends BasePage {
    public ReptilesMainPage(WebDriver driver) {
        super(driver);
    }

    private final By returnToMainPageButton = By.xpath("//div[@id='BackLink']//a");
    private final By rattlesnakeLink = By.xpath("//a[contains(text(), 'SN-01')]");
    private final By iguanaLink = By.xpath("//a[contains(text(), 'LI-02')]");

    public MainPage returnToMainPage() {
        driver.findElement(returnToMainPageButton).click();
        return new MainPage(driver);
    }

    public RattlesnakePage rattlesnakeLinkClick() {
        driver.findElement(rattlesnakeLink).click();
        return new RattlesnakePage(driver);
    }

    public IguanaPage iguanaLinkClick() {
        driver.findElement(iguanaLink).click();
        return new IguanaPage(driver);
    }
}
