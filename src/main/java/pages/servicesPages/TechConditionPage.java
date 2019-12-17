package pages.servicesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class TechConditionPage extends ParentPage {
    public TechConditionPage(WebDriver webDriver) {
        super(webDriver); }

    @FindBy(xpath = ".//*[text()='Services']")
    private WebElement services;
    @FindBy(xpath = ".//*[text()='Technical condition']")
    private WebElement technicalCondition;
    @FindBy(xpath = ".//span[text()='Vehicle service info']")
    private WebElement checkTechnicalConditionPage;
    @FindBy(id = "groupName")
    private WebElement chooseGroupe;
    @FindBy(xpath = ".//*[text()='PL9777 SC6712B']")
    private WebElement groupIsCorrect;
    @FindBy(xpath = ".//*[text()=' Vvvv ']")
    private WebElement clickOnTargetGroup;

    public void openServices() {
        actionsWithOurElements.clickOnElement(services);
    }

    public void technicalCondition() {
        actionsWithOurElements.clickOnElement(technicalCondition);
    }

    public boolean headerIsCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(checkTechnicalConditionPage);
    }
    public void selectGroupFromDropdown( ) {
        actionsWithOurElements.clickOnElement(chooseGroupe);

    }
    public boolean filterGroupIsCorrect() {
        return
                actionsWithOurElements.elementIsDisplayed(groupIsCorrect);
    }
}
