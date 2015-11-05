package console;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class ConsoleNum {
  public boolean readNum() throws OutsideOfIntervalException {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    if (number > 0 && number < 100) {
      return true;
    } else {
      throw new OutsideOfIntervalException("This number is outside interval.Please enter number from 0 to 100");
    }
  }
}
