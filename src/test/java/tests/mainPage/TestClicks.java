package tests.mainPage;

import org.junit.Assert;
import org.junit.Test;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;

public class TestClicks extends BaseTest {

    @Test
    public void testClickOnFishLogo() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnFishLogo();

        Assert.assertTrue(driver.getCurrentUrl().contains("FISH"));
    }

    @Test
    public void testClickOnDogLogo() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnDogLogo();

        Assert.assertTrue(driver.getCurrentUrl().contains("DOGS"));
    }

    @Test
    public void testClickOnReptileLogo() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnReptileLogo();

        Assert.assertTrue(driver.getCurrentUrl().contains("REPTILES"));
    }

    @Test
    public void testClickOnCatLogo() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnCatLogo();

        Assert.assertTrue(driver.getCurrentUrl().contains("CATS"));
    }

    @Test
    public void testClickOnBirdBigLogo() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnBirdBigLogo();

        Assert.assertTrue(driver.getCurrentUrl().contains("BIRDS"));
    }

    @Test
    public void testClickOnBirdSmallLogo() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        mainPage.clickOnBirdSmallLogo();

        Assert.assertTrue(driver.getCurrentUrl().contains("BIRDS"));
    }
}
