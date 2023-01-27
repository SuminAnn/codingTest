package promgrammers;

public class OddAndEvenNum {

	public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int num = 0;
        int odd = 0; //홀수 개수
        int even = 0; //짝수 개수
        for(int i=0; i<num_list.length; i++){
            num = num_list[i];
            if(num%2==0){
                even++;
            }else{
                odd++;
            } // 홀수와 짝수 구분
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}
