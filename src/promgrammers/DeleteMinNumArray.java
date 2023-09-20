package promgrammers;

public class DeleteMinNumArray {

	private int min, idx, tmp;
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        min = arr[0];
        idx = 0;
        
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }else{
            
            for(int i=1; i<arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                    idx = i;
                }
            }
        }
        tmp = 0;
        for(int i=0; i<arr.length; i++){
            if(idx != i){
                answer[tmp] = arr[i];
                tmp++;
            }
        }
        return answer;
    }
}
