package promgrammers;

public class Collatz {

	public int solution(long num) { //기존 파라미터는 int형이지만 int형 같은 경우에는 연산 과정에서 21억을 넘게되면 결과가 뒤틀리기때문에 long타입으로 변경 후 진행
        int answer = 0;
        if(num == 1){
            return 0;
        }
        
        while(num != 1){
            if(answer > 499){
                answer = -1;
                break;
            }
            
            if(num%2 == 0){
                num = num/2;
                answer++;
            }else{
                num = num*3+1;
                answer++;
            }
            
        }
        return answer;
    }
}
