package promgrammers;

public class Painting {

	public int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;
        for(int i=0; i<section.length; i++){
            if(max <= section[i]){
                answer += 1;
                max = section[i] + m;
            }
        }
        return answer;
    }
}
