package ensyu;

public class Ensyu22 {
	public static void main(String[] args) {
		for (int n = 10000; n < 10100; n++) {
			if (priNum(n) == true) {
				System.out.println(n);
			}
		}
	}

	public static boolean priNum(int num) {
		for (int i = 2; i <= (num / 2); i++)
			if ((num % i) == 0)
				return false;
		return true;
	}
}

