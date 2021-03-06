package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class HomePage extends ParentPage {

        public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isItCorrectUrl(){
            try {
                logger.info(webDriver.getCurrentUrl());
                Assert.assertEquals("https://uat.fleethand.com/monitor",
                webDriver.getCurrentUrl());
                logger.info("It is expected URL");

            }catch (Exception e) {
                logger.error("Is not expected URL");
                Assert.fail("Is not expected URL");
            }
            return true;

    }
    public void timer10seconds(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("10 second timer for download started");
    }
    public void timer3seconds (){
            webDriver.manage().timeouts().setScriptTimeout(2,TimeUnit.SECONDS);
    }

    public void generalError500(){
        try {
            webDriver.findElement(By.xpath(".//*[text()='Loading error']")).isDisplayed();
            logger.info("Find 500 ERROR ");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }
    public void clearTextBox(){
            webDriver.findElement(By.name("dateInput")).clear();
    }
}
