package promgrammers;

public class SlicePizza3 {

	 public int solution(int slice, int n) {
	        int answer = 1;
	        int piece = slice;
	        
	        while(slice < n){
	            slice += piece;
	            answer++;
	        }
	        return answer;
	    }
}
