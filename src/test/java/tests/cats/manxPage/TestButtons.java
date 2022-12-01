package tests.cats.manxPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddTaillessManxToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnCatLogo().manxLinkClick().addTaillessManx();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Manx')]")).getText()
                .contains("Tailless"));
    }

    @Test
    public void testAddWithTailManxToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnCatLogo().manxLinkClick().addWithTailManx();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Manx')]")).getText()
                .contains("With tail"));
    }
}
