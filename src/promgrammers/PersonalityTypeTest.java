package promgrammers;

import java.util.*;
public class PersonalityTypeTest {

	public String solution(String[] survey, int[] choices) {
        char[] surveyElement = {'R', 'T', 'C', 'F',  'J', 'M',  'A', 'N'}; //지표에 따른 성격유형 순서
        int[] score = new int[8]; // 점수를 담을 int[]
        String answer = ""; //최종 성격유형을 담을 String
        Map<Character, Integer> scoreBoard = new HashMap(); //성격유형애 따른 index를 담은 map
        
        scoreBoard = setScoreBoard(scoreBoard, surveyElement); //scoreBoard를 setting
        
        score = check(survey, choices, score, scoreBoard);
        
        
        return reult(score, answer, surveyElement);
    }
    
    public Map<Character, Integer> setScoreBoard(Map<Character, Integer> scoreBoard, char[] surveyElement){
        for(int i=0; i<8; i++){
            scoreBoard.put(surveyElement[i], i);
        }
        
        return scoreBoard;
    } // scoreBoard를 각 지표에 따른 성격유형 타입에 맞게 index를 setting 
    
    public int[] check(String[] survey, int[] choices, int[] score, Map<Character, Integer> scoreBoard){
        for(int i=0; i<survey.length; i++){ // survey 만큼 반복문 실행
            char first = survey[i].charAt(0); // survey의 첫번째 타입
            char secoond = survey[i].charAt(1); // survey의 두번째 타입
            
            switch(choices[i]){ // 점수계산
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
        
    } // 선택지에 해당하는 성격유형의 점수를 체크하는 메서드
    
    public String reult(int[] score, String answer, char[] surveyElement){
        for(int i=0; i<8; i+=2){ //성격유형 타입이 8개이기 때문에 8번 반복
            if(score[i] > score[i+1]){
                answer += surveyElement[i]; 
            }else if(score[i] == score[i+1]){
                answer += surveyElement[i]; // 동점인 경우 사전순으로 빠른 타입
            }else{
                answer += surveyElement[i+1];
            }
        }
        return answer;
    } //최종 성격유형을 반환하는 메서드
}
