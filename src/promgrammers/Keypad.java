package promgrammers;

public class Keypad {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;  // *�� ���� 10���� �����Ѵ�
        int right = 12; // #�� ���� 12�� �����Ѵ�
        
        for(int tmp : numbers){ // ������� ���� ��ȣ�� ��� �迭��ŭ �ݺ����� �����Ѵ�
            if(tmp == 1 || tmp == 4 || tmp == 7){   
                answer += "L";  // 1, 4, 7�� ���� ���ǿ� ���� L�� ���ڿ��� �߰�
                left = tmp;     // left�� tmp�� ����
            } else if(tmp == 3 || tmp == 6 || tmp == 9){    
                answer += "R";  // 3, 6, 9�� ���� ���ǿ� ���� R�� ���ڿ��� �߰�
                right = tmp;    // right�� tmp�� ����
            }else{
                if(tmp == 0) tmp = 11;  // 0�� ���� 11�� �����Ѵ�
                
                int distanceL = Math.abs(tmp-left)/3 + Math.abs(tmp-left)%3; // �޼հ� �������ϴ� ������ �Ÿ��� ���Ѵ�
                int distanceR = Math.abs(tmp-right)/3 + Math.abs(tmp-right)%3; // �����հ� �������ϴ� ������ �Ÿ��� ���Ѵ�
                
                if(distanceL > distanceR){
                    answer += "R";  // �������� ����� ��� R�� ���ڿ��� �߰�
                    right = tmp;    // right�� tmp�� ����
                }else if(distanceR > distanceL){
                    answer += "L";  // �޼��� ����� ��� L�� ���ڿ��� �߰�
                    left = tmp;     // left�� tmp�� ����
                }else{
                    if(hand.equals("left")){ // �Ÿ��� ���� ��� �޼����̿� ������ �������� Ȯ��
                        answer += "L";  // �޼������� ��� L�� ���ڿ��� �߰�
                        left = tmp;     // left�� tmp�� ����
                    }else{
                        answer += "R";  // ������������ ��� R�� ���ڿ��� �߰�
                        right = tmp;    // right�� tmp�� ����
                    }
                }
            }
        }
        return answer;
    }
}
