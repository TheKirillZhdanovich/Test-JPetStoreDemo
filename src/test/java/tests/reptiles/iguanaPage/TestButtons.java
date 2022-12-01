package tests.reptiles.iguanaPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddIguanaToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnReptileLogo().iguanaLinkClick().addIguana();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Iguana')]")).getText()
                .contains("Iguana"));
    }
}
