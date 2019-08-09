package servicesTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class FinishedServiceTest extends ParentTest {

    @Before
    public void LogIn(){
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        finishedServicesPage.openServices();
        finishedServicesPage.openServicesExpected();
        finishedServicesPage.headerIsCorrect();
        checkExpectedResult("Page Services/Finished Services not opened", true, finishedServicesPage.headerIsCorrect());

    }

    @Test
    public void validServicesExpectedCreate() {
//        Before running test need to enter "Services Types" "TestTO"

        finishedServicesPage.addNewExpServices();
        finishedServicesPage.chooseVehicle();
        finishedServicesPage.chooseService();
        finishedServicesPage.setServiceDate();
        finishedServicesPage.setOdometerData("123");
        finishedServicesPage.clickSubmit();
        finishedServicesPage.chooseGroup();

    }



    @After
    public void delete(){
        finishedServicesPage.enterTextIntoSearchByVehicle("TestTO");
        finishedServicesPage.deleteService();
//        checkExpectedResult("service has been removed", false, finishedServicesPage.filterIsCorrect());
    }

}
