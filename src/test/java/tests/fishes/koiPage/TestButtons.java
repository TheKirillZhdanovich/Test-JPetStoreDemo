package tests.fishes.koiPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddSpottedKoiToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().koiLinkClick().addSpottedKoi();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Koi')]")).getText()
                .contains("Spotted Koi"));
    }

    @Test
    public void testAddSpotlessKoiToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().koiLinkClick().addSpotlessKoi();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Koi')]")).getText()
                .contains("Spotless Koi"));
    }
}
