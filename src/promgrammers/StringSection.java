package promgrammers;

public class StringSection {

	public int solution(String t, String p) {
        int answer = 0;
        Long cp = Long.parseLong(p); //������
        
        for(int i=0; i<=t.length() - p.length(); i++){
            Long ct = Long.parseLong(t.substring(i,i+p.length())); //�񱳱�(������ ���� ��ŭ)
            if(ct<=cp) answer++;
        } // �������� �񱳱� ���ڿ� ���̸�ŭ �κ� ���ڿ��� ��
        return answer;
    }
}
