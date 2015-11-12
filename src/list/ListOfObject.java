package list;

import java.util.Arrays;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class ListOfObject {
  private int size = 5;
  private Object[] list = new Object[size];
  public int i = 0;

  public void add(Object obj) throws FullListException {
    if (i < list.length) {
      list[i] = obj;
      i++;
    } else throw new FullListException("The list is full.You can not add element!!!");
  }

  public void remove() throws EmptyListException {
    if (list[i] == null) {
      throw new EmptyListException("You can not removed any elements.The list is empty");
    } else {
      list[i - 1] = null;
      i--;
    }
  }

  public void printAllElements() {
    System.out.println(Arrays.toString(list));
  }
}
