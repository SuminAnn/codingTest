package promgrammers;

public class ClawMachine {

	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack(); //인형을 뽑은 순서대로 담기위한 stack
        stack.push(0); // 첫번째 뽑은 인형의 전순서 뽑기 인형과 비교하기 위해 임의로 0을 추가
        
        for(int i : moves){
            for(int j=0; j<board.length; j++){
                if(board[j][i-1] != 0){
                    if(stack.peek() == board[j][i-1]){ // 뽑기 전순서의 인형과 비교(일치하는경우)
                        stack.pop(); // 기존의 인형 제거
                        answer += 2;
                        board[j][i-1] = 0; // 뽑은 인형의 위치는 0으로 설정
                        break;
                    }else{ // 뽑기 전순서의 인형과 비교(일치하지 않는 경우)
                        stack.push(board[j][i-1]); // stack에 뽑은 인형 추가
                        board[j][i-1] = 0; // 뽑은 인형의 위치는 0으로 설정
                        break;
                    }
                }else{
                    
                }
            }
        }
        return answer;
    }
}
