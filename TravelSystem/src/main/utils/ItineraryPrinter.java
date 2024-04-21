package main.utils;

import main.entities.Activity;
import main.entities.Destination;
import main.entities.TravelPackage;

public class ItineraryPrinter {
  public void printItinerary(TravelPackage travelPackage) {
    System.out.println("Itinerary for Travel Package: " + travelPackage.getName());
    for (Destination destination : travelPackage.getItinerary()) {
      System.out.println("Destination: " + destination.getName());
      for (Activity activity : destination.getActivities()) {
        System.out.println(
            "- "
                + activity.getName()
                + ": "
                + activity.getDescription()
                + ", Cost: $"
                + activity.getCost()
                + ", Capacity: "
                + activity.getCapacity());
      }
    }
  }
}
