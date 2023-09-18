package promgrammers;

public class StrangerString {

	public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean flag = true; //각 단어의 첫번째 확인을 위한 flag
        
        for(int i=0; i<s.length(); i++){
            char chr = s.charAt(i);
            
            if(chr == ' '){
                sb.append(' ');
                flag = true;
                continue;
            } // 공백을 만나는 경우 새로운 단어 시작 flag true
            
            if(flag){ //짝수 대문자 변환
                if(Character.isUpperCase(chr)){
                    sb.append(chr);
                }else{
                    sb.append((char)(chr - 32));
                }
                flag = false;
            }else{ //홀수 소문자 변환
                if(Character.isUpperCase(chr)){
                    sb.append((char)(chr + 32));
                }else{
                    sb.append(chr);
                }
                flag = true;
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}
