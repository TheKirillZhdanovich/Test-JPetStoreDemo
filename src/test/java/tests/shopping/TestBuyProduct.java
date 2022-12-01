package tests.shopping;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.JPetStorePages.authorization.SignInPage;
import pages.JPetStorePages.shopping.ContinuePage;
import pages.JPetStorePages.shopping.PayPage;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestBuyProduct extends BaseTest {

    @Test
    public void testBuyProductShipToDiffCheckboxIsOff() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        SignInPage signInPage = basePage.signInLinkClick();
        signInPage.inputUsername("1997");
        signInPage.inputPassword("1997");
        signInPage.clickLoginButton();

        PayPage page = mainPage.clickOnDogLogo().poodleLinkClick()
                .addMalePoodle().setQualityProductById(0, "2")
                .updateCard().proceedCheckout();

        page.setCardType("MasterCard");
        page.setCardNumbersField("777 7777 7777 7777");
        page.setDateField("22/07");
        page.clickToContinueButtonIfShipToDiffCheckboxIsOff().clickToConfirmButton();

        WebElement element = driver.findElement(By.xpath("//th[contains(text(), 'Total:')]"));

        assertTrue(element.getText().contains("$37.00"));
    }

    @Test
    public void testBuyProductShipToDiffCheckboxIsOn() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        SignInPage signInPage = basePage.signInLinkClick();
        signInPage.inputUsername("1997");
        signInPage.inputPassword("1997");
        signInPage.clickLoginButton();

        PayPage page = mainPage.clickOnDogLogo().poodleLinkClick()
                .addMalePoodle().setQualityProductById(0, "2")
                .updateCard().proceedCheckout();

        page.setCardType("MasterCard");
        page.setCardNumbersField("777 7777 7777 7777");
        page.setDateField("22/07");
        ContinuePage continuePage = page.clickToShipToDiffCheckbox().clickToContinueButtonIfShipToDiffCheckboxIsOn();

        continuePage.setFirstNameField("Gon");
        continuePage.setLastNameField("Frixx");
        continuePage.setAddress1Field("Home");
        continuePage.setAddress2Field("Far away");
        continuePage.setCityField("Neverlands");
        continuePage.setStateField("Joy");
        continuePage.setZipField("876534");
        continuePage.setCountryField("Sparkle");

        continuePage.clickToContinueButton().clickToConfirmButton();

        WebElement element = driver.findElement(By.xpath("//th[contains(text(), 'Total:')]"));

        assertTrue(element.getText().contains("$37.00"));
    }
}
