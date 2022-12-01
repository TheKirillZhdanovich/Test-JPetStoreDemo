package tests.cats.catsMainPage;

import org.junit.Test;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestClicks extends BaseTest {

    @Test
    public void testClickOnReturnToMainPageButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnCatLogo().returnToMainPage();

        assertEquals(JPETSTORE_MAIN_PAGE, driver.getCurrentUrl());
    }

    @Test
    public void testClickOnManxLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnCatLogo().manxLinkClick();

        assertTrue(driver.getCurrentUrl().contains("DSH-01"));
    }

    @Test
    public void testClickOnPersianLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnCatLogo().persianLinksClick();

        assertTrue(driver.getCurrentUrl().contains("DLH-02"));
    }
}
