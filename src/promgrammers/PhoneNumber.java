package promgrammers;

import java.util.*;
public class PhoneNumber {

	public String solution(String phone_number) {
		
		StringBuilder answer = new StringBuilder(phone_number); //빠른 처리를 위해 StringBuilder에 phone_number를 담는다

	    for(int i = 0; i < phone_number.length()-4; i++) {
	    	answer.setCharAt(i, '*'); //반복문을 통해 마지막 4자리를 제외하고 *로 변경한다
	    }
	    
	    return answer.toString();
	}
}
