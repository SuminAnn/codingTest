package promgrammers;

public class LoopCharacter {

	public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer += my_string.charAt(i);
            }//반복 횟수만큼 각 문자를 반복
        }//문자열 길이만큼 반복
        return answer;
    }
}
