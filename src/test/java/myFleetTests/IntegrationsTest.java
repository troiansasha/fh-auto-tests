package myFleetTests;

import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class IntegrationsTest extends ParentTest {

    final String VEHICLE_NAME = "AA007";
    final String lICENSE_PLATE = "123124";
    final String INEGRATION_NUMBER = "FLH-6C54";

    @Before
    public void preconditionIntegration(){
        //Login block
        loginPage.validLogin();
        integrationsPage.openIntegrations();
    }

    @Test
    public void searcByNameIntegration(){
        integrationsPage.inputVehicleName(VEHICLE_NAME);
        homePage.timer3seconds();
        integrationsPage.vehicleNameIsCorrect();
        checkExpectedResult("Filter is not correct", true, integrationsPage.vehicleNameIsCorrect());
    }
    @Test
    public void searcByLicencePlateIntegration(){
        integrationsPage.inputLicencePlate(lICENSE_PLATE);
        homePage.timer3seconds();
        integrationsPage.integrationNumberIsCorrect();
        checkExpectedResult("Filter is not correct", true, integrationsPage.integrationNumberIsCorrect());

    }
    @Test
    public void searcByIntegrationNumber(){
        integrationsPage.inputIntegrationNumber(INEGRATION_NUMBER);
        homePage.timer3seconds();
        integrationsPage.vehicleNameIsCorrect();
        checkExpectedResult("Filter is not correct", true, integrationsPage.integrationNumberIsCorrect());

    }
    //
    @Test
    public void searcByEmptyLicencePlateIntegration(){
        integrationsPage.clickOnEmptyLicensePlate();
        homePage.timer3seconds();
        integrationsPage.vehicleNameIsCorrect();
        checkExpectedResult("Filter is not correct", true, integrationsPage.integrationNumberIsCorrect());

    }
    @Test
    public void searcByProjectActiveIntegration(){
        integrationsPage.inputIntegrationNumber(INEGRATION_NUMBER);
        homePage.timer3seconds();
        integrationsPage.vehicleNameIsCorrect();
        checkExpectedResult("Filter is not correct", true, integrationsPage.integrationNumberIsCorrect());

    }
    @Test
    public void searcByProjectPassiveIntegration(){
        integrationsPage.inputIntegrationNumber(INEGRATION_NUMBER);
        homePage.timer3seconds();
        integrationsPage.vehicleNameIsCorrect();
        checkExpectedResult("Filter is not correct", true, integrationsPage.integrationNumberIsCorrect());

    }
    @Test
    public void searcBySentActiveIntegration(){
        integrationsPage.inputIntegrationNumber(INEGRATION_NUMBER);
        homePage.timer3seconds();
        integrationsPage.vehicleNameIsCorrect();
        checkExpectedResult("Filter is not correct", true, integrationsPage.integrationNumberIsCorrect());

    }
    @Test
    public void searcByEconnectActiveIntegration(){
        integrationsPage.inputIntegrationNumber(INEGRATION_NUMBER);
        homePage.timer3seconds();
        integrationsPage.vehicleNameIsCorrect();
        checkExpectedResult("Filter is not correct", true, integrationsPage.integrationNumberIsCorrect());

    }
}
