package ensyu;

public class Ensyu14 {
	public static void main(String[] arghs) {
		int countBall = 0;
		int countStrike = 0;
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			while (countBall < 4 && countStrike < 3) {
				System.out.println("ストライク：1、ボール：2、ファール：3を入力してください");
				int Throw = scanner.nextInt();
				if (Throw == 1) {
					countStrike++;
				} else if (Throw == 2) {
					countBall++;
				} else if (Throw == 3 && countStrike < 2) {
					countStrike++;
				}
			}
			System.out.println("ストライク＝" + countStrike);
			System.out.println("ボール＝" + countBall);
		}
	}
}