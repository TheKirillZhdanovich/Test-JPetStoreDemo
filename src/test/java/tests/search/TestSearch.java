package tests.search;

import org.junit.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static constants.Constant.Urls.JPETSTORE_MAIN_PAGE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestSearch extends BaseTest {

    @Test
    public void testSearchExistProduct() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        basePage.search("Shark");
        String string = driver.findElement(By.xpath("//table")).getText();
        assertTrue(string.contains("Shark"));
    }

    @Test
    public void testSearchNotExistProduct() {
        basePage.open(JPETSTORE_MAIN_PAGE);
        basePage.search("*");
        String string = driver.findElement(By.xpath("//table")).getText();
        assertFalse(string.contains("*"));
    }
}
