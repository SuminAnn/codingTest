package promgrammers;

public class Intercept {

	public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (t1,t2) -> {return t1[1] - t2[1];}); // 요격 범위가 담긴 2차원 배열을 끝나는 구간을 오름차순으로 정렬한다.(요격 범위 내에서 최대한 뒤쪽으로 요격하면 이후 범위가 최대로 들수 있기 떄문)
        
        int last = -1;
        for(int[] target : targets){
            if( last == -1){
                answer++;
                last = target[1] - 1; // 양쪽은 개구간이기 때문에 -1을 한다
                continue;
            } // 첫번째 요격의 경우
            
            if(target[0] <= last && target[1] >= last) continue; // 이전 요격 범위에 드는경우
            
            answer++;
            last = target[1] - 1; // 요격 범위에 들지 못하는 경우
        }
        return answer;
    }
}
