package promgrammers;

public class ArrayOrder {

	public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++){
            answer[i]++;
            for(int j=0; j<emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}