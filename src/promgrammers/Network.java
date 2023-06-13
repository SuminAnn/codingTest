package promgrammers;

import java.util.*;
public class Network {

	static class Node{
        int x;
        
        public Node(int x){
            this.x = x;
        }
    }
    static Queue<Node> queue = new LinkedList<>();
    static boolean[] visited;
    static int answer = 0;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(visited[i] == false){
                bfs(computers, i, n);
                answer++;
            }
        }
        return answer;
    }
    
    public void bfs(int[][] computers, int x, int n){
        queue.add(new Node(x));
        
        while(!queue.isEmpty()){
            Node now = queue.poll();
            for(int i=0; i<n; i++){
                if(visited[i] == false && computers[now.x][i] == 1){
                    queue.add(new Node(i));
                    visited[i] = true;
                }
            }
        }
    }
}
