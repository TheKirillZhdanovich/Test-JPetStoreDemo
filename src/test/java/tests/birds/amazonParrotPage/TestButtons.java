package tests.birds.amazonParrotPage;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestButtons extends BaseTest {

    @Test
    public void testAddMaleAmazonParrotToCardButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnBirdBigLogo().amazonParrotLinkClick().clickToAddToCardButton();

        assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'Parrot')]")).getText()
                .contains("Male"));
    }
}
