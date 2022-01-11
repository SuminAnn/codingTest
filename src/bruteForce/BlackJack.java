package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cnt = Integer.parseInt(st.nextToken());
		int aws = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int[] card = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(card, cnt, aws);
		
		System.out.println(result);
		
	}
	
	static int search(int[] card, int cnt, int aws) {
		int result = 0;
		
		for(int i=0; i<cnt-2; i++) {
			if(card[i]>aws) continue;
			for(int j=i+1; j<cnt-1; j++) {
				if(card[i]+card[j]>aws) continue;
				for(int k=j+1; k<cnt; k++) {
					int tot = card[i] + card[j] + card[k];
					
					if(tot == aws) return tot;
					
					if(result<tot && tot<aws) result = tot;
				}
			}
		}
		return result;
	}
}
