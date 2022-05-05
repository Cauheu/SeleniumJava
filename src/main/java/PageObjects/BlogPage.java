package PageObjects;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class BlogPage {
    private final WebDriver driver;

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    }

    private String getUrl() {
        return driver.getCurrentUrl();
    }

    public void verifyPageIsOpened() {
        assertEquals(getUrl(), "https://www.epam.com/careers/blog");
    }
}
