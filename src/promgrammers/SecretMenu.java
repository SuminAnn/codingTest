package promgrammers;
import java.util.*;
import java.io.*;
public class SecretMenu {

	static int M,N,K;
    static String secret, button;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        

        if(N < M){
            System.out.print("normal");
        }else{
             st = new StringTokenizer(br.readLine());
            secret = setting(st, M);
            st = new StringTokenizer(br.readLine());
            button = setting(st, N);
            
            if(button.contains(secret)){
                System.out.print("secret");
            }else{
                System.out.print("normal");
            }
        }

       
    }

    public static String setting(StringTokenizer st, int num){
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<num; i++){
            sb.append(st.nextToken());
        }
        return sb.toString();
    }
}
