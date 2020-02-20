package ShoppingList;

import java.util.List;

/**
  * Builder Pattern
  * ---------------
  * The builder pattern is a design pattern designed to provide a flexible solution
  * to various object creation problems in object-oriented programming.
  * The intent of the Builder design pattern is to separate the construction
  * of a complex object from its representation.
  * It is one of the Gang of Four design patterns.
  **/
public class StoreBuilder {
  private int _id;
  private String _name;
  private List<Category> _categories;

  public Store build() {
    return new Store(_id, _name, _categories);
  }

  public StoreBuilder setId(int id) {
    _id = id;
    return this;
  }

  public StoreBuilder setName(String name) {
    _name = name;
    return this;
  }

  public StoreBuilder setCategories(List<Category> categories) {
    _categories = categories;
    return this;
  }
}
