package tests.dogs.chihuahuaPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddMaleChihuahuaToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().chihuahuaLinkClick().addMaleChihuahua();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Chihuahua')]")).getText()
                .contains("Male"));
    }

    @Test
    public void testAddFemaleChihuahuaToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().chihuahuaLinkClick().addFemaleChihuahua();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Chihuahua')]")).getText()
                .contains("Female"));
    }
}
