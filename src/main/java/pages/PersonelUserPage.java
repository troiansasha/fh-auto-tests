package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonelUserPage extends ParentPage {

    public PersonelUserPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath=".//*[text()=\'Edit\']")
    private WebElement buttonEdit;
    @FindBy(id = "fullName")
    private WebElement inputFullName;
    @FindBy(name = "fullName")
    private WebElement inputChekFullName;
    @FindBy(id = "email")
    private WebElement inputEmail;
    @FindBy(name = "email")
    private WebElement inputChekEmail;
    @FindBy(id = "phoneNumber")
    private WebElement inputPhoneNumber;

    @FindBy(id = "role")
    private WebElement inputRole;
    @FindBy(xpath = ".//*[@value='ADMIN']")
    private WebElement inputRole2;
    @FindBy(id = "countryId")
    private WebElement inputCountry;
    @FindBy(xpath = ".//*[@value='8']")
    private WebElement inputCountry2;
    @FindBy(xpath = ".//*[@formcontrolname='departmentId']")
    private WebElement inputDepartment;
    @FindBy(xpath = ".//*[@value='50']")
    private WebElement inputDepartment2;


    public void openPerssonel() {

        try {
            WebElement personnelButton = webDriver.findElement(By.xpath(".//*[text()='Personnel']"));
            personnelButton.click();
            logger.info("Button Personnel was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void openPerssonelUsers() {
        try {
            WebElement personnelUsersButton = webDriver.findElement(By.xpath(".//*[text()='Users']"));
            personnelUsersButton.click();
            logger.info("Button Personnel/Users was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }

    }

    public boolean headerIsCorrect() {
        try {

            webDriver.findElement(By.xpath(".//span[text()='Users']")).isDisplayed();
            logger.info("Header from current page");
            return true;

        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }

        return false;
    }
///scopipashchenooooooooo!!!!!!!!!!!!!!!!!


    public void addNewUser() {
        try {
            WebElement addNewUserButton = webDriver.findElement(By.xpath(".//*[@href=\'/colleagues/new\']"));
            addNewUserButton.click();
            logger.info("Button add new User was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }

    }

    public void enterTextInToInputFullName(String fullNameUser) {
        actionsWithOurElements.enterTextIntoInput(inputFullName, fullNameUser);

    }

    public void enterTextInToInputEmail(String emailUser) {
        actionsWithOurElements.enterTextIntoInput(inputEmail, emailUser);

    }

    public void enterTextInToInputPhoneNumber(String phoneUser) {
        actionsWithOurElements.enterTextIntoInput(inputPhoneNumber, phoneUser);

    }

    //
    public void inputDataUsers(String fullNameUser, String emailUser, String phoneUser) {
        enterTextInToInputFullName(fullNameUser);
        enterTextInToInputEmail(emailUser);
        enterTextInToInputPhoneNumber(phoneUser);

    }

    public void dataUsers() {
        inputDataUsers("Troian Test", "qwerty111@qwerty", "00000000002");
    }

    public void chooseRoleUser() {
        try {
            inputRole.click();
            logger.info("Button set Role was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        try {
            inputRole2.click();
            logger.info("Button choose Role was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void chooseCountryUser() {
        try {
            inputCountry.click();
            logger.info("Button set Country was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        try {
            inputCountry2.click();
            logger.info("Button choose Country was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void chooseDepartmentUser() {
        try {
            inputDepartment.click();
            logger.info("Button set Department was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        try {
            inputDepartment2.click();
            logger.info("Button choose Department was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    //+1
    public void saveOurNewUser() {
        try {
            WebElement saveNewUserButton = webDriver.findElement(By.xpath(".//*[text()=' Save ']"));
            saveNewUserButton.click();
            logger.info("Button save new user was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void inputToFindOurNewUser(String userToFind) {
        actionsWithOurElements.enterTextIntoInput(inputChekFullName, "Troian Test");}

    public void inputToFindOurNewUserEmail(String emailToFind) {
        actionsWithOurElements.enterTextIntoInput(inputChekEmail, "qwerty");}


//+1
        public void clickToFindOurNewUser () {
            try {
                WebElement findNewUserButton = webDriver.findElement(By.xpath(".//*[text()=' Search ']"));
                findNewUserButton.click();
                logger.info("Button find new User was clicked");
            } catch (Exception e) {
                logger.error("Can not work with element");
                Assert.fail("Can not work with element");
            }
        }
        //+1
        public void clickOnUserList () {
            try {
                WebElement clickOnUserList = webDriver.findElement(By.xpath(".//div//span[text()='Users']"));
                clickOnUserList.click();
                logger.info("Clicked on Users");
            } catch (Exception e) {
                logger.error("Can not work with element");
                Assert.fail("Can not work with element");
            }
        }

    public void clickEditOurNewUser() {
        try {
            webDriver.findElement(By.xpath(".//span[text()='Users']")).click();
            logger.info("Header from current page");

        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        try {
            buttonEdit.click();
            logger.info("Button submit was clicked");
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
//        //+1
//        public void clickEditOurNewUser () {
//            try {
//                WebElement editNewUserButton = webDriver.findElement(By.xpath(".//*[text()=\'Edit\']"));
//                editNewUserButton.click();
//                logger.info("Button edit new User was clicked");
//            } catch (Exception e) {
//                logger.error("Can not work with element");
//                Assert.fail("Can not work with element");
//            }
//        }
////+1
//        public void clickBackFromOurNewUser () {
//            try {
//                WebElement backNewUserButton = webDriver.findElement(By.xpath(".//*[text()=' Back ']"));
//                backNewUserButton.click();
//                logger.info("Button back from edit new user was clicked");
//            } catch (Exception e) {
//                logger.error("Can not work with element");
//                Assert.fail("Can not work with element");
//            }
//        }
        //+1
        public void deleteOurNewUser () {
            try {
                WebElement deleteNewUserButton = webDriver.findElement(By.xpath(".//*[text()=\'Delete\']"));
                deleteNewUserButton.click();
                logger.info("Button delete new User was clicked");
            } catch (Exception e) {
                logger.error("Can not work with element");
                Assert.fail("Can not work with element");
            }
        }
        public void deleteOurNewUserYes () {
            try {
                WebElement deleteNewUserButtonYes = webDriver.findElement(By.xpath(".//*[text()=\' Yes \']"));
                deleteNewUserButtonYes.click();
                logger.info("Button delete new user / YES was clicked");
            } catch (Exception e) {
                logger.error("Can not work with element");
                Assert.fail("Can not work with element");
            }
        }
    }


