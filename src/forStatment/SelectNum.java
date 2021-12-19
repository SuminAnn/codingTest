package forStatment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = Integer.parseInt(st.nextToken());
		int std = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		StringBuffer sb = new StringBuffer();
		br.close();
		
		for(int i=0; i<cnt; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num < std) {
				sb.append(num);
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}
