import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        boolean answer = true;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    answer = false;
                    break;
                }
            }
        }
        
        if(!stack.isEmpty()){
            answer = false;
        }
    

        return answer;
    }
}