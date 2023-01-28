package ensyu;

public class Ensyu9 {
	public static void main(String[] args) {
		CoinCase MyCase = new CoinCase();
		for (int i = 0; i < 10; i++) {
			try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
				System.out.println("硬貨の種類は？");
				int kind = scanner.nextInt();
				System.out.println("硬貨の枚数は？");
				int count = scanner.nextInt();
				MyCase.AddCoins(kind, count);
			}
		}
		System.out.println("500円は" + MyCase.GetCount(500) + "枚");
		System.out.println("100円は" + MyCase.GetCount(100) + "枚");
		System.out.println("50円は" + MyCase.GetCount(50) + "枚");
		System.out.println("10円は" + MyCase.GetCount(10) + "枚");
		System.out.println("5円は" + MyCase.GetCount(5) + "枚");
		System.out.println("1円は" + MyCase.GetCount(1) + "枚");
		System.out.println("総額は" + MyCase.GetAmount() + "円");
	}
}

class CoinCase {
	private int yen500 = 0;
	private int yen100 = 0;
	private int yen50 = 0;
	private int yen10 = 0;
	private int yen5 = 0;
	private int yen1 = 0;

	public void AddCoins(int kind, int count) {
		switch (kind) {
		case 500:
			yen500 += count;
			break;
		case 100:
			yen100 += count;
			break;
		case 50:
			yen50 += count;
			break;
		case 10:
			yen10 += count;
			break;
		case 5:
			yen5 += count;
			break;
		case 1:
			yen1 += count;
		}
	}

	public int GetCount(int kind) {
		switch (kind) {
		case 500:
			return yen500;
		case 100:
			return yen100;
		case 50:
			return yen50;
		case 10:
			return yen10;
		case 5:
			return yen5;
		case 1:
			return yen1;
		}
		return 0;
	}

	public int GetAmount() {
		return (yen500 * 500) + (yen100 * 100) + (yen50 * 50) + (yen10 * 10) + (yen5 * 5) + yen1;
	}
}