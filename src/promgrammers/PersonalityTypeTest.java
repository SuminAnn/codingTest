package promgrammers;

import java.util.*;
public class PersonalityTypeTest {

	public String solution(String[] survey, int[] choices) {
        char[] surveyElement = {'R', 'T', 'C', 'F',  'J', 'M',  'A', 'N'}; //��ǥ�� ���� �������� ����
        int[] score = new int[8]; // ������ ���� int[]
        String answer = ""; //���� ���������� ���� String
        Map<Character, Integer> scoreBoard = new HashMap(); //���������� ���� index�� ���� map
        
        scoreBoard = setScoreBoard(scoreBoard, surveyElement); //scoreBoard�� setting
        
        score = check(survey, choices, score, scoreBoard);
        
        
        return reult(score, answer, surveyElement);
    }
    
    public Map<Character, Integer> setScoreBoard(Map<Character, Integer> scoreBoard, char[] surveyElement){
        for(int i=0; i<8; i++){
            scoreBoard.put(surveyElement[i], i);
        }
        
        return scoreBoard;
    } // scoreBoard�� �� ��ǥ�� ���� �������� Ÿ�Կ� �°� index�� setting 
    
    public int[] check(String[] survey, int[] choices, int[] score, Map<Character, Integer> scoreBoard){
        for(int i=0; i<survey.length; i++){ // survey ��ŭ �ݺ��� ����
            char first = survey[i].charAt(0); // survey�� ù��° Ÿ��
            char secoond = survey[i].charAt(1); // survey�� �ι�° Ÿ��
            
            switch(choices[i]){ // �������
                case 1 : score[scoreBoard.get(first)] += 3;
                    break;
                case 2 : score[scoreBoard.get(first)] += 2;
                    break;
                case 3 : score[scoreBoard.get(first)] += 1;
                    break;
                case 5 : score[scoreBoard.get(secoond)] += 1;
                    break;
                case 6 : score[scoreBoard.get(secoond)] += 2;
                    break;
                case 7 : score[scoreBoard.get(secoond)] += 3;
                    break;
                default : break;
            }
                
        }
        
        return score;
        
    } // �������� �ش��ϴ� ���������� ������ üũ�ϴ� �޼���
    
    public String reult(int[] score, String answer, char[] surveyElement){
        for(int i=0; i<8; i+=2){ //�������� Ÿ���� 8���̱� ������ 8�� �ݺ�
            if(score[i] > score[i+1]){
                answer += surveyElement[i]; 
            }else if(score[i] == score[i+1]){
                answer += surveyElement[i]; // ������ ��� ���������� ���� Ÿ��
            }else{
                answer += surveyElement[i+1];
            }
        }
        return answer;
    } //���� ���������� ��ȯ�ϴ� �޼���
}
