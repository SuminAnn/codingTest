package promgrammers;
import java.util.*;
import java.io.*;
public class Thief {

	 static int W,N;
	    static List<int[]> list = new ArrayList<>();
	    static StringTokenizer st;
	    static int sum=0;
	    public static void main(String args[])throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        st = new StringTokenizer(br.readLine());
	        W = Integer.parseInt(st.nextToken());
	        N = Integer.parseInt(st.nextToken());

	        setting(br);

	        Collections.sort(list,(o1,o2)->o2[1]-o1[1]);

	        sum = check();

	        System.out.print(sum);
	    }

	    public static void setting(BufferedReader br)throws IOException{
	        for(int i=0; i<N; i++){
	            st = new StringTokenizer(br.readLine());
	            int M = Integer.parseInt(st.nextToken());
	            int P = Integer.parseInt(st.nextToken());
	            list.add(new int[]{M, P});
	        }
	    }

	    public static int check(){
	        for(int[] item : list){
	            if(W <= item[0]){
	                sum += W*item[1];
	                break;
	            }else{
	                sum += item[0]*item[1];
	                W -= item[0];
	            }
	        }
	        return sum;
	    }
}
