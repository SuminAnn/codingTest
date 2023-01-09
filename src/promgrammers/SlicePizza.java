package promgrammers;

public class SlicePizza {
	 public int solution(int n) {
	        int answer = 0;
	       if(n%7 == 0){
	           answer = n/7;
	       }else{
	           answer = n/7+1;
	       } //7의 배수인 경우와 7의 배수가 아닌경우를 구분
	        return answer;
	    }
}
