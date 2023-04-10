package promgrammers;

public class Race {

	 public String[] solution(String[] players, String[] callings) {
	        HashMap<String,Integer> map = new LinkedHashMap<>();
	        
	        for(int i=0; i<players.length; i++){
	            map.put(players[i], i); //기존 선수들 등수를 map에 담아준다
	        }
	        for(int i=0; i<callings.length; i++){
	            int idx = map.get(callings[i]); //호명된 선수의 idx번호를 찾는다
	            String str = players[idx-1]; // 호명된 선수 앞순위의 선수 이름을 찾는다
	            players[idx-1] = players[idx]; // 호명된 선수의 idx를 한단계 앞으로 변경
	            players[idx] = str; // 기존의 선수는 idx를 한단계 뒤로 변경
	            map.put(callings[i], idx-1);
	            map.put(str, idx); //map에 담긴 값들도 변경해준다
	        }
	        return players;
	    }
}
