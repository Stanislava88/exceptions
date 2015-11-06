package console;


import java.util.InputMismatchException;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    try {
      Number num = new Number();
      System.out.println("Enter number :");
      num.read();
    } catch (OutsideOfIntervalException exc) {
      System.out.println(exc.getMessage());
    } catch (InputMismatchException ex) {
      System.out.println("Invalid input! Please enter number");
    }
  }
}
