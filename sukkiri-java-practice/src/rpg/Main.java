package rpg;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h1 = new Hero("ミナト");
		h1.sword = s;

		Hero h2 = new Hero("ミナ");

		SuperHero sh1 = new SuperHero("ああああ");
		sh1.sword = s;

		Dancer d = new Dancer();
		d.name = "いいいい";
		d.hp = 50;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 80;

		Matango m1 = new Matango('A');
		m1.hp = 50;

		Matango m2 = new Matango('B');
		m2.hp = 48;

		PoisonMatango pm1 = new PoisonMatango('C');

		System.out.println("現在の武器は" + h1.sword.name);
		System.out.println("勇者" + h1.name + "を生み出しました!");
		System.out.println("勇者" + h2.name + "を生み出しました!");
		System.out.println("スーパー勇者" + sh1.name + "を生み出しました!");
		h1.attack();
		h1.slip();
		sh1.fly();
		sh1.attack();
		m1.run();
		m2.run();
		d.dance();
		pm1.attack(sh1);
		w.heal(h1);
		w.heal(h2);
		h1.run();
		sh1.run();
	}
}
