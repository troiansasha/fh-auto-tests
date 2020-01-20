package pages.ClientsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class ClientsVehicleAccessPage extends ParentPage {
    public ClientsVehicleAccessPage(WebDriver webDriver) {
        super(webDriver);
    }

    //Inputs and settings
    @FindBy(id="autocomplete-input")
    private WebElement inputCompanyName;
    @FindBy(xpath=".//*[text()='Employee email']/../app-single-select/div/input")
    private WebElement inputEmployeeEmail;
    @FindBy(xpath=".//*[@class='form-control picker-input ng-pristine ng-valid ng-touched']")
    private WebElement inputDateFrom;
    @FindBy(id=".//*[text()='Share till']/../app-date-time-picker/form/div/div/input")
    private WebElement inputDateTill;
    @FindBy(xpath=".//*[text()='Select vehicle']/../app-vehicle-multi-select/div/div/div/input")
    private WebElement inputSelectVehicleadd;
    @FindBy(xpath=".//*[@class='selected-vehicles ng-untouched ng-pristine ng-valid']")
    private WebElement inputSelectVehicle;
    @FindBy(xpath = ".//*[text()='Add all']")
    private WebElement addAllButton;
    @FindBy(xpath=".//*[text()='Select company']/../app-partner-select/div/select")
    private WebElement clickOnEditCompamy;
    @FindBy(xpath = ".//*[text()='УкрТест']")
    private WebElement clickonNwEditCompany;

    //Global actions +
    @FindBy(xpath=".//*[text()=' Save ']")
    private WebElement buttonSubmit;
    @FindBy(xpath=".//*[text()=' Search ']")
    private WebElement buttonSearch;
    @FindBy(xpath=".//*[text()=\'Edit\']")
    private WebElement buttonEdit;
    @FindBy(xpath=".//*[text()=\'Delete\']")
    private WebElement buttonDelete;
    @FindBy(xpath = ".//*[text()=' Back ']")
    private WebElement buttonBack;
    @FindBy(xpath = ".//*[text()=\' Yes \']")
    private WebElement buttonYes;

    //Search +
    @FindBy(name="partner")
    private WebElement searchByCompany;
    @FindBy(name="vehicle")
    private WebElement searchByVehicle;


    //Open Pages +
    @FindBy(xpath = ".//*[text()='Clients']")
    private WebElement clients;
    @FindBy(xpath = ".//*[text()='Vehicle access']")
    private WebElement openCompaniesVehicleAccess;
    @FindBy(xpath = ".//span[text()='Access for vehicle tracking']")
    private WebElement checkVehicleAccessPage;

    // Add/KeyWords
    @FindBy(xpath = ".//*[text()='Ukrtest']")
    private WebElement selectCompanyNameIsCorrect;
    @FindBy(xpath = ".//*[text()='УкрТест']")
    private WebElement editCompanyNameIsCorrect;
    @FindBy(xpath = ".//*[text()='Ukrtest@ukrtest']")
    private WebElement addEmployeeEmail;
    @FindBy(xpath = ".//*[@href='/shared-vehicles/new']")
    private WebElement vehicleAccessNew;
    @FindBy(xpath = ".//*[text()='LAT346']")
    private WebElement vehicleIsCorrect;

    //open
    public void openClients() {
        actionsWithOurElements.clickOnElement(clients);
    }

    public void openClientsVehicleAccess() {
        actionsWithOurElements.clickOnElement(openCompaniesVehicleAccess);
    }
    //check
    public boolean headerIsCorrectVehicleAccess() {
        return
                actionsWithOurElements.elementIsDisplayed(checkVehicleAccessPage);
    }
    public boolean companyIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(selectCompanyNameIsCorrect);
    }
    public boolean vehicleIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(vehicleIsCorrect);
    }
    public boolean editCompanyIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(editCompanyNameIsCorrect);
    }

    //add new
    public void addNewVehicleAccess(){
        actionsWithOurElements.clickOnElement(vehicleAccessNew);
    }

    public void enterTextInToInputSelectCompany(String SelectCompany) {
        actionsWithOurElements.enterTextIntoInput(inputCompanyName, SelectCompany);
    }

    public void enterTextInToInputDateFrom (String From) {
        actionsWithOurElements.enterTextIntoInput(inputDateFrom, From);
    }
    public void enterTextInToInputDateTill (String Till) {
        actionsWithOurElements.enterTextIntoInput(inputDateTill, Till);
    }

    public void enterTextInToInputEmployeeEmail (String Email) {
        actionsWithOurElements.enterTextIntoInput(inputEmployeeEmail, Email);
    }
    public void enterTextInToInputSelectVehicle (String SelectVehicle) {
        actionsWithOurElements.enterTextIntoInput(inputSelectVehicleadd, SelectVehicle);
        actionsWithOurElements.clickOnEnter(inputSelectVehicleadd);
    }

    public void enterAllVehicle() {
        actionsWithOurElements.clickOnElement(addAllButton);
    }


    public void clickSubmit() {
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }
    //edit
    public void enterTextInToInputSelectCompanyEdit () {
        actionsWithOurElements.clickOnElement(clickOnEditCompamy);
        actionsWithOurElements.clickOnElement(clickonNwEditCompany);
}
//    public void enterTextInToInputDateFromEdit (String FromEdit) {
//        actionsWithOurElements.enterTextIntoInput(inputDateFrom, FromEdit);
//    }
//    public void enterTextInToInputDateTillEdit (String TillEdit) {
//        actionsWithOurElements.enterTextIntoInput(inputDateTill, TillEdit);
//    }
//
//    public void enterTextInToInputSelectVehicleEdit (String SelectVehicleEdit) {
//        actionsWithOurElements.enterTextIntoInput(inputSelectVehicle, SelectVehicleEdit);
//    }

    public void editCompany () {
        actionsWithOurElements.clickOnElement(buttonEdit);
    }

    //search
    public void enterTextInToSearchByCompany (String companyName) {
        actionsWithOurElements.enterTextIntoInput(searchByCompany, companyName);
        actionsWithOurElements.clickOnSearchButton();
    }

    public void enterTextInToSearchBycVehicle(String Vehicle) {
        actionsWithOurElements.enterTextIntoInput(searchByVehicle, Vehicle);
        actionsWithOurElements.clickOnSearchButton();
    }
    //delete
    public void deleteAccess() {
//        actionsWithOurElements.clickOnElement(openCompaniesVehicleAccess);
        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }

}
