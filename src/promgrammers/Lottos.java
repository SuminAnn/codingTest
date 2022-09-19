package promgrammers;
import java.util.*;

public class Lottos {
	public int[] solution(int[] lottos, int[] win_nums) {
        int correctNum = 0; // ��÷ ����
        lottos = removeElement(lottos, 0); // �˼� ���� ����(0) ����
        
        int unknow = 6-lottos.length; // �˼� ���� ����(0) ���
        
        correctNum = correct(lottos, win_nums); // ��÷ ���
       
        int[] answer = new int[2];
        answer[0] = rank(correctNum + unknow); // �ִ� ����
        answer[1] = rank(correctNum); // ���� ����
        
        //answer[0] = Math.min(7 - (correctNum + unknow), 6);
        //answer[1] = Math.min(7 - correctNum, 6);
        return answer;
    }
    
     public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    } // �� �� ���� ���� ����(0�����ϱ�)
    
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
    } // ��÷ ���� ��� ���ϱ�
    
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
    } // ���� ��ȯ

}
