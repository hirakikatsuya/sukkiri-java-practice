package ensyu;

public class Ensyu7 {
	public static void main(String[]args) {
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			System.out.println("身長(cm)を入力してください");
			double height = scanner.nextInt();
			height /= 100;
			System.out.println("体重(kg)を入力してください");
			double weight = scanner.nextInt();
			double BMI = weight/height/height;
			System.out.println("BMIは"+BMI+"です");
		}
	}
}