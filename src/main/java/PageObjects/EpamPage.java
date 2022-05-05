package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EpamPage {
    private final WebDriver driver;
    private final By searchIcon = By.xpath("//button[@class='header-search__button header__icon']");
    private final By blockchainOption = By.xpath("//li[@class='frequent-searches__item' and contains(text(), 'Blockchain')]");
    private final By findButton = By.xpath("//button[@class='header-search__submit']");
    private final By infongenLink = By.xpath("//a[@class='footer__brands-link' and @href='https://www.infongen.com/']");
    private final By careerLink = By.xpath("//a[@class='top-navigation__item-link' and @href='/careers']");
    private final By blogLink = By.xpath("//a[@class='top-navigation__main-link' and @href='/careers/blog']");
    private final By aboutLink = By.xpath("//a[@class='top-navigation__item-link' and @href='/about']");
    private final By navMenu = By.xpath("//nav[@class='top-navigation-ui']");
    private final By twitterLink = By.xpath("//a[@class='footer__social-link' and contains(@href, 'https://twitter.com/')]");
    private final By servicesLink = By.xpath("//a[@class='top-navigation__item-link' and @href='/services']");
    private final By consulting = By.xpath("//a[@class='top-navigation__epam-continuum-featured-link feature-item']");
    private final By contactUs = By.xpath("//a[@class='cta-button-ui cta-button--envelope header__control']");

    public EpamPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement searchIcon() {
        return driver.findElement(searchIcon);
    }

    private WebElement blockchainOption() {
        return driver.findElement(blockchainOption);
    }

    private WebElement findButton() {
        return driver.findElement(findButton);
    }

    private WebElement infongenLink() {
        return driver.findElement(infongenLink);
    }

    private WebElement careerLink() {
        return driver.findElement(careerLink);
    }

    private WebElement blogLink() {
        return driver.findElement(blogLink);
    }

    private WebElement aboutLink() {
        return driver.findElement(aboutLink);
    }

    private WebElement navMenu() {
        return driver.findElement(navMenu);
    }

    private WebElement twitterLink() {
        return driver.findElement(twitterLink);
    }

    private WebElement servicesLink() {
        return driver.findElement(servicesLink);
    }

    private WebElement consulting() {
        return driver.findElement(consulting);
    }

    private WebElement contactUs() {
        return driver.findElement(contactUs);
    }

    public void clickSearchIcon() {
        searchIcon().click();
    }

    public void selectBlockchainOption() {
        blockchainOption().click();
    }

    public void clickFindButton() {
        findButton().click();
    }

    public void clickinfongenLink() {
        infongenLink().click();
    }

    public void moveToCareer() {
        Actions actions = new Actions(driver);
        actions.moveToElement(careerLink()).build().perform();
    }

    public void clickBlogLink() {
        blogLink().click();
    }

    public void clickAboutLink() {
        aboutLink().click();
    }

    public void clickNavMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(navMenu()).build().perform();
    }

    public void clickTwitterLink() {
        twitterLink().click();
    }

    public void moveToServices() {
        Actions actions = new Actions(driver);
        actions.moveToElement(servicesLink()).build().perform();
    }

    public void clickContactUs() {
        contactUs().click();
    }

    public void clickConsultingLink() {
        consulting().click();
    }
}
