package tests.fishes.tigerSharkPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddTigerSharkToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().tigerSharkLinkClick().addTigerShark();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Tiger')]")).getText()
                .contains("Tiger Shark"));
    }
}
