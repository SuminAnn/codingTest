package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int climb = Integer.parseInt(st.nextToken());
		int slide = Integer.parseInt(st.nextToken());
		int top = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		cnt = (top-slide)/(climb-slide);
		if((top-slide)%(climb-slide) != 0) {
			cnt++;
		}
		
		
		System.out.println(cnt);
	}
}
