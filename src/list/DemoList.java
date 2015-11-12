package list;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DemoList {
  public static void main(String[] args) {
    ListOfObject list=new ListOfObject();
    list.add(16);
    list.add("Ivan");
    list.printAllElements();
    System.out.println("After remove:");
    list.remove();
  }
}
