package promgrammers;

public class BetweenNumSum {

	private int max, min;
    public long solution(int a, int b) {
        long answer = 0;
        max = Math.max(a,b);
        min = Math.min(a,b);
        
        for(int i=min; i<=max; i++){
            answer += i;
        }
        return answer;
    }
}
