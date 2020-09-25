package clientsTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class ClientsVehicleAccessTest extends ParentTest {

    final String COMPANY = "Ukrtest";
    final String COMPANY_EDIT = "Ukrtest EDIT";
    final String EMPLOYEE_EMAIL = "Employee@email";
    final String VEHICLE = "LAT346";


    @Before
    public void logIn(){
        //Login block
        loginPage.validLogin();
        //Go to
        clientsVehicleAccessPage.openClients();
        clientsVehicleAccessPage.openClientsVehicleAccess();
        checkExpectedResult("Page Personel/Drivers is not opened", true, clientsVehicleAccessPage.headerIsCorrectVehicleAccess());
    }
    @Test
    public void validCompanyCreate()  {

        clientsVehicleAccessPage.addNewVehicleAccess();
        clientsVehicleAccessPage.enterTextInToInputSelectCompany(COMPANY);
        clientsVehicleAccessPage.enterTextInToInputSelectVehicle(VEHICLE);
//        clientsVehicleAccessPage.enterAllVehicle();
//        clientsVehicleAccessPage.enterTextInToInputEmployeeEmail(EMPLOYEE_EMAIL);
        clientsVehicleAccessPage.clickSubmit();
        clientsVehicleAccessPage.companyIsCorrect();
        checkExpectedResult("Driver is not find", true, clientsVehicleAccessPage.companyIsCorrect());
    }
    @Test
    public void validCompanyCreateEdit()  {

        clientsVehicleAccessPage.addNewVehicleAccess();
        clientsVehicleAccessPage.enterTextInToInputSelectCompany(COMPANY);
        clientsVehicleAccessPage.enterTextInToInputSelectVehicle(VEHICLE);
        clientsVehicleAccessPage.clickSubmit();
        clientsVehicleAccessPage.editCompany();
        clientsVehicleAccessPage.enterTextInToInputSelectCompanyEdit();
        clientsVehicleAccessPage.clickSubmit();
        clientsVehicleAccessPage.editCompanyIsCorrect();
        checkExpectedResult("Driver is not find", true, clientsVehicleAccessPage.editCompanyIsCorrect());
    }
    @Test
    public void validCompanySearch() {

        clientsVehicleAccessPage.addNewVehicleAccess();
        clientsVehicleAccessPage.enterTextInToInputSelectCompany(COMPANY);
        clientsVehicleAccessPage.enterTextInToInputSelectVehicle(VEHICLE);
        clientsVehicleAccessPage.clickSubmit();
        clientsVehicleAccessPage.enterTextInToSearchByCompany(COMPANY);
        clientsVehicleAccessPage.companyIsCorrect();
        checkExpectedResult("Driver is not find", true, clientsVehicleAccessPage.companyIsCorrect());

    }
//    @Test
//    public void validVehicleSearch() {
//
//        clientsVehicleAccessPage.addNewVehicleAccess();
//        clientsVehicleAccessPage.enterTextInToInputSelectCompany(COMPANY);
//        clientsVehicleAccessPage.enterTextInToInputSelectVehicle(VEHICLE);
//        clientsVehicleAccessPage.clickSubmit();
//        clientsVehicleAccessPage.enterTextInToSearchBycVehicle(VEHICLE);
//        clientsVehicleAccessPage.vehicleIsCorrect();
//        checkExpectedResult("Driver is not find", true, clientsVehicleAccessPage.vehicleIsCorrect());
//
//    }
        @After
        public void delete () {

            clientsVehicleAccessPage.deleteAccess();

        }
    }

