package promgrammers;

public class FailPercent {

	 public int[] solution(int N, int[] stages) {
	        int[] answer = new int[N];
	        Map<Integer, Double> map = new HashMap<>(); //스테이지별 실패율을 담아줄 map 선언
	        int player = stages.length;
	        int cnt = 0;
	        
	        for(int i=1; i<=N; i++){
	            cnt = 0;
	            for(int j=0; j<stages.length; j++){
	                if(i == stages[j]){
	                    cnt++; //실패한 스테이지의 플레이어 수
	                }
	            }
	            if(cnt == 0){
	                map.put(i,0.0);//스테이지별 실패한 플레이어가 없는경우
	            }else{
	                map.put(i,(double)cnt/player);
	            } 
	            player -= cnt;
	        }
	        
	        List<Integer> list = new ArrayList<>(map.keySet());
	        Collections.sort(list, (o1, o2) -> Double.compare(map.get(o2), map.get(o1))); //실패율에 따른 내림차순 정렬
	        answer = list.stream().mapToInt(Integer::intValue).toArray(); //list를 int[]로 변경
	        return answer;
	    }
}
