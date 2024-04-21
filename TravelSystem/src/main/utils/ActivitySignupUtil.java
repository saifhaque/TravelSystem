package main.utils;

import main.entities.Activity;
import main.entities.Passenger;
import main.entities.SignedUpActivity;
import main.enums.PassengerType;

public class ActivitySignupUtil {
  public void activitySignup(Activity activity, Passenger passenger) {
    // Check if the activity capacity is full
    if (activity.getCapacity() == activity.getSignedUpCount()) {
      System.out.println("Activity capacity reached. Cannot sign up for " + activity.getName());
      return;
    }

    // Check if the passenger has sufficient balance or is a premium passenger
    if ((passenger.getPassengerType() == PassengerType.STANDARD
            && passenger.getBalance() < activity.getCost())
        || (passenger.getPassengerType() == PassengerType.GOLD
            && passenger.getBalance() < activity.getCost() * 0.9)) {
      System.out.println("Insufficient balance to sign up for " + activity.getName());
      return;
    }

    // Calculate the price to be paid by the passenger
    double pricePaid = (passenger.getPassengerType() == PassengerType.GOLD) ? activity.getCost() * 0.9 : activity.getCost();

    // Deduct the price from the balance if the passenger is not premium
    if (passenger.getPassengerType() != PassengerType.PREMIUM) {
      passenger.setBalance(passenger.getBalance() - pricePaid);
    }

    // Add the signed-up activity to the list
    SignedUpActivity signedUpActivity = new SignedUpActivity(activity, pricePaid);
    passenger.getSignedUpActivities().add(signedUpActivity);
    activity.setSignedUpCount(activity.getSignedUpCount() + 1);

    System.out.println("Signed up for " + activity.getName());
  }
}
