package pages.JPetStorePages.fishes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.MainPage;

public class FishMainPage extends BasePage {
    public FishMainPage(WebDriver driver) {
        super(driver);
    }

    private final By returnToMainPageButton = By.xpath("//div[@id='BackLink']//a");
    private final By angelfishLink = By.xpath("//a[contains(text(), 'SW-01')]");
    private final By tigerSharkLink = By.xpath("//a[contains(text(), 'SW-02')]");
    private final By koiLink = By.xpath("//a[contains(text(), 'FW-01')]");
    private final By goldfishLink = By.xpath("//a[contains(text(), 'FW-02')]");

    public MainPage returnToMainPage() {
        driver.findElement(returnToMainPageButton).click();
        return new MainPage(driver);
    }

    public AngelfishPage angelFishLinkClick() {
        driver.findElement(angelfishLink).click();
        return new AngelfishPage(driver);
    }

    public TigerSharkPage tigerSharkLinkClick() {
        driver.findElement(tigerSharkLink).click();
        return new TigerSharkPage(driver);
    }

    public KoiPage koiLinkClick() {
        driver.findElement(koiLink).click();
        return new KoiPage(driver);
    }

    public GoldfishPage goldfishLinkClick() {
        driver.findElement(goldfishLink).click();
        return new GoldfishPage(driver);
    }
}
