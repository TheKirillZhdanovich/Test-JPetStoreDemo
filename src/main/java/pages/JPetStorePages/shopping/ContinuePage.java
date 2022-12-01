package pages.JPetStorePages.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ContinuePage extends BasePage {
    public ContinuePage(WebDriver driver) {
        super(driver);
    }

    private final By firstNameField = By.xpath("//input[@name='order.shipToFirstName']");
    private final By lastNameField = By.xpath("//input[@name='order.shipToLastName']");
    private final By address1Field = By.xpath("//input[@name='order.shipAddress1']");
    private final By address2Field = By.xpath("//input[@name='order.shipAddress2']");
    private final By cityField = By.xpath("//input[@name='order.shipCity']");
    private final By stateField = By.xpath("//input[@name='order.shipState']");
    private final By zipField = By.xpath("//input[@name='order.shipZip']");
    private final By countryField = By.xpath("//input[@name='order.shipCountry']");
    private final By continueButton = By.xpath("//input[@name='newOrder']");

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

    public ConfirmPage clickToContinueButton() {
        driver.findElement(continueButton).click();
        return new ConfirmPage(driver);
    }
}
