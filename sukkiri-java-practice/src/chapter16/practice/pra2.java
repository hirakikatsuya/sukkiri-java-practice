package chapter16.practice;

import java.util.*;

public class pra2 {
  public static void main(String[] args) {
    Hero h1 = new Hero("スズキ");
    Hero h2 = new Hero("サイトウ");
    Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
    heroes.put(h1, 7);
    heroes.put(h2, 3);
    for (Hero key : heroes.keySet()) {
      int kdc = heroes.get(key);
      System.out.println(key.getName() + "が倒した敵＝" + kdc);
    }
  }
}
