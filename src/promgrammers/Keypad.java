package promgrammers;

public class Keypad {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;  // *을 숫자 10으로 설정한다
        int right = 12; // #을 숫자 12로 설정한다
        
        for(int tmp : numbers){ // 순서대로 누른 번호가 담긴 배열만큼 반복문을 실행한다
            if(tmp == 1 || tmp == 4 || tmp == 7){   
                answer += "L";  // 1, 4, 7의 경우는 조건에 따라 L을 문자열에 추가
                left = tmp;     // left를 tmp로 대입
            } else if(tmp == 3 || tmp == 6 || tmp == 9){    
                answer += "R";  // 3, 6, 9의 경우는 조건에 따라 R을 문자열에 추가
                right = tmp;    // right를 tmp로 대입
            }else{
                if(tmp == 0) tmp = 11;  // 0을 숫자 11로 설정한다
                
                int distanceL = Math.abs(tmp-left)/3 + Math.abs(tmp-left)%3; // 왼손과 눌러야하는 숫자의 거리를 구한다
                int distanceR = Math.abs(tmp-right)/3 + Math.abs(tmp-right)%3; // 오른손과 눌러야하는 숫자의 거리를 구한다
                
                if(distanceL > distanceR){
                    answer += "R";  // 오른손이 가까운 경우 R을 문자열에 추가
                    right = tmp;    // right를 tmp로 대입
                }else if(distanceR > distanceL){
                    answer += "L";  // 왼손이 가까운 경우 L을 문자열에 추가
                    left = tmp;     // left를 tmp로 대입
                }else{
                    if(hand.equals("left")){ // 거리가 같은 경우 왼손잡이와 오른손 잡이인지 확인
                        answer += "L";  // 왼손잡이인 경우 L을 문자열에 추가
                        left = tmp;     // left를 tmp로 대입
                    }else{
                        answer += "R";  // 오른손잡이인 경우 R을 문자열에 추가
                        right = tmp;    // right를 tmp로 대입
                    }
                }
            }
        }
        return answer;
    }
}
