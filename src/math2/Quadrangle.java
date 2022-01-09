package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quadrangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x;
		int y;
		
		int[] vertex_1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine(), " ");
		int[] vertex_2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine(), " ");
		int[] vertex_3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		if(vertex_1[0] == vertex_2[0]) {
			x = vertex_3[0];
		}else if(vertex_1[0] == vertex_3[0]) {
			x = vertex_2[0];
		}else {
			x = vertex_1[0];
		}
		
		if(vertex_1[1] == vertex_2[1]) {
			y = vertex_3[1];
		}else if(vertex_1[1] == vertex_3[1]) {
			y = vertex_2[1];
		}else {
			y = vertex_1[1];
		}
		
		System.out.println(x + " " + y);
	}
}
