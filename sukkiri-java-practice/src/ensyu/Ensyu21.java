package ensyu;

public class Ensyu21 {
	public static void main(String[] args) {
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			System.out.println("数字を入力してください");
			int n = scanner.nextInt();
			Num(n);
		}
	}

	public static void Num(int num) {
		for (int i = 1; i <= 9; i++) {
			int outNum = num * i;
			System.out.println(outNum);
		}
	}
}
