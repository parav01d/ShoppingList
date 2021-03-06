package ShoppingList;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Category vegetables = Category.builder().setId(1).setName("Vegetables").build();
        Category bakery = Category.builder().setId(2).setName("Bakery").build();
        Category meat = Category.builder().setId(3).setName("Meat").build();
        Category others = Category.builder().setId(4).setName("Others").build();

        HashMap<Integer, Category> categories = new HashMap();
        categories.put(vegetables.getId(), vegetables);
        categories.put(bakery.getId(), bakery);
        categories.put(meat.getId(), meat);
        categories.put(others.getId(), others);

        Store edeka = Store.builder().setId(1).setName("Edeka").setCategories(Arrays.asList(vegetables, bakery, meat)).build();
        Store rewe = Store.builder().setId(2).setName("Rewe").setCategories(Arrays.asList(bakery, meat, vegetables)).build();
        Store lidl = Store.builder().setId(3).setName("Lidl").setCategories(Arrays.asList(vegetables, meat, bakery)).build();

        HashMap<Integer, Store> stores = new HashMap();
        stores.put(edeka.getId(), edeka);
        stores.put(rewe.getId(), rewe);
        stores.put(lidl.getId(), lidl);

        InputReader inputReader = new InputReader();
        OutputWriter outputWriter = new OutputWriter();
        ShoppingList shoppingList = new ShoppingList();

        while(true) {
          outputWriter.print("Enter the product name:");
          String productName = inputReader.readText();

          outputWriter.print("Select category (1-" + categories.size() +"):");
          outputWriter.printCategories(categories);
          int categoryId = inputReader.readNumber(1, categories.size());

          outputWriter.print("Select amount:");
          int amount = inputReader.readNumber();

          shoppingList.addProduct(
            Product.builder().setName(productName).setCategoryId(categoryId).setAmount(amount).build()
          );

          outputWriter.print("Do you want to add an additional Product?");
          outputWriter.print("[Y]es");
          outputWriter.print("[n]o");

          String answer = inputReader.readText();
          if(answer.equals("n")) {
            break;
          }
        }

        outputWriter.print("Select Store (1-" + stores.size() +"):");
        outputWriter.printStores(stores);
        int storeId = inputReader.readNumber(1, stores.size());

        Store selectedStore = (Store)stores.get(storeId);
        outputWriter.print(selectedStore, shoppingList);

        inputReader.close();
    }
}
