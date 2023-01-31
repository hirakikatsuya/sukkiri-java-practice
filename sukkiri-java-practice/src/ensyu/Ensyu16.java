package ensyu;

public class Ensyu16 {
	public static void main(String[] args) {
		int List[] = new int[10];
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			System.out.println("数字を10回入力してください");
			for (int in = 0; in < 10; in++) {
				List[in] = scanner.nextInt();
			}
			for (int out = 0; out < 10; out++) {
				System.out.println(List[out] * 2);
			}
		}
	}
}