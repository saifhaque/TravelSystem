package main.utils;

import main.entities.Passenger;
import main.entities.TravelPackage;

public class PassengerListPrinter {
  public void printPassengerList(TravelPackage travelPackage) {
    System.out.println("Passenger List for Travel Package: " + travelPackage.getName());
    System.out.println("Passenger Capacity: " + travelPackage.getPassengerCapacity());
    System.out.println("Number of Passengers Enrolled: " + travelPackage.getPassengers().size());
    for (Passenger passenger : travelPackage.getPassengers()) {
      System.out.println(
          "- Name: " + passenger.getName() + ", Number: " + passenger.getPassengerNumber());
    }
  }
}
