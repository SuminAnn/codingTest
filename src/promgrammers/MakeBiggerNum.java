package promgrammers;

public class MakeBiggerNum {

	static int idx, max, len;
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        len = number.length() - k;
        idx = 0;
        
        for(int i=0; i<len; i++){
            max = 0;
            for(int j=idx; j<=i+k; j++){
                if(number.charAt(j)-'0' == 9){
                    max = 9;
                    idx = j+1;
                    break;
                } // 가장 큰 수가 9이기 때문에 break
                if(max < number.charAt(j)-'0'){
                    max = number.charAt(j)-'0';
                    idx = j+1;// 가장 큰 수 다음부터 비교하기 위헤
                }
            }//정해진 범위에서 가장 큰수 찾기
            sb.append(max);
        }//만들어야하는 자리수 만큼 반복
        return sb.toString();
    }
}
