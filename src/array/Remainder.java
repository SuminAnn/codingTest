package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remainder {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[42];
		int cnt=0;
		
		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine())%42] = true;
		}
		
		for(boolean i : arr) {
			if(i) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
