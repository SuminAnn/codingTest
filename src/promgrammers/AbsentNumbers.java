package promgrammers;

public class AbsentNumbers {

	public int solution(int[] numbers) {
        int answer = 0;
        int[] cnt = new int[10];
        
        for(int i=0; i<numbers.length; i++){
            cnt[numbers[i]]++;
        }
        
        for(int i=0; i<cnt.length; i++){
            if(cnt[i] == 0){
                answer += i;
            }
        }
        return answer;
    }
}
