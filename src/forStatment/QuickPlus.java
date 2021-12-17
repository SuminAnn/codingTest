package forStatment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickPlus {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		
		for(int i=0; i<cnt; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");	
		}
		
		br.close();
		System.out.println(sb);
	}
}
