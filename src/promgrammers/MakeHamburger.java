package promgrammers;

public class MakeHamburger {

	public int solution(int[] ingredient) {
        int answer = 0;
        String recipe = "1231";
        StringBuffer sb = new StringBuffer(Arrays.toString(ingredient).replaceAll("[^0-9]","")); // int[]을 String으로 변환
        
        while(sb.indexOf(recipe) > -1){
            int idx = sb.indexOf(recipe);
            sb.delete(idx, idx+4); // 일치하는 문자열을 제거
            answer++;
        }// recipe와 일치하는 문자열이 없을때까지 반복
        
        
        return answer;
    } // StringBuffer를 이용한 풀이(코드가 간략해보이지만 시간이 오래걸린다)
	
	 public int solution(int[] ingredient) {
	        Stack<Integer> stack = new Stack<>(); // stack선언
	        for(int i : ingredient){
	            stack.push(i); //stack에 int배열을 하나씩 넣어준다
	            if(stack.size() >= 4){
	                int size = stack.size();
	                if(stack.get(size-1) == 1
	                  && stack.get(size-2) == 3
	                  && stack.get(size-3) == 2
	                  && stack.get(size-4) == 1){
	                    stack.pop();
	                    stack.pop();
	                    stack.pop();
	                    stack.pop();
	                    answer++;
	                }
	            } // stack의 크기가 4이상부터 recipe에 맞는지 확인 후 제거
	            
	        }
	        return answer;
	    } // Stack을 이용한 풀이(신간복잡도와 메모리를 줄일수 있다.)
}
