package ensyu;

public class Ensyu11 {
	public static void main(String[] args) {
		int minValue = 0;
		int maxValue = 0;
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			for (int i = 0; i < 5; i++) {
				System.out.println("数値を入力してください");
				int value = scanner.nextInt();
				if (i == 0) {
					maxValue = value;
					minValue = value;
				}
				if (value > maxValue) {
					maxValue = value;
				} else if (value < minValue) {
					minValue = value;
				}
			}
			System.out.println("最大値＝"+maxValue);
			System.out.println("最小値＝"+minValue);
		}
	}
}
