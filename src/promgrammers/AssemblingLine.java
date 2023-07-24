package promgrammers;

import java.util.*;
import java.io.*;
public class AssemblingLine {

	 static int N;
	    public static void main(String args[])throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;

	        st = new StringTokenizer(br.readLine());
	        N = Integer.parseInt(st.nextToken());

	        int[][] work_time = new int[2][N];
	        int[][] move_time = new int[2][N];

	        for(int i=0; i<N-1; i++){
	            st = new StringTokenizer(br.readLine(), " ");
	            work_time[0][i] = Integer.parseInt(st.nextToken());
	            work_time[1][i] = Integer.parseInt(st.nextToken());
	            move_time[0][i] = Integer.parseInt(st.nextToken());
	            move_time[1][i] = Integer.parseInt(st.nextToken());
	        }

	        st = new StringTokenizer(br.readLine(), " ");
	        work_time[0][N-1] = Integer.parseInt(st.nextToken());
	        work_time[1][N-1] = Integer.parseInt(st.nextToken());

	        int[] dp_a = new int[N];
	        int[] dp_b = new int[N];

	        dp_a[0] = work_time[0][0];
	        dp_b[0] = work_time[1][0];
	        for(int i=1; i<N; i++){
	            dp_a[i] = Math.min(dp_a[i-1]+work_time[0][i], dp_b[i-1]+ move_time[1][i-1] +work_time[0][i]);
	            dp_b[i] = Math.min(dp_b[i-1]+work_time[1][i], dp_a[i-1]+ move_time[0][i-1] +work_time[1][i]);
	        }

	        System.out.print(Math.min(dp_a[N-1], dp_b[N-1]));
	    }
}
