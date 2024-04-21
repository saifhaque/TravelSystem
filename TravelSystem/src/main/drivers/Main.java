package main.drivers;

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

public class Main {

  public static void main(String[] args) {
    Destination destination1 = new Destination("Destination 1");
    Destination destination2 = new Destination("Destination 2");

    Activity activity1 = new Activity("Activity 1", "Description 1", 100.0, 20, destination1);
    Activity activity2 = new Activity("Activity 2", "Description 2", 150.0, 30, destination2);

    destination1.addActivity(activity1);
    destination2.addActivity(activity2);
    Passenger passenger1 =
        new Passenger(
            "John",
            1,
            PassengerType.STANDARD,
            500.0,
            new ActivitySignupUtil(),
            new PassengerDetailPrinter());

    TravelPackage travelPackage =
        new TravelPackage(
            "Travel Package 1",
            50,
            new ItineraryPrinter(),
            new PassengerListPrinter(),
            new AvailableActivityPrinter());

    travelPackage.addPassenger(passenger1);
    travelPackage.addDestination(destination1);
    travelPackage.addDestination(destination2);
    travelPackage.printItinerary();
    travelPackage.printPassengerList();
    passenger1.signUpForActivity(activity1);
    passenger1.printDetails();
    travelPackage.printAvailableActivities();
  }
}
