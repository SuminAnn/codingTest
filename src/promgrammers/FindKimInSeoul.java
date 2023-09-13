package promgrammers;

import java.util.Arrays;

public class FindKimInSeoul {

	public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        int idx = Arrays.asList(seoul).indexOf("Kim");
        sb.append(idx);
        sb.append("에 있다");
        return sb.toString();
    }
}
