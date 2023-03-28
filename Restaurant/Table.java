package Restaurant;

public class Table {
  private boolean available;
  private int capacity;
  private Order order;

  public boolean isAvailable() {
    return available;
  }

  public void markAvailable() { this.available = true; }
  public void markUnavailable() {
    this.available = false;
  }

  public int getCapacity() {
    return capacity;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
}
