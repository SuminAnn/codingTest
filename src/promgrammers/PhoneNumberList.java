package promgrammers;
import java.util.*;
public class PhoneNumberList {

	public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for(String str : phone_book){
            set.add(str);
        }
        
        for(String phone : phone_book){
            for(int i=1 ; i<phone.length(); i++){
                if(set.contains(phone.substring(0,i))) return false;
            }
        }
        return true;
    }
}
