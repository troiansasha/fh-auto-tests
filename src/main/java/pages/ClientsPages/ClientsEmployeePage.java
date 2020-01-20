package pages.ClientsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class ClientsEmployeePage extends ParentPage {
    public ClientsEmployeePage(WebDriver webDriver) {
        super(webDriver);
    }


    //Inputs and settings +
    @FindBy(id="fullName")
    private WebElement inputFullName;
    @FindBy(id="partnerId")
    private WebElement setCompany;
    @FindBy(xpath=".//*[text()='Name of company']")
    private WebElement chooseCompany;
    @FindBy(xpath=".//*[text()='New company']")
    private WebElement chooseCompanyEdit;
    @FindBy(id="email")
    private WebElement inputEmail;
    @FindBy(id="phoneNumber")
    private WebElement inputPhone;

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
    @FindBy(name="partnerTitle")
    private WebElement searchByCompany;
    @FindBy(name="fullName")
    private WebElement searchByName;
    @FindBy(name="email")
    private WebElement searchByEmail;

    //Open Pages +
    @FindBy(xpath = ".//*[text()='Clients']")
    private WebElement clients;
    @FindBy(xpath = ".//*[@href=\'/partners-employees\']")
    private WebElement clientsEmployees;
    @FindBy(xpath = ".//span[text()='Employees']")
    private WebElement checkEmployeesPage;

    //Add KeyWords
    @FindBy(xpath = ".//*[text()='Test FullName']")
    private WebElement fullName;
    @FindBy(xpath = ".//*[text()='Name of company']")
    private WebElement company;
    @FindBy(xpath = ".//*[text()='Test@email']")
    private WebElement email;
    @FindBy(xpath = ".//*[text()='55555']")
    private WebElement phoneNumber;
    @FindBy(xpath = ".//*[text()='Test CompanyName Edit']")
    private WebElement editFullName;
    @FindBy(xpath = ".//*[@href=\'/partners-employees/new\']")
    private WebElement employeesNew;

    //open
    public void openClients() {
        actionsWithOurElements.clickOnElement(clients);
    }

    public void openClientsEmployees() {
        actionsWithOurElements.clickOnElement(clientsEmployees);
    }
    //check
    public boolean headerIsCorrectEmployees() {
        return
                actionsWithOurElements.elementIsDisplayed(checkEmployeesPage);
    }
    public boolean companyIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(company);
    }
    public boolean nameIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(fullName);
    }
    public boolean companyEmailIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(email);
    }

    public boolean editFullNameIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(editFullName);
    }
    //add new
    public void addNewEmployees(){
        actionsWithOurElements.clickOnElement(employeesNew);
    }

    public void enterTextInToInputFullName(String FullName) {
        actionsWithOurElements.enterTextIntoInput(inputFullName, FullName);
    }

    public void enterTextInToInputEmail (String Email) {
        actionsWithOurElements.enterTextIntoInput(inputEmail, Email);
    }

    public void enterTextInToInputPhone (String Phone) {
        actionsWithOurElements.enterTextIntoInput(inputPhone, Phone);
    }
    public void clickOnSetCompany() {
        actionsWithOurElements.clickOnElement(setCompany);
        actionsWithOurElements.clickOnElement(chooseCompany);
    }

    public void clickSubmit() {
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    public void enterTextInToInputCompanyNameEdit (String FullName) {
        actionsWithOurElements.enterTextIntoInput(inputFullName, FullName);
    }

    public void enterTextInToInputEmailEdit (String Email) {
        actionsWithOurElements.enterTextIntoInput(inputEmail, Email);
    }
    public void enterTextInToInputPhoneEdit (String Phone) {
        actionsWithOurElements.enterTextIntoInput(inputPhone, Phone);
    }
    public void clickOnSetCompanyEdit() {
        actionsWithOurElements.clickOnElement(setCompany);
        actionsWithOurElements.clickOnElement(chooseCompanyEdit);
    }
    public void editEmployee () {
        actionsWithOurElements.clickOnElement(buttonEdit);
    }

    //search
    public void enterTextInToSearchByCompany (String CompanyName) {
        actionsWithOurElements.enterTextIntoInput(searchByCompany, CompanyName);
        actionsWithOurElements.clickOnSearchButton();
    }

    public void enterTextInToSearchByFullName(String FullName) {
        actionsWithOurElements.enterTextIntoInput(searchByName, FullName);
        actionsWithOurElements.clickOnSearchButton();
    }
    public void enterTextInToSearchByEmail(String companyEmail) {
        actionsWithOurElements.enterTextIntoInput(searchByEmail, companyEmail);
        actionsWithOurElements.clickOnSearchButton();
    }
    //delete
    public void deleteDriver() {
        actionsWithOurElements.clickOnElement(checkEmployeesPage);
        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }

}
