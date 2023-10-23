import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buf.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(buf.readLine());
            
            if(num == 0){
                stack.pop();
            }else{
                stack.push(num);
            }
        }
        
        int sum = 0;
        for(int n : stack){
            sum += n;
        }
        
        System.out.println(sum);
    }
}