package servicesTest;

import org.junit.Test;
import parentTest.ParentTest;

public class TechConditionsTest extends ParentTest {

    @Test
    public void validTechConditionPage() {


        loginPage.validLogin();
        techConditionPage.openServices();
        techConditionPage.technicalCondition();
//        finishedServicesPage.headerIsCorrect();
        checkExpectedResult("Page Services/Finished Services not opened", true, techConditionPage.headerIsCorrect());

    }
    @Test
    public void validFindTechConditionPage() {


        loginPage.validLogin();
//        changeLanguagePage.clickOnLanguage();
//        changeLanguagePage.changeLanguage();
//        homePage.timer10seconds();
        techConditionPage.openServices();
        techConditionPage.technicalCondition();
        techConditionPage.selectGroupFromDropdown();
        techConditionPage.filterGroupIsCorrect();
        checkExpectedResult("Vehicle not find in group", true, techConditionPage.filterGroupIsCorrect());

    }
}
