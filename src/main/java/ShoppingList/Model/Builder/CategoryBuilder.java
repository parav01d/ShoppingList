package ShoppingList;

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
