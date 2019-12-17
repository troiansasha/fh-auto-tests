package personelTest;

import org.junit.Test;
import parentTest.ParentTest;

public class PersonelUsersTest extends ParentTest  {

    @Test
    public void validPersonnelUsers (){
        //Login block
        loginPage.validLogin();
        homePage.timer10seconds();
        //Change Language
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
        //Go to personnel Users
        personelUserPage.openPerssonel();
        personelUserPage.openPerssonelUsers();
        personelUserPage.headerIsCorrect();
        checkExpectedResult("Page Personnel/User is not opened", true, personelUserPage.headerIsCorrect());
        //Adding
        personelUserPage.addNewUser();
        personelUserPage.dataUsers();
        personelUserPage.chooseRoleUser();
        personelUserPage.chooseCountryUser();
        personelUserPage.chooseDepartmentUser();
        //Saveing
        personelUserPage.saveOurNewUser();
        //Find1
        personelUserPage.inputToFindOurNewUser("Troian Test" );
        personelUserPage.clickToFindOurNewUser();
        personelUserPage.clickOnUserList();
        //Edit/Back
        personelUserPage.clickEditOurNewUser();
        //Find2
        personelUserPage.inputToFindOurNewUserEmail("qwerty");
        personelUserPage.clickToFindOurNewUser();
        personelUserPage.clickOnUserList();
        //Delete
        personelUserPage.deleteOurNewUser();
        personelUserPage.deleteOurNewUserYes();


    }
}

