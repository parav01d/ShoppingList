package ShoppingList;

public class Category {
  private int _id;
  private String _name;

  public static CategoryBuilder builder() {
    return new CategoryBuilder();
  }

  public Category(int id, String name) {
    _id = id;
    _name = name;
    System.out.println("Category created with id " + _id + " and name " + _name);
  }

  public int getId() {
    return _id;
  }

  public String getName() {
    return _name;
  }
}
