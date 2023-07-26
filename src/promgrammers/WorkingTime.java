package promgrammers;

import java.util.*;
import java.io.*;
public class WorkingTime {

	 public static void main(String args[])throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int tot = 0;
	        tot = cal(tot, br);
	        System.out.print(tot);

	    }
	 public static int cal(int tot, BufferedReader br)throws IOException {
		 StringTokenizer st;
		 for(int i=0; i<5; i++){
			 st = new StringTokenizer(br.readLine(), " ");
	         String go = st.nextToken();
	         String leave = st.nextToken();
	         int goH = Integer.parseInt(go.substring(0,2));
	         int goM = Integer.parseInt(go.substring(3,5));
	         int lvH = Integer.parseInt(leave.substring(0,2));
	         int lvM = Integer.parseInt(leave.substring(3,5));
	         tot += (lvH-goH)*60 + (lvM-goM);
	    }
		 return tot;
	 }
}
