package promgrammers;

public class ContinuousNaturalSum {

	public int solution(int n) {
        int answer = 0;
        int sum;
        
        for(int i=1; i<=n; i++){
            sum = 0;
            for(int j=i; j<=n; j++){//1���� n���� �ڿ��� ���� ���Ѵ�.
                sum += j;
                if(sum == n){ //���� n�� �������� answer++�ϰ� break;
                    answer++;
                    break;
                }else if(sum > n){ //���� n���� Ŀ���� break;
                    break;
                }
            }
        }
        return answer;
        /*
         - 1���� ���������� ���� n�� �������� �ֵ��� Ž��
         - ���������� Ž���ϸ鼭 n���� ���� Ŀ���� ��쿡 break 
         */
    }
}
