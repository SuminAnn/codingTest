package promgrammers;

public class ServiceCnt {

	public int solution(int n, int k) {
        int answer = 0;
        int cnt = n/10; //서비스 음료수 개수
        k -= cnt; // 주문한 음료수 - 서비스
        answer = n*12000 + k*2000;
        return answer;
    }
}
