package stepDefinitions;

import PageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
public class allSteps {
    static WebDriver driver;
    static EpamPage epamPage;

    @Given("we have https:\\/\\/www.epam.com\\/ open")
    public void weHaveHttpsWwwEpamComOpen() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.epam.com/");
    }

    @When("click search button")
    public void clickSearchButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickSearchIcon();
    }

    @When("search for Blockchain")
    public void searchForBlockchain() {
        epamPage = new EpamPage(driver);
        epamPage.selectBlockchainOption();
        epamPage.clickFindButton();
    }

    @Then("we have search results for Blockchain")
    public void weHaveSearchResultsForBlockchain() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.verifySuccessSearching();
        driver.quit();
    }

    @When("click INFOGEN button")
    public void clickINFOGENButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickinfongenLink();
    }

    @Then("we have https:\\/\\/www.infongen.com\\/ open")
    public void weHaveHttpsWwwInfongenComOpen() {
        InfongenPage infongenPage = new InfongenPage(driver);
        infongenPage.verifyLink();
        driver.quit();
    }

    @Given("we have https:\\/\\/www.epam.com\\/our-work\\/energy-and-utilities open")
    public void weHaveHttpsWwwEpamComOurWorkEnergyAndUtilitiesOpen() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.epam.com/our-work/energy-and-utilities");
    }

    @When("we click on explore our latest work button")
    public void weClickOnExploreOurLatestWorkButton() {
        EnergyAndUtilities energyAndUtilities = new EnergyAndUtilities(driver);
        energyAndUtilities.clickLink();
    }

    @Then("we see info about latest work")
    public void weSeeInfoAboutLatestWork() {
        EnergyAndUtilities energyAndUtilities = new EnergyAndUtilities(driver);
        energyAndUtilities.verifyBlock();
        driver.quit();
    }

    @When("we click on blog button")
    public void weClickOnBlogButton() {
        epamPage = new EpamPage(driver);
        epamPage.moveToCareer();
        epamPage.clickBlogLink();
    }

    @Then("we have blog article open")
    public void weHaveBlogArticleOpen() {
        BlogPage blogPage = new BlogPage(driver);
        blogPage.verifyPageIsOpened();
        driver.quit();
    }

    @When("we click on menu button")
    public void weClickOnMenuButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickNavMenu();
    }

    @When("we click on About button")
    public void weClickOnAboutButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickAboutLink();
    }

    @Then("we have https:\\/\\/www.epam.com\\/about open")
    public void weHaveHttpsWwwEpamComAboutOpen() {
        AboutPage aboutPage = new AboutPage(driver);
        aboutPage.verifyPageIsOpened();
        driver.quit();
    }

    @When("click twitter button")
    public void clickTwitterButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickTwitterLink();
    }

    @Then("we have epams twitter profile open")
    public void weHaveEpamsTwitterProfileOpen() {
        TwitterPage twitterPage = new TwitterPage(driver);
        twitterPage.verifyLink();
        driver.quit();
    }

    @When("we click on Consult button")
    public void weClickOnConsultButton() {
        epamPage = new EpamPage(driver);
        epamPage.moveToServices();
        epamPage.clickConsultingLink();
    }

    @Then("we have https:\\/\\/www.epam.com\\/services\\/consult-and-design open")
    public void weHaveHttpsWwwEpamComServicesConsultAndDesignOpen() {
        ConsultingPage consultingPage = new ConsultingPage(driver);
        consultingPage.verifyPageIsOpened();
        driver.quit();
    }

    @When("click mail button")
    public void clickMailButton() {
        epamPage = new EpamPage(driver);
        epamPage.clickContactUs();
    }

    @Then("we have https:\\/\\/www.epam.com\\/about\\/who-we-are\\/contact open")
    public void weHaveHttpsWwwEpamComAboutWhoWeAreContactOpen() {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.verifyPageIsOpened();
        driver.quit();
    }
}
