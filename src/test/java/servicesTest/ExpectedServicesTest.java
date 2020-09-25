package servicesTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class ExpectedServicesTest extends ParentTest {

    @Before
    public void LogIn(){
        loginPage.validLogin();
        expectedServicesPage.openServices();
        expectedServicesPage.openSetvicesExpected();


    }

    @Test
    public void headerIsCorrectExpectedServices() {
        expectedServicesPage.headerIsCorrect();
        checkExpectedResult("Page Services/Expected Services not opened", true, expectedServicesPage.headerIsCorrect());

    }

    @Test
    public void validServicesExpectedCreate() {

        expectedServicesPage.addNewExpServices();
        expectedServicesPage.chooseVehicle();
        expectedServicesPage.chooseService();
        expectedServicesPage.setLastServiceData();
        expectedServicesPage.clickSubmit();
        expectedServicesPage.chooseGroupe();

    }

    @Test
    public void validServicesExpectedEditSave(){
        expectedServicesPage.addNewExpServices();
        expectedServicesPage.chooseVehicle();
        expectedServicesPage.chooseService();
        expectedServicesPage.setLastServiceData();
        expectedServicesPage.clickSubmit();
        expectedServicesPage.chooseGroupe();
        expectedServicesPage.enterTextIntoSearchByVehicle("testto");
        expectedServicesPage.editService();
    }


    @After
    public void delete(){
        expectedServicesPage.enterTextIntoSearchByVehicle("testto");
        expectedServicesPage.deleteService();

    }

}
