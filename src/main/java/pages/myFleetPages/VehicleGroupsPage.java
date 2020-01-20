package pages.myFleetPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class VehicleGroupsPage extends ParentPage
{
    public VehicleGroupsPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = ".//*[text()='My fleet']")
    private WebElement myFleet;
    @FindBy(xpath = ".//*[text()='Vehicle groups']")
    private WebElement vehicleGroups;
    @FindBy(xpath = ".//span[text()='My group']")
    private WebElement checkVehicleGroupsPage;
    @FindBy(id="plateNumber")
    private WebElement inputVehicleName;
    @FindBy(xpath = ".//*[@title='documents.vehicle-change.form.add']")
    private WebElement addGroup;
    @FindBy(id="title")
    private WebElement inputGroupName;
    @FindBy(xpath = ".//span[text()='Alarms']")
    private WebElement addNotificationAlarm;
    @FindBy(xpath = ".//span[text()='Drivers']")
    private WebElement addNotificationDrivers;
    @FindBy(xpath = ".//span[text()='Geozones']")
    private WebElement addNotificationGeozones;
    @FindBy(xpath = ".//span[text()='Services']")
    private WebElement addNotificationServices;
    @FindBy(xpath = ".//span[text()='Add all']")
    private WebElement addAllVehicle;
    @FindBy(xpath=".//*[text()=' LAT346 ']")
    private WebElement buttonVehicle1;
    @FindBy(xpath = ".//span[text()='Test Group Name']")
    private WebElement newGroupAdded;
    @FindBy(xpath = ".//span[text()='Test Group Name Edit']")
    private WebElement newGroupEditAdded;
    @FindBy(xpath=".//*[text()='Delete']")
    private WebElement buttonDelete;
    @FindBy(xpath = ".//*[text()=\' Yes \']")
    private WebElement buttonYes;

    public void openVehicleGroups(){
        actionsWithOurElements.clickOnElement(myFleet);
        actionsWithOurElements.clickOnElement(vehicleGroups);
    }

    public boolean headerIsCorrectVehicleGroups(){
        return
          actionsWithOurElements.elementIsDisplayed(checkVehicleGroupsPage);
    }
    public void addMyFleetNewGroup(){
        actionsWithOurElements.clickOnElement(addGroup);
    }
    public void inputGroupName(String vehicleGroup){
        actionsWithOurElements.enterTextIntoInput(inputGroupName, vehicleGroup);
    }
    public void addNotification(){
        actionsWithOurElements.clickOnElement(addNotificationAlarm);
        actionsWithOurElements.clickOnElement(addNotificationDrivers);
        actionsWithOurElements.clickOnElement(addNotificationGeozones);
        actionsWithOurElements.clickOnElement(addNotificationServices);
    }
    public void addVehiclesAll(){
        actionsWithOurElements.clickOnElement(addAllVehicle);
    }
    public void addVehicleOne(){
        actionsWithOurElements.clickOnElement(buttonVehicle1);
    }
    public void saveNewGroup(){
        actionsWithOurElements.clickOnSaveButton();
    }

    public boolean newGroupAdded(){
        return
                actionsWithOurElements.elementIsDisplayed(newGroupAdded);
    }
    public boolean newGroupEditAdded(){
        return
                actionsWithOurElements.elementIsDisplayed(newGroupEditAdded);
    }
    public void deleteVehicleGroup(){
        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }
    public void findNewgroup(String vehicleGroupInput){
        actionsWithOurElements.enterTextIntoInput(inputGroupName, vehicleGroupInput);
    }
}
