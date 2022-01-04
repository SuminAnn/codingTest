package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 10000;
		
		for(int i=M; i<=N; i++) {
			if(i==1) {
				
			}else {
				boolean isPrime = true;
				for(int j=2; j<=Math.sqrt(i); j++) {
					if(i%j == 0) {
						isPrime = false;
					}
				}
				if(isPrime) {
					sum += i;
					if(i<min) {
						min = i;
					}
				}
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
