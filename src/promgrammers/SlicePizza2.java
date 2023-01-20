package promgrammers;

public class SlicePizza2 {

	public int solution(int n) {
        int piece = 6;
        while(piece%n != 0){
            piece += 6;
        }
        
        return piece/6;
    }
}
