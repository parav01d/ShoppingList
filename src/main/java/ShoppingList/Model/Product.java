package ShoppingList;

/**
  * Model
  * ---------------
  * Representation of the Entities occurring in the application,
  * the static factory method is returning a builder.
  **/
public class Product {
  private String _name;
  private int _categoryId;
  private int _amount;

  public static ProductBuilder builder() {
    return new ProductBuilder();
  }

  public Product(String name, int categoryId, int amount) {
    _name = name;
    _categoryId = categoryId;
    _amount = amount;
    System.out.println("Product created with name " + _name + " and categoryId: " + _categoryId + " and amount: " + _amount);
  }

  public String getName() {
    return _name;
  }

  public int getCategoryId() {
    return _categoryId;
  }

  public int getAmount() {
    return _amount;
  }
}
