package clientsTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class ClientsEmployeeTest extends ParentTest {
    final String FULLNAME = "Test FullName";
    final String FULLNAME_EDIT = "Test CompanyName Edit";
    final String COMPANY_EMAIL = "Test@email";
    final String COMPANY_EMAIL_EDIT = "Test@email EDIT";
    final String COMPANY_PHONE = "55555";
    final String COMPANY_PHONE_EDIT = "44444444";
    final String COMPANY = "Name of company";


    @Before
    public void logIn(){
        //Login block
        loginPage.validLogin();
        //Go to
        clientsEmployeePage.openClients();
        clientsEmployeePage.openClientsEmployees();
        checkExpectedResult("Page Clients/Employee is not opened", true, clientsEmployeePage.headerIsCorrectEmployees());
    }
    @Test
    public void validCompanyCreate()  {

        clientsEmployeePage.addNewEmployees();
        clientsEmployeePage.enterTextInToInputFullName(FULLNAME);
        clientsEmployeePage.enterTextInToInputEmail(COMPANY_EMAIL);
        clientsEmployeePage.enterTextInToInputPhone(COMPANY_PHONE);
        clientsEmployeePage.clickOnSetCompany();
        clientsEmployeePage.clickSubmit();
        checkExpectedResult("Employee is not find", true, clientsEmployeePage.companyIsCorrect());
    }
    @Test
    public void validCompanyCreateEdit()  {

        clientsEmployeePage.addNewEmployees();
        clientsEmployeePage.enterTextInToInputFullName(FULLNAME);
        clientsEmployeePage.enterTextInToInputEmail(COMPANY_EMAIL);
        clientsEmployeePage.enterTextInToInputPhone(COMPANY_PHONE);
        clientsEmployeePage.clickOnSetCompany();
        clientsEmployeePage.clickSubmit();
        clientsEmployeePage.editEmployee();
        clientsEmployeePage.enterTextInToInputFullName(FULLNAME_EDIT);
        clientsEmployeePage.enterTextInToInputEmail(COMPANY_EMAIL_EDIT);
        clientsEmployeePage.enterTextInToInputPhone(COMPANY_PHONE_EDIT);
        clientsEmployeePage.clickSubmit();
        checkExpectedResult("Employee is not find", true, clientsEmployeePage.editFullNameIsCorrect());
    }
    @Test
    public void validFullNameSearch() {

        clientsEmployeePage.addNewEmployees();
        clientsEmployeePage.enterTextInToInputFullName(FULLNAME);
        clientsEmployeePage.enterTextInToInputEmail(COMPANY_EMAIL);
        clientsEmployeePage.enterTextInToInputPhone(COMPANY_PHONE);
        clientsEmployeePage.clickOnSetCompany();
        clientsEmployeePage.clickSubmit();
        clientsEmployeePage.enterTextInToSearchByFullName(FULLNAME);
        clientsEmployeePage.headerIsCorrectEmployees();
        checkExpectedResult("Employee is not find", true, clientsEmployeePage.nameIsCorrect());

    }
    @Test
    public void validEmailSearch() {

        clientsEmployeePage.addNewEmployees();
        clientsEmployeePage.enterTextInToInputFullName(FULLNAME);
        clientsEmployeePage.enterTextInToInputEmail(COMPANY_EMAIL);
        clientsEmployeePage.enterTextInToInputPhone(COMPANY_PHONE);
        clientsEmployeePage.clickOnSetCompany();
        clientsEmployeePage.clickSubmit();
        clientsEmployeePage.enterTextInToSearchByEmail(COMPANY_EMAIL);
        clientsEmployeePage.headerIsCorrectEmployees();
        checkExpectedResult("Employee is not find", true, clientsEmployeePage.companyEmailIsCorrect());

    }
    @Test
    public void validCompanySearch() {

        clientsEmployeePage.addNewEmployees();
        clientsEmployeePage.enterTextInToInputFullName(FULLNAME);
        clientsEmployeePage.enterTextInToInputEmail(COMPANY_EMAIL);
        clientsEmployeePage.enterTextInToInputPhone(COMPANY_PHONE);
        clientsEmployeePage.clickOnSetCompany();
        clientsEmployeePage.clickSubmit();
        clientsEmployeePage.enterTextInToSearchByCompany(COMPANY);
        clientsEmployeePage.headerIsCorrectEmployees();
        checkExpectedResult("Employee is not find", true, clientsEmployeePage.companyIsCorrect());

    }

    @After
    public void delete(){

        clientsEmployeePage.deleteDriver();

    }
}
