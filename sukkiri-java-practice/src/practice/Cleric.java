package practice;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(name + "セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("MPを5消費してhpを" + MAX_HP + "まで回復しました！");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "祈った！");
		int recover = sec + new Random().nextInt(3);
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		return recoverActual;
	}
}
