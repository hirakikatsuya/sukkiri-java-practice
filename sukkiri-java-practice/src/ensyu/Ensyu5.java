package ensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ensyu5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
		}
		System.out.println((sum / 10));
	}
}
