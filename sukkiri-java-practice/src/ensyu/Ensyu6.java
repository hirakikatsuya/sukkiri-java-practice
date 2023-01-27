package ensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ensyu6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int wins = 0;
		for (int i = 0; i < 10; i++) {
			int result = Integer.parseInt(br.readLine());
			if (result == 1) {
				wins += 1;
			}
		}
		System.out.println("勝ち" + wins + "回、負け" + (10 - wins) + "回");
	}
}
