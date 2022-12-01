package tests.cats.persianPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddMalePersianToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnCatLogo().persianLinksClick().addMalePersian();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Persian')]")).getText()
                .contains("Male"));
    }

    @Test
    public void testAddFemalePersianToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnCatLogo().persianLinksClick().addFemalePersian();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Persian')]")).getText()
                .contains("Female"));
    }
}
