package servicesTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ParentPage;
import parentTest.ParentTest;

public class DefectsTest extends ParentTest {

    final String Vehicle_name = "9187";
    final String POI_ADRESS = "POI Adress";
    final String POI_NAME = "Test POI POI";
    final String POI_COORDINATES = "50.00, 30.00";
    final String POI_NAMEEDIT = "Test POI 1 Edit";

    @Before
    public void loginBefore() {
        loginPage.validLogin();
        homePage.timer10seconds();
        defectsPage.openServices();
        defectsPage.openDefects();
    }

    @Test
    public void validPOIGroupsPage() {

        defectsPage.headerIsCorrect();
        checkExpectedResult("Page POI groups not opened", true, defectsPage.headerIsCorrect());
    }

    @Test
    public void validFindDefectByName() {


        POIPage.searchPOIByName(Vehicle_name);
        POIPage.filterIsCorrectName();
        checkExpectedResult("Vehicle not find", true, POIPage.filterIsCorrectName());

    }
}
