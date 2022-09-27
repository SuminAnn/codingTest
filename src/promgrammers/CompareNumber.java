package promgrammers;

public class CompareNumber {

	public String solution(String s) {
        String[] number = s.split(" ");
        
        return compare(number);
    }
    
    public String compare(String[] number){
        int[] nums = new int[number.length];
        
		for(int i=0; i<number.length; i++) {
			nums[i] = Integer.parseInt(number[i]);
		}
        
        Arrays.sort(nums);
        return nums[0] + " " + nums[nums.length - 1];
    }
}
