package pages.ClientsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class ClientsCompaniesPage extends ParentPage
{
    public ClientsCompaniesPage(WebDriver webDriver) {
        super(webDriver);
    }
    //Inputs and settings +
    @FindBy(id="title")
    private WebElement inputCompanyName;
    @FindBy(id="companyCode")
    private WebElement inputCompanyCode;
    @FindBy(id="representative")
    private WebElement inputRepresentative;
    @FindBy(id="countryId")
    private WebElement setCountry;
    @FindBy(xpath=".//*[@value='29']")
    private WebElement chooseCountry;
    @FindBy(xpath=".//*[@value='28']")
    private WebElement chooseCountryEdit;
    @FindBy(xpath=".//*[text()='Tacho module']")
    private WebElement setTachoModule;
    @FindBy(xpath=".//*[text()=' Management module ']")
    private WebElement setManagementModule;


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
    @FindBy(name="title")
    private WebElement searchByCompany;
    @FindBy(name="companyCode")
    private WebElement searchByCompanyCode;
    @FindBy(name="representative")
    private WebElement searchByRepresPerson;

    //Open Pages +
    @FindBy(xpath = ".//*[text()='Clients']")
    private WebElement clients;
    @FindBy(xpath = ".//*[text()='Companies']")
    private WebElement openCompanies;
    @FindBy(xpath = ".//span[text()='Companies']")
    private WebElement checkCompaniesPage;

    //Add KeyWords
    @FindBy(xpath = ".//*[text()='Test CompanyName']")
    private WebElement companyName;
    @FindBy(xpath = ".//*[text()='Test Representative']")
    private WebElement representativeName;
    @FindBy(xpath = ".//*[text()='7777777']")
    private WebElement companyCode;
    @FindBy(xpath = ".//*[text()='Test CompanyName Edit']")
    private WebElement editCompanyName;
    @FindBy(xpath = ".//*[@href=\'/partners/new\']")
    private WebElement companiesNew;

//open
    public void openClients() {
        actionsWithOurElements.clickOnElement(clients);
    }

    public void openClientsCompanies() {
        actionsWithOurElements.clickOnElement(openCompanies);
    }
//check
    public boolean headerIsCorrectCompanies() {
        return
                actionsWithOurElements.elementIsDisplayed(checkCompaniesPage);
    }
    public boolean companyIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(companyName);
    }
    public boolean representativeIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(representativeName);
    }
    public boolean companyCodeIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(companyCode);
    }


    public boolean editCompanyIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(editCompanyName);
    }
//add new
    public void addNewCompany(){
        actionsWithOurElements.clickOnElement(companiesNew);
    }

    public void enterTextInToInputCompanyName(String CompanyName) {
        actionsWithOurElements.enterTextIntoInput(inputCompanyName, CompanyName);
    }

    public void enterTextInToInputCompanyCode (String CompanyCode) {
        actionsWithOurElements.enterTextIntoInput(inputCompanyCode, CompanyCode);
    }

    public void enterTextInToInputRepresentative (String Representative) {
        actionsWithOurElements.enterTextIntoInput(inputRepresentative, Representative);
    }
    public void clickOnSetCountry() {
        actionsWithOurElements.clickOnElement(setCountry);
        actionsWithOurElements.clickOnElement(chooseCountry);
    }
    public void clickTachoModule (){actionsWithOurElements.clickOnElement(setTachoModule);}
    public void clickManagementModule (){actionsWithOurElements.clickOnElement(setManagementModule);}

    public void clickSubmit() {
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    public void enterTextInToInputCompanyNameEdit (String CompanyName) {
        actionsWithOurElements.enterTextIntoInput(inputCompanyName, CompanyName);
    }

    public void enterTextInToInputCompanyCodeEdit (String CompanyCode) {
        actionsWithOurElements.enterTextIntoInput(inputCompanyCode, CompanyCode);
    }
    public void enterTextInToInputRepresentativeEdit (String Representative) {
        actionsWithOurElements.enterTextIntoInput(inputRepresentative, Representative);
    }
    public void clickOnSetCountryEdit() {
        actionsWithOurElements.clickOnElement(setCountry);
        actionsWithOurElements.clickOnElement(chooseCountryEdit);
    }
    public void editCompany () {
        actionsWithOurElements.clickOnElement(buttonEdit);
    }

//search
    public void enterTextInToSearchByCompany (String companyName) {
        actionsWithOurElements.enterTextIntoInput(searchByCompany, companyName);
        actionsWithOurElements.clickOnSearchButton();
    }

    public void enterTextInToSearchByCompanyCode(String companyCode) {
        actionsWithOurElements.enterTextIntoInput(searchByCompanyCode, companyCode);
        actionsWithOurElements.clickOnSearchButton();
    }
    public void enterTextInToSearchByRepresentative(String companyRepresentative) {
        actionsWithOurElements.enterTextIntoInput(searchByRepresPerson, companyRepresentative);
        actionsWithOurElements.clickOnSearchButton();
    }
//delete
    public void deleteDriver() {
        actionsWithOurElements.clickOnElement(checkCompaniesPage);
        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }


}
