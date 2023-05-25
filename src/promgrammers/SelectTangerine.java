package promgrammers;

public class SelectTangerine {

	 public int solution(int k, int[] tangerine) {
	        int answer = 0;
	        Map<Integer,Integer> tMap = new HashMap<>(); //귤의 크기별로 갯수를 담을 Map타입
	        for(int n : tangerine){
	            tMap.put(n, tMap.getOrDefault(n, 0) + 1); //귤을 크기별로 갯수만큼 담아준다
	        }
	        List<Integer> list = new ArrayList<>();
	        
	        for(Integer n : tMap.keySet()){
	            list.add(tMap.get(n)); //list에 귤의 갯수를 담아준다
	        }
	        list.sort(Collections.reverseOrder()); // 갯수가 많은 순으로 정렬
	        
	        int tot = 0;
	        
	        for(Integer n : list){
	            answer++;
	            tot += n;
	            if(tot >= k){
	                break;
	            } // 갯수가 충족되면 반복문 종료
	        }
	        return answer;
	    }
}
