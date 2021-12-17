package forStatment;

import java.util.Scanner;

public class Hap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int tot=0;
		scan.close();
		
		for(int i=1; i<=cnt; i++) {
			tot += i;
		}
		
		System.out.println(tot);
	}
}
