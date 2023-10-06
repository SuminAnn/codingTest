package promgrammers;

public class NextBiggerNum {

	public int solution(int n) {
        int answer = n+1;
        int cnt =0;
        boolean flag = true;
        String tmp = Integer.toBinaryString(n);
        
        for(int i=0; i<tmp.length(); i++){
            if(tmp.charAt(i) == '1'){
                cnt++;
            }
        }
        
        while(flag){
            tmp = Integer.toBinaryString(answer);
            int tmpCnt = 0;
            for(int i=0; i<tmp.length(); i++){
                if(tmp.charAt(i) == '1'){
                    tmpCnt++;
                }
                
                if(tmpCnt > cnt){
                    break;
                }
            }
            
            if(tmpCnt == cnt){
                flag = false;
            }else{
                answer++;
            }
        }
        
        return answer;
    }
}
