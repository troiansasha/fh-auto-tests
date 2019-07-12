package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeLanguagePage extends ParentPage {
    public ChangeLanguagePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnLanguage() {
        try {
            WebElement languageButton = webDriver.findElement(By.xpath(".//*[@class=\'flag-icon flag-icon-lt\']"));
            languageButton.click();
            logger.info("Button Language was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void changeLanguage() {
        try {
            WebElement changelanguageButton = webDriver.findElement(By.xpath(".//*[@class=\'flag-icon flag-icon-gb\']"));
            changelanguageButton.click();
            logger.info("Button Language change language");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public boolean languageIsCorrect() {
        try {

            webDriver.findElement(By.xpath(".//*[text()=\'Mark all\']")).isDisplayed();
            logger.info("Language from current page");
            return true;

        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }

        return false;

    }
}
