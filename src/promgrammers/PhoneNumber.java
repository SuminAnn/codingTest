package promgrammers;

import java.util.*;
public class PhoneNumber {

	public String solution(String phone_number) {
		
		StringBuilder answer = new StringBuilder(phone_number); //���� ó���� ���� StringBuilder�� phone_number�� ��´�

	    for(int i = 0; i < phone_number.length()-4; i++) {
	    	answer.setCharAt(i, '*'); //�ݺ����� ���� ������ 4�ڸ��� �����ϰ� *�� �����Ѵ�
	    }
	    
	    return answer.toString();
	}
}
