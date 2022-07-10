package promgrammers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Declare {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];
        
        //key : �Ű����ID, value : �Ű��� ID
        Map<String, HashSet<String>> declareMap = new HashMap<>();//�ߺ� ������ ���� value�� set�̿�
        // key : �Ű����ID, value : �Ű�Ƚ��
        Map<String, Integer> answerMap = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++){
            String name = id_list[i];
            declareMap.put(name, new HashSet<>());
            answerMap.put(name, i);
        } //declareMap key, answerMap key, value ����
        
        for(String declareList : report){
            String[] str = declareList.split(" ");
            String from = str[0];
            String to = str[1];
            declareMap.get(to).add(from);
        } //declareMap value ����(�ߺ� ���� ��)
        
        for(int i=0; i<id_list.length; i++){
            HashSet<String> mail =  declareMap.get(id_list[i]);
            if(mail.size() >= k){ //������ �Ű�Ƚ���� �Ѿ�� ��츸
                for(String name : mail){
                    answer[answerMap.get(name)]++;
                } // mail�� ����
            }
        }
        
        return answer;
    }
}
