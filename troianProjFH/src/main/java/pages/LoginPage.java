package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class LoginPage extends ParentPage {

//    protected HomePage homePage;

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

        loginWithData("test.fleethand@gmail.com", "1506milk");
    }

//    public void clickOnButtonFlag() {
//        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        try {
//            WebElement flagButton = webDriver.findElement(By.className("dropdown-toggle notification"));
//            flagButton.click();
//            logger.info("Button flag was clicked");
//        } catch (Exception e) {
//            logger.error("Can not work with element");
//            Assert.fail("Can not work with element");
//        }
//    }
}
