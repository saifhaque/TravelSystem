package main.entities;

public class SignedUpActivity {
  private Activity activity;
  private double pricePaid;

  public SignedUpActivity(Activity activity, double pricePaid) {
    this.activity = activity;
    this.pricePaid = pricePaid;
  }

  public Activity getActivity() {
    return activity;
  }
  public void setActivity(Activity activity) {
    this.activity = activity;
  }
  public double getPricePaid() {
    return pricePaid;
  }
  public void setPricePaid(double pricePaid) {
    this.pricePaid = pricePaid;
  }
}
