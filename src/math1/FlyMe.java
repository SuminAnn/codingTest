package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlyMe {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());

			int distance = Y - X;

			int max = (int) Math.sqrt(distance);

			if (max == Math.sqrt(distance)) {
				sb.append(max * 2 - 1).append('\n');
			} else if (distance <= max * max + max) {
				sb.append(max * 2).append('\n');
			} else {
				sb.append(max * 2 + 1).append('\n');
			}

		}
		System.out.println(sb);
	}
}
