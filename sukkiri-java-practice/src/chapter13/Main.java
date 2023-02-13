package chapter13;

public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.setName("aaa");
    Wand wa = new Wand();
    wa.setName("aaa");
    wa.setPower(10);
    Wizard w = new Wizard();
    w.setHp(100);
    w.setMp(30);
    w.setWand(wa);
    w.heal(h);
  }
}
