package tests.shopping;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.JPetStorePages.authorization.SignInPage;
import pages.JPetStorePages.shopping.ShoppingCard;
import tests.BaseTest;

import java.util.List;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertEquals;

public class TestShoppingCard extends BaseTest {

    @Test
    public void TestRemove() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        SignInPage signInPage = basePage.signInLinkClick();
        signInPage.inputUsername("1997");
        signInPage.inputPassword("1997");
        signInPage.clickLoginButton();

        mainPage.clickOnReptileLogo().iguanaLinkClick().addIguana();
        driver.get(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnReptileLogo().rattlesnakeLinkClick().addRattlessRattlesnake();
        driver.get(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().chihuahuaLinkClick().addFemaleChihuahua();

        ShoppingCard shoppingCard = new ShoppingCard(driver);

        shoppingCard.removeProductById(2);

        List<WebElement> elements = driver.findElements(By.xpath("//a[contains(text(), 'Remove')]"));

        assertEquals(2, elements.size());
    }

    @Test
    public void testUpdate() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        SignInPage signInPage = basePage.signInLinkClick();
        signInPage.inputUsername("1997");
        signInPage.inputPassword("1997");
        signInPage.clickLoginButton();

        mainPage.clickOnReptileLogo().iguanaLinkClick().addIguana().setQualityProductById(0, "5").updateCard();

        WebElement element = driver.findElement(By.xpath("//input[@size='3']"));

        assertEquals("5", element.getAttribute("value"));
    }
}
