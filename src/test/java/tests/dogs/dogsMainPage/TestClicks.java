package tests.dogs.dogsMainPage;

import org.junit.Test;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestClicks extends BaseTest {

    @Test
    public void testClickOnReturnToMainPageButton() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().returnToMainPage();

        assertEquals(JPETSTORE_MAIN_PAGE, driver.getCurrentUrl());
    }

    @Test
    public void testClickOnBulldogLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().bulldogLinkClick();

        assertTrue(driver.getCurrentUrl().contains("BD-01"));
    }

    @Test
    public void testClickOnChihuahuaLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().chihuahuaLinkClick();

        assertTrue(driver.getCurrentUrl().contains("CW-01"));
    }

    @Test
    public void testClickOnDalmationLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().dalmationLinkClick();

        assertTrue(driver.getCurrentUrl().contains("DL-01"));
    }

    @Test
    public void testClickOnGoldenRetrieverLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().goldenRetrieverLinkClick();

        assertTrue(driver.getCurrentUrl().contains("RT-01"));
    }

    @Test
    public void testClickOnLabradorRetrieverLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().labradorRetrieverLinkClick();

        assertTrue(driver.getCurrentUrl().contains("RT-02"));
    }

    @Test
    public void testClickOnLabradorPoodleLink() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo().poodleLinkClick();

        assertTrue(driver.getCurrentUrl().contains("PO-02"));
    }
}
