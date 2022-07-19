package promgrammers;

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] first = {1,2,3,4,5};                      // 첫번째 수포자 반복을 제외한 찍는 번호를 담는 배열
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};        // 두번째 수포자 반복을 제외한 찍는 번호를 담는 배열
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};   // 세번째 수포자 반복을 제외한 찍는 번호를 담는 배열
        int[] scores = new int[3];                      // 수포자 순서에 맞게 정답 개수를 담을 배열
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == first[i%5]) scores[0]++;
            if(answers[i] == second[i%8]) scores[1]++;
            if(answers[i] == third[i%10]) scores[2]++;
        }   // 각 수포자의 정답을 채점하는 반복문
        
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));  // 가장 많이 맞은 점수를 구한다
        
        List<Integer> list = new ArrayList<>(); // 가장 많이 맞은 수포자를 담을 List
        
        if(scores[0] == max) list.add(1);
        if(scores[1] == max) list.add(2);
        if(scores[2] == max) list.add(3);   // 한명 혹은 복수의 고득점자를 찾는 조건문
        
        int[] answer = new int[list.size()];    //고득점자의 수만큼 return배열의 크기를 설정한다
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }   // 고득점자를 오름차순으로 answer배열에 담아준다
        
        return answer;
    }
}