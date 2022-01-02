package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMhotel {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int H = 0;
		int W = 0;
		int N = 0;
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<cnt; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			
			if(N%H == 0) {
				sb.append((H*100) + (N/H));
				sb.append("\n");
			}else {
				sb.append(((N%H)*100) + ((N/H)+1));
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
