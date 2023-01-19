package promgrammers;

public class Mode {

	 public int solution(int[] array) {
	        int answer = 0; // 최빈값
	        int idx[] = new int[1001]; // 정수 배열의 최댓값이 1000이기 때문에 1001 정수 배열 선언
	        int cnt = 0; // 동일한 최빈값 갯수
	        int max = 0; // 반복 수의 갯수
	        
	        if(array.length == 1){
	            return array[0];
	        } // 정수 배열이 1인 경우
	        
	        for(int i=0; i<array.length; i++){
	            idx[array[i]]++;
	        } // 정수 배열의 숫자의 해당하는 idx를 ++;
	        
	        for(int i=0; i<idx.length; i++){
	            if(idx[i] > max){
	                max = idx[i]; 
	                answer = i;
	            }//최빈값 check
	        }
	        
	        for(int i=0; i<idx.length; i++){
	            if(idx[i] == max){
	                cnt++; // 최빈값 갯수 check
	            }else if(cnt > 1){
	                return -1;
	            }   
	        }
	        return answer;
	    }
}
