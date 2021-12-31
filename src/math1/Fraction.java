package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fraction {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cross = 1;
		int prevSum = 0;
		
		while(true) {
			if(num <= prevSum + cross) {
				if(cross%2 == 1) {
					System.out.println((cross-(num-prevSum-1)) + "/" + (num-prevSum));
					break;
				}else {
					System.out.println((num-prevSum) + "/" + (cross-(num-prevSum-1)));
					break;
				}
			}else {
				prevSum += cross;
				cross++;
			}
		}
	}
}
