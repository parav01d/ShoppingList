package ShoppingList;

import java.util.List;

/**
  * Model
  * ---------------
  * Representation of the Entities occurring in the application,
  * the static factory method is returning a builder.
  **/
public class Store {
  private int _id;
  private String _name;
  private List<Category> _categories;

  public static StoreBuilder builder() {
    return new StoreBuilder();
  }

  public Store(int id, String name, List<Category> categories) {
    _id = id;
    _name = name;
    _categories = categories;
    System.out.println("Store created with id " + _id + " and name " + _name + " and categories: " + _categories);
  }

  public int getId() {
    return _id;
  }

  public String getName() {
    return _name;
  }

  public List<Category> getCategories() {
    return _categories;
  }
}
