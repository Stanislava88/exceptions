package list;

import java.util.Arrays;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DemoList {
  public static void main(String[] args) throws EmptyListException, FullListException {
    try {
      ListOfObject list = new ListOfObject();
      list.add("Ivan");
      list.add(16);
      list.add(28);
      list.add(12.5);
      list.add(null);
      list.printAllElements();
      System.out.println("After remove:");
      list.remove();
      list.printAllElements();
    } catch (EmptyListException exc) {
      System.out.println(exc.getMessage());
    } catch (NullValueException e) {
      System.out.println(e.getMessage());
    }
  }
}
