package sumator;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.IllegalFormatCodePointException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Sumator {
  public int sum(String a, String b) throws IllegalArgumentException {
    if (!a.matches("[0-9]+") || !b.matches("[0-9]+")) {
      throw new IllegalArgumentException("Illegal Argument");
    }
    int x = Integer.parseInt(a);
    int y = Integer.parseInt(b);
    int sum = x + y;
    return sum;
  }
}

