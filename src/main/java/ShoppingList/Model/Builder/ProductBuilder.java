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
public class ProductBuilder {
  private String _name;
  private int _categoryId;
  private int _amount;

  public Product build() {
    return new Product(_name, _categoryId, _amount);
  }

  public ProductBuilder setName(String name) {
    _name = name;
    return this;
  }

  public ProductBuilder setCategoryId(int categoryId) {
    _categoryId = categoryId;
    return this;
  }

  public ProductBuilder setAmount(int amount) {
    _amount = amount;
    return this;
  }
}
