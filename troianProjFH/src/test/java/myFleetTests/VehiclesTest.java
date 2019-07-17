package myFleetTests;

import org.junit.Test;
import parentTest.ParentTest;

public class VehiclesTest extends ParentTest {

    final String VEHICLE_NAME = "AA010";
    final String VEHICLE_LICENSE_PLATE = "ssss";
    final String VEHICLE_PHONE_NUMBER = "37066755779";
    final String VEHICLE_TYPE = "Mega Truck";
    final String DEPARTMENT = "UA-01-Kiev";


    @Test
    public void validMyFleetVehiclesSearchByName(){

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to MyFleet vehicles
        vehiclesPage.openVehicles();
//        vehiclesPage.headerIsCorrect();
        checkExpectedResult("Page My Fleet/Vehicles not opened", true, vehiclesPage.headerIsCorrect());
        vehiclesPage.enterTextInToInputVehicleName(VEHICLE_NAME);
        vehiclesPage.filterIsCorrectName();
        checkExpectedResult("Vehicle not find", true, vehiclesPage.filterIsCorrectName());
    }

    @Test
    public void validMyFleetVehiclesSearchByLicensePlate(){

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to MyFleet vehicles
        vehiclesPage.openVehicles();
//        vehiclesPage.headerIsCorrect();
        checkExpectedResult("Page My Fleet/Vehicles not opened", true, vehiclesPage.headerIsCorrect());
        vehiclesPage.enterTextInToInputVehicleLicensePlate(VEHICLE_LICENSE_PLATE);
        vehiclesPage.filterIsCorrectLicesePlate();
        checkExpectedResult("Vehicle not find", true, vehiclesPage.filterIsCorrectLicesePlate());
    }

    @Test
    public void validMyFleetVehiclesSearchByPhoneNumber(){

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to MyFleet vehicles
        vehiclesPage.openVehicles();
//        vehiclesPage.headerIsCorrect();
        checkExpectedResult("Page My Fleet/Vehicles not opened", true, vehiclesPage.headerIsCorrect());
        vehiclesPage.enterTextInToInputVehiclePhoneNumber(VEHICLE_PHONE_NUMBER);
        vehiclesPage.filterIsCorrectPhoneNumber();
        checkExpectedResult("Vehicle not find", true, vehiclesPage.filterIsCorrectPhoneNumber());
    }

    @Test
    public void validMyFleetVehiclesSearchByVehicleType(){

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to MyFleet vehicles
        vehiclesPage.openVehicles();
//        vehiclesPage.headerIsCorrect();
        checkExpectedResult("Page My Fleet/Vehicles not opened", true, vehiclesPage.headerIsCorrect());
        vehiclesPage.selectVehicleTypeFromDropdown(VEHICLE_TYPE);
        vehiclesPage.filterIsCorrectVehicleType();
        checkExpectedResult("Vehicle not find", true, vehiclesPage.filterIsCorrectVehicleType());
    }

    @Test
    public void validMyFleetVehiclesSearchByDepartment(){

        //Login block
        loginPage.validLogin();
        changeLanguagePage.clickOnLanguage();
        changeLanguagePage.changeLanguage();
        homePage.timer10seconds();
        //Go to MyFleet vehicles
        vehiclesPage.openVehicles();
//        vehiclesPage.headerIsCorrect();
        checkExpectedResult("Page My Fleet/Vehicles not opened", true, vehiclesPage.headerIsCorrect());
        vehiclesPage.selectDepartmentFromDropdown(DEPARTMENT);
        vehiclesPage.filterIsCorrectDepartment();
        checkExpectedResult("Vehicle not find", true, vehiclesPage.filterIsCorrectDepartment());
    }










}
