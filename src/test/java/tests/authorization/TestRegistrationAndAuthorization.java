package tests.authorization;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.JPetStorePages.authorization.RegistrationPage;
import pages.JPetStorePages.authorization.SignInPage;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertTrue;

public class TestRegistrationAndAuthorization extends BaseTest {

    private final By welcomeContent = By.xpath("//div[@id='WelcomeContent']");

    @Test
    public void testRegisterAndAuthorization() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        RegistrationPage registrationPage = basePage.signInLinkClick().clickOnRegisterNowLink();
        registrationPage.setUserIDField("1997");
        registrationPage.setNewPasswordField("1997");
        registrationPage.setRepeatPasswordField("1997");
        registrationPage.setFirstNameField("Zoro");
        registrationPage.setLastNameField("Roronoa");
        registrationPage.setEmailField("zoro@yandex.ru");
        registrationPage.setPhoneField("88888888888");
        registrationPage.setAddress1Field("Anywhere");
        registrationPage.setAddress2Field("Nowhere");
        registrationPage.setCityField("Wano");
        registrationPage.setStateField("Samurai");
        registrationPage.setZipField("2666753");
        registrationPage.setCountryField("Japan");
        registrationPage.setLanguagePreferenceChoose("japanese");
        registrationPage.setFavouriteCategoryChoose("DOGS");
        registrationPage.enableMyList();
        registrationPage.enableMyBanner();
        registrationPage.clickOnSaveButton();

        SignInPage signInPage = basePage.signInLinkClick();
        signInPage.inputUsername("1997");
        signInPage.inputPassword("1997");
        signInPage.clickLoginButton();

        WebElement element = driver.findElement(welcomeContent);

        assertTrue(element.getText().contains("Zoro"));
    }
}
