package tests.birds.finchPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddMaleFinchToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnBirdBigLogo().finchLinkClick().clickToAddToCardButton();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Finch')]")).getText()
                .contains("Male"));
    }
}
