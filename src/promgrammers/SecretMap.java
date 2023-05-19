package promgrammers;

public class SecretMap {

	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<arr1.length; i++){
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            str = "0".repeat(n - str.length()) + str;
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0", " ");
            answer[i] = str;
        }
        return answer;
    }
}
