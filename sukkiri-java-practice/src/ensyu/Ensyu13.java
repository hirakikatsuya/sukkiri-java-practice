package ensyu;

public class Ensyu13 {
	public static void main(String[] args) {
		int sum = 0;
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			while (sum <= 100) {
				System.out.println("数字を入力してください");
				int value = scanner.nextInt();
				sum += value;
//				sum += scanner.nextInt() ;
			}
			System.out.println("合計値は" + sum);
		}
	}
}
