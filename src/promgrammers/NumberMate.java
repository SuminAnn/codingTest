package promgrammers;

public class NumberMate {

	public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        
        for(int i=0; i<X.length(); i++){
            xArr[X.charAt(i)-48]++;
        } // 정수 String X의 각각 자리수의 숫자를 분리해서 int[]xArr에 해당 숫자 ++
        
        for(int i=0; i<Y.length(); i++){
            yArr[Y.charAt(i)-48]++;
        } // 정수 String Y의 각각 자리수의 숫자를 분리해서 int[]yArr에 해당 숫자 ++
        
        for(int i=9; i>=0; i--){
            for(int j=0; j<Math.min(xArr[i], yArr[i]); j++){
                answer.append(i);
            }//x와 y의 공통된 숫자 만큼 큰수부터 역순으로 StringBuilder에 추가
        }
        
        if(answer.toString().equals("")){
            return "-1"; // 공통된 숫자가 없는경우
        }else if(answer.toString().substring(0,1).equals("0")){
            return "0"; // 공통된 숫자가 0만 있는경우
        }
        
        return answer.toString();
    }
}
