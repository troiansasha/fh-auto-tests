package pages.servicesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class DefectsPage extends ParentPage {

    public DefectsPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = ".//*[text()='Services']")
    private WebElement services;
    @FindBy(xpath = ".//*[text()='Defects']")
    private WebElement defects;
    @FindBy(xpath = ".//span[text()='Defects']")
    private WebElement checkDefectsPage;
    @FindBy(id = "status")
    private WebElement chooseStatus;
    @FindBy(xpath = ".//*[text()=' New ']")
    private WebElement chooseStatusNew;
    @FindBy(xpath = ".//*[text()=' Fixed ']")
    private WebElement chooseStatusFixed;
    @FindBy(id = "vehicle")
    private WebElement inputVehicleName;
    @FindBy(xpath = ".//*[text()='PZ-9187 / WGM63002']")
    private WebElement nameIsCorrrect;
    @FindBy(xpath = ".//*[text()='PZ-9187 / WGM63002']")
    private WebElement statusNewIsCorrrect;
    @FindBy(xpath = ".//*[text()='PZ-9188 / WGM63003']")
    private WebElement statusFixedIsCorrrect;
    @FindBy(xpath = "//img[contains(@src,'https://uat-communication.fleethand.com/api-change/change-forms/file/2019-06-27/600d3ada-a75c-4940-9a3c-ea64cbd176e9_2019-06-27T07:11:33.034.png')]")
    private WebElement choosePicture;
    @FindBy(xpath = ".//*[@class='modal-buttons']/*[@class='fa fa-rotate-right modal-button']")
    private WebElement changeViewButton;
    @FindBy(xpath = ".//*[@class='modal-buttons']/*[@class='fa fa-times modal-button']")
    private WebElement exitPhoto;

    public void openServices() {
        actionsWithOurElements.clickOnElement(services);
    }

    public void openDefects() {
        actionsWithOurElements.clickOnElement(defects);
    }

    public boolean headerIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(checkDefectsPage);
    }
    public void selectNewDefectFromDropdown( ) {
        actionsWithOurElements.clickOnElement(chooseStatus);
        actionsWithOurElements.clickOnElement(chooseStatusNew);
        actionsWithOurElements.clickOnSearchButton();

    }
    public void selectFixedDefectFromDropdown( ) {
        actionsWithOurElements.clickOnElement(chooseStatus);
        actionsWithOurElements.clickOnElement(chooseStatusFixed);
        actionsWithOurElements.clickOnSearchButton();

    }
    public void searchDefByName(String searchName){
        actionsWithOurElements.enterTextIntoInput(inputVehicleName, searchName);
        actionsWithOurElements.clickOnSearchButton();
    }
    public boolean filterIsCorrectName(){
        return
                actionsWithOurElements.elementIsDisplayed(nameIsCorrrect);
    }
    public boolean filterStatusIsCorrectNew(){
        return
                actionsWithOurElements.elementIsDisplayed(statusNewIsCorrrect);
    }
    public boolean filterStatusIsCorrectFixed(){
        return
                actionsWithOurElements.elementIsDisplayed(statusFixedIsCorrrect);
    }
    public void openPhotoDefect( ) {
        actionsWithOurElements.clickOnElement(choosePicture);
    }
    public void changeView( ) {
        actionsWithOurElements.clickOnElement(changeViewButton);
    }
    public void exitFromPhoto( ) {
        actionsWithOurElements.clickOnElement(exitPhoto);
    }
}




