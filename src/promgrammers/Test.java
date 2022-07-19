package promgrammers;

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] first = {1,2,3,4,5};                      // ù��° ������ �ݺ��� ������ ��� ��ȣ�� ��� �迭
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};        // �ι�° ������ �ݺ��� ������ ��� ��ȣ�� ��� �迭
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};   // ����° ������ �ݺ��� ������ ��� ��ȣ�� ��� �迭
        int[] scores = new int[3];                      // ������ ������ �°� ���� ������ ���� �迭
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == first[i%5]) scores[0]++;
            if(answers[i] == second[i%8]) scores[1]++;
            if(answers[i] == third[i%10]) scores[2]++;
        }   // �� �������� ������ ä���ϴ� �ݺ���
        
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));  // ���� ���� ���� ������ ���Ѵ�
        
        List<Integer> list = new ArrayList<>(); // ���� ���� ���� �����ڸ� ���� List
        
        if(scores[0] == max) list.add(1);
        if(scores[1] == max) list.add(2);
        if(scores[2] == max) list.add(3);   // �Ѹ� Ȥ�� ������ ������ڸ� ã�� ���ǹ�
        
        int[] answer = new int[list.size()];    //��������� ����ŭ return�迭�� ũ�⸦ �����Ѵ�
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }   // ������ڸ� ������������ answer�迭�� ����ش�
        
        return answer;
    }
}