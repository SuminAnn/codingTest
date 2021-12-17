package forStatment;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<cnt; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			sb.append(A+B);
			sb.append("\n");
		}
		
		scan.close();
		System.out.println(sb);
	}
}
