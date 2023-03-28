package Restaurant;

import java.util.List;

public class Order {
  private List<Meal> meals;

  public List<Meal> getMeals() {
    return meals;
  }

  public void addMeals(List<Meal> meals) {
    this.meals.addAll(meals);
  }

  public Receipt checkout() {
    return null;
  }

  public float getBill() {
    return 0.0f;
  }
}
