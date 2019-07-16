package pages.servicesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class ExpectedServicesPage extends ParentPage {

    public ExpectedServicesPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[text()='Services']")
    private WebElement services;
    @FindBy(xpath = ".//*[text()='Expected services']")
    private WebElement expectedServices;
    @FindBy(xpath = ".//span[text()='Expected services']")
    private WebElement checkExpectedServicesPage;
    @FindBy(xpath = ".//*[@href=\"/service/current/new\"]")
    private WebElement expServicesNew;
    @FindBy(id = "vehicleId")
    private WebElement chooseVehicle;
    @FindBy(xpath = ".//*[text()='AA000']")
    private WebElement setVehicle;
    @FindBy(xpath = ".//span[text()='New service']")
    private WebElement clickNewService;
    @FindBy(id = "serviceId")
    private WebElement chooseService;
    @FindBy(xpath = ".//*[text()='TestTO']")
    private WebElement setService;
    @FindBy(id = "serviceDate")
    private WebElement setLastService;
    @FindBy(xpath=".//*[text()=' Save ']")
    private WebElement buttonSubmit;
    @FindBy(id = "serviceName")
    private WebElement inputVehicleName;
    @FindBy(xpath=".//*[text()=' Search ']")
    private WebElement buttonSearch;
    @FindBy(id = "groupName")
    private WebElement chooseGroupe;
    @FindBy(xpath = ".//*[text()=' All Vehicles ']")
    private WebElement setGroupe;
    @FindBy(xpath=".//*[text()=\'Delete\']")
    private WebElement buttonDelete;
    @FindBy(xpath = ".//*[text()=\' Yes \']")
    private WebElement buttonYes;

    public void openServices() {
        actionsWithOurElements.clickOnElement(services);
    }

    public void openSetvicesExpected() {
        actionsWithOurElements.clickOnElement(expectedServices);
    }

    public boolean headerIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(checkExpectedServicesPage);
    }

    public void addNewExpServices(){
        actionsWithOurElements.clickOnElement(expServicesNew);
    }

    public void chooseVehicle(){
        actionsWithOurElements.clickOnElement(chooseVehicle);
        actionsWithOurElements.clickOnElement(setVehicle);
        actionsWithOurElements.clickOnElement(clickNewService);
    }

    public void chooseService(){
        actionsWithOurElements.clickOnElement(chooseService);
        actionsWithOurElements.clickOnElement(setService);
        actionsWithOurElements.clickOnElement(clickNewService);
    }

    public void setLastServiceData(){
        actionsWithOurElements.enterTextIntoInput(setLastService, "123");
    }

    public void clickSubmit(){
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    public void chooseGroupe(){
        actionsWithOurElements.clickOnElement(chooseGroupe);
        actionsWithOurElements.clickOnElement(setGroupe);
    }

    public void enterTextIntoSearchByVehicle(String vehicle){
        actionsWithOurElements.enterTextIntoInput(inputVehicleName, vehicle);
        actionsWithOurElements.clickOnElement(buttonSearch);
    }

    public void deleteService(){
        actionsWithOurElements.clickOnElement(checkExpectedServicesPage);
        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }





}
