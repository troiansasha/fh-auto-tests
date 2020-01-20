package pages.ReportsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ParentPage;

public class ReportsVideoLocationObjectsPage extends ParentPage
{
    public ReportsVideoLocationObjectsPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = ".//*[text()='Reports']")
    private WebElement reports;
    @FindBy(xpath = ".//*[text()='Loading error']")
    private WebElement error500;
//    @FindBy(xpath = ".//*[@class='fa fa-bar-chart faa-tada animated-hover']")
//    private WebElement redButton;


    //OBJECT HISTORY

    @FindBy(xpath = ".//*[text()='Objects history']")
    private WebElement reportsObjectHistory;
    @FindBy(xpath = ".//span[text()='Objects history']")
    private WebElement checkObjectHistoryPage;
    @FindBy(id = "query")
    private WebElement inputQuery;
    @FindBy(name = "type")
    private WebElement clickObject;
    @FindBy(xpath = ".//*[text()=' Department ']")
    private WebElement clickDepartament;
    @FindBy(xpath = ".//*[text()='2020-01-08 13:51:10']")
    private WebElement checkObjectHistoryCorrect;


    //lOCATION BY TIME
    @FindBy(xpath = ".//*[text()='Location by time']")
    private WebElement reportsLocationByTime;
    @FindBy(xpath = ".//span[text()='Vehicle location by time']")
    private WebElement checkLocationByTimePage;
    @FindBy(xpath = ".//*[text()='Mark all']")
    private WebElement deMarkAll;
    @FindBy(xpath = ".//*[text()='PL9623 SC6770V mega']")
    private WebElement mark1Vehicle;
    @FindBy(xpath = ".//*[text()='+37066746712']")
    private WebElement correctValue;


    //VIDEO SUMMARY

    @FindBy(xpath = ".//*[text()='Video summary']")
    private WebElement reportsVideoSummary;
    @FindBy(xpath = ".//span[text()='Video summary']")
    private WebElement checkVideoSummaryPage;

    public void openReportsObjectHistory(){
        actionsWithOurElements.clickOnElement(reports);
        actionsWithOurElements.clickOnElement(reportsObjectHistory);
    }
    public void openReportsLocationByTime(){
        actionsWithOurElements.clickOnElement(reports);
        actionsWithOurElements.clickOnElement(reportsLocationByTime);
    }
    public void openReportsVideoSummary(){
        actionsWithOurElements.clickOnElement(reports);
        actionsWithOurElements.clickOnElement(reportsVideoSummary);
    }
    public boolean headerIsCorrectObjectHistory(){
        return
                actionsWithOurElements.elementIsDisplayed(checkObjectHistoryPage);
    }
    public boolean headerIsCorrectLocationByTime(){
        return
                actionsWithOurElements.elementIsDisplayed(checkLocationByTimePage);
    }
    public boolean headerIsCorrectVideoSummary(){
        return
                actionsWithOurElements.elementIsDisplayed(checkVideoSummaryPage);
    }
    public boolean generalError500(){
        return
                actionsWithOurElements.elementIsDisplayed(error500);
    }
    public void searcByQuery(String queryName) {
        actionsWithOurElements.enterTextIntoInput(inputQuery, queryName);
    }
    public void searchByObject() {
        actionsWithOurElements.clickOnElement(clickObject);
        actionsWithOurElements.clickOnElement(clickDepartament);
        actionsWithOurElements.clickOnSearchButton();
    }
    public boolean searchObjectHistoryCorrect(){
        return
                actionsWithOurElements.elementIsDisplayed(checkObjectHistoryCorrect);
    }
    public void dontMarkAll() {
        actionsWithOurElements.clickOnElement(deMarkAll);
    }
    public void markVehicle() {
        actionsWithOurElements.clickOnElement(mark1Vehicle);
    }
    public void clickSearch() {
        actionsWithOurElements.clickOnSearchButton();
    }
    public boolean dataIsCorrectLocationByTime(){
        return
                actionsWithOurElements.elementIsDisplayed(correctValue);
    }



//    public void clickRedButton(){
//        actionsWithOurElements.clickOnElement(redButton);
//    }

}
