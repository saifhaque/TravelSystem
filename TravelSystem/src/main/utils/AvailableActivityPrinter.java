package main.utils;

import main.entities.Activity;
import main.entities.Destination;
import main.entities.TravelPackage;

public class AvailableActivityPrinter {
  public void printAvailableActivities(TravelPackage travelPackage) {
    System.out.println("Available activities for Travel Package: " + travelPackage.getName());
    for (Destination destination : travelPackage.getItinerary()) {
      System.out.println("Destination: " + destination.getName());
      for (Activity activity : destination.getActivities()) {
        if (activity.getCapacity() > activity.getSignedUpCount()) {
          System.out.println("Activity name : " + activity.getName());
          System.out.println("Activity description : " + activity.getDescription());
          System.out.println("Activity cost : " + activity.getCost());
          System.out.println(
              "Slots available : "
                  + String.valueOf(activity.getCapacity() - activity.getSignedUpCount()));
        }
      }
    }
  }
}
