package servicesTest;

import org.junit.Test;
import parentTest.ParentTest;

public class FinishedServiceTest extends ParentTest {

    @Test
    public void validServicesExpectedCreate() {

//        Before running test need to enter "Services Types" "TO"

        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        finishedServicesPage.openServices();
        finishedServicesPage.openSetvicesExpected();
        finishedServicesPage.headerIsCorrect();
        finishedServicesPage.addNewExpServices();
        finishedServicesPage.chooseVehicle();
        finishedServicesPage.chooseService();
        finishedServicesPage.setServiceDate();
        finishedServicesPage.clickSubmit();
        finishedServicesPage.chooseGroupe();
        finishedServicesPage.enterTextIntoSearchByVehicle();
        finishedServicesPage.deleteService();

    }


}
