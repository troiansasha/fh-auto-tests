package reportsTest;

import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class ReportsLocationByTimeTest extends ParentTest {
    final String POI_NAMEEDIT = "Test POI 1 Edit";

    @Before
    public void loginBefore() {
        loginPage.validLogin();
        homePage.timer10seconds();
        reportsVideoLocationObjectsPage.openReportsLocationByTime();
        checkExpectedResult("500 Error", false, reportsVideoLocationObjectsPage.generalError500());

    }

    @Test
    public void validReportsLocationByTime(){
        checkExpectedResult("Page POI groups not opened", true, reportsVideoLocationObjectsPage.headerIsCorrectLocationByTime());
    }
    @Test
    public void chekLocationByTime(){
        reportsVideoLocationObjectsPage.dontMarkAll();
        reportsVideoLocationObjectsPage.markVehicle();
        reportsVideoLocationObjectsPage.clickSearch();
        reportsVideoLocationObjectsPage.dataIsCorrectLocationByTime();
        checkExpectedResult("Page POI groups not opened", true, reportsVideoLocationObjectsPage.dataIsCorrectLocationByTime());

    }

}
