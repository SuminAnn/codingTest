package promgrammers;

public class Babbling {

	public int solution(String[] babbling) {
        String[] words = new String[] {"aya", "ye", "woo", "ma"}; // 옹알이 가능한 단어
        String[] continued = new String[] {"ayaaya", "yeye", "woowoo", "mama"}; // 옹알이 불가능한 반복 단어
        int answer = 0;
        
        return chkWords(babbling, words, continued, answer);
    }
    
    public int chkWords(String[] babbling, String[] words, String[] continued, int answer){
        for(String str : babbling){
            String tmpStr = str; // 주어진 단어를 하나씩 꺼내서 tmpStr에 담는다
            
            for(String no : continued){
                tmpStr = tmpStr.replace(no, "x");
            } // 반복적인 단어가 있는지 확인하는 반복문 : 일치하는 경우 x로 변경
            
            for(String word : words){
                tmpStr = tmpStr.replace(word, "");
            } // 사용가능한 단어가 있는지 확인하는 반복문 : 일치하는 경우 ""으로 변경
            
            if(tmpStr.length() == 0){
                answer++; 
            }
        } // 주어진 단어만큼 반복
        return answer;
    }
}
