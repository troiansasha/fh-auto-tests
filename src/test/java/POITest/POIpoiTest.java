package POITest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class POIpoiTest extends ParentTest {

    final String POI_ADRESS2 = "POI Adress 2";
    final String POI_ADRESS = "POI Adress";
    final String POI_NAME = "Test POI POI";
    final String POI_COORDINATES = "50.00, 30.00";
    final String POI_NAMEEDIT = "Test POI 1 Edit";

    @Before
        public void loginBefore() {
        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
    }

    @Test
    public void validPOIGroupsPage(){

//        //Login block
//        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOI();
        checkExpectedResult("Page POI groups not opened", true, POIPage.headerIsCorrectPOI());
    }
    @Test
    public void validFindPOIByName(){

        //Login block
//        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOI();
        POIPage.searchPOIByName(POI_NAME);
        POIPage.filterIsCorrectNamePOI();
        checkExpectedResult("Page POI not opened", true, POIPage.filterIsCorrectNamePOI());

    }
    @Test
    public void validFindPOIByAdress(){

        //Login block
//        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOI();
        POIPage.searchPOIByAdress(POI_ADRESS);
        POIPage.filterIsCorrectAdress();
        checkExpectedResult("Adress not find", true, POIPage.filterIsCorrectAdress());

    }
    //1
    @Test
    public void addNewPOIPOI(){


//        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOI();
        POIPage.addNewPOI();
        POIPage.createNewPOIName(POI_NAME);
        POIPage.createNewPOIAdress(POI_ADRESS);
        POIPage.createNewPOICoordinates(POI_COORDINATES);
        POIPage.selectVehicleGroupFromDropdown("TEST");
        POIPage.saveNewPOI();
        checkExpectedResult("Vehicle not find", true, POIPage.newPOIIsCorrectName());
        POIPage.deletePOIPOI();
    }

    @Test
    public void editNewPOIPOI(){

        //Login block
//        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOI();
        POIPage.addNewPOI();
        POIPage.createNewPOIName(POI_NAME);
        POIPage.createNewPOIAdress(POI_ADRESS);
        POIPage.createNewPOICoordinates(POI_COORDINATES);
        POIPage.selectVehicleGroupFromDropdown("TEST");
        POIPage.saveNewPOI();
        POIPage.editNewPOIGroup();
        POIPage.createNewPOIAdress(POI_ADRESS2);
        POIPage.saveNewPOI();
        checkExpectedResult("Vehicle not find", true, POIPage.newPOIIsCorrectName());
        POIPage.deletePOIPOI();
    }


//    @After
//
//    public void deletePOIGroup(){
//        POIPage.deletePOIPOI();
//    }
}
