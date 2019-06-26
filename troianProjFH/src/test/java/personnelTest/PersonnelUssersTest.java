package personnelTest;

import org.junit.Test;
import pages.LoginPage;
import pages.PersonnelUsserPage;
import parentTest.ParentTest;

public class PersonnelUssersTest extends ParentTest {

    @Test
    public void validPersonnelUsers (){
        //Login block
        loginPage.openPage();
        loginPage.enterTextInToInputLogin("troianwork@gmail.com");
        loginPage.enterTextInToInputPass("1q2w3e4r");
        loginPage.clickOnButtonEnter();
        homePage.timer10seconds();
        //Go to personnel Users
        personnelUsserPage.openPerssonel();
        personnelUsserPage.openPerssonelUsers();
        checkExpectedResult("Page Personnel/User is not opened", true, personnelUsserPage.headerIsCorrect());

    }
}

