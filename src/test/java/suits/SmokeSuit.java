package suits;

import POITest.POIgroupsTest;
import POITest.POIpoiTest;
import clientsTest.ClientsCompanyTest;
import clientsTest.ClientsEmployeeTest;
import clientsTest.ClientsVehicleAccessTest;
import geozonesTest.GeozonesCrossingsTest;
import geozonesTest.GeozonesTest;
import myFleetTests.IntegrationsTest;
import myFleetTests.VehicleGroupsTest;
import myFleetTests.VehiclesTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import personelTest.PersonelDriversTest;
import personelTest.PersonelUsersTest;
import reportsTest.ReportsLocationByTimeTest;
import reportsTest.ReportsObjectHistoryTest;
import reportsTest.ReportsVideoSummaryTest;
import servicesTest.DefectsTest;
import servicesTest.ExpectedServicesTest;
import servicesTest.FinishedServiceTest;
import servicesTest.TechConditionsTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ClientsCompanyTest.class,
                ClientsEmployeeTest.class,
                ClientsVehicleAccessTest.class,
                GeozonesTest.class,
                GeozonesCrossingsTest.class,
                IntegrationsTest.class,
                VehiclesTest.class,
                VehicleGroupsTest.class,
                PersonelDriversTest.class,
                PersonelUsersTest.class,
                POIgroupsTest.class,
                POIpoiTest.class,
                ReportsVideoSummaryTest.class,
                ReportsObjectHistoryTest.class,
                ReportsLocationByTimeTest.class,
                DefectsTest.class,
                ExpectedServicesTest.class,
                FinishedServiceTest.class,
                TechConditionsTest.class
        }
)

public class SmokeSuit {

}
