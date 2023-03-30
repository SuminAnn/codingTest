package promgrammers;

public class SecretCode {

	public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int cnt = 0;
            
            while(cnt < index){
                c++;
                if(c > 'z'){
                    c -= 26;
                } // z를 넘어가는 경우 a로 초기화
                
                if(skip.contains(c+"")){
                    continue;
                }else{
                    cnt++;
                } // skip 문자열과 동일한 알파벳인경우 continue 아닌경우 cnt ++
            }
            answer += c;
        } //문자열만큼 반복
        return answer;
    }
}
