package reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
	static char[][] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		arr = new char[cnt][cnt];
		
		star(0,0,cnt,false);
		
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<cnt; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	static void star(int x, int y, int cnt, boolean blank) {
		if(blank) {
			for(int i=x; i<x+cnt; i++) {
				for(int j=y; j<y+cnt; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(cnt==1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = cnt/3;
		int count = 0;
		
		for(int i=x; i<x+cnt; i+=size) {
			for(int j=y; j<y+cnt; j+=size) {
				count++;
				if(count==5) {
					star(i,j,size,true);
				}else {
					star(i,j,size,false);
				}
			}
		}
	}
}
