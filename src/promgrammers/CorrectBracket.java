package promgrammers;

import java.util.*;
public class CorrectBracket {

	boolean notStack(String s) {
        boolean answer = true;
        int chk = 0; //괄호 개수 체크를 위한 int chk 선언
        char[] words = s.toCharArray(); // 문자열 char[]로 변환
        if(words[0] == ')'){
            return false; //괄호가 먼저 닫히는 경우 false반환
        }
        
        for(char word : words){
            if(word == '('){
                chk += 1; // 열리는 괄호인 경우 chk++;
            }else{
                chk -= 1; // 닫히는 괄호인 경우 chk--;
            }
            
            if(chk<0){
                return false; // chk가 음수가 되는 경우는 복수로 닫히는 경우기 때문에 false반환
            }
        }
        
        if(chk > 0){
            return false; // chk가 양수인 경우에는 괄호가 열려있고 닫히지 못한 경우이기때문에 false반환
        }


        return answer;
    }
	
	 boolean stack(String s) {
	        boolean answer = true;
	        char[] words = s.toCharArray(); // 문자열 char[]로 변환
	        
	        Stack<Character> stack = new Stack<>(); // stack 선언
	        for(char word : words){
	            if(word =='('){
	                stack.push('('); // 열린 괄호인 경우 stack push
	            }else{
	                if(stack.isEmpty()){ // stack이 비어있는 경우는 먼저 닫힌경우, 닫힌 괄호가 더 많은 경우이기 때문에 false 반환
	                    return false;
	                }else{
	                    stack.pop(); // stack에 있는경우 stack pop
	                }
	            }
	            
	            
	        }
	        answer = (stack.isEmpty())?true:false; // 최종적으로는 열린 괄호와 닫힌 괄호의 짝이 맞아서 stack이 비어있는 경우 true를 반환
	        return answer;
	    }
}
