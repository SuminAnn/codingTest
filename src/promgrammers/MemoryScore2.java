package promgrammers;

public class MemoryScore2 {

	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int score = 0;
        
        HashMap<String,Integer> map = new LinkedHashMap<>();
        
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            score = 0;
            String[] persons = photo[i];
            for(int j=0; j<persons.length; j++){
                String person = persons[j];
                if(map.containsKey(person)){
                    score += map.get(person);
                }
            }
            answer[i] = score;
        } //기존의 3중 for문으로 하는 경우에는 소요시간이 오래걸리기 때문에 map을 활용한 풀이
        return answer;
    }
}
