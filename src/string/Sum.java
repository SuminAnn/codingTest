package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int tot = 0;
		String st = br.readLine();
		
		for(int i=0; i<cnt; i++) {
			tot += (st.charAt(i)-48);
		}
		System.out.println(tot);
	}
}
