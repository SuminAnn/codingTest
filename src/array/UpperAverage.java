package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UpperAverage {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int student = Integer.parseInt(st.nextToken());
			double cnt = 0;
			int sum = 0;
			double average = 0;
			double rate = 0;
			int[] ss = new int[student];
			for(int j=0; j<student; j++) {
				int score = Integer.parseInt(st.nextToken());
				ss[j] = score;
				sum += score;
			}
			
			average = sum/student;
			
			for(int k=0; k<student; k++) {
				if(ss[k] > average) {
					cnt++;
				}
			}
			rate = (cnt/student)*100;
			sb.append((double)Math.round(rate*1000)/1000);
			sb.append("%");
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
