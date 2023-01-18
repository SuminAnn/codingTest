package promgrammers;

public class FractionSum {

	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom = denom1*denom2;
        int numer = denom1*numer2 + denom2*numer1;
        int min = denom>numer?numer:denom;
        
        while(true){
            if(denom%min == 0){
                if(numer%min == 0){
                    answer[0] = numer/min;
                    answer[1] = denom/min;
                    return answer;
                }
            }
            min -= 1;
        } //통분하기
    }
}
