package ensyu;

public class Ensyu28 {
	public static void main(String[] args) {
		int array[] = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = new java.util.Random().nextInt(10) + 1;
			System.out.print(array[i] + " ");
		}
		for (int o = 0; o < array.length; o++) {
			System.out.println();
			for (int j = 0; j < array[o]; j++) {
				System.out.print("*");
			}
		}
	}
}
