package promgrammers;
import java.util.*;

public class Lottos {
	public int[] solution(int[] lottos, int[] win_nums) {
        int correctNum = 0; // 당첨 숫자
        lottos = removeElement(lottos, 0); // 알수 없는 숫자(0) 제거
        
        int unknow = 6-lottos.length; // 알수 없는 숫자(0) 계수
        
        correctNum = correct(lottos, win_nums); // 당첨 계수
       
        int[] answer = new int[2];
        answer[0] = rank(correctNum + unknow); // 최대 순위
        answer[1] = rank(correctNum); // 최저 순위
        
        //answer[0] = Math.min(7 - (correctNum + unknow), 6);
        //answer[1] = Math.min(7 - correctNum, 6);
        return answer;
    }
    
     public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    } // 알 수 없는 숫자 제거(0제거하기)
    
    public static int correct(int[] lottos, int[] win_nums){
        int correct = 0;
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    correct++;
                }
            }
        }
        return correct;
    } // 당첨 숫자 계수 구하기
    
    public static int rank(int correct){
        if(correct == 2){
            return 5;
        }else if(correct == 3){
            return 4;
        }else if(correct == 4){
            return 3;
        }else if(correct == 5){
            return 2;
        }else if(correct ==6){
            return 1;
        }else{
            return 6;
        }
    } // 순위 반환

}
