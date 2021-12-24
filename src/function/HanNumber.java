package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.print(arithmetic_sequence(num));
	}
	
	public static int arithmetic_sequence(int num) {
		int cnt = 0;
		
		if(num < 100) {
			return num;
		}else {
			cnt = 99;
			
			if(num == 1000) {
				num = 999;
			}
			
			for(int i=100; i<=num; i++) {
				int baek = i/100;
				int ten = (i/10)%10;
				int one = i%10;
				
				if((baek-ten) == (ten-one)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
