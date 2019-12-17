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
    @FindBy(xpath = ".//*[text()='NEW']")
    private WebElement chooseStatusNew;
    @FindBy(xpath = ".//*[text()=' Fixed ']")
    private WebElement chooseStatusFixed;
    @FindBy(id = "vehicle")
    private WebElement inputVehicleName;
    @FindBy(xpath = ".//*[text()='9187']")
    private WebElement nameIsCorrrect;

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

    }
    public void selectFixedDefectFromDropdown( ) {
        actionsWithOurElements.clickOnElement(chooseStatus);
        actionsWithOurElements.clickOnElement(chooseStatusFixed);

    }
    public void searchDefByName(String searchName){
        actionsWithOurElements.enterTextIntoInput(inputVehicleName, searchName);
        actionsWithOurElements.clickOnSearchButton();
    }
    public boolean filterIsCorrectName(){
        return
                actionsWithOurElements.elementIsDisplayed(nameIsCorrrect);
    }
}



