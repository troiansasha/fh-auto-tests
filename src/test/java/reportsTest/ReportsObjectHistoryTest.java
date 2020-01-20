package reportsTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class ReportsObjectHistoryTest extends ParentTest {
    final String QUERY = "TestDepartament";
    final String POI_NAMEEDIT = "Test POI 1 Edit";

    @Before
    public void loginBefore() {
        loginPage.validLogin();
        homePage.timer10seconds();
        reportsVideoLocationObjectsPage.openReportsObjectHistory();
        checkExpectedResult("500 Error", false, reportsVideoLocationObjectsPage.generalError500());

    }

    @Test
    public void validReportsObjectHistoryPage(){
        checkExpectedResult("Page POI groups not opened", true, reportsVideoLocationObjectsPage.headerIsCorrectObjectHistory());
    }
    @Test
    public void searcByObjectQuery(){
        reportsVideoLocationObjectsPage.searcByQuery(QUERY);
        reportsVideoLocationObjectsPage.searchByObject();
        reportsVideoLocationObjectsPage.searchObjectHistoryCorrect();
        checkExpectedResult("Filter is not correct", true, reportsVideoLocationObjectsPage.searchObjectHistoryCorrect());
    }
    @After
    public void findErrors(){

    }
}
