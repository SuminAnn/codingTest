package promgrammers;
import java.util.*;
public class TravelPath {

	static List<String> list = new ArrayList<>();
    static boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length]; //방문여부 체크
        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(list);
        
        return list.get(0).split(" ");
    }
    public void dfs(int depth, String now, String path, String[][] tickets){
        if(depth == tickets.length){
            list.add(path);
            return;
        }
        
        for(int i=0; i<tickets.length; i++){
            if(!visited[i] && now.equals(tickets[i][0])){
                visited[i] = true;
                dfs(depth+1, tickets[i][1], path + " " + tickets[i][1], tickets);
                visited[i] = false; 
            }
        }
    }
}
