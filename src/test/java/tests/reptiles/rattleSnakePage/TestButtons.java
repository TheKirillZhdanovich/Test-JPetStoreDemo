package tests.reptiles.rattleSnakePage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddVenomlessRattlesnakeToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnReptileLogo().rattlesnakeLinkClick().addVenomlessRattlesnake();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Rattlesnake')]")).getText()
                .contains("Venomless"));
    }

    @Test
    public void testAddRattlessRattlesnakeToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnReptileLogo().rattlesnakeLinkClick().addRattlessRattlesnake();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Rattlesnake')]")).getText()
                .contains("Rattleless"));
    }
}
