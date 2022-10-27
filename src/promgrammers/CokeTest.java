package promgrammers;

public class CokeTest {

	public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a && n > 1){
            int tmp  = 0;
            tmp = (n / a) * b; // 돌려받는 새콜라
            answer = answer + tmp; // 총 돌려받은 새콜라 
            n = tmp + (n%a); // 남은 콜라 수
        }
        
        return answer;
    }
}
