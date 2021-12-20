package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int max = 0;
		
		for(int i=1; i<=9; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num > max) {
				max = num;
				cnt = i;
			}
		}
		
		br.close();
		System.out.println(max + "\n" + cnt);
	}
}
