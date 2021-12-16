package ifStatment;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		
		System.out.println((A>0 && B>0)? '1': (A>0 && B<0)? '4': (A<0 && B>0)? '2' : '3');
	}
}
