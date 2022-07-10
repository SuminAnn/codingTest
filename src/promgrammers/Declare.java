package promgrammers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Declare {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];
        
        //key : 신고당한ID, value : 신고한 ID
        Map<String, HashSet<String>> declareMap = new HashMap<>();//중복 방지를 위해 value에 set이용
        // key : 신고당한ID, value : 신고횟수
        Map<String, Integer> answerMap = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++){
            String name = id_list[i];
            declareMap.put(name, new HashSet<>());
            answerMap.put(name, i);
        } //declareMap key, answerMap key, value 세팅
        
        for(String declareList : report){
            String[] str = declareList.split(" ");
            String from = str[0];
            String to = str[1];
            declareMap.get(to).add(from);
        } //declareMap value 세팅(중복 제거 한)
        
        for(int i=0; i<id_list.length; i++){
            HashSet<String> mail =  declareMap.get(id_list[i]);
            if(mail.size() >= k){ //지정한 신고횟수를 넘어가는 경우만
                for(String name : mail){
                    answer[answerMap.get(name)]++;
                } // mail수 세팅
            }
        }
        
        return answer;
    }
}
