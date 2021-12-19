package forStatment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		br.close();
		
		for(int i=1; i<=cnt; i++) {
			for(int j=1; j<=i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
