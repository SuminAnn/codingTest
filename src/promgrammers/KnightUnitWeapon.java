package promgrammers;

public class KnightUnitWeapon {

	public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        
       
        for (int i = 1; i  <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) cnt++;
                else if (i % j == 0) cnt += 2;
            }
            arr[i-1] = cnt;
        } // 주어진 숫자만큼 돌면서 각 숫자별 약수를 int[]arr에 담는다
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > limit){
                answer += power;
            }else{
                answer += arr[i];
            }
        }
        return answer;
    }
}
