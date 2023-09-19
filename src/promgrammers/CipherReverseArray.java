package promgrammers;

import java.util.*;
public class CipherReverseArray {

	public int[] solution(long n) {
        List<Integer> list = new ArrayList<Integer>();
        
        while(n > 0){
            int tmp = (int)(n%10);
            list.add(tmp);
            n /= 10;
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
