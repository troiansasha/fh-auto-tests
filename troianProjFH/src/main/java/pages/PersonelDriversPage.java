package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PersonelDriversPage extends ParentPage {

    public PersonelDriversPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id="fullName")
    private WebElement inputFullName;
    @FindBy(id="driverCard")
    private WebElement inputDriverCard;
    @FindBy(id="phoneNumber")
    private WebElement inputPhoneNumber;
    @FindBy(id="language")
    private WebElement setLanguage;
    @FindBy(xpath=".//*[@value=\"en\"]")
    private WebElement chooseLanguage;
//    @FindBy(id="address")
//    private WebElement inputAddress;
    @FindBy(xpath=".//*[text()=' Save ']")
    private WebElement buttonSubmit;
    @FindBy(name="fullName")
    private WebElement searchByFullName;
    @FindBy(xpath=".//*[text()=' Search ']")
    private WebElement buttonSearch;
    @FindBy(xpath=".//*[text()=\'Edit\']")
    private WebElement buttonEdit;
    @FindBy(xpath=".//*[text()=\'Delete\']")
    private WebElement buttonDelete;
    @FindBy(name="driverCard")
    private WebElement searchByDriverCard;
    @FindBy(xpath = ".//*[text()='Personnel']")
    private WebElement personel;
    @FindBy(xpath = ".//*[text()='Drivers']")
    private WebElement openDrivers;
    @FindBy(xpath = ".//span[text()='Drivers']")
    private WebElement checkDriversPage;

    public void openPersonel() {
        actionsWithOurElements.clickOnElement(personel);

    }

    public void openPersonelDrivers() {
        actionsWithOurElements.clickOnElement(openDrivers);

    }

    public boolean headerIsCorrect() {
        return
        actionsWithOurElements.elementIsDisplayed(checkDriversPage);
//        try {
//            webDriver.findElement(By.xpath(".//span[text()='Drivers']")).isDisplayed();
//                logger.info("Header from current page");
//                return true;
//        } catch (Exception e) {
//            logger.error("Can not work with element");
//            Assert.fail("Can not work with element");
//        }
//        return false;
    }

    public void addNewDriver(){

        try {
            WebElement addDriversButton = webDriver.findElement(By.xpath(".//*[@href=\'/drivers/new\']"));
            addDriversButton.click();
            logger.info("Button Personnel/Drivers/driverNew was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }

    }

    public void enterTextInToInputFullName(String fullName) {
        actionsWithOurElements.enterTextIntoInput(inputFullName, fullName);

    }

    public void enterTextInToInputDriverCardNumber(String driverCardNumber) {
        actionsWithOurElements.enterTextIntoInput(inputDriverCard, driverCardNumber);

    }

    public void enterTextInToInputPhoneNumber(String phoneNumber) {
        actionsWithOurElements.enterTextIntoInput(inputPhoneNumber, phoneNumber);

    }


    public void inputDataDrivers(String fullName, String driverCardNumber, String phoneNumber){
        enterTextInToInputFullName(fullName);
        enterTextInToInputDriverCardNumber(driverCardNumber);
        enterTextInToInputPhoneNumber(phoneNumber);

    }

    public void dataDrivers(){
        inputDataDrivers("Test Test", "1578487894561235", "581365811");
    }

    public void clickOnSetLanguage() {
        try {
            setLanguage.click();
            logger.info("Button setLanguage was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        try {
            chooseLanguage.click();
            logger.info("Button chooseLanguage was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void clickSubmit() {
        try {
            buttonSubmit.click();
            logger.info("Button submit was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void enterTextInToSearchByFullName(String fullName) {
        actionsWithOurElements.enterTextIntoInput(searchByFullName, "Test Test");
        try {
            buttonSearch.click();
            logger.info("Button submit was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }

    }

    public void editDriverBack() {
        try {
            webDriver.findElement(By.xpath(".//span[text()='Drivers']")).click();
            logger.info("Header from current page");

        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        try {
            buttonEdit.click();
            logger.info("Button edit was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        try {
            webDriver.findElement(By.xpath(".//*[text()=' Back ']")).click();
            logger.info("Header from current page");

        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void deleteDriver() {
        try {
            webDriver.findElement(By.xpath(".//span[text()='Drivers']")).click();
            logger.info("Header from current page");

        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        try {
            buttonDelete.click();
            logger.info("Button submit was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        try {
            webDriver.findElement(By.xpath(".//*[text()=\' Yes \']")).click();
            logger.info("Header from current page");

        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void enterTextInToSearchByFullNameClear(String fullName) {
        actionsWithOurElements.enterTextIntoInput(searchByFullName, "");
    }

    public void enterTextInToSearchByDriverCard(String driverCard) {
        actionsWithOurElements.enterTextIntoInput(searchByDriverCard, "1578487894561235");
        try {
            buttonSearch.click();
            logger.info("Button submit was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public boolean driverIsCorrect() {
        try {
            webDriver.findElement(By.xpath(".//*[text()='Test Test']")).isDisplayed();
            logger.info("Current driver");
            return true;
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        return false;
    }

}