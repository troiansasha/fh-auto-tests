package parentTest;

import clientsTest.ClientsCompanyTest;
import geozonesTest.GeozonesTest;
import myFleetTests.VehiclesTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import pages.ClientsPages.ClientsCompaniesPage;
import pages.GeozonesPages.GeozonesPage;
import pages.myFleetPages.IntegrationsPage;
import pages.myFleetPages.VehicleGroupsPage;
import pages.myFleetPages.VehiclesPage;
import pages.servicesPages.DefectsPage;
import pages.servicesPages.ExpectedServicesPage;
import pages.servicesPages.FinishedServicesPage;
import pages.servicesPages.TechConditionPage;

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
    protected GeozonesPage geozonesPage;
    protected TechConditionPage techConditionPage;
    protected POIPage POIPage;
    protected VehicleGroupsPage vehicleGroupsPage;
    protected IntegrationsPage integrationsPage;
    protected DefectsPage defectsPage;
    protected ClientsCompaniesPage clientsCompaniesPage;
    /* **To Do  */

    //Precondition
    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
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
    geozonesPage = new GeozonesPage(webDriver);
    techConditionPage = new TechConditionPage(webDriver);
    POIPage = new POIPage(webDriver);
    vehicleGroupsPage = new VehicleGroupsPage(webDriver);
    integrationsPage = new IntegrationsPage(webDriver);
    defectsPage = new DefectsPage(webDriver);
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
