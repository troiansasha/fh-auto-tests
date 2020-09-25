package pages.myFleetPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class VehiclesPage extends ParentPage {

    public VehiclesPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[text()='My fleet']")
    private WebElement myFleet;
    @FindBy(xpath = ".//*[text()='Vehicles']")
    private WebElement vehicles;
    @FindBy(xpath = ".//span[text()='Vehicles list']")
    private WebElement checkVehiclesPage;
    @FindBy(id="plateNumber")
    private WebElement inputVehicleName;
//    @FindBy(xpath=".//*[text()=' Search ']")
//    private WebElement buttonSearch;
    @FindBy(xpath = ".//*[text()=' AA010 ']")
    private WebElement vehicleNameIsCorrrect;
    @FindBy(id = "licensePlateNumber")
    private WebElement inputVehicleLicensePlate;
    @FindBy(xpath = ".//*[text()=' test ']")
    private WebElement vehicleLicensePlateIsCorrrect;
    @FindBy(id = "simNumber")
    private WebElement inputVehiclePhoneNumber;
    @FindBy(xpath = ".//*[text()='+37066755779']")
    private WebElement vehiclePhoneNumberIsCorrect;
    @FindBy(id = "vehicleType")
    private WebElement vehicleTypeDD;
    @FindBy(xpath = ".//*[text()=' Mega Truck ']")
    private WebElement vehicleTypeIsCorrect;
    @FindBy(id = "department")
    private WebElement departmentDD;
    @FindBy(xpath = ".//*[text()=' UA-01-Kyiv ']")
    private WebElement departmentTypeIsCorrect;


    public void openVehicles(){
        actionsWithOurElements.clickOnElement(myFleet);
        actionsWithOurElements.clickOnElement(vehicles);
    }

    public boolean headerIsCorrect(){
        return
        actionsWithOurElements.elementIsDisplayed(checkVehiclesPage);
    }

    public void enterTextInToInputVehicleName(String vehicleName){
        actionsWithOurElements.enterTextIntoInput(inputVehicleName, vehicleName);
        actionsWithOurElements.clickOnSearchButton();
    }

    public boolean filterIsCorrectName(){
        return
        actionsWithOurElements.elementIsDisplayed(vehicleNameIsCorrrect);
    }

    public void enterTextInToInputVehicleLicensePlate(String licensePlate){
        actionsWithOurElements.enterTextIntoInput(inputVehicleLicensePlate, licensePlate);
        actionsWithOurElements.clickOnSearchButton();
    }

    public boolean filterIsCorrectLicesePlate(){
        return
                actionsWithOurElements.elementIsDisplayed(vehicleLicensePlateIsCorrrect);
    }

    public void enterTextInToInputVehiclePhoneNumber(String phoneNumber){
        actionsWithOurElements.enterTextIntoInput(inputVehiclePhoneNumber, phoneNumber);
        actionsWithOurElements.clickOnSearchButton();
    }

    public boolean filterIsCorrectPhoneNumber(){
        return
                actionsWithOurElements.elementIsDisplayed(vehiclePhoneNumberIsCorrect);
    }


    public void selectVehicleTypeFromDropdown(String vehicleType) {
        actionsWithOurElements.selectTextInDD(vehicleTypeDD, vehicleType);
        actionsWithOurElements.clickOnSearchButton();
    }

    public boolean filterIsCorrectVehicleType() {
        return
                actionsWithOurElements.elementIsDisplayed(vehicleTypeIsCorrect);
    }

    public void selectDepartmentFromDropdown(String departmentType) {
        actionsWithOurElements.selectTextInDD(departmentDD, departmentType);
        actionsWithOurElements.clickOnSearchButton();
    }

    public boolean filterIsCorrectDepartment() {
        return
                actionsWithOurElements.elementIsDisplayed((departmentTypeIsCorrect));
    }
}
