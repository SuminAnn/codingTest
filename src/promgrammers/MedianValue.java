package promgrammers;

public class MedianValue {

	 public int solution(int[] array) {
	        int answer = 0;
	        int len = array.length%2==0?array.length/2-1:array.length/2;
	        Arrays.sort(array);
	        answer = array[len];
	        return answer;
	    }
}
