package promgrammers;

public class MakePrimeNum {

	public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(solve(sum)){
                        answer++;
                    }
                }
            }
        }//주어진 배열에서 3개의 수를 더하기위한 3중 반복문

        return answer;
    }
    
    public boolean solve(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    } // 소수 판별하기
}
