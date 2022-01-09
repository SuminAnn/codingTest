package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxicab {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double R = Double.parseDouble(br.readLine());
		
		System.out.println(R*R*Math.PI);
		System.out.println(2*R*R);
	}
}
