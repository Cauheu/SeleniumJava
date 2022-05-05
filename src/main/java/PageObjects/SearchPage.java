package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchPage {
    private final WebDriver driver;
    private final By searchTitle = By.xpath("//h1");
    private final By results = By.xpath("//h2");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement searchTitle() {
        return driver.findElement(searchTitle);
    }

    private WebElement results() {
        return driver.findElement(results);
    }

    public void verifySuccessSearching() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(results));
        assertEquals(searchTitle().getText().trim(), "Search");
        assertEquals(results().getText().trim(), "71 RESULTS FOR \"BLOCKCHAIN\"");
    }
}
