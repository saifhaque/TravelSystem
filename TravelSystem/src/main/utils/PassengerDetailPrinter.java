package main.utils;

import main.entities.Passenger;
import main.entities.SignedUpActivity;

public class PassengerDetailPrinter {
  public void printPassengerDetail(Passenger passenger) {
    System.out.println("Passenger Details of: " + passenger.getName());
    System.out.println("Passenger Number: " + passenger.getPassengerNumber());
    System.out.println("Balance: " + passenger.getBalance());
    for (SignedUpActivity signedUpActivity : passenger.getSignedUpActivities()) {
      System.out.println(
          "- Activity Destination: "
              + signedUpActivity.getActivity().getDestination().getName()
              + ", Price paid: "
              + signedUpActivity.getPricePaid());
    }
  }
}
