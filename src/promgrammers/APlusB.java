package promgrammers;

public class APlusB {

	public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]); //숫자의 합 중복을 방지하기위해 set에 담는다
            }
        }
        ArrayList<Integer> list = new ArrayList(set); //set을 List로 변환
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i); //list에 값들을 int[]에 담아준다
        }
        Arrays.sort(answer); //오름차순 정렬
        return answer;
    }
}
