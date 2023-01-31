package ensyu;

public class Ensyu17 {
	public static void main(String[] args) {
		int fibo1 = 0;
		int fibo2 = 1;
		while (fibo1 < 1000 && fibo2 < 1000) {
			System.out.println(fibo1);
			fibo1 += fibo2;
			System.out.println(fibo2);
			fibo2 += fibo1;
		}
	}
}
