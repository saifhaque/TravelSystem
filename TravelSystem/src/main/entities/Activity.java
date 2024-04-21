package main.entities;

public class Activity {
  private String name;
  private String description;
  private double cost;
  private int capacity;
  private int signedUpCount;
  private Destination destination;

  public Activity(String name, String description, double cost, int capacity, Destination destination) {
    this.name = name;
    this.description = description;
    this.cost = cost;
    this.capacity = capacity;
    this.signedUpCount = 0;
    this.destination = destination;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getSignedUpCount() {
    return signedUpCount;
  }

  public void setSignedUpCount(int signedUpCount) {
    this.signedUpCount = signedUpCount;
  }

  public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }
}
