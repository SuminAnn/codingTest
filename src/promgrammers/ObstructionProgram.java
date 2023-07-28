package promgrammers;
import java.util.*;
import java.io.*;
public class ObstructionProgram {

	static int N;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static Queue<Node> queue = new LinkedList<>();
    static boolean[][] visited;
    static int[][] map;
    static List<Integer> list = new ArrayList<>();
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        map = new int[N][N];
        settingMap(br);

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1 && visited[i][j] != true){
                    int count = bfs(i, j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        
    }

    public static void settingMap(BufferedReader br)throws IOException{
        for(int i=0; i<N; i++){
            String tmp = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = Character.getNumericValue(tmp.charAt(j));
            }
        }
    }
    
    public static int bfs(int x, int y){
        int cnt = 0;
        queue.add(new Node(x,y));
        visited[x][y] = true;
        cnt++;

        while(!queue.isEmpty()){
            Node now = queue.poll();
            for(int i=0; i<4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(0<=nx && nx<N && 0<=ny && ny<N){
                    if(map[nx][ny] != 0 && visited[nx][ny] != true){
                        queue.add(new Node(nx, ny));
                        visited[nx][ny] = true;
                        cnt ++;
                    }
                }
            }
        }
        return cnt;
    }
}
