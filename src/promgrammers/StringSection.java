package promgrammers;

public class StringSection {

	public int solution(String t, String p) {
        int answer = 0;
        Long cp = Long.parseLong(p); //대조군
        
        for(int i=0; i<=t.length() - p.length(); i++){
            Long ct = Long.parseLong(t.substring(i,i+p.length())); //비교군(대조군 길이 만큼)
            if(ct<=cp) answer++;
        } // 대조군을 비교군 문자열 길이만큼 부분 문자열로 비교
        return answer;
    }
}
