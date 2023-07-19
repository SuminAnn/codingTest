package promgrammers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SteppingStone {

	 public static void main(String args[]) throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int num = Integer.parseInt(br.readLine());
	        int[] bridge = new int[num];
	        int[] dp = new int[num];
	        int answer = 0;
	        String input[] = br.readLine().split(" ");
	        
	        setting(bridge, dp, input);

	        check(num, bridge, dp);

	        answer = max(answer, dp);

	        System.out.print(answer);
	        
	    }

	    public static void setting(int[] bridge, int[] dp, String[] input){
	        for(int i=0 ;i<input.length; i++){
	            int tmp = Integer.parseInt(input[i]);
	            bridge[i] = tmp;
	            dp[i] = 1;
	        }
	    }

	    public static void check(int num, int[] bridge, int[] dp){
	        for(int i=0; i<num; i++){
	            for(int j=0; j<i; j++){
	                if(bridge[j] < bridge[i]){
	                    dp[i] = Math.max(dp[i], dp[j]+1);
	                }
	            }
	        }
	    }

	    public static int max(int answer, int[] dp){
	        for(int tmp : dp){
	            answer = Math.max(answer, tmp);
	        }

	        return answer;
	    }
}
