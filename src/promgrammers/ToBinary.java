package promgrammers;

public class ToBinary {

	public int[] solution(String s) {
        int[] answer = new int[2]; // return int[] ����
        int change_cnt = 0; // ��ȯȸ�� ���� ����
        int zero_cnt = 0; // ������ 0�� ���� ���� ����
        
        while(!s.equals("1")){ //���� ��ȯ ����� 1�� �ɶ����� �ݺ�
            change_cnt++; // ��ȯȸ�� 1�� ����
            String tmp = s.replaceAll("0", ""); // 9�� ������ ���ڿ��� ������ ���ڿ� tmp�� ��´�
            zero_cnt += s.length() - tmp.length(); // ���ŵ� 0�� ���� = ������ ���ڿ� - 0�� ���ŵ� ���ڿ�
            s = Integer.toBinaryString(tmp.length()).toString(); // 0�� ���ŵ� ���ڿ� ���̸� ���� ��ȯ
        }
        answer[0] = change_cnt;
        answer[1] = zero_cnt;
        return answer;
    }
}
