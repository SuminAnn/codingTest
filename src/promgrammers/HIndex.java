package promgrammers;

public class HIndex {

	public int solution(int[] citations) {
        int answer = 0;
        int cnt = 0;
        for(int i=1; i<=citations.length; i++){
            cnt = 0;
            for(int num : citations){
                if(num >= i) cnt++;
            }
            if(cnt >= i){
                answer = i;
            }else{
                break;
            }
        }
        return answer;
    }
}
