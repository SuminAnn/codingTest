package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int auset = Integer.parseInt(st.nextToken());
			int ausar = Integer.parseInt(st.nextToken());
			int heru = Integer.parseInt(st.nextToken());
			
			if(auset == 0 && ausar == 0 && heru == 0) {
				break;
			}
			
			if((auset * auset + ausar * ausar) == heru * heru) {
				sb.append("right");
				sb.append('\n');
			}
        	else if(auset * auset == (ausar * ausar + heru * heru)) {
				sb.append("right");
				sb.append('\n');
			}
        	else if(ausar * ausar == (heru * heru + auset * auset)) {
				sb.append("right");
				sb.append('\n');
			}
        	else {
				sb.append("wrong");
				sb.append('\n');
			}
		}
		System.out.println(sb);
	}
}
