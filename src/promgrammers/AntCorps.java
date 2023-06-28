package promgrammers;

public class AntCorps {

	public int solution(int hp) {
        int answer = 0;
        answer = hp/5;
        hp = hp%5;
        if(hp == 0){
            return answer;
        }else{
            answer += hp/3;
            hp = hp%3;
            if(hp == 0){
                return answer;
            }else{
                answer += hp;
                return answer;
            }
        }
    }
}
