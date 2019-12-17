package POITest;

import org.junit.After;
import org.junit.Test;
import pages.POIPage;
import parentTest.ParentTest;

public class POIgroupsTest extends ParentTest {

    final String POI_NAMESEARCH = "testFHtest";
    final String POI_NAME = "Test POI 1";
    final String POI_NAMEEDIT = "Test POI 1 Edit";


    @Test
    public void validPOIGroupsPage(){

        //Login block
        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOIgroups();
        checkExpectedResult("Page POI groups not opened", true, POIPage.headerIsCorrect());
    }
    @Test
    public void validFindPOIGroupsByName(){

        //Login block
        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
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
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOIgroups();
        POIPage.addNewPOIGroup();
        POIPage.createNewGroup(POI_NAME);
        checkExpectedResult("Vehicle not find", true, POIPage.newGroupIsCorrectName());

    }
    @Test
    public void addNewPOIGroupsImportant(){

        //Login block
        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOIgroups();
        POIPage.addNewPOIGroup();
        POIPage.makePOIImportant();
        POIPage.createNewGroup(POI_NAME);
        checkExpectedResult("Vehicle not find", true, POIPage.newGroupIsCorrectName());

    }
    @Test
    public void editNewPOIGroups(){

        //Login block
        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        POIPage.openPOI();
        POIPage.openPOIPOIgroups();
        POIPage.addNewPOIGroup();
        POIPage.createNewGroup(POI_NAME);
        POIPage.editNewPOIGroup();
        POIPage.createNewGroup(POI_NAMEEDIT);

    }


    @After

    public void deletePOIGroup(){
        POIPage.deletePOI();
    }


}
