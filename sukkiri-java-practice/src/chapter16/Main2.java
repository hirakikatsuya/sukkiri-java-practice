package chapter16;

import java.util.*;

public class Main2 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("ミナト");
    names.add("アサカ");
    names.add("スガワラ");
    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}
