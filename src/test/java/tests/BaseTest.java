package tests;

import common.CommonActions;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.MainPage;

import static common.CommonActions.createDriver;
import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected static final WebDriver driver = createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MainPage mainPage = new MainPage(driver);

    @After
    public void clearCookiesAndLocalStorage() {
        if(CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterClass
    public static void close() {
        if(!HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

}
