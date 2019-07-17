package personelTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class PersonelDriversTest extends ParentTest {

    final String DRIVER_NAME = "Test Test";

    @Before
    public void logIn(){
//Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();

    }

    @Test
    public void validPersonelDriversCreate()  {
//
        //Go to personnel drivers
        personelDriversPage.openPersonel();
        personelDriversPage.openPersonelDrivers();
//        personelDriversPage.headerIsCorrect();
        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
        personelDriversPage.addNewDriver();
        personelDriversPage.dataDrivers();
        personelDriversPage.clickOnSetLanguage();
        personelDriversPage.clickSubmit();
        personelDriversPage.enterTextInToSearchByFullName(DRIVER_NAME);
        homePage.timer3seconds();
        personelDriversPage.driverIsCorrect();
        checkExpectedResult("Driver is not find", true, personelDriversPage.driverIsCorrect());
//        personelDriversPage.deleteDriver();

    }

    @Test
    public void validPersonelDriversEditSave()  {
//
        //Go to personnel drivers
        personelDriversPage.openPersonel();
        personelDriversPage.openPersonelDrivers();
        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
        personelDriversPage.addNewDriver();
        personelDriversPage.dataDrivers();
        personelDriversPage.clickOnSetLanguage();
        personelDriversPage.clickSubmit();
        personelDriversPage.enterTextInToSearchByFullName(DRIVER_NAME);
        homePage.timer3seconds();
        personelDriversPage.driverIsCorrect();
        personelDriversPage.editDriverSave();
        personelDriversPage.enterTextInToSearchByFullName("Edit Test");
        personelDriversPage.editDriverIsCorrect();
        checkExpectedResult("Driver is not find", true, personelDriversPage.editDriverIsCorrect());
//        personelDriversPage.deleteDriver();
    }

    @Test
    public void validPersonelDriversEditBack()  {
//
        //Go to personnel drivers
        personelDriversPage.openPersonel();
        personelDriversPage.openPersonelDrivers();
//        personelDriversPage.headerIsCorrect();
        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
        personelDriversPage.addNewDriver();
        personelDriversPage.dataDrivers();
        personelDriversPage.clickOnSetLanguage();
        personelDriversPage.clickSubmit();
        personelDriversPage.enterTextInToSearchByFullName(DRIVER_NAME);
//        checkExpectedResult("Driver is not find", true, personelDriversPage.driverIsCorrect());
        homePage.timer3seconds();
        personelDriversPage.driverIsCorrect();
        personelDriversPage.editDriverBack();
        personelDriversPage.enterTextInToSearchByFullName(DRIVER_NAME);
        homePage.timer3seconds();
        personelDriversPage.driverIsCorrect();
        checkExpectedResult("Driver is not find", true, personelDriversPage.driverIsCorrect());
//        personelDriversPage.deleteDriver();
    }

//    @Test
//    public void validPersonelDriversDelete()  {
//
//        //Go to personnel drivers
//        personelDriversPage.openPersonel();
//        personelDriversPage.openPersonelDrivers();
////        personelDriversPage.headerIsCorrect();
//        checkExpectedResult("Page Personel/Drivers is not opened", true, personelDriversPage.headerIsCorrect());
//        personelDriversPage.addNewDriver();
//        personelDriversPage.dataDrivers();
//        personelDriversPage.clickOnSetLanguage();
//        personelDriversPage.clickSubmit();
//        personelDriversPage.enterTextInToSearchByFullName(DRIVER_NAME);
//        homePage.timer3seconds();
////        checkExpectedResult("Driver is not find", true, personelDriversPage.driverIsCorrect());
//        personelDriversPage.driverIsCorrect();
//        personelDriversPage.deleteDriver();
//    }

    @Test
    public void validPersonelDriversSearchByCard()  {
//
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
        checkExpectedResult("Driver is not find", true, personelDriversPage.driverIsCorrect());
//        personelDriversPage.deleteDriver();
    }

    @After
    public void delete(){

        personelDriversPage.deleteDriver();

    }

}
