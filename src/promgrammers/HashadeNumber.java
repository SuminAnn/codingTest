package promgrammers;

public class HashadeNumber {

	 public boolean solution(int x) {
	        boolean answer = true;
	        String str = Integer.toString(x);
	        int sum = 0;
	        
	        for(int i=0; i<str.length(); i++){
	            char chr = str.charAt(i);
	            sum += chr-48;
	        }
	        
	        if(x%sum != 0){
	            answer = false;
	        }
	        return answer;
	    }
}
