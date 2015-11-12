package list;


import java.util.Arrays;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class ListOfObject {
  private int size = 5;
  private Object[] list = new Object[size];
  public int i=0;

  public void add(Object obj) {
    if(i<list.length)
      list[i] =obj;
    i++;
  }

  public void remove() {
    if (list[list.length - 1] != null) {
      list[list.length - 1] = null;
      System.out.println(Arrays.toString(list));
    }
  }

  public void printAllElements() {
    System.out.println(Arrays.toString(list));
  }
}
