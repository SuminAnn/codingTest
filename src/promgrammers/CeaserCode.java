package promgrammers;

public class CeaserCode {

	public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char chr = s.charAt(i);
            if(chr == ' '){
                sb.append(' ');
                continue;
            }
            
            if(Character.isUpperCase(chr)){
                sb.append((char)((chr - 'A' + n)%26 + 'A'));
            }else{
                sb.append((char)((chr - 'a' + n)%26 + 'a'));
            }
        }
        answer = sb.toString();
        return answer;
    }
}
