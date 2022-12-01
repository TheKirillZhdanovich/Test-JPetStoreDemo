package tests.fishes.angelfishPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddLargeAngelfishToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().angelFishLinkClick().addLargeAngelfish();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Large')]")).getText()
                .contains("Large Angelfish"));
    }

    @Test
    public void testAddSmallAngelfishToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().angelFishLinkClick().addSmallAngelfish();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Small')]")).getText()
                .contains("Small Angelfish"));
    }
}
