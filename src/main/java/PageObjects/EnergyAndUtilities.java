package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class EnergyAndUtilities {
    private final WebDriver driver;
    private final By latestWorkLink = By.xpath("//a[@class='button-ui bg-color-light-blue standard']//span[contains" +
            "(text(), 'Explore our latest work') and @class='button__content button__content--desktop']");
    private final By block = By.xpath("//div[@class='featured-content-grid__info']");

    public EnergyAndUtilities(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement latestWorkLink() {
        return driver.findElement(latestWorkLink);
    }

    private WebElement block() {
        return driver.findElement(block);
    }

    public void clickLink() {
        latestWorkLink().click();
    }

    public void verifyBlock() {
        assertTrue(block().isDisplayed());
    }
}
