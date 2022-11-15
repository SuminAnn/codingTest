package promgrammers;

public class JadenCase {

	public String solution(String s) {
        String answer = "";
        s = s.toLowerCase(); //모든 문자 소문자 처리
        char[] words = s.toCharArray(); //문자열을 char로 변환
        words[0] = Character.toUpperCase(words[0]); //가장 첫번째 문자 대문자로 변환
        boolean flag = false;
        
        for(int i=0; i<words.length; i++){
            if(flag){
                words[i] = Character.toUpperCase(words[i]); // 대문자로 변환
                flag = false;
            }
            if(words[i] == ' '){
                flag = true; // 띄어쓰기 이후에는 flag를 true로 변경
            } 
        }
        
        answer = String.valueOf(words);
        return answer;
    }
}
