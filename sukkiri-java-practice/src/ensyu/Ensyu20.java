package ensyu;

public class Ensyu20 {
	public static void main(String[] args) {
		System.out.println("数字を3つ入力してください");
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = scanner.nextInt();
			System.out.println(maxNum(x, (maxNum(y, z))));
		}
	}

	public static int maxNum(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
}
