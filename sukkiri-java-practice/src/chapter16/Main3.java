package chapter16;

import java.util.HashSet;
import java.util.Set;

public class Main3 {
  public static void main(String[] args) {
    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("緑");
    colors.add("赤");
    System.out.println("色は" + colors.size() + "種類です");
    for (String s : colors) {
      System.out.print(s + "→");
    }
  }
}
