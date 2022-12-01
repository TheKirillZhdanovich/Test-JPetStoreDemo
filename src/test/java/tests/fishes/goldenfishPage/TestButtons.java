package tests.fishes.goldenfishPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddMaleGoldfishToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().goldfishLinkClick().addMaleGoldfish();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Male')]")).getText()
                .contains("Male Goldfish"));
    }

    @Test
    public void testAddFemaleGoldfishToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().goldfishLinkClick().addFemaleGoldfish();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Female')]")).getText()
                .contains("Female Goldfish"));
    }
}
