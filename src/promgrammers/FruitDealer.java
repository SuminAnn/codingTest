package promgrammers;

import java.util.*;
public class FruitDealer {

	public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); //점수 배열 오름차순 정렬
        for(int i = score.length-1; i>=0; i--){
            if((score.length-i) %m == 0) answer += score[i] * m;
        } // 높은 점수 순으로 배열 역순으로 하나씩 꺼내서 확인
        return answer;
    }
}
