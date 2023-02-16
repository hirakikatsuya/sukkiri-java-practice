package chapter16.practice;

import java.util.ArrayList;

public class pra1 {
  public static void main(String[] args) {
    Hero h1 = new Hero("スズキ");
    Hero h2 = new Hero("サイトウ");
    ArrayList<Hero> heroes = new ArrayList<Hero>();
    heroes.add(h1);
    heroes.add(h2);
    for (Hero h : heroes) {
      System.out.println(h.getName());
    }
  }
}