package promgrammers;

public class Keyboard {

	public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int cnt = 0;
        List<Map<Character,Integer>> keyboard = new ArrayList<Map<Character,Integer>>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<keymap.length; i++){
            char[] arrCh1 = keymap[i].toCharArray();
            for(int j=0; j<arrCh1.length; j++){
                if(map.get(arrCh1[j]) == null){
                    map.put(arrCh1[j],j);
                }else{
                    int idx = map.get(arrCh1[j]);
                    if(idx>j){
                        map.put(arrCh1[j],j);
                    }
                }
            }
        }
        
        for(int i=0; i<targets.length; i++){
            char[] arrCh2 = targets[i].toCharArray();
            for(int j=0; j<arrCh2.length; j++){
                if(map.get(arrCh2[j]) == null){
                    cnt = -1;
                    break;
                }else{
                    cnt += map.get(arrCh2[j])+1;
                }
            }
            answer[i] = cnt;
            cnt = 0;
        }
        return answer;
    }
}
