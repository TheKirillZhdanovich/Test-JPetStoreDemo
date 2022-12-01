package tests.dogs.poodlePage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddMalePoodleToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().poodleLinkClick().addMalePoodle();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Poodle')]")).getText()
                .contains("Poodle"));
    }
}
