package promgrammers;

public class TileingOf2XN {

	private int[] dp = new int[60001];
    public int solution(int n) {
        int answer = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-2] + dp[i-1]) %  1000000007;
        }
        
        answer = dp[n];
        return answer;
    }
}
