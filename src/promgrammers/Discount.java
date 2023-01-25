package promgrammers;

public class Discount {

	 public int solution(int price) {
	        int answer = price;
	        if(price >= 500000){
	            answer = (int)(price * 0.8); // int로 형변환
	        }else if(price >= 300000){
	            answer = (int)(price * 0.9);
	        }else if(price >= 100000){
	            answer = (int)(price * 0.95);
	        }
	        return answer;
	    }
}
