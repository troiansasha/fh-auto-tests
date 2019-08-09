package pages.GeozonesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class GeozonesPage extends ParentPage {
    public GeozonesPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[text()='Geozones']")
    private WebElement geozones;
    @FindBy(xpath = ".//*[text()='Planner']")
    private WebElement geozonesPlanner;
    @FindBy(xpath = ".//*[text()='Crossings']")
    private WebElement geozonesCrossings;

    @FindBy(xpath = ".//span[text()='Geozones']")
    private WebElement checkPlannerPage;
    @FindBy(xpath = ".//span[text()='Geozones crossings']")
    private WebElement checkCrossingsPage;

    @FindBy(xpath = ".//*[text()=' Add new ']")
    private WebElement addNewGeozones;
    @FindBy(xpath = ".//*[text()=' Country ']")
    private WebElement addNewGeozonesCountry;
    @FindBy(id = "title")
    private WebElement inputTitleGeozone;
    @FindBy(id = "country")
    private WebElement inputTitleCountry;
    @FindBy(xpath = ".//*[text()='Spain']")
    private WebElement inputTitleCountrySpain;
    @FindBy(id = "filter_title")
    private WebElement inputFilterTitle;
    @FindBy(xpath = ".//*[text()=' Search ']")
    private WebElement searchGeozone;
    @FindBy(xpath = ".//*[text()=' Spain ']")
    private WebElement geozoneNameIsCorrrect;
    @FindBy(id = "delete_all")
    private WebElement deleteNewGeozones;
    @FindBy(xpath=".//*[text()=' Delete marked ']")
    private WebElement buttonDelete;
    @FindBy(xpath = ".//*[text()=' Yes ']")
    private WebElement buttonYes;

    public void openGeozonesPlanner(){
        actionsWithOurElements.clickOnElement(geozones);
        actionsWithOurElements.clickOnElement(geozonesPlanner);
    }
    public void openGeozonesCrossings(){
        actionsWithOurElements.clickOnElement(geozones);
        actionsWithOurElements.clickOnElement(geozonesCrossings);
    }
    public boolean headerIsCorrectPlanner(){
        return
                actionsWithOurElements.elementIsDisplayed(checkPlannerPage);
    }
    public boolean headerIsCorrectCrossings(){
        return
                actionsWithOurElements.elementIsDisplayed(checkCrossingsPage);
    }
    public void addingNewGeozone(){
        actionsWithOurElements.clickOnElement(addNewGeozones);
    }
    public void addingNewGeozoneCountry(){
        actionsWithOurElements.clickOnElement(addNewGeozonesCountry);
    }
    public void enterTextInToInputTitle(String geozonesTitle){
        actionsWithOurElements.enterTextIntoInput(inputTitleGeozone, geozonesTitle);
    }
    public void selectCountryTypeFromDropdown(String countryType) {
        actionsWithOurElements.selectTextInDD(inputTitleCountry, countryType);
        actionsWithOurElements.clickOnSaveButton();
    }
    public boolean titleGeozonesIsDisplayed(){
        return
                actionsWithOurElements.elementIsDisplayed(geozoneNameIsCorrrect);
    }
    public void enterTextInToInputFindTitleGeozone(String titleGeozone){
        actionsWithOurElements.enterTextIntoInput(inputFilterTitle, titleGeozone);
        actionsWithOurElements.clickOnSearchButton();
    }
    public boolean filterIsCorrectTitlegeozones(){
        return
                actionsWithOurElements.elementIsDisplayed(geozoneNameIsCorrrect);
    }
    public void deleteGeozone(){
        actionsWithOurElements.clickOnElement(checkPlannerPage);
        actionsWithOurElements.clickOnElement(buttonDelete);
        actionsWithOurElements.clickOnElement(buttonYes);
    }
}
