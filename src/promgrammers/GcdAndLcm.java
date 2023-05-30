package promgrammers;

public class GcdAndLcm {

	 public int[] solution(int n, int m) {
	        int num1 = gcd(n,m); //큰수가 n이라는 가정이 없는경우에는 n과m중에 어느것이 큰수인지 확인하는 과정이 필요하다
	        int num2 = lcm(n*m, num1);
	        int[] answer = {num1, num2};
	        return answer;
	    }
	    
	    public int gcd(int max, int min){
	        if(min == 0){
	            return max;
	        }
	        return gcd(min, max%min);
	    }
	    
	    public int lcm(int gob, int gcd){
	        return gob/gcd;
	    }
}
