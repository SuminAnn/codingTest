package promgrammers;

public class Budget {

	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int tot = 0;
        
        for(int i=0; i<d.length; i++){
            tot += d[i];
            if(tot<=budget){
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}
