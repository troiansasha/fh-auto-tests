package parentTest;

import myFleetTests.VehiclesTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import pages.myFleetPages.VehiclesPage;
import pages.servicesPages.ExpectedServicesPage;
import pages.servicesPages.FinishedServicesPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    protected WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected PersonelUserPage personelUserPage;
    protected PersonelDriversPage personelDriversPage;
    protected ChangeLanguagePage changeLanguagePage;
    protected ExpectedServicesPage expectedServicesPage;
    protected FinishedServicesPage finishedServicesPage;
    protected VehiclesPage vehiclesPage;

    //Precondition
    @Before
    public void setUp() {
        File file = new File("./src/olddrivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    loginPage = new LoginPage(webDriver);
    homePage = new HomePage(webDriver);
    personelUserPage = new PersonelUserPage(webDriver);
    personelDriversPage = new PersonelDriversPage(webDriver);
    changeLanguagePage = new ChangeLanguagePage(webDriver);
    expectedServicesPage = new ExpectedServicesPage(webDriver);
    finishedServicesPage = new FinishedServicesPage(webDriver);
    vehiclesPage = new VehiclesPage(webDriver);
    }
    @After
    public void tearDown () {
//        webDriver.quit();
    }



    public void checkExpectedResult(String message, boolean expectedResult, boolean actualResult){

        Assert.assertEquals(message, expectedResult, actualResult);

    }

//    public void checkExpectedResult (String message, boolean actualResult){
//        checkExpectedResult(message, actualResult);
//    }
}
