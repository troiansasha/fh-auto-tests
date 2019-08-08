package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(name="username")
    private WebElement inputLogin;
    @FindBy(name="password")
    private WebElement inputPassword;
    @FindBy(xpath=".//*[@role=\"button\"]")
    private WebElement buttonLogin;


    public void openPage() {
        try {
            webDriver.get("https://uat.fleethand.com/");
            logger.info("LoginPage was opened");
        } catch (Exception e) {
            logger.error("Can not open Login Page");
            Assert.fail("Can not open Login Page");
        }
    }

    public void enterTextInToInputLogin(String login) {
        actionsWithOurElements.enterTextIntoInput(inputLogin, login);

    }

    public void enterTextInToInputPass(String password) {
        actionsWithOurElements.enterTextIntoInput(inputPassword, password );


    }

    public void clickOnButtonEnter() {
        try {
            buttonLogin.click();
            logger.info("Button enter was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }
    public void loginWithData (String login, String password){
        openPage();
        enterTextInToInputLogin(login);
        enterTextInToInputPass(password);
        clickOnButtonEnter();

    }

    public void validLogin(){
        loginWithData("troianwork@gmail.com", "1q2w3e4r5t");
    }
//    public void clickOnButtonUser() {
//        try {
//            WebElement userButton = webDriver.findElement(By.xpath(".//*[text()=\' O. Troian1 \']"));
//            userButton.click();
//            logger.info("Button User was clicked");
//        } catch (Exception e) {
//            logger.error("Can not work with element");
//            Assert.fail("Can not work with element");
//        }
//    }
}
