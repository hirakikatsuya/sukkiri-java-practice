package ensyu;

public class Ensyu31 {
	public static void main(String[] args) {
		int p = 0;
		for (int a = 1; a <= 100; a++) {
			for (int b = 1; b <= 100; b++) {
				for (int c = 1; c <= 100; c++) {
					if (a <= b && (a * a) + (b * b) == c * c) {
						System.out.println("c=" + c + " b=" + b + " a=" + a);
						p++;
					}
				}
			}
		}
		System.out.println("組み合わせは" + p);
	}
}
