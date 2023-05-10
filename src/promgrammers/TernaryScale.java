package promgrammers;

public class TernaryScale {

	public int solution(int n) {
        Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        String str = Integer.toString(n,3);
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return Integer.parseInt(sb.toString(),3);
    }
}
