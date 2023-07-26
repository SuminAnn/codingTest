package promgrammers;

import java.util.*;
import java.io.*;
public class SumAB {

	 static int T;
	    public static void main(String args[])throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        T = Integer.parseInt(br.readLine());
	        sum(T, sb, br);
	        
	        System.out.print(sb);
	    }
	    
	    public static void sum(int T, StringBuilder sb, BufferedReader br)throws IOException {
	        StringTokenizer st;
	    	for(int i=1; i<=T; i++){
	            st = new StringTokenizer(br.readLine());
	            int fNum = Integer.parseInt(st.nextToken());
	            int sNum = Integer.parseInt(st.nextToken());
	            int sum = fNum+sNum;
	            sb.append("Case #" + i + ": " + sum);
	            sb.append("\n");
	        }
	    }
}
