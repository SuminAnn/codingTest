package promgrammers;

public class RemoveCharacter {

	public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter,"");
        return answer;
    }
}