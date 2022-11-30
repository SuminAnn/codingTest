package promgrammers;

public class ContinuousNaturalSum {

	public int solution(int n) {
        int answer = 0;
        int sum;
        
        for(int i=1; i<=n; i++){
            sum = 0;
            for(int j=i; j<=n; j++){//1부터 n까지 자연수 합을 구한다.
                sum += j;
                if(sum == n){ //합이 n과 같아지면 answer++하고 break;
                    answer++;
                    break;
                }else if(sum > n){ //합이 n보다 커지면 break;
                    break;
                }
            }
        }
        return answer;
        /*
         - 1부터 순차적으로 합이 n과 같아질수 있도록 탐색
         - 순차적으로 탐색하면서 n보다 합이 커지는 경우에 break 
         */
    }
}
