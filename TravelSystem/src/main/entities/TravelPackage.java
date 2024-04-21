package main.entities;

import java.util.ArrayList;
import java.util.List;
import main.utils.AvailableActivityPrinter;
import main.utils.ItineraryPrinter;
import main.utils.PassengerListPrinter;

public class TravelPackage {
  private String name;
  private int passengerCapacity;
  private List<Destination> itinerary;
  private List<Passenger> passengers;
  private ItineraryPrinter itineraryPrinter;
  private PassengerListPrinter passengerListPrinter;
  private AvailableActivityPrinter availableActivityPrinter;

  public TravelPackage(
      String name,
      int passengerCapacity,
      ItineraryPrinter itineraryPrinter,
      PassengerListPrinter passengerListPrinter,
      AvailableActivityPrinter availableActivityPrinter) {
    this.name = name;
    this.passengerCapacity = passengerCapacity;
    this.itinerary = new ArrayList<>();
    this.passengers = new ArrayList<>();
    this.itineraryPrinter = itineraryPrinter;
    this.passengerListPrinter = passengerListPrinter;
    this.availableActivityPrinter = availableActivityPrinter;
  }

  public void addPassenger(Passenger passenger) {
    passengers.add(passenger);
  }

  public void removePassenger(Passenger passenger) {
    passengers.remove(passenger);
  }

  public void addDestination(Destination destination) {
    itinerary.add(destination);
  }

  public void printItinerary() {
    itineraryPrinter.printItinerary(this);
  }

  public void printPassengerList() {
    passengerListPrinter.printPassengerList(this);
  }

  public void printAvailableActivities() {
    availableActivityPrinter.printAvailableActivities(this);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPassengerCapacity() {
    return passengerCapacity;
  }

  public void setPassengerCapacity(int passengerCapacity) {
    this.passengerCapacity = passengerCapacity;
  }

  public List<Destination> getItinerary() {
    return itinerary;
  }

  public void setItinerary(List<Destination> itinerary) {
    this.itinerary = itinerary;
  }

  public List<Passenger> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<Passenger> passengers) {
    this.passengers = passengers;
  }
}
