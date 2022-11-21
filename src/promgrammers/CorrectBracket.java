package promgrammers;

import java.util.*;
public class CorrectBracket {

	boolean notStack(String s) {
        boolean answer = true;
        int chk = 0; //��ȣ ���� üũ�� ���� int chk ����
        char[] words = s.toCharArray(); // ���ڿ� char[]�� ��ȯ
        if(words[0] == ')'){
            return false; //��ȣ�� ���� ������ ��� false��ȯ
        }
        
        for(char word : words){
            if(word == '('){
                chk += 1; // ������ ��ȣ�� ��� chk++;
            }else{
                chk -= 1; // ������ ��ȣ�� ��� chk--;
            }
            
            if(chk<0){
                return false; // chk�� ������ �Ǵ� ���� ������ ������ ���� ������ false��ȯ
            }
        }
        
        if(chk > 0){
            return false; // chk�� ����� ��쿡�� ��ȣ�� �����ְ� ������ ���� ����̱⶧���� false��ȯ
        }


        return answer;
    }
	
	 boolean stack(String s) {
	        boolean answer = true;
	        char[] words = s.toCharArray(); // ���ڿ� char[]�� ��ȯ
	        
	        Stack<Character> stack = new Stack<>(); // stack ����
	        for(char word : words){
	            if(word =='('){
	                stack.push('('); // ���� ��ȣ�� ��� stack push
	            }else{
	                if(stack.isEmpty()){ // stack�� ����ִ� ���� ���� �������, ���� ��ȣ�� �� ���� ����̱� ������ false ��ȯ
	                    return false;
	                }else{
	                    stack.pop(); // stack�� �ִ°�� stack pop
	                }
	            }
	            
	            
	        }
	        answer = (stack.isEmpty())?true:false; // ���������δ� ���� ��ȣ�� ���� ��ȣ�� ¦�� �¾Ƽ� stack�� ����ִ� ��� true�� ��ȯ
	        return answer;
	    }
}
