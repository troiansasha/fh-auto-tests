package servicesTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ParentPage;
import parentTest.ParentTest;

public class DefectsTest extends ParentTest {

    final String Vehicle_name = "9187";
    final String POI_ADRESS = "POI Adress";


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


        defectsPage.searchDefByName(Vehicle_name);
        defectsPage.filterStatusIsCorrectNew();
        checkExpectedResult("Vehicle not find", true, defectsPage.filterIsCorrectName());
    }
    @Test
    public void validFindNewDefect() {


        defectsPage.selectNewDefectFromDropdown();
        defectsPage.filterStatusIsCorrectNew();
        checkExpectedResult("Vehicle not find", true, defectsPage.filterStatusIsCorrectNew());
    }
    @Test
    public void validFindFixedDefect() {


        defectsPage.selectFixedDefectFromDropdown();
        defectsPage.filterStatusIsCorrectFixed();
        checkExpectedResult("Vehicle not find", true, defectsPage.filterStatusIsCorrectFixed());
    }
    @Test
    public void defectPhotoes() {


        defectsPage.openPhotoDefect();
        defectsPage.changeView();
        defectsPage.exitFromPhoto();

    }
}
