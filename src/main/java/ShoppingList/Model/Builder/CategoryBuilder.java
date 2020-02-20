package ShoppingList;

/**
  * Builder Pattern
  * ---------------
  * The builder pattern is a design pattern designed to provide a flexible solution
  * to various object creation problems in object-oriented programming.
  * The intent of the Builder design pattern is to separate the construction
  * of a complex object from its representation.
  * It is one of the Gang of Four design patterns.
  **/
public class CategoryBuilder {
  private int _id;
  private String _name;

  public Category build() {
    return new Category(_id, _name);
  }

  public CategoryBuilder setId(int id) {
    _id = id;
    return this;
  }

  public CategoryBuilder setName(String name) {
    _name = name;
    return this;
  }
}
