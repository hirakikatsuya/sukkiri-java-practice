package ensyu;

public class Ensyu10 {
	public static void main(String[] args) {
		int max_value = 0;
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			for (int i = 0; i < 3; i++) {
				System.out.println("数値を入力してください");
				int value = scanner.nextInt();
				if (value > max_value) {
					max_value = value;
				}
			}
			System.out.println("最大値＝" + max_value);
		}
	}
}
