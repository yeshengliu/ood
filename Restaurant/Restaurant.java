package Restaurant;

import java.util.List;

public class Restaurant {
  private List<Table> tables;
  private List<Meal> menu;

  public List<Table> getTables() {
    return tables;
  }

  public List<Meal> getMenu() {
    return menu;
  }

  public Table findTable(Party party) throws NoTableException {
    return null;
  }

  public void takeOrder(Table table, Order order) {
  }

  public Receipt checkout(Table table) {
    return null;
  }
}
