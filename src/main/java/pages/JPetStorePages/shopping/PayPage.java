package pages.JPetStorePages.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class PayPage extends BasePage {
    public PayPage(WebDriver driver) {
        super(driver);
    }

    private final By cardNumbersField = By.xpath("//input[@name='order.creditCard']");
    private final By dateField = By.xpath("//input[@name='order.expiryDate']");
    private final By firstNameField = By.xpath("//input[@name='order.billToFirstName']");
    private final By lastNameField = By.xpath("//input[@name='order.billToLastName']");
    private final By address1Field = By.xpath("//input[@name='order.billAddress1']");
    private final By address2Field = By.xpath("//input[@name='order.billAddress2']");
    private final By cityField = By.xpath("//input[@name='order.billCity']");
    private final By stateField = By.xpath("//input[@name='order.billState']");
    private final By zipField = By.xpath("//input[@name='order.billZip']");
    private final By countryField = By.xpath("//input[@name='order.billCountry']");
    private final By shipToDiffCheckbox = By.xpath("//input[@name='shippingAddressRequired']");
    private final By continueButton = By.xpath("//input[@name='newOrder']");

    public void setCardType(String type) {
        driver.findElement(By.xpath("//select//option[@value='" + type + "']")).click();
    }

    public void setCardNumbersField(String number) {
        driver.findElement(cardNumbersField).clear();
        driver.findElement(cardNumbersField).sendKeys(number);
    }

    public void setDateField(String date) {
        driver.findElement(dateField).clear();
        driver.findElement(dateField).sendKeys(date);
    }

    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setAddress1Field(String address) {
        driver.findElement(address1Field).clear();
        driver.findElement(address1Field).sendKeys(address);
    }

    public void setAddress2Field(String address) {
        driver.findElement(address2Field).clear();
        driver.findElement(address2Field).sendKeys(address);
    }

    public void setCityField(String city) {
        driver.findElement(cityField).clear();
        driver.findElement(cityField).sendKeys(city);
    }

    public void setStateField(String state) {
        driver.findElement(stateField).clear();
        driver.findElement(stateField).sendKeys(state);
    }

    public void setZipField(String zip) {
        driver.findElement(zipField).clear();
        driver.findElement(zipField).sendKeys(zip);
    }

    public void setCountryField(String county) {
        driver.findElement(countryField).clear();
        driver.findElement(countryField).sendKeys(county);
    }

    public PayPage clickToShipToDiffCheckbox() {
        driver.findElement(shipToDiffCheckbox).click();
        return new PayPage(driver);
    }

    public ContinuePage clickToContinueButtonIfShipToDiffCheckboxIsOn() {
        driver.findElement(continueButton).click();
        return new ContinuePage(driver);
    }

    public ConfirmPage clickToContinueButtonIfShipToDiffCheckboxIsOff() {
        driver.findElement(continueButton).click();
        return new ConfirmPage(driver);
    }
}
