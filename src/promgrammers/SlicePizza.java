package promgrammers;

public class SlicePizza {
	 public int solution(int n) {
	        int answer = 0;
	       if(n%7 == 0){
	           answer = n/7;
	       }else{
	           answer = n/7+1;
	       } //7�� ����� ���� 7�� ����� �ƴѰ�츦 ����
	        return answer;
	    }
}
