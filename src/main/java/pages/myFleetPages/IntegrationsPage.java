package pages.myFleetPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class IntegrationsPage extends ParentPage {
    public IntegrationsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[text()='My fleet']")
    private WebElement myFleet;
    @FindBy(xpath = ".//*[text()='Integrations']")
    private WebElement vehicleIntegrations;
    @FindBy(id = "plateNumber")
    private WebElement inputPlateNumber;
    @FindBy(id = "licensePlate")
    private WebElement inputLicencePlate;
    @FindBy(id = "integrationId")
    private WebElement inputIntegrationNumber;
    @FindBy(xpath = ".//*[text()='AA007']")
    private WebElement correctVehicleNameFilter;
    @FindBy(xpath = ".//*[text()='123124']")
    private WebElement correctLicencePlateFilter;
    @FindBy(xpath = ".//*[text()='FLH-6C54']")
    private WebElement correctIntegrationNumberFilter;
    @FindBy(xpath = ".//*[text()='Empty license plate']")
    private WebElement flagEmptyLicensePlate;

    public void openIntegrations() {

        actionsWithOurElements.clickOnElement(myFleet);
        actionsWithOurElements.clickOnElement(vehicleIntegrations);
    }

    public void inputVehicleName(String vehicleName) {
        actionsWithOurElements.enterTextIntoInput(inputPlateNumber, vehicleName);
        actionsWithOurElements.clickOnSearchButton();
    }
    public void inputLicencePlate(String licencePlate) {
        actionsWithOurElements.enterTextIntoInput(inputLicencePlate, licencePlate);
        actionsWithOurElements.clickOnSearchButton();
    }
    public void inputIntegrationNumber(String integrationNumber) {
        actionsWithOurElements.enterTextIntoInput(inputIntegrationNumber, integrationNumber);
        actionsWithOurElements.clickOnSearchButton();
    }

    public boolean vehicleNameIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(correctVehicleNameFilter);
    }
    public boolean licencePlateIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(correctLicencePlateFilter);

    }
    public boolean integrationNumberIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(correctIntegrationNumberFilter);
    }
    public void clickOnEmptyLicensePlate(){
        actionsWithOurElements.clickOnElement(flagEmptyLicensePlate);
    }
}