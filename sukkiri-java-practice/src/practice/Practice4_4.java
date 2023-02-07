package practice;

public class Practice4_4 {
	public static void main(String[] args) {
		int[] numbers = { 3, 4, 9 };
		System.out.println("一桁の数字を入力してください");
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			int input = scanner.nextInt();
			for (int n : numbers) {
				if (n == input) {
					System.out.println("アタリです");
				}
			}
		}
	}
}
