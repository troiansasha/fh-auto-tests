package myFleetTests;

import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class VehicleGroupsTest extends ParentTest {

    final String GROUP_NAME = "Test Group Name";
    final String GROUP_NAME_EDIT = "Test Group Name Edit";

    @Before
    public void preconditionMyFleetVehicleGroups() {
        loginPage.validLogin();
        vehicleGroupsPage.openVehicleGroups();

    }

    @Test
    public void validMyFleetVehicleGroupsPage() {

        checkExpectedResult("Page My Fleet/Vehicle Groups not opened", true, vehicleGroupsPage.headerIsCorrectVehicleGroups());

    }

    @Test
    public void addNewVehicleGroup() {

        vehicleGroupsPage.addMyFleetNewGroup();
        vehicleGroupsPage.inputGroupName(GROUP_NAME);
//        vehicleGroupsPage.addNotification();
        vehicleGroupsPage.addVehiclesAll();
        vehicleGroupsPage.saveNewGroup();
        checkExpectedResult("Page My Fleet/Vehicle Group current group not opened", true, vehicleGroupsPage.newGroupAdded());
        vehicleGroupsPage.deleteVehicleGroup();
    }

    @Test
    public void searchIsCorrect() {

        vehicleGroupsPage.addMyFleetNewGroup();
        vehicleGroupsPage.inputGroupName(GROUP_NAME);
        vehicleGroupsPage.addVehiclesAll();
        vehicleGroupsPage.saveNewGroup();
        vehicleGroupsPage.findNewgroup(GROUP_NAME);
        checkExpectedResult("Page My Fleet/Vehicle Group current group not opened", true, vehicleGroupsPage.newGroupAdded());
        vehicleGroupsPage.deleteVehicleGroup();

    }

    @Test
    public void editVehicleGroupNotification() {

        vehicleGroupsPage.addMyFleetNewGroup();
        vehicleGroupsPage.inputGroupName(GROUP_NAME_EDIT);
        vehicleGroupsPage.addVehicleOne();
        vehicleGroupsPage.saveNewGroup();
        vehicleGroupsPage.addNotification();
        vehicleGroupsPage.newGroupEditAdded();
        checkExpectedResult("Page My Fleet/Vehicle Group current group not opened", true, vehicleGroupsPage.newGroupEditAdded());
        vehicleGroupsPage.deleteVehicleGroup();

    }
}
