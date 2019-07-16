package myFleetTests;

import org.junit.Test;
import parentTest.ParentTest;

public class VehiclesTest extends ParentTest {

    final String vehicleName = "AA010";
    final String vehicleLicensePlate = "ssss";
    final String vehiclePhoneNumber = "37066755779";
    final String vehicleType = "Mega Truck";
    final String department = "UA-01-Kiev";


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
        vehiclesPage.enterTextInToInputVehicleName(vehicleName);
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
        vehiclesPage.enterTextInToInputVehicleLicensePlate(vehicleLicensePlate);
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
        vehiclesPage.enterTextInToInputVehiclePhoneNumber(vehiclePhoneNumber);
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
        vehiclesPage.selectVehicleTypeFromDropdown(vehicleType);
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
        vehiclesPage.selectDepartmentFromDropdown(department);
        vehiclesPage.filterIsCorrectDepartment();
        checkExpectedResult("Vehicle not find", true, vehiclesPage.filterIsCorrectDepartment());
    }







    


}
