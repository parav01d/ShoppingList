package ShoppingList;

import java.util.ArrayList;
import java.util.List;

/**
  * Model
  * ---------------
  * Representation of the Entities occurring in the application.
  **/
public class ShoppingList {
  private List<Product> _list;

  public ShoppingList() {
    _list = new ArrayList<Product>();
  }

  public void addProduct(Product product) {
    _list.add(product);
  }

  public List<Product> getList() {
    return _list;
  }

}
