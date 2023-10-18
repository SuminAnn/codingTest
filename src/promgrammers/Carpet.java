package promgrammers;

public class Carpet {

	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int small = 0;
        int big = 0;
        int sum = 0;
        
        if(yellow == 1){
            answer[0] = 3;
            answer[1] = 3;
            return answer;
        }else if(yellow == 2){
            answer[0] = 4;
            answer[1] = 3;
            return answer;
        }else{
            for(int i=1; i<=Math.sqrt(yellow); i++){
                if(yellow%i == 0){
                    small = i;
                    big = yellow/i;
                    sum = (big+2)*2 + small*2;
                    if(sum == brown){
                        answer[0] = big+2;
                        answer[1] = small+2;
                        return answer;
                    }
                }
                
            }
        }
        return answer;
    }
}
