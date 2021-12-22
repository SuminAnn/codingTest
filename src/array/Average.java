package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double max = 0;
		double tot = 0;
		double arr[] = new double[cnt];
		
		for(int i=0; i<cnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
	
		for(int i=0; i<cnt; i++) {
			tot += (arr[i]/max)*100;
		}
		
		System.out.println(tot/cnt);
	}
}
