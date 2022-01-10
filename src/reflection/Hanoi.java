package reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi {
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		sb.append((int)(Math.pow(2, num)-1));
		sb.append("\n");
		
		hanoi(num,1,2,3);
		System.out.println(sb);
		
	}
	
	static void hanoi(int num, int start, int mid, int to) {
		if(num==1) {
			sb.append(start);
			sb.append(" ");
			sb.append(to);
			sb.append("\n");
			return;
		}
		
		hanoi(num-1, start, to, mid);
		sb.append(start);
		sb.append(" ");
		sb.append(to);
		sb.append("\n");
		
		hanoi(num-1, mid, start, to);
	}
}
