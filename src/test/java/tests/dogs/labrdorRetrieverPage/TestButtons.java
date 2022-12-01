package tests.dogs.labrdorRetrieverPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddMaleLabradorRetrieverToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().labradorRetrieverLinkClick().addMaleLabradorRetriever();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Labrador')]")).getText()
                .contains("Male"));
    }

    @Test
    public void testAddFemaleLabradorRetrieverToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().labradorRetrieverLinkClick().addFemaleLabradorRetriever();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Labrador')]")).getText()
                .contains("Female"));
    }
}
