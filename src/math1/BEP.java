package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class BEP {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int fix = Integer.parseInt(st.nextToken());
		int variable = Integer.parseInt(st.nextToken());
		int cost = Integer.parseInt(st.nextToken());
	
		if(cost <= variable) {
			System.out.println(-1);
		}else {
			System.out.println((fix/(cost-variable))+1);
		}
		
		
	}
}
