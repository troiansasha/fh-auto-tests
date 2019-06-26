package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends ParentPage {


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
        try {
            webDriver.get("https://dev.fleethand.com/");
            logger.info("LoginPage was opened");
        } catch (Exception e) {
            logger.error("Can not open Login Page");
            Assert.fail("Can not open Login Page");
        }
    }

    public void enterTextInToInputLogin(String Login) {
        try {
            WebElement inputLogin = webDriver.findElement(By.name("username"));
            inputLogin.clear();
            inputLogin.sendKeys(Login);
            logger.info(Login + " was inputted into Login ");


        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void enterTextInToInputPass(String Password) {
        try {
            WebElement inputPass = webDriver.findElement(By.name("password"));
            inputPass.clear();
            inputPass.sendKeys(Password);
            logger.info(Password + " was inputed into Password");

        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }

    }

    public void clickOnButtonEnter() {
        try {
            WebElement enterButton = webDriver.findElement(By.tagName("button"));
            enterButton.click();
            logger.info("Button enter was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }
    public void clickOnButtonUser() {
        try {
            WebElement userButton = webDriver.findElement(By.xpath(".//*[text()=\' O. Troian1 \']"));
            userButton.click();
            logger.info("Button User was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }
}
