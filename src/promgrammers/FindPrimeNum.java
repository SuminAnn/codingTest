package promgrammers;

public class FindPrimeNum {

	public int solution(int n) {
        int answer = 0;
        
        if(n == 2){
            return 1;
        }
        
        for(int i=2; i<=n; i++){
            boolean flag = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
        
        return answer;
    }
}
