package reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int tot = 1;
		while (num != 0) {
			tot *= num;
			num--;
		}
		System.out.println(tot);
	}
}
