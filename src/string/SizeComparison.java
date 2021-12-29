package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SizeComparison {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		int num1 = 0;
		int num2 = 0;
		for(int i=2; i>=0; i--) {
			if(i == 2) {
				num1 += (str1.charAt(i) -48) * 100;
				num2 += (str2.charAt(i) -48) * 100;
			}else if(i == 1) {
				num1 += (str1.charAt(i) -48) * 10;
				num2 += (str2.charAt(i) -48) * 10;
			}else {
				num1 += (str1.charAt(i) -48);
				num2 += (str2.charAt(i) -48);
			}
		}
		
		if(num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
}
