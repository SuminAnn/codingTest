package promgrammers;

public class OddNumber {

	public int[] solution(int n) {
        int idx = 0;
        if(n%2 == 0){
            idx = n/2;
        }else{
            idx = n/2+1;
        } // 짝수와 홀수를 구분해서 배열의 갯수를 setting
        
        int[] answer = new int[idx];
        int cnt = 0;
        
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                answer[cnt] = i;
                cnt++;
            } // 홀수인 경우만 배열에 담는다
        }
        return answer;
    }
}
