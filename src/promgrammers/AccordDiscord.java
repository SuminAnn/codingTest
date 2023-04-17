package promgrammers;

public class AccordDiscord {

	public int solution(String s) {
        int answer = 0;
        int left = 0;
        int right = 0;
        int len = s.length();
        
        while(right < len){
            char c = s.charAt(left);
            int cnt  = 1;
            int oCnt = 0;
            while(right+1 < len && cnt != oCnt){
                right++;
                if(s.charAt(right) == c){
                    cnt ++;
                }else{
                    oCnt++;
                }
            }
            right++;
            answer++;
            left = right;
            
        }
        return answer;
    }
}
