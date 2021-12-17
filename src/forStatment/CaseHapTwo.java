package forStatment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CaseHapTwo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		
		for(int i=1; i<=cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); 
			int B = Integer.parseInt(st.nextToken()); 
			sb.append("Case #");
			sb.append(i);
			sb.append(": ");
			sb.append(A);
			sb.append(" + ");
			sb.append(B);
			sb.append(" = ");
			sb.append(A+B);
			sb.append("\n");
		}
		
		br.close();
		System.out.println(sb);
	}
}
