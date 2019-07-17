package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonelDriversPage extends ParentPage {

    public PersonelDriversPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id="fullName")
    private WebElement inputFullName;
    @FindBy(id="driverCard")
    private WebElement inputDriverCard;
    @FindBy(id="phoneNumber")
    private WebElement inputPhoneNumber;
    @FindBy(id="language")
    private WebElement setLanguage;
    @FindBy(xpath=".//*[@value=\"en\"]")
    private WebElement chooseLanguage;
//    @FindBy(id="address")
//    private WebElement inputAddress;
    @FindBy(xpath=".//*[text()=' Save ']")
    private WebElement buttonSubmit;
    @FindBy(name="fullName")
    private WebElement searchByFullName;
    @FindBy(xpath=".//*[text()=' Search ']")
    private WebElement buttonSearch;
    @FindBy(xpath=".//*[text()=\'Edit\']")
    private WebElement buttonEdit;
    @FindBy(xpath=".//*[text()=\'Delete\']")
    private WebElement buttonDelete;
    @FindBy(name="driverCard")
    private WebElement searchByDriverCard;
    @FindBy(xpath = ".//*[text()='Personnel']")
    private WebElement personel;
    @FindBy(xpath = ".//*[text()='Drivers']")
    private WebElement openDrivers;
    @FindBy(xpath = ".//span[text()='Drivers']")
    private WebElement checkDriversPage;
    @FindBy(xpath = ".//*[text()=' Back ']")
    private WebElement buttonBack;
    @FindBy(xpath = ".//*[text()=\' Yes \']")
    private WebElement buttonYes;
    @FindBy(xpath = ".//*[text()='Test Test']")
    private WebElement driverName;
    @FindBy(xpath = ".//*[@href=\'/drivers/new\']")
    private WebElement driversNew;
    @FindBy(xpath = ".//*[text()='Edit Test']")
    private WebElement editDriverName;

    public void openPersonel() {
        actionsWithOurElements.clickOnElement(personel);
    }

    public void openPersonelDrivers() {
        actionsWithOurElements.clickOnElement(openDrivers);
    }

    public boolean headerIsCorrect() {
        return
            actionsWithOurElements.elementIsDisplayed(checkDriversPage);
    }

    public boolean editDriverIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(editDriverName);
    }

    public void addNewDriver(){
        actionsWithOurElements.clickOnElement(driversNew);
    }

    public void enterTextInToInputFullName(String fullName) {
        actionsWithOurElements.enterTextIntoInput(inputFullName, fullName);
    }

    public void enterTextInToInputDriverCardNumber(String driverCardNumber) {
        actionsWithOurElements.enterTextIntoInput(inputDriverCard, driverCardNumber);
    }

    public void enterTextInToInputPhoneNumber(String phoneNumber) {
        actionsWithOurElements.enterTextIntoInput(inputPhoneNumber, phoneNumber);
    }

    public void inputDataDrivers(String fullName, String driverCardNumber, String phoneNumber){
        enterTextInToInputFullName(fullName);
        enterTextInToInputDriverCardNumber(driverCardNumber);
        enterTextInToInputPhoneNumber(phoneNumber);
    }

    public void dataDrivers(){
        inputDataDrivers("Test Test", "1578487894561235", "581365811");
    }

    public void clickOnSetLanguage() {
        actionsWithOurElements.clickOnElement(setLanguage);
        actionsWithOurElements.clickOnElement(chooseLanguage);
    }

    public void clickSubmit() {
        actionsWithOurElements.clickOnElement(buttonSubmit);//
    }

    public void enterTextInToSearchByFullName(String fullName) {
        actionsWithOurElements.enterTextIntoInput(searchByFullName, fullName);
        actionsWithOurElements.clickOnElement(buttonSearch);
    }

    public void editDriverBack() {
        actionsWithOurElements.clickOnElement(checkDriversPage);
        actionsWithOurElements.clickOnElement(buttonEdit);
        actionsWithOurElements.clickOnElement(buttonBack);
    }

    public void editDriverSave() {
        actionsWithOurElements.clickOnElement(checkDriversPage);
        actionsWithOurElements.clickOnElement(buttonEdit);
        actionsWithOurElements.enterTextIntoInput(inputFullName, "Edit Test");
        actionsWithOurElements.enterTextIntoInput(inputDriverCard, "5321654987848751");
        actionsWithOurElements.enterTextIntoInput(inputPhoneNumber, "00000000001");
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    public void deleteDriver() {
        actionsWithOurElements.clickOnElement(checkDriversPage);
        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }

//    public void enterTextInToSearchByFullNameClear(String fullName) {
//        actionsWithOurElements.enterTextIntoInput(searchByFullName, "");
//    }

    public void enterTextInToSearchByDriverCard(String driverCard) {
        actionsWithOurElements.enterTextIntoInput(searchByDriverCard, "1578487894561235");
        actionsWithOurElements.clickOnElement(buttonSearch);
    }

    public boolean driverIsCorrect() {
        return
        actionsWithOurElements.elementIsDisplayed(driverName);
    }

}