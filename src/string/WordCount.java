package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordCount {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(str, " ");
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
