package promgrammers;
import java.util.*;
public class PairRemove {

	 public int solution(String s){
	        int answer = 0;
	        char[] chr = new char[s.length()];
	        for(int i=0; i<s.length(); i++){
	            chr[i] = s.charAt(i);
	        }
	        
	        Stack<Character> stack = new Stack<>();
	        
	        for(char c : chr){
	            if(!stack.isEmpty() && stack.peek() == c){
	                stack.pop();
	            }else{
	                stack.push(c);
	            }
	        }
	        if(stack.isEmpty()){
	            answer = 1;
	        }
	        return answer;
	    }
}
