package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			while(num%i == 0) {
				sb.append(i);
				sb.append("\n");
				num /= i;
			}
		}
		if(num != 1) {
			sb.append(num);
		}
		
		System.out.println(sb);
	}
}
