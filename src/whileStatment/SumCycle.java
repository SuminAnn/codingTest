package whileStatment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumCycle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int comp = num;
		int cnt = 0;
		
		while(true) {
			num = ((num/10) + (num%10))%10 + (10*(num%10));
			cnt++;
			
			if(comp == num) {
				break;
			}
		}
		
		System.out.println(cnt);
	}
}
