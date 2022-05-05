package PageObjects;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class InfongenPage {
    private final WebDriver driver;

    public InfongenPage(WebDriver driver) {
        this.driver = driver;
    }

    private Set<String> allTabs() {
        return driver.getWindowHandles();
    }

    private void switchToNewWindow() {
        driver.switchTo().window(getTheLastOpenedWindow());
    }

    private String getTheLastOpenedWindow() {
        String window = null;
        for (String s : allTabs()) {
            window = s;
        }
        return window;
    }

    public void verifyLink() {
        switchToNewWindow();
        assertEquals(driver.getCurrentUrl(), "https://www.infongen.com/");
    }
}
