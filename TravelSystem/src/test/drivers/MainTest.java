package test.drivers;

import main.drivers.Main;
import main.entities.Activity;
import main.entities.Destination;
import main.entities.Passenger;
import main.entities.TravelPackage;
import main.enums.PassengerType;
import main.utils.ActivitySignupUtil;
import main.utils.AvailableActivityPrinter;
import main.utils.ItineraryPrinter;
import main.utils.PassengerDetailPrinter;
import main.utils.PassengerListPrinter;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void testMain() {
    Destination destination1 = new Destination("Destination 1");
    Destination destination2 = new Destination("Destination 2");

    Activity activity1 = new Activity("Activity 1", "Description 1", 100.0, 20, destination1);
    Activity activity2 = new Activity("Activity 2", "Description 2", 150.0, 30, destination2);

    destination1.addActivity(activity1);
    destination2.addActivity(activity2);

    ActivitySignupUtil activitySignupUtil = new ActivitySignupUtil();
    PassengerDetailPrinter passengerDetailPrinter = new PassengerDetailPrinter();
    ItineraryPrinter itineraryPrinter = new ItineraryPrinter();
    PassengerListPrinter passengerListPrinter = new PassengerListPrinter();
    AvailableActivityPrinter availableActivityPrinter = new AvailableActivityPrinter();

    Passenger passenger1 =
        new Passenger(
            "John", 1, PassengerType.STANDARD, 500.0, activitySignupUtil, passengerDetailPrinter);
    TravelPackage travelPackage =
        new TravelPackage(
            "Travel Package 1",
            50,
            itineraryPrinter,
            passengerListPrinter,
            availableActivityPrinter);

    travelPackage.addPassenger(passenger1);
    travelPackage.addDestination(destination1);
    travelPackage.addDestination(destination2);
    passenger1.signUpForActivity(activity1);

    Main.main(null);

    assertTrue(travelPackage.getItinerary().contains(destination1));
    assertTrue(travelPackage.getItinerary().contains(destination2));
    assertEquals(1, travelPackage.getPassengers().size());
    assertEquals(1, passenger1.getSignedUpActivities().size());
  }
}
