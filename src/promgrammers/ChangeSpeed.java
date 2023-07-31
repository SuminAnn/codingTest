package promgrammers;
import java.util.*;
import java.io.*;
public class ChangeSpeed {

	static int speed = 8;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        
        setting();

        if(sb.toString().equals("12345678")){
            System.out.print("ascending");
        }else if(sb.toString().equals("87654321")){
            System.out.print("descending");
        }else{
            System.out.print("mixed");
        }
    }

    public static void setting(){
        for(int i=0 ;i<speed; i++){
            sb.append(st.nextToken());
        }
    }
}
