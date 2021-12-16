package arithmetic;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		
		StringBuffer sb = new StringBuffer();
		sb.append(A*(B%10));
		sb.append("\n");
		sb.append(A*((B%100)/10));
		sb.append("\n");
		sb.append(A*((B%1000)/100));
		sb.append("\n");
		sb.append(A*B);
		
		System.out.println(sb);
		
	}
}
