package pages.JPetStorePages.dogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.MainPage;

public class DogsMainPage extends BasePage {
    public DogsMainPage(WebDriver driver) {
        super(driver);
    }

    private final By returnToMainPageButton = By.xpath("//div[@id='BackLink']//a");
    private final By bulldogLink = By.xpath("//a[contains(text(), 'BD-01')]");
    private final By poodleLink = By.xpath("//a[contains(text(), 'PO-02')]");
    private final By dalmationLink = By.xpath("//a[contains(text(), 'DL-01')]");
    private final By goldenRetrieverLink = By.xpath("//a[contains(text(), 'RT-01')]");
    private final By labradorRetrieverLink = By.xpath("//a[contains(text(), 'RT-02')]");
    private final By chihuahuaLink = By.xpath("//a[contains(text(), 'CW-01')]");

    public MainPage returnToMainPage() {
        driver.findElement(returnToMainPageButton).click();
        return new MainPage(driver);
    }

    public BulldogPage bulldogLinkClick() {
        driver.findElement(bulldogLink).click();
        return new BulldogPage(driver);
    }

    public PoodlePage poodleLinkClick() {
        driver.findElement(poodleLink).click();
        return new PoodlePage(driver);
    }

    public DalmationPage dalmationLinkClick() {
        driver.findElement(dalmationLink).click();
        return new DalmationPage(driver);
    }

    public GoldenRetrieverPage goldenRetrieverLinkClick() {
        driver.findElement(goldenRetrieverLink).click();
        return new GoldenRetrieverPage(driver);
    }

    public LabradorRetrieverPage labradorRetrieverLinkClick() {
        driver.findElement(labradorRetrieverLink).click();
        return new LabradorRetrieverPage(driver);
    }

    public ChihuahuaPage chihuahuaLinkClick() {
        driver.findElement(chihuahuaLink).click();
        return new ChihuahuaPage(driver);
    }
}
