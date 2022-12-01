package tests.reptiles.reptilesMainPage;

import org.junit.Test;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestClicks extends BaseTest {
    @Test
    public void testClickOnReturnToMainPageButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnReptileLogo().returnToMainPage();

        assertEquals(JPETSTORE_MAIN_PAGE, driver.getCurrentUrl());
    }

    @Test
    public void testClickOnIguanaLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnReptileLogo().iguanaLinkClick();

        assertTrue(driver.getCurrentUrl().contains("LI-02"));
    }

    @Test
    public void testClickOnRattlesnakeLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnReptileLogo().rattlesnakeLinkClick();

        assertTrue(driver.getCurrentUrl().contains("SN-01"));
    }
}
