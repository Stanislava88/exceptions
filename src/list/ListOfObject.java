package list;


import java.util.Arrays;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class ListOfObject {
  private Object[] list = {"Maria", 95};

  public void add(Object obj) {
    Object[] newList = new Object[list.length + 1];
    for (int i = 0; i < list.length; i++) {
      newList[i] = list[i];
    }
    newList[newList.length - 1] = obj;
    list = newList;
  }
  public void remove(){
    if(list[list.length-1]!=null){
      list[list.length-1]=null;
      System.out.println(Arrays.toString(list));
    }
  }

  public void printAllElements() {
    System.out.println(Arrays.toString(list));
  }
}
