package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POIPage extends ParentPage {
    public POIPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[text()='POI']")
    private WebElement pOI;
    @FindBy(xpath = ".//*[text()='POI groups']")
    private WebElement pOIGroups;
    @FindBy(xpath = ".//*[@href=\"/poi/poi\"]")
    private WebElement pOIPOI;
    @FindBy(xpath = ".//span[text()='POI groups']")
    private WebElement checkPOIGroupsPage;
    @FindBy(xpath = ".//span[text()='POI list']")
    private WebElement checkPOIPOIPage;
    @FindBy(id = "name")
    private WebElement inputGroupName;
    @FindBy(xpath = ".//*[text()='testFHtest']")
    private WebElement groupNameIsCorrrect;
    @FindBy(xpath = ".//*[text()='Test POI POI']")
    private WebElement poiNameIsCorrrect;
    @FindBy(xpath = ".//*[text()='Test POI 1']")
    private WebElement newGroupIsCorrectName;
    @FindBy(xpath = ".//*[text()='Test POI POI']")
    private WebElement newPOIIsCorrectName;
    @FindBy(id = "address")
    private WebElement inputPoiAdress;
    @FindBy(id = "coordinates")
    private WebElement inputPoiCoordinates;
    @FindBy(xpath = ".//*[text()='POI']")
    private WebElement adressIsCorrrect;
    @FindBy(xpath = ".//*[@href=\"/poi/poi/new\"]")
    private WebElement poipoiNew;
    @FindBy(id = "poiType")
    private WebElement vehicleGroupDD;
    @FindBy(xpath = ".//*[@href=\"/poi/type/new\"]")
    private WebElement poigroupNew;
    @FindBy(xpath = ".//*[text()='Important']")
    private WebElement importantPOI;
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
    //    @FindBy(xpath=".//*[text()=' Search ']")
//    private WebElement buttonSearch;
    @FindBy(id = "groupName")
    private WebElement chooseGroupe;
    @FindBy(xpath = ".//*[text()=' All Vehicles ']")
    private WebElement setGroupe;
    @FindBy(xpath=".//*[text()='Delete']")
    private WebElement buttonDelete;
    @FindBy(xpath = ".//*[text()=\' Yes \']")
    private WebElement buttonYes;
    @FindBy(xpath = ".//*[text()='Edit']")
    private WebElement buttonEdit;

    public void openPOI() {
        actionsWithOurElements.clickOnElement(pOI);
    }
    public void openPOIPOI() {
        actionsWithOurElements.clickOnElement(pOIPOI);
    }

    public void openPOIPOIgroups() {
        actionsWithOurElements.clickOnElement(pOIGroups);
    }

    public boolean headerIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(checkPOIGroupsPage);
    }
    public boolean headerIsCorrectPOI(){
        return
                actionsWithOurElements.elementIsDisplayed(checkPOIPOIPage);
    }
    public void searchPOIByName(String searchName){
        actionsWithOurElements.enterTextIntoInput(inputGroupName, searchName);
        actionsWithOurElements.clickOnSearchButton();
    }
    public void searchPOIByAdress(String poiAdress){
        actionsWithOurElements.enterTextIntoInput(inputPoiAdress, poiAdress);
        actionsWithOurElements.clickOnSearchButton();
    }
    public boolean filterIsCorrectName(){
        return
                actionsWithOurElements.elementIsDisplayed(groupNameIsCorrrect);
    }
    public boolean filterIsCorrectAdress(){
        return
                actionsWithOurElements.elementIsDisplayed(adressIsCorrrect);
    }
    public boolean filterIsCorrectNamePOI(){
        return
                actionsWithOurElements.elementIsDisplayed(poiNameIsCorrrect);
    }
    public void addNewPOIGroup() {
        actionsWithOurElements.clickOnElement(poigroupNew);
    }

    public void addNewPOI() {
        actionsWithOurElements.clickOnElement(poipoiNew);
    }

    public void createNewGroup(String NewGroupName){
        actionsWithOurElements.enterTextIntoInput(inputGroupName, NewGroupName);
        actionsWithOurElements.clickOnSaveButton();
    }
    public boolean newGroupIsCorrectName(){
        return
                actionsWithOurElements.elementIsDisplayed(newGroupIsCorrectName);
    }
    public void makePOIImportant() {
        actionsWithOurElements.clickOnElement(importantPOI);
    }
    public void createNewPOIName(String POIName) {
        actionsWithOurElements.enterTextIntoInput(inputGroupName, POIName);
    }
    public void createNewPOIAdress(String POIAdress) {
        actionsWithOurElements.enterTextIntoInput(inputPoiAdress, POIAdress);
    }
    public void createNewPOICoordinates(String POICord) {
        actionsWithOurElements.enterTextIntoInput(inputPoiCoordinates, POICord);
    }
    public void selectVehicleGroupFromDropdown(String vehicleGroup) {
        actionsWithOurElements.selectTextInDD(vehicleGroupDD, vehicleGroup);
    }
    public boolean newPOIIsCorrectName(){
        return
                actionsWithOurElements.elementIsDisplayed(newPOIIsCorrectName);
    }
    public void editNewPOIPOI() {
        actionsWithOurElements.clickOnElement(buttonEdit);
    }


    public void editNewPOIGroup() {
        actionsWithOurElements.clickOnElement(buttonEdit);
    }

    public void deletePOI(){
        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }
    public void deletePOIPOI(){
        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }
    public void saveNewPOI(){
        actionsWithOurElements.clickOnSaveButton();

    }
}
