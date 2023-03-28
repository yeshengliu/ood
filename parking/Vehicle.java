package parking;

public class Vehicle {
  protected VehicleSize size;

  public Vehicle(VehicleSize size) {
    this.size = size;
  }

  public VehicleSize getSize() {
    return size;
  }
}
