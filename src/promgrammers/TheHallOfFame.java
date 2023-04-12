package promgrammers;

public class TheHallOfFame {

	public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>(); //명에의 전당
        for(int i=0 ;i<score.length; i++){
            if(list.size() <k){ //정해진 명예의 전당 수 전까지는 list에 무조건 추가 후 내림차순 정렬
                list.add(score[i]);
                list.sort(Comparator.reverseOrder());
                answer[i] = list.get(i);
            }else{
                if(list.get(k-1) < score[i]){ // 정해진 명예의 전당이 채워진 후에는 가장 낮은 점수와 비교해서 추가 후 내림차순 정렬
                    list.remove(k-1);
                    list.add(score[i]);
                    list.sort(Comparator.reverseOrder());
                    answer[i] = list.get(k-1);
                }else{ // 명예의 전당 가장 낮은 점수보다 작은 경우 기존의 가장 낮은 점수를 발표
                    answer[i] = list.get(k-1);
                }
            }
        }
        return answer;
    }
}
