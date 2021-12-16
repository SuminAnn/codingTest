package arithmetic;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextInt();
		double B = scan.nextInt();
		
		System.out.println(A/B);
		scan.close();
	}
}
