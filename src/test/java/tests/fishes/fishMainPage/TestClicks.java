package tests.fishes.fishMainPage;

import org.junit.Assert;
import org.junit.Test;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;

public class TestClicks extends BaseTest {

    @Test
    public void testClickOnAngelfishLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().angelFishLinkClick();

        Assert.assertTrue(driver.getCurrentUrl().contains("FI-SW-01"));
    }

    @Test
    public void testClickOnTigerSharkLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().tigerSharkLinkClick();

        Assert.assertTrue(driver.getCurrentUrl().contains("FI-SW-02"));
    }

    @Test
    public void testClickOnKoiLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().koiLinkClick();

        Assert.assertTrue(driver.getCurrentUrl().contains("FI-FW-01"));
    }

    @Test
    public void testClickOnGoldfishLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().goldfishLinkClick();

        Assert.assertTrue(driver.getCurrentUrl().contains("FI-FW-02"));
    }

    @Test
    public void testClickOnReturnToMainPageButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo().returnToMainPage();

        Assert.assertEquals(JPETSTORE_MAIN_PAGE, driver.getCurrentUrl());
    }
}
