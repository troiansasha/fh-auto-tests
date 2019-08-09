package geozonesTest;

import org.junit.Test;
import parentTest.ParentTest;

public class GeozonesTest extends ParentTest {

    final String TITLE_NAME = "Spain";
    final String COUNTRY_NAME = "Spain";

    @Test
    public void validGeozonesPlannerPage() {

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to MyFleet vehicles
        geozonesPage.openGeozonesPlanner();
//        vehiclesPage.headerIsCorrect();
        checkExpectedResult("Page Geozones/Planner not opened", true, geozonesPage.headerIsCorrectPlanner());
    }

    @Test
    public void addNewGeozone() {

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to MyFleet vehicles
        geozonesPage.openGeozonesPlanner();
//        vehiclesPage.headerIsCorrect();
        checkExpectedResult("Page Geozones/Planner not opened", true, geozonesPage.headerIsCorrectPlanner());
        geozonesPage.addingNewGeozone();
        geozonesPage.addingNewGeozoneCountry();
        geozonesPage.enterTextInToInputTitle(TITLE_NAME);
        geozonesPage.selectCountryTypeFromDropdown(COUNTRY_NAME);
        checkExpectedResult("Page Geozones/Planner not opened", true, geozonesPage.titleGeozonesIsDisplayed());
    }

    @Test
    public void validGeozoneSearchByTitle() {

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to MyFleet vehicles
        geozonesPage.openGeozonesPlanner();
//        vehiclesPage.headerIsCorrect();
        checkExpectedResult("Page Geozones/Planner not opened", true, geozonesPage.headerIsCorrectPlanner());

//        geozonesPage.enterTextInToInputFindTitleGeozone(TITLE_NAME);
//        geozonesPage.filterIsCorrectTitlegeozones();
//        checkExpectedResult("Vehicle not find", true, geozonesPage.filterIsCorrectTitlegeozones());
    }
}
