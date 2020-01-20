package reportsTest;

import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class ReportsVideoSummaryTest extends ParentTest {
    final String POI_NAMEEDIT = "Test POI 1 Edit";

    @Before
    public void loginBefore() {
        loginPage.validLogin();
        reportsVideoLocationObjectsPage.openReportsVideoSummary();
        checkExpectedResult("500 Error", false, reportsVideoLocationObjectsPage.generalError500());

    }
    @Test
    public void validReportsVideoSummary(){
        checkExpectedResult("Page POI groups not opened", true, reportsVideoLocationObjectsPage.headerIsCorrectVideoSummary());
    }
//    @Test
//    public void searchReportsVideoSummary(){
//        reportsVideoLocationObjectsPage.choosePeriodVideo();
//        reportsVideoLocationObjectsPage.markUser();
//        reportsVideoLocationObjectsPage.clickSearch();
//        checkExpectedResult("Page POI groups not opened", true, reportsVideoLocationObjectsPage.headerIsCorrectVideoSummary());
//    }



    //    @Test
//    public void validRedButton(){
//        reportsVideoLocationObjectsPage.clickRedButton();
//        checkExpectedResult("500 Error", false, reportsVideoLocationObjectsPage.generalError500());
//    }
}
