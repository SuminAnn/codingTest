package promgrammers;

public class Babbling2 {

	public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling){
            if(str.contains("ayaaya") || str.contains("yeye") || str.contains("woowoo") || str.contains("mama")) continue; //2번 연속으로 같은 단어를 말할 수 없기때문에 제외
            
            str = str.replace("aya", " ");
            str = str.replace("ye", " ");
            str = str.replace("woo", " ");
            str = str.replace("ma", " ");
            str = str.replace(" ", "");
            
            if(str.equals("")) answer++;
        }
        
        return answer;
    }
}
