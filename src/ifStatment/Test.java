package ifStatment;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		scan.close();
		
		System.out.println((A>=90)? 'A': (A>=80)? 'B' : (A>=70)? 'C': (A>=60)? 'D': 'F');
	}
}
