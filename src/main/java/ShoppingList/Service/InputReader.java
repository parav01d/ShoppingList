package ShoppingList;

import java.util.Scanner;

public class InputReader {

  private Scanner _scanner = new Scanner(System.in);

  public String readText() {
    try {
      String text = _scanner.next();
      _scanner.nextLine();
      return text;
    } catch(Exception e) {
      System.out.println("Input should be a Text");
      _scanner.nextLine();
      return readText();
    }
  }

  public int readNumber() {
    try {
      int number = _scanner.nextInt();
      _scanner.nextLine();
      return number;
    } catch(Exception e) {
      System.out.println("Input should be a Number");
      _scanner.nextLine();
      return readNumber();
    }
  }

  public int readNumber(int min, int max) {
    try {
      int number = _scanner.nextInt();
      if(number < min || number > max) {
        throw new IllegalArgumentException();
      }
      _scanner.nextLine();
      return number;
    } catch(Exception e) {
      System.out.println("Input should be a Number between " + min + " and " + max);
      _scanner.nextLine();
      return readNumber(min, max);
    }
  }

  public void close() {
    _scanner.close();
  }
}
