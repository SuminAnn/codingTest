package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int min = Integer.parseInt(st.nextToken());
		int max = min;
		
		for(int i=1; i<cnt; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num<min) {
				min = num;
			}
			if(num>max) {
				max = num;
			}
		}
		System.out.println(min + " " + max);
	}
}
