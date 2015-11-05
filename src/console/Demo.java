package console;


import java.util.InputMismatchException;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    try {
      ConsoleNum num = new ConsoleNum();
      System.out.println("Enter number :");
      num.readNum();
    } catch (OutsideOfIntervalException exc) {
      System.out.println(exc.getMessage());
    } catch (InputMismatchException ex) {
      System.out.println("Invalid input! Please enter number");
    }
  }
}
