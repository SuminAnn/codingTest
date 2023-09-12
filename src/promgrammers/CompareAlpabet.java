package promgrammers;

public class CompareAlpabet {

	 private int pCnt = 0;
	    private int yCnt = 0;
	    boolean solution(String s) {
	        s = s.toLowerCase();
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i) == 'y'){
	                yCnt++;
	            }else if(s.charAt(i) == 'p'){
	                pCnt++;
	            }
	        }

	        return pCnt == yCnt;
	    }
}
