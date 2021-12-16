package ifStatment;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		scan.close();
		
		System.out.println(((A%4==0 && A%100!=0)||A%400==0)? '1' : '0');
	}
}
