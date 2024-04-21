package test.utils;

import main.entities.Activity;
import main.entities.Passenger;
import main.enums.PassengerType;
import main.utils.ActivitySignupUtil;
import main.utils.PassengerDetailPrinter;
import org.junit.Test;
import static org.junit.Assert.*;

public class ActivitySignupUtilTest {

  @Test
  public void testActivitySignup_Success() {
    Activity activity = new Activity("Hiking", "Mountain trail", 50.0, 10, null);
    ActivitySignupUtil util = new ActivitySignupUtil();
    PassengerDetailPrinter passengerDetailPrinter = new PassengerDetailPrinter();

    Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD, 100.0, util, passengerDetailPrinter);

    util.activitySignup(activity, passenger);

    assertEquals(1, passenger.getSignedUpActivities().size());
    assertEquals(1, activity.getSignedUpCount());
    assertEquals(50.0, passenger.getBalance(), 0.01);
  }

  @Test
  public void testActivitySignup_CapacityFull() {
    Activity activity = new Activity("Hiking", "Mountain trail", 50.0, 0, null);
    ActivitySignupUtil util = new ActivitySignupUtil();
    PassengerDetailPrinter passengerDetailPrinter = new PassengerDetailPrinter();

    Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD, 100.0, util, passengerDetailPrinter);

    util.activitySignup(activity, passenger);

    assertEquals(0, passenger.getSignedUpActivities().size());
    assertEquals(0, activity.getSignedUpCount());
    assertEquals(100.0, passenger.getBalance(), 0.01);
  }

  @Test
  public void testActivitySignup_InsufficientBalance() {
    Activity activity = new Activity("Hiking", "Mountain trail", 50.0, 10, null);
    ActivitySignupUtil util = new ActivitySignupUtil();
    PassengerDetailPrinter passengerDetailPrinter = new PassengerDetailPrinter();

    Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD, 40.0, util, passengerDetailPrinter);

    util.activitySignup(activity, passenger);

    assertEquals(0, passenger.getSignedUpActivities().size());
    assertEquals(0, activity.getSignedUpCount());
    assertEquals(40.0, passenger.getBalance(), 0.01);
  }
}

