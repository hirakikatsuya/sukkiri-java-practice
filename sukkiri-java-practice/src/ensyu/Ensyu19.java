package ensyu;

public class Ensyu19 {
	public static void main(String[] args) {
		try(java.util.Scanner scanner = new java.util.Scanner(System.in)){
			System.out.println("数字を2つ入力してください");
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			System.out.println("2つの平均値は"+Num(n1,n2));
		}
	}

	public static int Num(int num1, int num2) {
		return (num1 + num2) / 2;
	}
}
