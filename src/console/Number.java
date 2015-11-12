package console;

import java.util.Scanner;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Number {
  public boolean readNumber() throws OutsideOfIntervalException {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();
    int number = input.nextInt();
    if (number > n && number < m) {
      return true;
    } else {
      throw new OutsideOfIntervalException("This number is outside interval.Please enter number from n to m");
    }
  }
}
