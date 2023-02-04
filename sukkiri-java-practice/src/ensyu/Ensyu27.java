package ensyu;

public class Ensyu27 {
	public static void main(String[] args) {
		int randomIn = 0;
		for (int i = 0; i < 5; i++) {
			int random = new java.util.Random().nextInt(99)+1;
			System.out.println(random);
			if(randomIn < random) {
				randomIn = random;
			}
		}
		System.out.println("最大値:"+randomIn);
	}
}
