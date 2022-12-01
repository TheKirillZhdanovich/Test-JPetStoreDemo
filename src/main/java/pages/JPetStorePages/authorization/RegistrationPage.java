package pages.JPetStorePages.authorization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.MainPage;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private final By userIDField = By.xpath("//input[@name='username']");
    private final By newPasswordField = By.xpath("//input[@name='password']");
    private final By repeatPasswordField = By.xpath("//input[@name='repeatedPassword']");
    private final By firstNameField = By.xpath("//input[@name='account.firstName']");
    private final By lastNameField = By.xpath("//input[@name='account.lastName']");
    private final By emailField = By.xpath("//input[@name='account.email']");
    private final By phoneField = By.xpath("//input[@name='account.phone']");
    private final By address1Field = By.xpath("//input[@name='account.address1']");
    private final By address2Field = By.xpath("//input[@name='account.address2']");
    private final By cityField = By.xpath("//input[@name='account.city']");
    private final By stateField = By.xpath("//input[@name='account.state']");
    private final By zipField = By.xpath("//input[@name='account.zip']");
    private final By countryField = By.xpath("//input[@name='account.country']");
    private final By enableMyListCheckbox = By.xpath("//input[@name='account.listOption']");
    private final By enableMyBannerCheckBox = By.xpath("//input[@name='account.bannerOption']");
    private final By saveAccountIngoButton = By.xpath("//input[@name='newAccount']");

    public void setUserIDField(String userId) {
        driver.findElement(userIDField).sendKeys(userId);
    }

    public void setNewPasswordField(String password) {
        driver.findElement(newPasswordField).sendKeys(password);
    }

    public void setRepeatPasswordField(String password) {
        driver.findElement(repeatPasswordField).sendKeys(password);
    }

    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPhoneField(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void setAddress1Field(String address) {
        driver.findElement(address1Field).sendKeys(address);
    }

    public void setAddress2Field(String address) {
        driver.findElement(address2Field).sendKeys(address);
    }

    public void setCityField(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void setStateField(String state) {
        driver.findElement(stateField).sendKeys(state);
    }

    public void setZipField(String zip) {
        driver.findElement(zipField).sendKeys(zip);
    }

    public void setCountryField(String country) {
        driver.findElement(countryField).sendKeys(country);
    }

    public void setLanguagePreferenceChoose(String language) {
        driver.
                findElement(By.xpath("//select[@name='account.languagePreference']//option[@value='" + language + "']")).
                click();
    }

    public void setFavouriteCategoryChoose(String category) {
        driver.
                findElement(By.xpath("//select[@name='account.favouriteCategoryId']//option[@value='" + category + "']")).
                click();
    }

    public void enableMyList() {
        driver.findElement(enableMyListCheckbox).click();
    }

    public void enableMyBanner() {
        driver.findElement(enableMyBannerCheckBox).click();
    }

    public MainPage clickOnSaveButton() {
        driver.findElement(saveAccountIngoButton).click();
        return new MainPage(driver);
    }
}
