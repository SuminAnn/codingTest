package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphaabet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		int[] alpha = new int[26];
		for(int i=0; i<alpha.length;i++) {
			alpha[i] = -1;
		}
		
		for(int i=0; i<st.length(); i++) {
			char ch = st.charAt(i);
			if(alpha[ch-97] == -1) {
				alpha[ch-97] = i;
			}
		}
		
		for(int i : alpha) {
			System.out.print(i + " ");
		}
	}
}
