package PageObjects;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class ConsultingPage {
    private final WebDriver driver;

    public ConsultingPage(WebDriver driver) {
        this.driver = driver;
    }

    private String getUrl() {
        return driver.getCurrentUrl();
    }

    public void verifyPageIsOpened() {
        assertEquals(getUrl(), "https://www.epam.com/services/consult-and-design");
    }
}
