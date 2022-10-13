package promgrammers;

public class Babbling {

	public int solution(String[] babbling) {
        String[] words = new String[] {"aya", "ye", "woo", "ma"}; // �˾��� ������ �ܾ�
        String[] continued = new String[] {"ayaaya", "yeye", "woowoo", "mama"}; // �˾��� �Ұ����� �ݺ� �ܾ�
        int answer = 0;
        
        return chkWords(babbling, words, continued, answer);
    }
    
    public int chkWords(String[] babbling, String[] words, String[] continued, int answer){
        for(String str : babbling){
            String tmpStr = str; // �־��� �ܾ �ϳ��� ������ tmpStr�� ��´�
            
            for(String no : continued){
                tmpStr = tmpStr.replace(no, "x");
            } // �ݺ����� �ܾ �ִ��� Ȯ���ϴ� �ݺ��� : ��ġ�ϴ� ��� x�� ����
            
            for(String word : words){
                tmpStr = tmpStr.replace(word, "");
            } // ��밡���� �ܾ �ִ��� Ȯ���ϴ� �ݺ��� : ��ġ�ϴ� ��� ""���� ����
            
            if(tmpStr.length() == 0){
                answer++; 
            }
        } // �־��� �ܾŭ �ݺ�
        return answer;
    }
}
