package promgrammers;

public class IndesOf {

	public int[] solution(String[] wallpaper) {
        int[] answer = {50, 50, 0, 0};

        for(int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].indexOf("#") != -1) {
                answer[0] = Math.min(answer[0], i);
                answer[2] = Math.max(answer[2], i+1);

                answer[1] = Math.min(answer[1], wallpaper[i].indexOf("#"));
                answer[3] = Math.max(answer[3], wallpaper[i].lastIndexOf("#")+1);
            }
        }
        return answer;
    }
}
