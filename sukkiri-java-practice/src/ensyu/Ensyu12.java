package ensyu;

public class Ensyu12 {
	public static void main(String[] args) {
		try(java.util.Scanner scanner = new java.util.Scanner(System.in)){
			System.out.println("数字を入力してください");
			int count = scanner.nextInt();
			for(int i=0;i<count;i++) {
				System.out.println("*");
			}
		}
	}
}
