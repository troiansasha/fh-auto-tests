package personelTest;

import org.junit.Test;
import parentTest.ParentTest;

public class PersonelDriversTest extends ParentTest {

    @Test
    public void validPersonelDriversCreate()  {
        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to personnel drivers
        personelDriversPage.openPersonel();
        personelDriversPage.openPersonelDrivers();
        personelDriversPage.headerIsCorrect();
//        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
        personelDriversPage.addNewDriver();
        personelDriversPage.dataDrivers();
        personelDriversPage.clickOnSetLanguage();
        personelDriversPage.clickSubmit();
        personelDriversPage.enterTextInToSearchByFullName("Test Test");
        homePage.timer3seconds();
        personelDriversPage.driverIsCorrect();
//        checkExpectedResult("Driver is not find", true, personelDriversPage.driverIsCorrect());
        personelDriversPage.deleteDriver();

    }

    @Test
    public void validPersonelDriversEditSave()  {
        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to personnel drivers
        personelDriversPage.openPersonel();
        personelDriversPage.openPersonelDrivers();
        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
        personelDriversPage.addNewDriver();
        personelDriversPage.dataDrivers();
        personelDriversPage.clickOnSetLanguage();
        personelDriversPage.clickSubmit();
        personelDriversPage.enterTextInToSearchByFullName("Test Test");
        homePage.timer3seconds();
        personelDriversPage.driverIsCorrect();
        personelDriversPage.editDriverSave();
        personelDriversPage.enterTextInToSearchByFullName("Edit Test");
        personelDriversPage.editDriverIsCorrect();
        personelDriversPage.deleteDriver();
    }

    @Test
    public void validPersonelDriversEditBack()  {
        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to personnel drivers
        personelDriversPage.openPersonel();
        personelDriversPage.openPersonelDrivers();
//        personelDriversPage.headerIsCorrect();
        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
        personelDriversPage.addNewDriver();
        personelDriversPage.dataDrivers();
        personelDriversPage.clickOnSetLanguage();
        personelDriversPage.clickSubmit();
        personelDriversPage.enterTextInToSearchByFullName("Test Test");
//        checkExpectedResult("Driver is not find", true, personelDriversPage.driverIsCorrect());
        homePage.timer3seconds();
        personelDriversPage.driverIsCorrect();
        personelDriversPage.editDriverBack();
        personelDriversPage.enterTextInToSearchByFullName("Test Test");
        homePage.timer3seconds();
        personelDriversPage.driverIsCorrect();
        personelDriversPage.deleteDriver();
    }

//    @Test
//    public void validPersonelDriversDelete()  {
//        //Login block
//        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
//        //Go to personnel drivers
//        personelDriversPage.openPersonel();
//        personelDriversPage.openPersonelDrivers();
////        personelDriversPage.headerIsCorrect();
//        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
//        personelDriversPage.addNewDriver();
//        personelDriversPage.dataDrivers();
//        personelDriversPage.clickOnSetLanguage();
//        personelDriversPage.clickSubmit();
//        personelDriversPage.enterTextInToSearchByFullName("Test Test");
//        homePage.timer3seconds();
////        checkExpectedResult("Driver is not find", true, personelDriversPage.driverIsCorrect());
//        personelDriversPage.driverIsCorrect();
//        personelDriversPage.deleteDriver();
//    }

    @Test
    public void validPersonelDriversSearchByCard()  {
        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to personnel drivers
        personelDriversPage.openPersonel();
        personelDriversPage.openPersonelDrivers();
//        personelDriversPage.headerIsCorrect();
        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
        personelDriversPage.addNewDriver();
        personelDriversPage.dataDrivers();
        personelDriversPage.clickOnSetLanguage();
        personelDriversPage.clickSubmit();
        personelDriversPage.enterTextInToSearchByDriverCard("1578487894561235");
        homePage.timer3seconds();
        personelDriversPage.driverIsCorrect();
//        checkExpectedResult("Driver is not find", true, personelDriversPage.driverIsCorrect());
        personelDriversPage.deleteDriver();
    }

}
