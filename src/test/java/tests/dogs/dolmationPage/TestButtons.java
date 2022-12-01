package tests.dogs.dolmationPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddMaleDalmationToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().dalmationLinkClick().addMaleDalmation();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Dalmation')]")).getText()
                .contains("Male"));
    }

    @Test
    public void testAddFemaleDalmationToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().dalmationLinkClick().addFemaleDalmation();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Dalmation')]")).getText()
                .contains("Female"));
    }
}
