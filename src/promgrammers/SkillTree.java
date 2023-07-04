package promgrammers;

public class SkillTree {

	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String str : skill_trees){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<str.length(); i++){
                char chr = str.charAt(i);
                if(skill.contains(chr + "")){
                    sb.append(chr);
                }
            }//스킬트리중 스킬에 해당하는 것만 걸러네는 과정
            answer += check(sb.toString(), skill);
        }
        return answer;
    }
    
    public int check(String str, String skill){
        if(skill.indexOf(str) == 0){
                return 1;
        }
        return 0;
    } // 스킬 순서에 맞게 진행되고있는지 확인하는 메서드
}
