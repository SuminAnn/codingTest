package promgrammers;

public class JadenCase {

	public String solution(String s) {
        String answer = "";
        s = s.toLowerCase(); //��� ���� �ҹ��� ó��
        char[] words = s.toCharArray(); //���ڿ��� char�� ��ȯ
        words[0] = Character.toUpperCase(words[0]); //���� ù��° ���� �빮�ڷ� ��ȯ
        boolean flag = false;
        
        for(int i=0; i<words.length; i++){
            if(flag){
                words[i] = Character.toUpperCase(words[i]); // �빮�ڷ� ��ȯ
                flag = false;
            }
            if(words[i] == ' '){
                flag = true; // ���� ���Ŀ��� flag�� true�� ����
            } 
        }
        
        answer = String.valueOf(words);
        return answer;
    }
}
