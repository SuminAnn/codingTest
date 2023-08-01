package promgrammers;
import java.util.*;
import java.io.*;
public class Lectures {

	 static StringTokenizer st;
	    static int N, start, end, after;
	    static int answer = 0;
	    static int tmp = 0;

	    static class Node implements Comparable<Node>{
	        int start, end;

	        public Node(int start, int end){
	            this.start = start;
	            this.end = end;
	        }

	        public int compareTo(Node n){
	            return this.end - n.end;
	        }
	    }
	    public static void main(String args[])throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        N = Integer.parseInt(br.readLine());
	        Node[] lectures = new Node[N];

	        setting(br, lectures);
	        Arrays.sort(lectures);
	        
	        count(lectures);
	        
	        System.out.print(answer);
	    }

	    public static void setting( BufferedReader br, Node[] lectures)throws IOException{
	        for(int i=0; i<N; i++){
	            st = new StringTokenizer(br.readLine());
	            start = Integer.parseInt(st.nextToken());
	            end = Integer.parseInt(st.nextToken());
	            lectures[i] = new Node(start, end);
	        }
	    }

	    public static void count(Node[] lectures){
	        for(Node lecture : lectures){
	            if(lecture.start < tmp){
	                continue;
	            }else{
	                tmp = lecture.end;
	                answer++;
	            }
	        }
	    }
}
