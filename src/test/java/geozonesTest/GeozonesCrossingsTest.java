package geozonesTest;

import org.junit.Test;
import parentTest.ParentTest;

public class GeozonesCrossingsTest extends ParentTest {

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
}
