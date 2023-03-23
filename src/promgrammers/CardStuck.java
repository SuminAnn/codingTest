package promgrammers;

public class CardStuck {

	public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1idx = 0; //goal과 일치하는 단어인 경우 다음 카드로 넘어가기위한 idx
        int cards2idx = 0; //goal과 일치하는 단어인 경우 다음 카드로 넘어가기위한 idx
        
        for(int i=0; i<goal.length; i++){
            if(cards1idx < cards1.length &&goal[i].equals(cards1[cards1idx])){ // idx가 카드 수보다 크지 않고 단어가 일치하는 경우
                cards1idx++;
            }else if(cards2idx < cards2.length && goal[i].equals(cards2[cards2idx])){ // idx가 카드 수보다 크지 않고 단어가 일치하는 경우
                cards2idx++;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}
