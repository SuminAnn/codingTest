package promgrammers;

public class IntToChar {

	public String solution(int age) {
        String answer = "";
        String[] str = String.valueOf(age).split("");
        
        for(int i=0; i<str.length; i++){
            answer += (char)((Integer.parseInt(str[i])+97));
        }
        return answer;
    }
}
