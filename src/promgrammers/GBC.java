package promgrammers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GBC {

	 static int N,M;
	    public static void main(String args[]) throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String[] input = br.readLine().split(" ");
	        List<Integer> meter = new ArrayList<>();
	        List<Integer> speed = new ArrayList<>();
	        List<Integer> tMeter = new ArrayList<>();
	        List<Integer> tSpeed = new ArrayList<>();
	        N = Integer.parseInt(input[0]);
	        M = Integer.parseInt(input[1]);
	        setting(N, meter, speed, br);
	        setting(M, tMeter, tSpeed, br);
	        int idx =0;
	        int t_idx =0;
	        int answer = 0;

	        while(idx < N){
	            if(meter.get(idx) < tMeter.get(t_idx)){
	                tMeter.set(t_idx, tMeter.get(t_idx)-meter.get(idx));
	                answer = Math.max(answer, tSpeed.get(t_idx)-speed.get(idx));
	                idx++;
	            }else if(meter.get(idx) > tMeter.get(t_idx)){
	                meter.set(idx, meter.get(idx)-tMeter.get(t_idx));
	                answer = Math.max(answer, tSpeed.get(t_idx)-speed.get(idx));
	                t_idx++;
	            }else{
	                answer = Math.max(answer, tSpeed.get(t_idx)-speed.get(idx));
	                t_idx++;
	                idx++;
	            }
	        }
	        System.out.println(answer);


	    }

	    public static void setting(int num, List<Integer> meter, List<Integer> speed, BufferedReader br) throws IOException{
	        for(int i=0; i<num; i++){
	            String[] tmp = br.readLine().split(" ");
	            meter.add(Integer.parseInt(tmp[0]));
	            speed.add(Integer.parseInt(tmp[1]));
	        }

	    }
}
