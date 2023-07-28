package promgrammers;
import java.io.*;
public class MakeMap {

	static int N;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        double[] dp = new double[16];

        setting(N, dp);

        System.out.print((int)Math.pow(dp[N], 2));
    }

    public static void setting(int N, double[] dp){ 
        dp[0] = 2;
        for(int i=1; i<=N; i++){
            dp[i] = dp[i-1] + Math.pow(2, i-1);
        }
    }
}
