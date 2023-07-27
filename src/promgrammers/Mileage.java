package promgrammers;
import java.util.*;
import java.io.*;
public class Mileage {

	static int A,B;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        if(A > B){
            System.out.print("A");
        }else if(A < B){
            System.out.print("B");
        }else{
            System.out.print("same");
        }
    }
}
