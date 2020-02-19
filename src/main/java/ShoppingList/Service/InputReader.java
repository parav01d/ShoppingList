package ShoppingList;

import java.util.Scanner;

public class InputReader {

  private Scanner _scanner = new Scanner(System.in);

  public String readText() {
    try {
      return _scanner.next();
    } catch(Exception e) {
      System.out.println(e);
      System.out.println("Input should be a Text");
      return this.readText();
    }
  }

  public int readNumber() {
    try {
      return _scanner.nextInt();
    } catch(Exception e) {
      System.out.println("Input should be a Number");
      return this.readNumber();
    }
  }

  public int readNumber(int min, int max) {
    try {
      return _scanner.nextInt();
    } catch(Exception e) {
      System.out.println("Input should be a Number between " + min + " and " + max);
      return this.readNumber();
    }
  }

  public void close() {
    _scanner.close();
  }
}
