package rpg;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h1 = new Hero("ミナト");
		h1.sword = s;

		Hero h2 = new Hero();

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 80;

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		System.out.println("現在の武器は" + h1.sword.name);
		System.out.println("勇者" + h1.name + "を生み出しました!");
		System.out.println("勇者" + h2.name + "を生み出しました!");
		h1.attack();
		h1.slip();
		m1.run();
		m2.run();
		w.heal(h1);
		w.heal(h2);
		h1.run();
	}
}
