package parking;

import java.util.List;

public class Level {
  private int numRows;
  private int numUnitSpotsPerRow;
  private List<Row> rows;

  public int getNumRows() {
    return numRows;
  }

  public int getNumUnitSpotsPerRow() {
    return numUnitSpotsPerRow;
  }

  public List<Row> getRows() {
    return rows;
  }
}
