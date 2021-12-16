package ifStatment;

import java.util.Scanner;

public class Alarm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		
		if(B >= 45) {
			B = B-45;
			System.out.println(A + " "  + B);
		}else {
			if(A<=0) {
				A = 24-1;
			}else{
				A--;
			}
			B = 60 - (45-B);
			System.out.println(A + " " + B);
		}
	}
}
