package ensyu;

public class Ensyu24 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int o = 0; o < 9; o++) {
				if (o == i) {
					System.out.print("■ ");
				}else {
					System.out.print("□ ");
				}
			}
			System.out.println();
		}
	}
}
