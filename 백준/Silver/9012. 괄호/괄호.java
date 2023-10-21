import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < N; i++){
            String input = bf.readLine().trim();
            boolean isBalanced = isBalancedParentheses(input);
            System.out.println(isBalanced ? "YES" : "NO");
        }
    }
    
    public static boolean isBalancedParentheses(String s){
        int balance = 0;
        
        for(char c : s.toCharArray()){
            if(c == '('){
                balance++;
            }else{
                balance--;
            }
            if(balance < 0){
                return false;
            }
        }
        
        return balance == 0;
    }
}