package promgrammers;

public class HateSameNumber {

	 public int[] solution(int []arr) {
	        Stack<Integer> stack = new Stack<>();
	        
	        for(int num : arr){
	            if(stack.isEmpty() || stack.peek() != num){
	                stack.push(num);
	            } //첫번쨰 숫자인 경우와 이전 숫자와 동일하지 않은경우에 stack에 추가
	        }
	        int[] answer = new int[stack.size()];
	        
	        for(int i= stack.size()-1; i>=0; i--){
	            answer[i] = stack.pop();
	        } //stack은 LILO이기 떄문에 역순으로 배열에 담는다

	        return answer;
	    }
}
