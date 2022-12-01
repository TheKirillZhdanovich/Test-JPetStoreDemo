package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.JPetStorePages.MainPage;
import pages.JPetStorePages.authorization.MyAccountPage;
import pages.JPetStorePages.authorization.SignInPage;
import pages.JPetStorePages.shopping.ShoppingCard;

import java.time.Duration;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {
    protected final WebDriver driver;
    private final By searchFields = By.xpath("//input[@name='keyword']");
    private final By searchButton = By.xpath("//input[@name='searchProducts']");
    private final By shoppingCard = By.xpath("//img[@name='img_cart']");
    private final By signInLink = By.xpath("//a[contains(text(), 'Sign')]");
    private final By signOutLink = By.xpath("//a[contains(text(), 'Sign')]");
    private final By myAccountLink = By.xpath("//a[contains(text(), 'My')]");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void search(String s) {
        driver.findElement(searchFields).sendKeys(s);
        driver.findElement(searchButton).click();
    }

    public ShoppingCard openShoppingCard() {
        driver.findElement(shoppingCard).click();
        return new ShoppingCard(driver);
    }

    public SignInPage signInLinkClick() {
        driver.findElement(signInLink).click();
        return new SignInPage(driver);
    }

    public MainPage signOutLinkClick() {
        driver.findElement(signOutLink).click();
        return new MainPage(driver);
    }

    public MyAccountPage myAccountLinkClick() {
        driver.findElement(myAccountLink).click();
        return new MyAccountPage(driver);
    }
}
