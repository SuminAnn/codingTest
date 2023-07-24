package promgrammers;
import java.util.*;
import java.io.*;

public class Average {

	static int N,K;
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] score = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<N; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            double sum = 0;
            for(int j=start-1; j<end; j++){
                sum += score[j];
            }
            sum = sum/(end-start+1);
            System.out.printf("%.2f",sum);
            System.out.println();
        }
    }
}
