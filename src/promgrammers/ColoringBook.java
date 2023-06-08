package promgrammers;

public class ColoringBook {

	 /*
    1. 아이디어
     - 2중 for문 => 값이 !0 && 값이 시작과 동일 && 방문하지 않은경우 => BFS
     - BFS 돌면서 그림의 수+1, 최대값 갱신
    2. 시간복잡도
     O(V+E)
     =>O(V+4V)
     - V : 100 * 100
     - E : 4 * 100 * 100
     - V + E : 10000 + 40000 = 500만 < 2억 >> 가능
    3. 자료구조
     picture : int[][]
     visit : bool[][]
     Queue 
*/

static int[] dx = {1,-1,0,0};
static int[] dy = {0,0,1,-1};

static class Node{
    int x;
    int y;
    
    public Node(int x, int y){
        this.y = y;
        this.x = x;
    }
}


static Queue<Node> queue = new LinkedList<Node>();
static boolean[][] visited;
static int size = 0;

public int[] solution(int m, int n, int[][] picture) {
    int numberOfArea = 0;
    int maxSizeOfOneArea = 0;
    int[] answer = new int[2];
    
    visited = new boolean[m][n];
    
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(picture[i][j] != 0 && visited[i][j] != true){
                size = 1;
                bfs(picture, i, j, m, n);
                numberOfArea++;
                maxSizeOfOneArea = Math.max(maxSizeOfOneArea, size);
            }
        }
    }
    answer[0] = numberOfArea;
    answer[1] = maxSizeOfOneArea;
    return answer;
}

public void bfs(int[][] picture, int x, int y, int m, int n){
    queue.add(new Node(x,y));
    visited[x][y] = true;
    
    while(!queue.isEmpty()){
        Node now = queue.poll();
        
        for(int i=0; i<4; i++){
            int nx = now.x + dx[i];
            int ny = now.y + dy[i];
            
            if(0<=nx && nx <m && 0<=ny && ny <n){
                if(picture[nx][ny] == picture[x][y] && visited[nx][ny] != true){
                    queue.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                    size++;
                }
            }
        }
    }
}
}
