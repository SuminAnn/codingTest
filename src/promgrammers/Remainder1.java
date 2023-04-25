package promgrammers;

public class Remainder1 {

	public int solution(int n) {
        int answer = 0;
        for(int i=2; i<n; i++){
            if(n%i == 1){
                return i;
            }
        }
        return answer;
    }
}
