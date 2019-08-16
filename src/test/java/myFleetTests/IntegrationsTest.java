package myFleetTests;

import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class IntegrationsTest extends ParentTest {
    @Before
    public void preconditionIntegration(){
        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to MyFleet vehiclesGroup
        integrationsPage.openIntegrations();
    }

    @Test
    public void searcByNameIntegration(){

    }
    @Test
    public void searcByLicencePlateIntegration(){

    }
    @Test
    public void searcByIntegrationNumberIntegration(){

    }
    @Test
    public void searcByEmptyLicencePlateIntegration(){

    }
    @Test
    public void searcByProjectActiveIntegration(){

    }
    @Test
    public void searcByProjectPassiveIntegration(){

    }
    @Test
    public void searcBySentActiveIntegration(){

    }
    @Test
    public void searcByEconnectActiveIntegration(){

    }
}
