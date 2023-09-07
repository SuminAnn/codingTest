package promgrammers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisorZero {

	class Solution {
	    private List<Integer> list = new ArrayList();
	    private int num = 0;
	    public int[] solution(int[] arr, int divisor) {
	        int[] answer = {};
	        Arrays.sort(arr);
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]%divisor == 0){
	                list.add(arr[i]);
	            }
	        }
	        
	        num = list.size();
	        
	        if(num == 0){
	            answer = new int[1];
	            answer[0] = -1;
	        }else{
	            answer = new int[num];
	            for(int i=0; i<num; i++){
	                answer[i] = list.get(i);
	            }
	        }
	        return answer;
	    }
	}
}
