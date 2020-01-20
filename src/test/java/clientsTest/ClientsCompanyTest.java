package clientsTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class ClientsCompanyTest extends ParentTest {

    final String COMPANY = "Test CompanyName";
    final String COMPANY_EDIT = "Test CompanyName Edit";
    final String COMPANY_CODE = "7777777";
    final String COMPANY_CODE_EDIT = "88888888";
    final String REPRESENTATIVE = "Test Representative";
    final String REPRESENTATIVE_EDIT = "Test Representative Edit";


    @Before
    public void logIn(){
        //Login block
        loginPage.validLogin();
        //Go to
        clientsCompaniesPage.openClients();
        clientsCompaniesPage.openClientsCompanies();
        checkExpectedResult("Page Personel/Drivers is not opened", true, clientsCompaniesPage.headerIsCorrectCompanies());
    }
    @Test
    public void validCompanyCreate()  {

        clientsCompaniesPage.addNewCompany();
        clientsCompaniesPage.enterTextInToInputCompanyName(COMPANY);
        clientsCompaniesPage.enterTextInToInputCompanyCode(COMPANY_CODE);
        clientsCompaniesPage.enterTextInToInputRepresentative(REPRESENTATIVE);
        clientsCompaniesPage.clickOnSetCountry();
        clientsCompaniesPage.clickTachoModule();
        clientsCompaniesPage.clickManagementModule();
        clientsCompaniesPage.clickSubmit();
        checkExpectedResult("Driver is not find", true, clientsCompaniesPage.companyIsCorrect());
    }
    @Test
    public void validCompanyCreateEdit()  {

        clientsCompaniesPage.addNewCompany();
        clientsCompaniesPage.enterTextInToInputCompanyName(COMPANY);
        clientsCompaniesPage.enterTextInToInputCompanyCode(COMPANY_CODE);
        clientsCompaniesPage.enterTextInToInputRepresentative(REPRESENTATIVE);
        clientsCompaniesPage.clickOnSetCountry();
        clientsCompaniesPage.clickTachoModule();
        clientsCompaniesPage.clickManagementModule();
        clientsCompaniesPage.clickSubmit();
        clientsCompaniesPage.editCompany();
        clientsCompaniesPage.enterTextInToInputCompanyNameEdit(COMPANY_EDIT);
        clientsCompaniesPage.enterTextInToInputCompanyCodeEdit(COMPANY_CODE_EDIT);
        clientsCompaniesPage.enterTextInToInputRepresentativeEdit(REPRESENTATIVE_EDIT);
        clientsCompaniesPage.clickSubmit();
        checkExpectedResult("Driver is not find", true, clientsCompaniesPage.editCompanyIsCorrect());
    }
    @Test
    public void validCompanySearch() {

        clientsCompaniesPage.addNewCompany();
        clientsCompaniesPage.enterTextInToInputCompanyName(COMPANY);
        clientsCompaniesPage.enterTextInToInputCompanyCode(COMPANY_CODE);
        clientsCompaniesPage.enterTextInToInputRepresentative(REPRESENTATIVE);
        clientsCompaniesPage.clickOnSetCountry();
        clientsCompaniesPage.clickTachoModule();
        clientsCompaniesPage.clickManagementModule();
        clientsCompaniesPage.clickSubmit();
        clientsCompaniesPage.enterTextInToSearchByCompany(COMPANY);
        clientsCompaniesPage.headerIsCorrectCompanies();
        checkExpectedResult("Driver is not find", true, clientsCompaniesPage.companyIsCorrect());

    }
    @Test
    public void validRepresentativeSearch() {

        clientsCompaniesPage.addNewCompany();
        clientsCompaniesPage.enterTextInToInputCompanyName(COMPANY);
        clientsCompaniesPage.enterTextInToInputCompanyCode(COMPANY_CODE);
        clientsCompaniesPage.enterTextInToInputRepresentative(REPRESENTATIVE);
        clientsCompaniesPage.clickOnSetCountry();
        clientsCompaniesPage.clickTachoModule();
        clientsCompaniesPage.clickManagementModule();
        clientsCompaniesPage.clickSubmit();
        clientsCompaniesPage.enterTextInToSearchByRepresentative(REPRESENTATIVE);
        clientsCompaniesPage.headerIsCorrectCompanies();
        checkExpectedResult("Driver is not find", true, clientsCompaniesPage.representativeIsCorrect());

    }
    @Test
    public void validCompanyCodeSearch() {

        clientsCompaniesPage.addNewCompany();
        clientsCompaniesPage.enterTextInToInputCompanyName(COMPANY);
        clientsCompaniesPage.enterTextInToInputCompanyCode(COMPANY_CODE);
        clientsCompaniesPage.enterTextInToInputRepresentative(REPRESENTATIVE);
        clientsCompaniesPage.clickOnSetCountry();
        clientsCompaniesPage.clickTachoModule();
        clientsCompaniesPage.clickManagementModule();
        clientsCompaniesPage.clickSubmit();
        clientsCompaniesPage.enterTextInToSearchByCompanyCode(COMPANY_CODE);
        clientsCompaniesPage.headerIsCorrectCompanies();
        checkExpectedResult("Driver is not find", true, clientsCompaniesPage.companyCodeIsCorrect());

    }

    @After
    public void delete(){

        clientsCompaniesPage.deleteDriver();

    }
}
