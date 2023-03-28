package parking;

import Restaurant.Receipt;
import java.time.LocalDateTime;

public class Parking {
  private Vehicle vehicle;
  private Spot spot;
  private LocalDateTime startTime;
  private LocalDateTime endTime;

  public Parking(Vehicle vehicle, Spot spot, LocalDateTime startTime) {
    this.vehicle = vehicle;
    this.spot = spot;
    this.startTime = startTime;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public Spot getSpot() {
    return spot;
  }

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }

  public Receipt generateReceipt() {
    return null;
  }
}
