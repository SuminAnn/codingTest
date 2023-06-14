package promgrammers;
import java.util.*;
public class GameMapShortDistance {

	static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    
    static class Node{
        int x;
        int y;
        int d;
        
        public Node(int x, int y, int d){
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
    
    static Queue<Node> queue = new LinkedList<>();
    static boolean[][] visited;
    static int size = 10000;
    
    
    public int solution(int[][] maps) {
        int m = maps.length;
        int n = maps[0].length;
        visited = new boolean[m][n];
        
        bfs(maps, m, n);
        if(!visited[m-1][n-1]){
            size = -1;
        }
        return size;
    }
    
    public void bfs(int[][] maps, int m, int n){
        queue.add(new Node(0, 0, 1));
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            Node now = queue.poll();
            for(int i=0; i<4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                
                if(0<=nx && nx<m && 0<=ny && ny<n){
                    if(maps[nx][ny] != 0 && visited[nx][ny] != true){
                        queue.add(new Node(nx, ny, now.d + 1));
                        visited[nx][ny] = true;
                        if(nx == m-1 && ny == n-1) size = Math.min(size, now.d+1); // 목표지점 도달시 최단거리 확인
                    }
                }
            }
        }
    }
}
