package ensyu;

public class Ensyu18 {
	public static void main(String[]args) {
		System.out.println("数字を入力してください");
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			int n = scanner.nextInt();
			System.out.println(Num(n));
		}
	}

	public static int Num(int num) {
		return num * num;
	}
}
