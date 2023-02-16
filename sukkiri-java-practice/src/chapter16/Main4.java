package chapter16;

import java.util.Set;
import java.util.TreeSet;

public class Main4 {
  public static void main(String[] args) {
    Set<String> animals = new TreeSet<String>();
    animals.add("dog");
    animals.add("wolf");
    animals.add("panda");
    animals.add("cat");
    for (String s : animals) {
      System.out.print(s + "→");
    }
  }
}
