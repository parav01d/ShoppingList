package ShoppingList;

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
