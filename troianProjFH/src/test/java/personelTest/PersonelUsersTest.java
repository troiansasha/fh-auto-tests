package personelTest;

import org.junit.Test;
import parentTest.ParentTest;

public class PersonelUsersTest extends ParentTest  {

    @Test
    public void validPersonnelUsers (){
        //Login block
        loginPage.validLogin();
        homePage.timer10seconds();
        //Go to personnel Users
        personelUserPage.openPersonel();
        personelUserPage.openPersonelUsers();
        personelUserPage.headerIsCorrect();
        checkExpectedResult("Page Personnel/User is not opened", true, personelUserPage.headerIsCorrect());

    }
}

