package promgrammers;

public class SumMatrix {

	public int[][] solution(int[][] arr1, int[][] arr2) {
        //int[][] answer = new int[arr1.length][arr1[0].length]; 초반에는 크기를 지정해줬지만 사실상 배열의 크기는 동일하기 때문에 arr1으로 지정해도 문제가 없다
        int[][] answer = arr1;
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                //answer[i][j] = arr1[i][j] + arr2[i][j];
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}
