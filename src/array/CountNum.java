package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		String str = Integer.toString(A*B*C);
		
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
