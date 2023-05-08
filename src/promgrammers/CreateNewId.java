package promgrammers;

public class CreateNewId {

	 public String solution(String new_id) {
	        String answer = "";
	        String step1 = new_id.toLowerCase();
	        
	        StringBuilder step2 = new StringBuilder();
	        for(int i=0; i<step1.length(); i++){
	            char ch = step1.charAt(i);
	            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == '-' || ch == '_' || ch == '.'){
	                step2.append(ch);
	            } 
	        }
	        
	        String step3 = step2.toString().replace(".." , ".");
	        while(step3.contains("..")){
	            step3 = step3.replace("..", ".");
	        }
	        
	        String step4 = step3;
	        if(step4.length() > 0){
	            if(step4.charAt(0) == '.'){
	                step4 = step4.substring(1, step4.length());
	            }
	        }
	        if(step4.length() > 0){
	            if(step4.charAt(step4.length()-1) == '.'){
	                step4 = step4.substring(0, step4.length()-1);
	            }
	        }
	        
	        String step5 = step4;
	        if(step5.length() == 0){
	            step5 = "a";
	        }
	        
	        String step6 = step5;
	        if(step6.length() >= 16){
	            step6 = step6.substring(0, 15);
	            
	            if(step6.charAt(step6.length()-1) == '.'){
	                step6 = step6.substring(0, step6.length()-1);
	            }
	        }
	        
	        StringBuilder step7 = new StringBuilder(step6);
	        if(step7.length() <= 2){
	            char last = step7.charAt(step7.length()-1);
	            while(step7.length() < 3){
	                step7.append(last);
	            }
	        }
	        answer = step7.toString();
	        return answer;
	    }
}
