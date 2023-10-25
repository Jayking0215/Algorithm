import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buf.readLine());
        
        int result = 0;

        while(N > 0){
            if(N % 5 == 0){
                result += N / 5;
                N = 0;
            }else{
                N -= 3;
                result++;
            }
            
            if(N < 0){
                result = -1;
                break;
            }
        }
        System.out.println(result);
    }
}