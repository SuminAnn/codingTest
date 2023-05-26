package promgrammers;

public class BlindPhoneNumber {

	public String solution(String phone_number) {
        String answer = phone_number.substring(phone_number.length()-4);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<phone_number.length()-4; i++){
            sb.append("*");
        }
        
        return sb.toString().concat(answer);
    }
}
