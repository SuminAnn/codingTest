package promgrammers;
import java.util.*;
public class ChangeWords {

	static class StrNode{
        String str;
        int idx;
        public StrNode(String str, int idx){
            this.str = str;
            this.idx = idx;
        }
    }
    static Queue<StrNode> queue = new LinkedList<>();
    static boolean[] visited;
    static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        visited =  new boolean[words.length];
        for(int i=0; i<words.length; i++){
            if(Arrays.asList(words).contains(target)){
                bfs(begin, target, words);
            }else{
                return 0;
            }
        }
        return answer;
    }
    
    public void bfs(String begin, String target, String[] words){
        queue.add(new StrNode(begin, 0));
        while(!queue.isEmpty()){
            StrNode now = queue.poll();
            if(now.str.equals(target)){
                answer = now.idx;
                return;
            }
            
            for(int i=0; i<words.length; i++){
                int cnt = 0;
                String word = words[i];
                
                if(visited[i]) continue;
                for(int j=0; j<now.str.length(); j++){
                    if(word.charAt(j) == now.str.charAt(j)) cnt++;
                }
                if(cnt == now.str.length()-1){
                    queue.add(new StrNode(word, now.idx+1));
                    visited[i] = true;
                }
            }
        }
    }
}
