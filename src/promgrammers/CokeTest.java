package promgrammers;

public class CokeTest {

	public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a && n > 1){
            int tmp  = 0;
            tmp = (n / a) * b; // �����޴� ���ݶ�
            answer = answer + tmp; // �� �������� ���ݶ� 
            n = tmp + (n%a); // ���� �ݶ� ��
        }
        
        return answer;
    }
}
