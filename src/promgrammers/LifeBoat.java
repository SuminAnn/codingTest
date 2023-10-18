package promgrammers;

import java.util.Arrays;

public class LifeBoat {

	public int solution(int[] people, int limit) {
        int answer = 0;
        int left = 0;
        int right = people.length-1;
        
        Arrays.sort(people);
        
        while(left <= right){
            if(left == right){
                answer++;
                break;
            }
            
            if(people[left] + people[right] <= limit){
                answer++;
                left += 1;
                right -= 1;
            }else{
                answer++;
                right -= 1;
            }
        }
        return answer;
    }
}
