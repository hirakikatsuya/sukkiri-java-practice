package ensyu;

public class Ensyu26 {
	public static void main(String[] args) {
		while (true) {
			int i = new java.util.Random().nextInt(99) + 1;
			if (i % 10 == 0) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}
		System.out.println("終了します");
	}
}
