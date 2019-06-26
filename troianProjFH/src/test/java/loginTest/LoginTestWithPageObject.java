package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestWithPageObject extends ParentTest {

    @Test
    public void validLogin(){

    loginPage.openPage();
    loginPage.enterTextInToInputLogin("troianwork@gmail.com");
    loginPage.enterTextInToInputPass("1q2w3e4r");
    loginPage.clickOnButtonEnter();
    homePage.timer10seconds();
    loginPage.clickOnButtonUser();

    checkExpectedResult("Url is not correct", true, homePage.isItCorrectUrl());
    }
}
