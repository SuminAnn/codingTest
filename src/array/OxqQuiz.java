package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OxqQuiz {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			int cnt = 0;
			int sum = 0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum += cnt;
			}
			sb.append(sum);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
