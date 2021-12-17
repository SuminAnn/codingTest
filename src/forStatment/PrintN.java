package forStatment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class PrintN {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for(int i=1; i<=num; i++) {
			sb.append(i + "\n");
		}
		
		br.close();
		System.out.println(sb);
	}
}
