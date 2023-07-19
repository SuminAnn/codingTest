package promgrammers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Virus {

	private static long K, P, N;
    public static void main(String args[]) throws IOException 
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        K = Integer.parseInt(input[0]);
        P = Integer.parseInt(input[1]);
        N = Integer.parseInt(input[2]);
        
        long answer = K;

        for(int i=0; i<N; i++){
            answer *= P;
            answer %= 1000000007;
        }

        System.out.println(answer);
    }
}
