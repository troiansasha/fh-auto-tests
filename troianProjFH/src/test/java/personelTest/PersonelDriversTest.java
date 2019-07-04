package personelTest;

import org.junit.Test;
import parentTest.ParentTest;

public class PersonelDriversTest extends ParentTest {

    @Test
    public void validPersonelDrivers() throws InterruptedException {
        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to personnel Users
        personelDriversPage.openPersonel();
        personelDriversPage.openPersonelDrivers();
        personelDriversPage.headerIsCorrect();
        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
        personelDriversPage.addNewDriver();
        personelDriversPage.dataDrivers();
        personelDriversPage.clickOnSetLanguage();
        personelDriversPage.clickSubmit();
        personelDriversPage.enterTextInToSearchByFullName("Test Test");
        personelDriversPage.editDriver();
        personelDriversPage.enterTextInToSearchByFullName("Test Test");
        personelDriversPage.deleteDriver();
        personelDriversPage.enterTextInToSearchByFullNameClear("");
        personelDriversPage.enterTextInToSearchByDriverCard("1578487894561235");

    }

}
