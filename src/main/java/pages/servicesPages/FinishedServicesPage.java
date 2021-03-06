package pages.servicesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class FinishedServicesPage extends ParentPage {

    public FinishedServicesPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[text()='Services']")
    private WebElement services;
    @FindBy(xpath = ".//*[text()='Finished services']")
    private WebElement expectedServices;
    @FindBy(xpath = ".//span[text()='Finished services']")
    private WebElement checkExpectedServicesPage;
    @FindBy(xpath = ".//*[@href=\"/service/history/new\"]")
    private WebElement expServicesNew;
    @FindBy(id = "vehicleId")
    private WebElement chooseVehicle;
    @FindBy(xpath = ".//*[text()='AA000']")
    private WebElement setVehicle;
    @FindBy(xpath = ".//span[text()='New finished service']")
    private WebElement clickNewService;
    @FindBy(id = "serviceId")
    private WebElement chooseService;
    @FindBy(xpath = ".//*[text()='TestTO']")
    private WebElement setService;
    @FindBy(xpath = ".//*[@class='ng-untouched ng-pristine ng-invalid ng-star-inserted']//div//div//button")
    private WebElement clickSetServiceDate;
    @FindBy(xpath = ".//*[text()='11']")
    private WebElement chooseSetServiceDate;
    @FindBy(id = "serviceData")
    private WebElement setLastService;
    @FindBy(xpath=".//*[text()=' Save ']")
    private WebElement buttonSubmit;
    @FindBy(id = "serviceName")
    private WebElement inputServiceName;
    @FindBy(xpath=".//*[text()=' Close']")
    private WebElement buttonClose;
    @FindBy(id = "groupName")
    private WebElement chooseGroupe;
    @FindBy(xpath = ".//*[text()=' All Vehicles ']")
    private WebElement setGroupe;
    @FindBy(xpath=".//*[text()=\'Delete\']")
    private WebElement buttonDelete;
    @FindBy(xpath = ".//*[text()=\' Yes \']")
    private WebElement buttonYes;
//    @FindBy(xpath = ".//*")


    public void openServices() {
        actionsWithOurElements.clickOnElement(services);
    }

    public void openServicesExpected() {
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

    public void setServiceDate(){
        actionsWithOurElements.clickOnElement(clickSetServiceDate);
        actionsWithOurElements.clickOnElement(chooseSetServiceDate);
        actionsWithOurElements.clickOnElement(buttonClose);
    }

    public void setOdometerData(String lastKiloMeters){
        actionsWithOurElements.enterTextIntoInput(setLastService, lastKiloMeters);
    }

    public void clickSubmit(){
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    public void chooseGroup(){
        actionsWithOurElements.clickOnElement(chooseGroupe);
        actionsWithOurElements.clickOnElement(setGroupe);
    }

    public void enterTextIntoSearchByVehicle(String vehicle){
        actionsWithOurElements.enterTextIntoInput(inputServiceName, vehicle);
        actionsWithOurElements.clickOnSearchButton();
    }

    public void deleteService(){
        actionsWithOurElements.clickOnElement(checkExpectedServicesPage);

        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }

    public boolean filterIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(setService);
    }

}
