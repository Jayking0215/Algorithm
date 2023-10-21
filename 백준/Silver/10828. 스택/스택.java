import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < N; i++) {
            String input = bf.readLine().trim();
            String[] command = input.split(" ");
            
            switch(command[0]){
                case "push" :
                    int X = Integer.parseInt(command[1]);
                    stack.push(X);
                    break;
                    
                case "pop" :
                    if(!stack.isEmpty()){
                        System.out.println(stack.pop());
                    }else{
                        System.out.println(-1);
                    }
                    break;
                    
                case "size" :
                    System.out.println(stack.size());
                    break;
                    
                case "empty" :
                    if(stack.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                    
                case "top" :
                    if (!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}