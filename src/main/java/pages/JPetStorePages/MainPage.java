package pages.JPetStorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.JPetStorePages.birds.BirdsMainPage;
import pages.JPetStorePages.cats.CatsMainPage;
import pages.JPetStorePages.dogs.DogsMainPage;
import pages.JPetStorePages.fishes.FishMainPage;
import pages.JPetStorePages.reptiles.ReptilesMainPage;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By fish_logo = By.xpath("//area[@alt='Fish']");
    private final By dog_logo = By.xpath("//area[@alt='Dogs']");
    private final By reptile_logo = By.xpath("//area[@alt='Reptiles']");
    private final By cat_logo = By.xpath("//area[@alt='Cats']");
    private final By bird_big_logo = By.xpath("//area[@coords='72,2,280,250']");
    private final By bird_small_logo = By.xpath("//area[@coords='280,180,350,250']");

    public FishMainPage clickOnFishLogo() {
        driver.findElement(fish_logo).click();
        return new FishMainPage(driver);
    }

    public DogsMainPage clickOnDogLogo() {
        driver.findElement(dog_logo).click();
        return new DogsMainPage(driver);
    }

    public ReptilesMainPage clickOnReptileLogo() {
        driver.findElement(reptile_logo).click();
        return new ReptilesMainPage(driver);
    }

    public CatsMainPage clickOnCatLogo() {
        driver.findElement(cat_logo).click();
        return new CatsMainPage(driver);
    }

    public BirdsMainPage clickOnBirdBigLogo() {
        driver.findElement(bird_big_logo).click();
        return new BirdsMainPage(driver);
    }

    public BirdsMainPage clickOnBirdSmallLogo() {
        driver.findElement(bird_small_logo).click();
        return new BirdsMainPage(driver);
    }

}
