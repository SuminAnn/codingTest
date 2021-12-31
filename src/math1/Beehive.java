package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beehive {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 1;
		int range = 2;
		
		if(num == 1) {
			System.out.println(1);
		}else {
			while(range <= num) {
				range = range + (6*cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
