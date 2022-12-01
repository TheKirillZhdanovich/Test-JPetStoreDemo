package tests.birds.birdsMainPage;

import org.junit.Test;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestClicks extends BaseTest {

    @Test
    public void testClickOnReturnToMainPageButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnBirdBigLogo().returnToMainPage();

        assertEquals(JPETSTORE_MAIN_PAGE, driver.getCurrentUrl());
    }

    @Test
    public void testClickOnAmazonParrotLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnBirdBigLogo().amazonParrotLinkClick();

        assertTrue(driver.getCurrentUrl().contains("CB-01"));
    }

    @Test
    public void testClickOnFinchLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnBirdSmallLogo().finchLinkClick();

        assertTrue(driver.getCurrentUrl().contains("SB-02"));
    }
}
