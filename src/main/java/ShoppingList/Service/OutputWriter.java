package ShoppingList;

import java.util.Scanner;
import java.util.Iterator;
import java.util.HashMap;

/**
  * Service
  * ---------------
  * Service implementations helps to sperating business logic depending on thier concern
  * and ensure singe responsibility for the single parts of application.
  *
  **/
public class OutputWriter {

  private Scanner _scanner;

  public OutputWriter() {
      Scanner scanner = new Scanner(System.in);
  }

  public void print(String text) {
    System.out.print(text + "\n");
  }

  public void printCategories(HashMap<Integer, Category> categories) {
    Iterator categoryIterator = categories.keySet().iterator();
    while (categoryIterator.hasNext()) {
      int key = (int)categoryIterator.next();
      System.out.print("[" + key + "] " + ((Category)categories.get(key)).getName() + "\n");
    }
  }

  public void printStores(HashMap<Integer, Store> stores) {
    Iterator storeIterator = stores.keySet().iterator();
    while (storeIterator.hasNext()) {
      int key = (int)storeIterator.next();
      System.out.print("[" + key + "] " + ((Store)stores.get(key)).getName() + "\n");
    }
  }

  public void print(Store store, ShoppingList shoppingList) {
    print("------------------------------");
    for( Category category: store.getCategories() ) {
        print(category.getName());
        for( Product product: shoppingList.getList()) {
          if(product.getCategoryId() == category.getId()) {
            print(product.getAmount() + "x " + product.getName());
          }
        }
        print("------------------------------");
    }
  }

}
