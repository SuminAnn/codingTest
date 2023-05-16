package promgrammers;

public class GymClothes {

	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost); //배열 오름차순 정렬
        Arrays.sort(reserve); //배열 오름차순 정렬
        
        answer = n - lost.length; //체육복을 잃어버리지 않은 학생 수
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        } // 여분의 체육복이 있지만 도난당한 학생의 경우(본인이 사용해야하기 떄문에 빌려줄 수 없다)
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i] -1 == reserve[j]) || (lost[i] +1 == reserve[j]) ){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        } // 체육복을 도난당했지만 빌릴수 있는 경우
        return answer;
    }
}
