package main.entities;

import java.util.ArrayList;
import java.util.List;
import main.enums.PassengerType;
import main.utils.ActivitySignupUtil;
import main.utils.PassengerDetailPrinter;

public class Passenger {
  private String name;
  private int passengerNumber;
  private PassengerType passengerType;
  private double balance;
  private List<SignedUpActivity> signedUpActivities;
  private ActivitySignupUtil activitySignupUtil;
  private PassengerDetailPrinter passengerDetailPrinter;

  public Passenger(
      String name,
      int passengerNumber,
      PassengerType passengerType,
      double balance,
      ActivitySignupUtil activitySignupUtil,
      PassengerDetailPrinter passengerDetailPrinter) {
    this.name = name;
    this.passengerNumber = passengerNumber;
    this.passengerType = passengerType;
    this.balance = balance;
    this.signedUpActivities = new ArrayList<>();
    this.activitySignupUtil = activitySignupUtil;
    this.passengerDetailPrinter = passengerDetailPrinter;
  }

  public void signUpForActivity(Activity activity) {
    activitySignupUtil.activitySignup(activity, this);
  }

  public void printDetails() {
    passengerDetailPrinter.printPassengerDetail(this);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPassengerNumber() {
    return passengerNumber;
  }

  public void setPassengerNumber(int passengerNumber) {
    this.passengerNumber = passengerNumber;
  }

  public PassengerType getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(PassengerType passengerType) {
    this.passengerType = passengerType;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public List<SignedUpActivity> getSignedUpActivities() {
    return signedUpActivities;
  }

  public void setSignedUpActivities(List<SignedUpActivity> signedUpActivities) {
    this.signedUpActivities = signedUpActivities;
  }
}
