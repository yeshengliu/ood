package parking;

import java.util.List;
import java.util.Map;

public class ParkingLot {
  private int numLevels;
  private int numRows;
  private int numUnitSpotsPerRow;
  private float pricePerHour;
  private List<Level> levels;
  private Map<Vehicle, Parking> parkings;

  public ParkingLot(int numLevels, int numRows, int numUnitSpotsPerRow, float pricePerHour) {
    this.numLevels = numLevels;
    this.numRows = numRows;
    this.numUnitSpotsPerRow = numUnitSpotsPerRow;
    this.pricePerHour = pricePerHour;
  }

  public ParkingLot getInstance() {
    return this;
  }

  public int getNumLevels() {
    return numLevels;
  }

  public int getNumRows() {
    return numRows;
  }

  public int getNumUnitSpotsPerRow() {
    return numUnitSpotsPerRow;
  }

  public float getPricePerHour() {
    return pricePerHour;
  }

  public List<Level> getLevels() {
    return levels;
  }

  public int getAvailableCount() {
    return -1;
  }

  public Parking parkVehicle(Vehicle vehicle) {
    return null;
  }

  private Spot findNextAvailableSpot(Vehicle vehicle) {
    return null;
  }

  public Receipt checkout(Vehicle vehicle) {
    return null;
  }
}
