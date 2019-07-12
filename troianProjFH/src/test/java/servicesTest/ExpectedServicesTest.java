package servicesTest;

import org.junit.Test;
import pages.LoginPage;
import parentTest.ParentTest;

public class ExpectedServicesTest extends ParentTest {

    @Test
    public void validServicesExpectedCreate() {

//        Before running test need to enter "Services Types" "TO"

        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        expectedServicesPage.openServices();
        expectedServicesPage.openSetvicesExpected();
        expectedServicesPage.headerIsCorrect();
        expectedServicesPage.addNewExpServices();
        expectedServicesPage.chooseVehicle();
        expectedServicesPage.chooseService();
        expectedServicesPage.setLastServiceData();
        expectedServicesPage.clickSubmit();
        expectedServicesPage.chooseGroupe();
        expectedServicesPage.enterTextIntoSearchByVehicle();
        expectedServicesPage.deleteService();

    }


}
