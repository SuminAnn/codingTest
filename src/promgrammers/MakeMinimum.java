package promgrammers;

public class MakeMinimum {

	public int solution(int []A, int []B){
        int answer = 0;
        Integer[] b = new Integer[B.length]; //WrapperŬ���� �迭 ����
        
        
        for(int i = 0 ; i<b.length;i++){
            b[i] = B[i];
        }// Collections.sort()�� ���� WrapperŬ���� �迭�� ��ȯ�Ѵ�
        
        Arrays.sort(A);//�������� ����
        Arrays.sort(b, Collections.reverseOrder());//������������
        
        for(int i = 0;i<A.length;i++){
            answer += (A[i]*b[i]);
        }

        return answer;
    }
}
