package promgrammers;

public class Phoneketmon {

	public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hash = new HashSet<>();
        
        for(int num : nums){
            if(!hash.contains(num)) hash.add(num); //공통된 숫자 제거
        }
        
        if(hash.size() > nums.length/2){
            return nums.length/2;
        }else{
            return hash.size();
        }
    }
}
