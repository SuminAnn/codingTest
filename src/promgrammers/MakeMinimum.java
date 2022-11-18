package promgrammers;

public class MakeMinimum {

	public int solution(int []A, int []B){
        int answer = 0;
        Integer[] b = new Integer[B.length]; //Wrapper클래스 배열 선언
        
        
        for(int i = 0 ; i<b.length;i++){
            b[i] = B[i];
        }// Collections.sort()를 위해 Wrapper클래스 배열로 변환한다
        
        Arrays.sort(A);//오름차순 정렬
        Arrays.sort(b, Collections.reverseOrder());//내림차순정렬
        
        for(int i = 0;i<A.length;i++){
            answer += (A[i]*b[i]);
        }

        return answer;
    }
}
