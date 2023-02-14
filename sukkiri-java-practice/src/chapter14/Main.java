package chapter14;

public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    Hero.setRandomMoney();
    System.out.println(h1.money);
    System.out.println(Hero.money);
    h1.money = 300;
    System.out.println(h2.money);
  }
}
