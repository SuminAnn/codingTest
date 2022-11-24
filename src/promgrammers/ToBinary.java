package promgrammers;

public class ToBinary {

	public int[] solution(String s) {
        int[] answer = new int[2]; // return int[] 선언
        int change_cnt = 0; // 변환회차 변수 선언
        int zero_cnt = 0; // 제거할 0의 개수 변수 선언
        
        while(!s.equals("1")){ //이진 변환 결과가 1일 될때까지 반복
            change_cnt++; // 변환회차 1씩 증가
            String tmp = s.replaceAll("0", ""); // 9을 제외한 문자열을 임의의 문자열 tmp에 담는다
            zero_cnt += s.length() - tmp.length(); // 제거된 0의 개수 = 기존의 문자열 - 0이 제거된 문자열
            s = Integer.toBinaryString(tmp.length()).toString(); // 0이 제거된 문자열 길이를 이진 변환
        }
        answer[0] = change_cnt;
        answer[1] = zero_cnt;
        return answer;
    }
}
