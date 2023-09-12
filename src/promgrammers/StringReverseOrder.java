package promgrammers;

public class StringReverseOrder {

	 public String solution(String s) {
	        String answer = "";
	        String[] strs = s.split("");
	        Arrays.sort(strs, Collections.reverseOrder());
	        
	        for(String str : strs){
	            answer += str;
	        }
	        return answer;
	    }
}
