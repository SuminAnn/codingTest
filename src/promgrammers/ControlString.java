package promgrammers;

public class ControlString {

	 public boolean solution(String s) {
	        if(s.length() == 4 || s.length() == 6){
	            for(int i=0; i<s.length(); i++){
	                if(s.charAt(i) > 64){
	                    return false;
	                }
	            }
	            return true;
	        }else{
	            return false;
	        }
	    }
}
