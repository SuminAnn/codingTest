package promgrammers;

public class CardPurse {

	public int solution(int[][] sizes) {
        int answer = 0;
        int idx = 0;
        int bigW = 0;
        int bigH = 0;
        
        int[][] big = new int[sizes.length][2];
        for(int i=0; i<sizes.length; i++){
            int w = sizes[i][0];
            int h = sizes[i][1];
            big[i][0] = Math.max(w,h);
            big[i][1] = Math.min(w,h);
        }
        for(int i=1 ;i<big.length; i++){
            if(big[idx][0] < big[i][0]){
                idx = i;
            }
        }
        bigW = big[idx][0];
        
        for(int i=0; i<big.length; i++){
            if(big[idx][1] < big[i][1]){
                idx = i;
            }
        }
        bigH = big[idx][1];
        answer = bigW * bigH;
        return answer;
    }
}
