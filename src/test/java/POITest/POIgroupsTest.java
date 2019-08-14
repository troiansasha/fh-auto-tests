package POITest;

import org.junit.After;
import org.junit.Test;
import pages.POIPage;
import parentTest.ParentTest;

public class POIgroupsTest extends ParentTest {

    final String POI_NAMESEARCH = "testFHtest";
    final String POI_NAME = "Test POI 1";



    @Test
    public void validPOIGroupsPage(){

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOIgroups();
        checkExpectedResult("Page POI groups not opened", true, POIPage.headerIsCorrect());
    }
    @Test
    public void validFindPOIGroupsByName(){

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOIgroups();
        POIPage.searchPOIByName(POI_NAMESEARCH);
        POIPage.filterIsCorrectName();
        checkExpectedResult("Vehicle not find", true, POIPage.filterIsCorrectName());

    }
    @Test
    public void addNewPOIGroups(){

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOIgroups();
        POIPage.addNewPOIGroup();
        POIPage.createNewGroup(POI_NAME);
        checkExpectedResult("Vehicle not find", true, POIPage.newGroupIsCorrectName());

    }


//    @Test
//    public void validPOIGroupsByName(){
//        //Login block
//        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
//        //Go to MyFleet vehicles
//        vehiclesPage.openVehicles();
////        vehiclesPage.headerIsCorrect();
//        checkExpectedResult("Page My Fleet/Vehicles not opened", true, vehiclesPage.headerIsCorrect());
//        vehiclesPage.enterTextInToInputVehicleName(VEHICLE_NAME);
//        vehiclesPage.filterIsCorrectName();
//        checkExpectedResult("Vehicle not find", true, vehiclesPage.filterIsCorrectName());
//    }
//    @After
//
//    public void deletePOIGroup(){
//        POIPage.deletePOI();
//    }


}
